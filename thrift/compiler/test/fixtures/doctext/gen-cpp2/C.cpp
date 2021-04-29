/**
 * Autogenerated by Thrift for src/module.thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
#include "thrift/compiler/test/fixtures/doctext/gen-cpp2/C.h"
#include "thrift/compiler/test/fixtures/doctext/gen-cpp2/C.tcc"
#include "thrift/compiler/test/fixtures/doctext/gen-cpp2/module_metadata.h"
#include <thrift/lib/cpp2/gen/service_cpp.h>

namespace cpp2 {
std::unique_ptr<apache::thrift::AsyncProcessor> CSvIf::getProcessor() {
  return std::make_unique<CAsyncProcessor>(this);
}


void CSvIf::f() {
  apache::thrift::detail::si::throw_app_exn_unimplemented("f");
}

folly::SemiFuture<folly::Unit> CSvIf::semifuture_f() {
  auto expected{apache::thrift::detail::si::InvocationType::SemiFuture};
  __fbthrift_invocation_f.compare_exchange_strong(expected, apache::thrift::detail::si::InvocationType::Sync, std::memory_order_relaxed);
  return apache::thrift::detail::si::semifuture([&] {
    return f();
  });
}

folly::Future<folly::Unit> CSvIf::future_f() {
  auto expected{apache::thrift::detail::si::InvocationType::Future};
  __fbthrift_invocation_f.compare_exchange_strong(expected, apache::thrift::detail::si::InvocationType::SemiFuture, std::memory_order_relaxed);
  return apache::thrift::detail::si::future(semifuture_f(), getInternalKeepAlive());
}

void CSvIf::async_tm_f(std::unique_ptr<apache::thrift::HandlerCallback<void>> callback) {
  // It's possible the coroutine versions will delegate to a future-based
  // version. If that happens, we need the RequestParams arguments to be
  // available to the future through the thread-local backchannel, so we set that up
  // for all cases.
  apache::thrift::detail::si::async_tm_prep(this, callback.get());
  auto invocationType = __fbthrift_invocation_f.load(std::memory_order_relaxed);
  switch (invocationType) {
    case apache::thrift::detail::si::InvocationType::AsyncTm:
    {
      __fbthrift_invocation_f.compare_exchange_strong(invocationType, apache::thrift::detail::si::InvocationType::Future, std::memory_order_relaxed);
      FOLLY_FALLTHROUGH;
    }
    case apache::thrift::detail::si::InvocationType::Future:
    {
      apache::thrift::detail::si::async_tm_future(std::move(callback), [&] {
        return future_f();
      });
      return;
    }
    case apache::thrift::detail::si::InvocationType::SemiFuture:
    {
      apache::thrift::detail::si::async_tm_semifuture(std::move(callback), [&] {
        return semifuture_f(); });
      return;
    }
    case apache::thrift::detail::si::InvocationType::Sync:
    {
      try {
        f();
        callback->done();
      } catch (...) {
        callback->exception(std::current_exception());
      }
      return;
    }
    default:
    {
      folly::assume_unreachable();
    }
  }
}

::apache::thrift::ServerStream<::cpp2::number> CSvIf::numbers() {
  apache::thrift::detail::si::throw_app_exn_unimplemented("numbers");
}

folly::SemiFuture<::apache::thrift::ServerStream<::cpp2::number>> CSvIf::semifuture_numbers() {
  auto expected{apache::thrift::detail::si::InvocationType::SemiFuture};
  __fbthrift_invocation_numbers.compare_exchange_strong(expected, apache::thrift::detail::si::InvocationType::Sync, std::memory_order_relaxed);
  return apache::thrift::detail::si::semifuture([&] {
    return numbers();
  });
}

folly::Future<::apache::thrift::ServerStream<::cpp2::number>> CSvIf::future_numbers() {
  auto expected{apache::thrift::detail::si::InvocationType::Future};
  __fbthrift_invocation_numbers.compare_exchange_strong(expected, apache::thrift::detail::si::InvocationType::SemiFuture, std::memory_order_relaxed);
  return apache::thrift::detail::si::future(semifuture_numbers(), getInternalKeepAlive());
}

void CSvIf::async_tm_numbers(std::unique_ptr<apache::thrift::HandlerCallback<::apache::thrift::ServerStream<::cpp2::number>>> callback) {
  // It's possible the coroutine versions will delegate to a future-based
  // version. If that happens, we need the RequestParams arguments to be
  // available to the future through the thread-local backchannel, so we set that up
  // for all cases.
  apache::thrift::detail::si::async_tm_prep(this, callback.get());
  auto invocationType = __fbthrift_invocation_numbers.load(std::memory_order_relaxed);
  switch (invocationType) {
    case apache::thrift::detail::si::InvocationType::AsyncTm:
    {
      __fbthrift_invocation_numbers.compare_exchange_strong(invocationType, apache::thrift::detail::si::InvocationType::Future, std::memory_order_relaxed);
      FOLLY_FALLTHROUGH;
    }
    case apache::thrift::detail::si::InvocationType::Future:
    {
      apache::thrift::detail::si::async_tm_future(std::move(callback), [&] {
        return future_numbers();
      });
      return;
    }
    case apache::thrift::detail::si::InvocationType::SemiFuture:
    {
      apache::thrift::detail::si::async_tm_semifuture(std::move(callback), [&] {
        return semifuture_numbers(); });
      return;
    }
    case apache::thrift::detail::si::InvocationType::Sync:
    {
      try {
        callback->result(numbers());
      } catch (...) {
        callback->exception(std::current_exception());
      }
      return;
    }
    default:
    {
      folly::assume_unreachable();
    }
  }
}

void CSvIf::thing(::std::string& /*_return*/, ::std::int32_t /*a*/, std::unique_ptr<::std::string> /*b*/, std::unique_ptr<::std::set<::std::int32_t>> /*c*/) {
  apache::thrift::detail::si::throw_app_exn_unimplemented("thing");
}

