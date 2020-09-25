/*
 * Copyright (c) Facebook, Inc. and its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

#include <thrift/lib/cpp2/server/LoggingEvent.h>

#include <memory>
#include <unordered_map>

#include <folly/portability/GMock.h>
#include <folly/portability/GTest.h>
#include <thrift/lib/cpp2/server/Cpp2Worker.h>
#include <thrift/lib/cpp2/server/ThriftServer.h>
#include <thrift/lib/cpp2/test/gen-cpp2/TestService.h>
#include <thrift/lib/cpp2/util/ScopedServerInterfaceThread.h>

namespace {

using apache::thrift::ApplicationEventHandler;
using apache::thrift::ConnectionEventHandler;
using apache::thrift::LoggingEventRegistry;
using apache::thrift::ServerEventHandler;
using apache::thrift::ThriftServer;

constexpr std::string_view kServe = "serve";
constexpr std::string_view kNonTls = "non_tls";

class TestServerEventHandler : public ServerEventHandler {
 public:
  MOCK_METHOD1(log, void(const ThriftServer&));
};

class TestConnectionEventHandler : public ConnectionEventHandler {
 public:
  MOCK_METHOD2(
      log,
      void(
          const apache::thrift::Cpp2Worker&,
          const folly::AsyncTransport::UniquePtr&));
};

class TestEventRegistry : public LoggingEventRegistry {
 public:
  TestEventRegistry() {
    serverEventMap_[kServe] = makeHandler<TestServerEventHandler>();
    connectionEventMap_[kNonTls] = makeHandler<TestConnectionEventHandler>();
  }

  ServerEventHandler& getServerEventHandler(
      std::string_view key) const override {
    return *serverEventMap_.at(key).get();
  }

  ConnectionEventHandler& getConnectionEventHandler(
      std::string_view key) const override {
    return *connectionEventMap_.at(key).get();
  }

  ApplicationEventHandler& getApplicationEventHandler(
      std::string_view /* key */) const override {
    static auto* handler = new ApplicationEventHandler();
    return *handler;
  }

 private:
  template <typename T>
  std::unique_ptr<T> makeHandler() {
    auto obj = std::make_unique<T>();
    testing::Mock::AllowLeak(obj.get());
    return obj;
  }

  std::unordered_map<std::string_view, std::unique_ptr<ServerEventHandler>>
      serverEventMap_;
  std::unordered_map<std::string_view, std::unique_ptr<ConnectionEventHandler>>
      connectionEventMap_;
};

void expectServerEventCall(std::string_view key, size_t times) {
  auto& handler =
      apache::thrift::getLoggingEventRegistry().getServerEventHandler(key);
  auto* testHandler = dynamic_cast<TestServerEventHandler*>(&handler);
  EXPECT_NE(testHandler, nullptr);
  EXPECT_CALL(*testHandler, log(testing::_)).Times(times);
}

void expectConnectionEventCall(std::string_view key, size_t times) {
  auto& handler =
      apache::thrift::getLoggingEventRegistry().getConnectionEventHandler(key);
  auto* testHandler = dynamic_cast<TestConnectionEventHandler*>(&handler);
  EXPECT_NE(testHandler, nullptr);
  EXPECT_CALL(*testHandler, log(testing::_, testing::_)).Times(times);
}

} // namespace

namespace fbthrift {
std::unique_ptr<apache::thrift::LoggingEventRegistry>
makeLoggingEventRegistry() {
  return std::make_unique<TestEventRegistry>();
}
} // namespace fbthrift

class ServerEventLogTest : public testing::Test {};

class TestServiceHandler : public apache::thrift::test::TestServiceSvIf {
 public:
  void voidResponse() override {}
};

class ConnectionEventLogTest : public testing::Test {};

TEST_F(ServerEventLogTest, serverTest) {
  expectServerEventCall(kServe, 1);
  apache::thrift::ThriftServer server;
}

TEST_F(ConnectionEventLogTest, connectionTest) {
  expectConnectionEventCall(kNonTls, 1);
  auto handler = std::make_shared<TestServiceHandler>();
  apache::thrift::ScopedServerInterfaceThread server(handler);
  auto client =
      server.newClient<apache::thrift::test::TestServiceAsyncClient>();

  // block to make sure request is actually sent.
  client->semifuture_voidResponse().get();
}
