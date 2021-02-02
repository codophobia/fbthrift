/**
 * Autogenerated by Thrift for src/module.thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */

#include "thrift/compiler/test/fixtures/basic-annotations/gen-cpp2/MyServicePrioChildAsyncClient.h"

#include <thrift/lib/cpp2/gen/client_cpp.h>

namespace cpp2 {
typedef apache::thrift::ThriftPresult<false> MyServicePrioChild_pang_pargs;
typedef apache::thrift::ThriftPresult<true> MyServicePrioChild_pang_presult;

template <typename Protocol_>
void MyServicePrioChildAsyncClient::pangT(Protocol_* prot, apache::thrift::RpcOptions rpcOptions, std::shared_ptr<apache::thrift::detail::ac::ClientRequestContext> ctx, apache::thrift::RequestClientCallback::Ptr callback) {

  std::shared_ptr<apache::thrift::transport::THeader> header(ctx, &ctx->header);
  MyServicePrioChild_pang_pargs args;
  auto sizer = [&](Protocol_* p) { return args.serializedSizeZC(p); };
  auto writer = [&](Protocol_* p) { args.write(p); };
  static constexpr const folly::StringPiece methodName = "pang";
  apache::thrift::clientSendT<apache::thrift::RpcKind::SINGLE_REQUEST_SINGLE_RESPONSE, Protocol_>(prot, std::move(rpcOptions), std::move(callback), ctx->ctx, std::move(header), channel_.get(), apache::thrift::ManagedStringView(methodName, false), writer, sizer);
  ctx->reqContext.setRequestHeader(nullptr);
}



void MyServicePrioChildAsyncClient::pang(std::unique_ptr<apache::thrift::RequestCallback> callback) {
  ::apache::thrift::RpcOptions rpcOptions;
  pang(rpcOptions, std::move(callback));
}

void MyServicePrioChildAsyncClient::pang(apache::thrift::RpcOptions& rpcOptions, std::unique_ptr<apache::thrift::RequestCallback> callback) {
  auto ctx = pangCtx(rpcOptions);
  apache::thrift::RequestCallback::Context callbackContext;
  callbackContext.protocolId =
      apache::thrift::GeneratedAsyncClient::getChannel()->getProtocolId();
  callbackContext.ctx = std::shared_ptr<apache::thrift::ContextStack>(ctx, &ctx->ctx);
  auto wrappedCallback = apache::thrift::toRequestClientCallbackPtr(std::move(callback), std::move(callbackContext));
  pangImpl(rpcOptions, std::move(ctx), std::move(wrappedCallback));
}

void MyServicePrioChildAsyncClient::pangImpl(const apache::thrift::RpcOptions& rpcOptions, std::shared_ptr<apache::thrift::detail::ac::ClientRequestContext> ctx, apache::thrift::RequestClientCallback::Ptr callback) {
  switch (apache::thrift::GeneratedAsyncClient::getChannel()->getProtocolId()) {
    case apache::thrift::protocol::T_BINARY_PROTOCOL:
    {
      apache::thrift::BinaryProtocolWriter writer;
      pangT(&writer, rpcOptions, std::move(ctx), std::move(callback));
      break;
    }
    case apache::thrift::protocol::T_COMPACT_PROTOCOL:
    {
      apache::thrift::CompactProtocolWriter writer;
      pangT(&writer, rpcOptions, std::move(ctx), std::move(callback));
      break;
    }
    default:
    {
      apache::thrift::detail::ac::throw_app_exn("Could not find Protocol");
    }
  }
}

std::shared_ptr<::apache::thrift::detail::ac::ClientRequestContext> MyServicePrioChildAsyncClient::pangCtx(apache::thrift::RpcOptions& rpcOptions) {
  return std::make_shared<apache::thrift::detail::ac::ClientRequestContext>(
      channel_->getProtocolId(),
      rpcOptions.releaseWriteHeaders(),
      handlers_,
      getServiceName(),
      "MyServicePrioChild.pang");
}

void MyServicePrioChildAsyncClient::sync_pang() {
  ::apache::thrift::RpcOptions rpcOptions;
  sync_pang(rpcOptions);
}

void MyServicePrioChildAsyncClient::sync_pang(apache::thrift::RpcOptions& rpcOptions) {
  apache::thrift::ClientReceiveState returnState;
  apache::thrift::ClientSyncCallback<false> callback(&returnState);
  auto protocolId = apache::thrift::GeneratedAsyncClient::getChannel()->getProtocolId();
  auto evb = apache::thrift::GeneratedAsyncClient::getChannel()->getEventBase();
  auto ctx = pangCtx(rpcOptions);
  auto wrappedCallback = apache::thrift::RequestClientCallback::Ptr(&callback);
  pangImpl(rpcOptions, ctx, std::move(wrappedCallback));
  callback.waitUntilDone(evb);

  if (returnState.isException()) {
    returnState.exception().throw_exception();
  }
  returnState.resetProtocolId(protocolId);
  returnState.resetCtx(std::shared_ptr<apache::thrift::ContextStack>(ctx, &ctx->ctx));
  if (returnState.header() && !returnState.header()->getHeaders().empty()) {
    rpcOptions.setReadHeaders(returnState.header()->releaseHeaders());
  }
  return folly::fibers::runInMainContext([&] {
      recv_pang(returnState);
  });
}


folly::Future<folly::Unit> MyServicePrioChildAsyncClient::future_pang() {
  ::apache::thrift::RpcOptions rpcOptions;
  return future_pang(rpcOptions);
}

folly::SemiFuture<folly::Unit> MyServicePrioChildAsyncClient::semifuture_pang() {
  ::apache::thrift::RpcOptions rpcOptions;
  return semifuture_pang(rpcOptions);
}

folly::Future<folly::Unit> MyServicePrioChildAsyncClient::future_pang(apache::thrift::RpcOptions& rpcOptions) {
  folly::Promise<folly::Unit> promise;
  auto future = promise.getFuture();
  auto callback = std::make_unique<apache::thrift::FutureCallback<folly::Unit>>(std::move(promise), recv_wrapped_pang, channel_);
  pang(rpcOptions, std::move(callback));
  return future;
}

folly::SemiFuture<folly::Unit> MyServicePrioChildAsyncClient::semifuture_pang(apache::thrift::RpcOptions& rpcOptions) {
  auto callbackAndFuture = makeSemiFutureCallback(recv_wrapped_pang, channel_);
  auto callback = std::move(callbackAndFuture.first);
  pang(rpcOptions, std::move(callback));
  return std::move(callbackAndFuture.second);
}

folly::Future<std::pair<folly::Unit, std::unique_ptr<apache::thrift::transport::THeader>>> MyServicePrioChildAsyncClient::header_future_pang(apache::thrift::RpcOptions& rpcOptions) {
  folly::Promise<std::pair<folly::Unit, std::unique_ptr<apache::thrift::transport::THeader>>> promise;
  auto future = promise.getFuture();
  auto callback = std::make_unique<apache::thrift::HeaderFutureCallback<folly::Unit>>(std::move(promise), recv_wrapped_pang, channel_);
  pang(rpcOptions, std::move(callback));
  return future;
}

folly::SemiFuture<std::pair<folly::Unit, std::unique_ptr<apache::thrift::transport::THeader>>> MyServicePrioChildAsyncClient::header_semifuture_pang(apache::thrift::RpcOptions& rpcOptions) {
  auto callbackAndFuture = makeHeaderSemiFutureCallback(recv_wrapped_pang, channel_);
  auto callback = std::move(callbackAndFuture.first);
  pang(rpcOptions, std::move(callback));
  return std::move(callbackAndFuture.second);
}

void MyServicePrioChildAsyncClient::pang(folly::Function<void (::apache::thrift::ClientReceiveState&&)> callback) {
  pang(std::make_unique<apache::thrift::FunctionReplyCallback>(std::move(callback)));
}

#if FOLLY_HAS_COROUTINES
#endif // FOLLY_HAS_COROUTINES
folly::exception_wrapper MyServicePrioChildAsyncClient::recv_wrapped_pang(::apache::thrift::ClientReceiveState& state) {
  if (state.isException()) {
    return std::move(state.exception());
  }
  if (!state.buf()) {
    return folly::make_exception_wrapper<apache::thrift::TApplicationException>("recv_ called without result");
  }

  using result = MyServicePrioChild_pang_presult;
  constexpr auto const fname = "pang";
  switch (state.protocolId()) {
    case apache::thrift::protocol::T_BINARY_PROTOCOL:
    {
      apache::thrift::BinaryProtocolReader reader;
      return apache::thrift::detail::ac::recv_wrapped<result>(
          fname, &reader, state);
    }
    case apache::thrift::protocol::T_COMPACT_PROTOCOL:
    {
      apache::thrift::CompactProtocolReader reader;
      return apache::thrift::detail::ac::recv_wrapped<result>(
          fname, &reader, state);
    }
    default:
    {
    }
  }
  return folly::make_exception_wrapper<apache::thrift::TApplicationException>("Could not find Protocol");
}

void MyServicePrioChildAsyncClient::recv_pang(::apache::thrift::ClientReceiveState& state) {
  auto ew = recv_wrapped_pang(state);
  if (ew) {
    ew.throw_exception();
  }
}

void MyServicePrioChildAsyncClient::recv_instance_pang(::apache::thrift::ClientReceiveState& state) {
  recv_pang(state);
}

folly::exception_wrapper MyServicePrioChildAsyncClient::recv_instance_wrapped_pang(::apache::thrift::ClientReceiveState& state) {
  return recv_wrapped_pang(state);
}


} // cpp2