folly::SemiFuture<std::unique_ptr<::std::string>> CSvIf::semifuture_thing(::std::int32_t p_a, std::unique_ptr<::std::string> p_b, std::unique_ptr<::std::set<::std::int32_t>> p_c) {
  auto expected{apache::thrift::detail::si::InvocationType::SemiFuture};
  __fbthrift_invocation_thing.compare_exchange_strong(expected, apache::thrift::detail::si::InvocationType::Sync, std::memory_order_relaxed);
  return apache::thrift::detail::si::semifuture_returning_uptr([&](::std::string& _return) { thing(_return, p_a, std::move(p_b), std::move(p_c)); });
}

folly::Future<std::unique_ptr<::std::string>> CSvIf::future_thing(::std::int32_t p_a, std::unique_ptr<::std::string> p_b, std::unique_ptr<::std::set<::std::int32_t>> p_c) {
  auto expected{apache::thrift::detail::si::InvocationType::Future};
  __fbthrift_invocation_thing.compare_exchange_strong(expected, apache::thrift::detail::si::InvocationType::SemiFuture, std::memory_order_relaxed);
  return apache::thrift::detail::si::future(semifuture_thing(p_a, std::move(p_b), std::move(p_c)), getInternalKeepAlive());
}

void CSvIf::async_tm_thing(std::unique_ptr<apache::thrift::HandlerCallback<std::unique_ptr<::std::string>>> callback, ::std::int32_t p_a, std::unique_ptr<::std::string> p_b, std::unique_ptr<::std::set<::std::int32_t>> p_c) {
  // It's possible the coroutine versions will delegate to a future-based
  // version. If that happens, we need the RequestParams arguments to be
  // available to the future through the thread-local backchannel, so we set that up
  // for all cases.
  apache::thrift::detail::si::async_tm_prep(this, callback.get());
  auto invocationType = __fbthrift_invocation_thing.load(std::memory_order_relaxed);
  switch (invocationType) {
    case apache::thrift::detail::si::InvocationType::AsyncTm:
    {
      __fbthrift_invocation_thing.compare_exchange_strong(invocationType, apache::thrift::detail::si::InvocationType::Future, std::memory_order_relaxed);
      FOLLY_FALLTHROUGH;
    }
    case apache::thrift::detail::si::InvocationType::Future:
    {
      apache::thrift::detail::si::async_tm_future(std::move(callback), [&] {
        return future_thing(p_a, std::move(p_b), std::move(p_c));
      });
      return;
    }
    case apache::thrift::detail::si::InvocationType::SemiFuture:
    {
      apache::thrift::detail::si::async_tm_semifuture(std::move(callback), [&] {
        return semifuture_thing(p_a, std::move(p_b), std::move(p_c)); });
      return;
    }
    case apache::thrift::detail::si::InvocationType::Sync:
    {
      try {
        ::std::string _return;
        thing(_return, p_a, std::move(p_b), std::move(p_c));
        callback->result(_return);
      } catch (...) {
        callback->exception(std::current_exception());
      }
      return;
    }
    default:
    {
      folly::assume_unreachable();
    }
  }
}

