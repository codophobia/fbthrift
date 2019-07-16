/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
#pragma once

#include <thrift/lib/cpp2/gen/service_h.h>

#include "thrift/compiler/test/fixtures/doctext/gen-cpp2/CAsyncClient.h"
#include "thrift/compiler/test/fixtures/doctext/gen-cpp2/module_types.h"

namespace folly {
  class IOBuf;
  class IOBufQueue;
}
namespace apache { namespace thrift {
  class Cpp2RequestContext;
  class BinaryProtocolReader;
  class CompactProtocolReader;
  namespace transport { class THeader; }
}}

namespace cpp2 {

class CSvAsyncIf {
 public:
  virtual ~CSvAsyncIf() {}
  virtual void async_tm_f(std::unique_ptr<apache::thrift::HandlerCallback<void>> callback) = 0;
  virtual folly::Future<folly::Unit> future_f() = 0;
  virtual folly::SemiFuture<folly::Unit> semifuture_f() = 0;
};

class CAsyncProcessor;

class CSvIf : public CSvAsyncIf, public apache::thrift::ServerInterface {
 public:
  typedef CAsyncProcessor ProcessorType;
  std::unique_ptr<apache::thrift::AsyncProcessor> getProcessor() override;
  virtual void f();
  folly::Future<folly::Unit> future_f() override;
  folly::SemiFuture<folly::Unit> semifuture_f() override;
  void async_tm_f(std::unique_ptr<apache::thrift::HandlerCallback<void>> callback) override;
};

class CSvNull : public CSvIf {
 public:
  void f() override;
};

class CAsyncProcessor : public ::apache::thrift::GeneratedAsyncProcessor {
 public:
  const char* getServiceName() override;
  using BaseAsyncProcessor = void;
 protected:
  CSvIf* iface_;
  folly::Optional<std::string> getCacheKey(folly::IOBuf* buf, apache::thrift::protocol::PROTOCOL_TYPES protType) override;
 public:
  void process(std::unique_ptr<apache::thrift::ResponseChannelRequest> req, std::unique_ptr<folly::IOBuf> buf, apache::thrift::protocol::PROTOCOL_TYPES protType, apache::thrift::Cpp2RequestContext* context, folly::EventBase* eb, apache::thrift::concurrency::ThreadManager* tm) override;
 protected:
  bool isOnewayMethod(const folly::IOBuf* buf, const apache::thrift::transport::THeader* header) override;
  std::shared_ptr<folly::RequestContext> getBaseContextForRequest() override;
 private:
  static std::unordered_set<std::string> onewayMethods_;
  static std::unordered_map<std::string, int16_t> cacheKeyMap_;
 public:
  using ProcessFunc = GeneratedAsyncProcessor::ProcessFunc<CAsyncProcessor>;
  using ProcessMap = GeneratedAsyncProcessor::ProcessMap<ProcessFunc>;
  static const CAsyncProcessor::ProcessMap& getBinaryProtocolProcessMap();
  static const CAsyncProcessor::ProcessMap& getCompactProtocolProcessMap();
 private:
  static const CAsyncProcessor::ProcessMap binaryProcessMap_;
   static const CAsyncProcessor::ProcessMap compactProcessMap_;
 private:
  template <typename ProtocolIn_, typename ProtocolOut_>
  void _processInThread_f(std::unique_ptr<apache::thrift::ResponseChannelRequest> req, std::unique_ptr<folly::IOBuf> buf, apache::thrift::Cpp2RequestContext* ctx, folly::EventBase* eb, apache::thrift::concurrency::ThreadManager* tm);
  template <typename ProtocolIn_, typename ProtocolOut_>
  void process_f(std::unique_ptr<apache::thrift::ResponseChannelRequest> req, std::unique_ptr<folly::IOBuf> buf,apache::thrift::Cpp2RequestContext* ctx,folly::EventBase* eb, apache::thrift::concurrency::ThreadManager* tm);
  template <class ProtocolIn_, class ProtocolOut_>
  static folly::IOBufQueue return_f(int32_t protoSeqId, apache::thrift::ContextStack* ctx);
  template <class ProtocolIn_, class ProtocolOut_>
  static void throw_wrapped_f(std::unique_ptr<apache::thrift::ResponseChannelRequest> req,int32_t protoSeqId,apache::thrift::ContextStack* ctx,folly::exception_wrapper ew,apache::thrift::Cpp2RequestContext* reqCtx);
 public:
  CAsyncProcessor(CSvIf* iface) :
      iface_(iface) {}

  virtual ~CAsyncProcessor() {}
};

} // cpp2
namespace apache { namespace thrift {

}} // apache::thrift
