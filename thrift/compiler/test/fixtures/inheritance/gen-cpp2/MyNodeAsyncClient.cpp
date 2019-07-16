/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */

#include "thrift/compiler/test/fixtures/inheritance/gen-cpp2/MyNodeAsyncClient.h"

#include <thrift/lib/cpp2/gen/client_cpp.h>

namespace cpp2 {
typedef apache::thrift::ThriftPresult<false> MyNode_do_mid_pargs;
typedef apache::thrift::ThriftPresult<true> MyNode_do_mid_presult;

template <typename Protocol_>
void MyNodeAsyncClient::do_midT(Protocol_* prot, apache::thrift::RpcOptions& rpcOptions, std::shared_ptr<apache::thrift::detail::ac::ClientRequestContext> ctx, apache::thrift::RequestClientCallback::Ptr callback) {
  std::shared_ptr<apache::thrift::transport::THeader> header(ctx, &ctx->header);
  MyNode_do_mid_pargs args;
  auto sizer = [&](Protocol_* p) { return args.serializedSizeZC(p); };
  auto writer = [&](Protocol_* p) { args.write(p); };
  apache::thrift::clientSendT<Protocol_>(prot, rpcOptions, std::move(callback), ctx->ctx, std::move(header), channel_.get(), "do_mid", writer, sizer, apache::thrift::RpcKind::SINGLE_REQUEST_SINGLE_RESPONSE);
  ctx->reqContext.setRequestHeader(nullptr);
}



void MyNodeAsyncClient::do_mid(std::unique_ptr<apache::thrift::RequestCallback> callback) {
  ::apache::thrift::RpcOptions rpcOptions;
  do_mid(rpcOptions, std::move(callback));
}

void MyNodeAsyncClient::do_mid(apache::thrift::RpcOptions& rpcOptions, std::unique_ptr<apache::thrift::RequestCallback> callback) {
  auto ctx = std::make_shared<apache::thrift::detail::ac::ClientRequestContext>(getChannel()->getProtocolId(), rpcOptions.releaseWriteHeaders(), this->handlers_, this->getServiceName(), "MyNode.do_mid");
  apache::thrift::RequestCallback::Context callbackContext;
  callbackContext.protocolId = getChannel()->getProtocolId();
  callbackContext.ctx = std::shared_ptr<apache::thrift::ContextStack>(ctx, &ctx->ctx);
  do_midImpl(rpcOptions, std::move(ctx), apache::thrift::toRequestClientCallbackPtr(std::move(callback), std::move(callbackContext)));
}

void MyNodeAsyncClient::do_midImpl(apache::thrift::RpcOptions& rpcOptions, std::shared_ptr<apache::thrift::detail::ac::ClientRequestContext> ctx, apache::thrift::RequestClientCallback::Ptr callback) {
  switch(getChannel()->getProtocolId()) {
    case apache::thrift::protocol::T_BINARY_PROTOCOL:
    {
      apache::thrift::BinaryProtocolWriter writer;
      do_midT(&writer, rpcOptions, std::move(ctx), std::move(callback));
      break;
    }
    case apache::thrift::protocol::T_COMPACT_PROTOCOL:
    {
      apache::thrift::CompactProtocolWriter writer;
      do_midT(&writer, rpcOptions, std::move(ctx), std::move(callback));
      break;
    }
    default:
    {
      apache::thrift::detail::ac::throw_app_exn("Could not find Protocol");
    }
  }
}

void MyNodeAsyncClient::sync_do_mid() {
  ::apache::thrift::RpcOptions rpcOptions;
  sync_do_mid(rpcOptions);
}

void MyNodeAsyncClient::sync_do_mid(apache::thrift::RpcOptions& rpcOptions) {
  apache::thrift::ClientReceiveState _returnState;
  apache::thrift::ClientSyncCallback<false> callback(&_returnState);
  auto protocolId = getChannel()->getProtocolId();
  auto evb = getChannel()->getEventBase();
  auto ctx = std::make_shared<apache::thrift::detail::ac::ClientRequestContext>(protocolId, rpcOptions.releaseWriteHeaders(), this->handlers_, this->getServiceName(), "MyNode.do_mid");
  do_midImpl(rpcOptions, ctx, apache::thrift::RequestClientCallback::Ptr(&callback));
  callback.waitUntilDone(evb);
  _returnState.resetProtocolId(protocolId);
  _returnState.resetCtx(std::shared_ptr<apache::thrift::ContextStack>(ctx, &ctx->ctx));
  SCOPE_EXIT {
    if (_returnState.header() && !_returnState.header()->getHeaders().empty()) {
      rpcOptions.setReadHeaders(_returnState.header()->releaseHeaders());
    }
  };
  if (!_returnState.buf()) {
    assert(!!_returnState.exception());
    _returnState.exception().throw_exception();
  }
  recv_do_mid(_returnState);
}

folly::Future<folly::Unit> MyNodeAsyncClient::future_do_mid() {
  ::apache::thrift::RpcOptions rpcOptions;
  return future_do_mid(rpcOptions);
}

folly::SemiFuture<folly::Unit> MyNodeAsyncClient::semifuture_do_mid() {
  ::apache::thrift::RpcOptions rpcOptions;
  return semifuture_do_mid(rpcOptions);
}

folly::Future<folly::Unit> MyNodeAsyncClient::future_do_mid(apache::thrift::RpcOptions& rpcOptions) {
  folly::Promise<folly::Unit> _promise;
  auto _future = _promise.getFuture();
  auto callback = std::make_unique<apache::thrift::FutureCallback<folly::Unit>>(std::move(_promise), recv_wrapped_do_mid, channel_);
  do_mid(rpcOptions, std::move(callback));
  return _future;
}

folly::SemiFuture<folly::Unit> MyNodeAsyncClient::semifuture_do_mid(apache::thrift::RpcOptions& rpcOptions) {
  auto callbackAndFuture = makeSemiFutureCallback(recv_wrapped_do_mid, channel_);
  auto callback = std::move(callbackAndFuture.first);
  do_mid(rpcOptions, std::move(callback));
  return std::move(callbackAndFuture.second);
}

folly::Future<std::pair<folly::Unit, std::unique_ptr<apache::thrift::transport::THeader>>> MyNodeAsyncClient::header_future_do_mid(apache::thrift::RpcOptions& rpcOptions) {
  folly::Promise<std::pair<folly::Unit, std::unique_ptr<apache::thrift::transport::THeader>>> _promise;
  auto _future = _promise.getFuture();
  auto callback = std::make_unique<apache::thrift::HeaderFutureCallback<folly::Unit>>(std::move(_promise), recv_wrapped_do_mid, channel_);
  do_mid(rpcOptions, std::move(callback));
  return _future;
}

folly::SemiFuture<std::pair<folly::Unit, std::unique_ptr<apache::thrift::transport::THeader>>> MyNodeAsyncClient::header_semifuture_do_mid(apache::thrift::RpcOptions& rpcOptions) {
  auto callbackAndFuture = makeHeaderSemiFutureCallback(recv_wrapped_do_mid, channel_);
  auto callback = std::move(callbackAndFuture.first);
  do_mid(rpcOptions, std::move(callback));
  return std::move(callbackAndFuture.second);
}
void MyNodeAsyncClient::do_mid(folly::Function<void (::apache::thrift::ClientReceiveState&&)> callback) {
  do_mid(std::make_unique<apache::thrift::FunctionReplyCallback>(std::move(callback)));
}

folly::exception_wrapper MyNodeAsyncClient::recv_wrapped_do_mid(::apache::thrift::ClientReceiveState& state) {
  if (state.isException()) {
    return std::move(state.exception());
  }
  if (!state.buf()) {
    return folly::make_exception_wrapper<apache::thrift::TApplicationException>("recv_ called without result");
  }

  using result = MyNode_do_mid_presult;
  constexpr auto const fname = "do_mid";
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

void MyNodeAsyncClient::recv_do_mid(::apache::thrift::ClientReceiveState& state) {
  auto ew = recv_wrapped_do_mid(state);
  if (ew) {
    ew.throw_exception();
  }
}

void MyNodeAsyncClient::recv_instance_do_mid(::apache::thrift::ClientReceiveState& state) {
  recv_do_mid(state);
}

folly::exception_wrapper MyNodeAsyncClient::recv_instance_wrapped_do_mid(::apache::thrift::ClientReceiveState& state) {
  return recv_wrapped_do_mid(state);
}

} // cpp2
namespace apache { namespace thrift {

}} // apache::thrift
