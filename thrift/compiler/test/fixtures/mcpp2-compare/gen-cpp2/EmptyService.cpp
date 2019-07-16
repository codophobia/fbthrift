/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
#include "thrift/compiler/test/fixtures/mcpp2-compare/gen-cpp2/EmptyService.h"
#include "thrift/compiler/test/fixtures/mcpp2-compare/gen-cpp2/EmptyService.tcc"

#include <thrift/lib/cpp2/gen/service_cpp.h>

namespace some { namespace valid { namespace ns {
std::unique_ptr<apache::thrift::AsyncProcessor> EmptyServiceSvIf::getProcessor() {
  return std::make_unique<EmptyServiceAsyncProcessor>(this);
}

const char* EmptyServiceAsyncProcessor::getServiceName() {
  return "EmptyService";
}

folly::Optional<std::string> EmptyServiceAsyncProcessor::getCacheKey(folly::IOBuf* buf, apache::thrift::protocol::PROTOCOL_TYPES protType) {
  return apache::thrift::detail::ap::get_cache_key(buf, protType, cacheKeyMap_);
}

void EmptyServiceAsyncProcessor::process(std::unique_ptr<apache::thrift::ResponseChannelRequest> req, std::unique_ptr<folly::IOBuf> buf, apache::thrift::protocol::PROTOCOL_TYPES protType, apache::thrift::Cpp2RequestContext* context, folly::EventBase* eb, apache::thrift::concurrency::ThreadManager* tm) {
  apache::thrift::detail::ap::process(this, std::move(req), std::move(buf), protType, context, eb, tm);
}

bool EmptyServiceAsyncProcessor::isOnewayMethod(const folly::IOBuf* buf, const apache::thrift::transport::THeader* header) {
  return apache::thrift::detail::ap::is_oneway_method(buf, header, onewayMethods_);
}

std::shared_ptr<folly::RequestContext> EmptyServiceAsyncProcessor::getBaseContextForRequest() {
  return iface_->getBaseContextForRequest();
}

std::unordered_set<std::string> EmptyServiceAsyncProcessor::onewayMethods_ {};
std::unordered_map<std::string, int16_t> EmptyServiceAsyncProcessor::cacheKeyMap_ {};
const EmptyServiceAsyncProcessor::ProcessMap& EmptyServiceAsyncProcessor::getBinaryProtocolProcessMap() {
  return binaryProcessMap_;
}

const EmptyServiceAsyncProcessor::ProcessMap EmptyServiceAsyncProcessor::binaryProcessMap_ {};

const EmptyServiceAsyncProcessor::ProcessMap& EmptyServiceAsyncProcessor::getCompactProtocolProcessMap() {
  return compactProcessMap_;
}

const EmptyServiceAsyncProcessor::ProcessMap EmptyServiceAsyncProcessor::compactProcessMap_ {};

}}} // some::valid::ns
namespace apache { namespace thrift {

}} // apache::thrift