void CSvNull::f() {
  return;
}

void CSvNull::thing(::std::string& /*_return*/, ::std::int32_t /*a*/, std::unique_ptr<::std::string> /*b*/, std::unique_ptr<::std::set<::std::int32_t>> /*c*/) {}



const char* CAsyncProcessor::getServiceName() {
  return "C";
}

void CAsyncProcessor::getServiceMetadata(apache::thrift::metadata::ThriftServiceMetadataResponse& response) {
  ::apache::thrift::detail::md::ServiceMetadata<CSvIf>::gen(*response.metadata_ref(), *response.context_ref());
}

void CAsyncProcessor::processSerializedCompressedRequest(apache::thrift::ResponseChannelRequest::UniquePtr req, apache::thrift::SerializedCompressedRequest&& serializedRequest, apache::thrift::protocol::PROTOCOL_TYPES protType, apache::thrift::Cpp2RequestContext* context, folly::EventBase* eb, apache::thrift::concurrency::ThreadManager* tm) {
  apache::thrift::detail::ap::process(this, std::move(req), std::move(serializedRequest), protType, context, eb, tm);
}

std::shared_ptr<folly::RequestContext> CAsyncProcessor::getBaseContextForRequest() {
  return iface_->getBaseContextForRequest();
}

const CAsyncProcessor::ProcessMap& CAsyncProcessor::getBinaryProtocolProcessMap() {
  return binaryProcessMap_;
}

const CAsyncProcessor::ProcessMap CAsyncProcessor::binaryProcessMap_ {
  {"f", &CAsyncProcessor::setUpAndProcess_f<apache::thrift::BinaryProtocolReader, apache::thrift::BinaryProtocolWriter>},
  {"numbers", &CAsyncProcessor::setUpAndProcess_numbers<apache::thrift::BinaryProtocolReader, apache::thrift::BinaryProtocolWriter>},
  {"thing", &CAsyncProcessor::setUpAndProcess_thing<apache::thrift::BinaryProtocolReader, apache::thrift::BinaryProtocolWriter>},
};

const CAsyncProcessor::ProcessMap& CAsyncProcessor::getCompactProtocolProcessMap() {
  return compactProcessMap_;
}

const CAsyncProcessor::ProcessMap CAsyncProcessor::compactProcessMap_ {
  {"f", &CAsyncProcessor::setUpAndProcess_f<apache::thrift::CompactProtocolReader, apache::thrift::CompactProtocolWriter>},
  {"numbers", &CAsyncProcessor::setUpAndProcess_numbers<apache::thrift::CompactProtocolReader, apache::thrift::CompactProtocolWriter>},
  {"thing", &CAsyncProcessor::setUpAndProcess_thing<apache::thrift::CompactProtocolReader, apache::thrift::CompactProtocolWriter>},
};

} // cpp2
