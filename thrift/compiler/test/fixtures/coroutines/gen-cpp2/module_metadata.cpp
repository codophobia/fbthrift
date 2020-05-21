/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
#include <thrift/lib/cpp2/gen/module_metadata_cpp.h>
#include "thrift/compiler/test/fixtures/coroutines/gen-cpp2/module_metadata.h"

namespace apache {
namespace thrift {
namespace detail {
namespace md {
using ThriftMetadata = ::apache::thrift::metadata::ThriftMetadata;
using ThriftPrimitiveType = ::apache::thrift::metadata::ThriftPrimitiveType;
using ThriftType = ::apache::thrift::metadata::ThriftType;
using ThriftService = ::apache::thrift::metadata::ThriftService;
using ThriftServiceContext = ::apache::thrift::metadata::ThriftServiceContext;
using ThriftFunctionGenerator = void (*)(ThriftMetadata&, ThriftService&);



void ServiceMetadata<::cpp2::MyServiceSvIf>::gen_ping(ThriftMetadata& metadata, ThriftService& service) {
  ::apache::thrift::metadata::ThriftFunction func;
  (void)metadata;
  func.name = "ping";
  auto func_ret_type = std::make_unique<Primitive>(ThriftPrimitiveType::THRIFT_VOID_TYPE);
  func_ret_type->writeAndGenType(*func.return_type_ref(), metadata);
  func.is_oneway_ref() = false;
  service.functions.push_back(std::move(func));
}
void ServiceMetadata<::cpp2::MyServiceSvIf>::gen_getRandomData(ThriftMetadata& metadata, ThriftService& service) {
  ::apache::thrift::metadata::ThriftFunction func;
  (void)metadata;
  func.name = "getRandomData";
  auto func_ret_type = std::make_unique<Primitive>(ThriftPrimitiveType::THRIFT_STRING_TYPE);
  func_ret_type->writeAndGenType(*func.return_type_ref(), metadata);
  func.is_oneway_ref() = false;
  service.functions.push_back(std::move(func));
}
void ServiceMetadata<::cpp2::MyServiceSvIf>::gen_hasDataById(ThriftMetadata& metadata, ThriftService& service) {
  ::apache::thrift::metadata::ThriftFunction func;
  (void)metadata;
  func.name = "hasDataById";
  auto func_ret_type = std::make_unique<Primitive>(ThriftPrimitiveType::THRIFT_BOOL_TYPE);
  func_ret_type->writeAndGenType(*func.return_type_ref(), metadata);
  ::apache::thrift::metadata::ThriftField module_MyService_hasDataById_id_1;
  module_MyService_hasDataById_id_1.id = 1;
  module_MyService_hasDataById_id_1.name = "id";
  module_MyService_hasDataById_id_1.is_optional = false;
  auto module_MyService_hasDataById_id_1_type = std::make_unique<Primitive>(ThriftPrimitiveType::THRIFT_I64_TYPE);
  module_MyService_hasDataById_id_1_type->writeAndGenType(module_MyService_hasDataById_id_1.type, metadata);
  func.arguments.push_back(std::move(module_MyService_hasDataById_id_1));
  func.is_oneway_ref() = false;
  service.functions.push_back(std::move(func));
}
void ServiceMetadata<::cpp2::MyServiceSvIf>::gen_getDataById(ThriftMetadata& metadata, ThriftService& service) {
  ::apache::thrift::metadata::ThriftFunction func;
  (void)metadata;
  func.name = "getDataById";
  auto func_ret_type = std::make_unique<Primitive>(ThriftPrimitiveType::THRIFT_STRING_TYPE);
  func_ret_type->writeAndGenType(*func.return_type_ref(), metadata);
  ::apache::thrift::metadata::ThriftField module_MyService_getDataById_id_1;
  module_MyService_getDataById_id_1.id = 1;
  module_MyService_getDataById_id_1.name = "id";
  module_MyService_getDataById_id_1.is_optional = false;
  auto module_MyService_getDataById_id_1_type = std::make_unique<Primitive>(ThriftPrimitiveType::THRIFT_I64_TYPE);
  module_MyService_getDataById_id_1_type->writeAndGenType(module_MyService_getDataById_id_1.type, metadata);
  func.arguments.push_back(std::move(module_MyService_getDataById_id_1));
  func.is_oneway_ref() = false;
  service.functions.push_back(std::move(func));
}
void ServiceMetadata<::cpp2::MyServiceSvIf>::gen_putDataById(ThriftMetadata& metadata, ThriftService& service) {
  ::apache::thrift::metadata::ThriftFunction func;
  (void)metadata;
  func.name = "putDataById";
  auto func_ret_type = std::make_unique<Primitive>(ThriftPrimitiveType::THRIFT_VOID_TYPE);
  func_ret_type->writeAndGenType(*func.return_type_ref(), metadata);
  ::apache::thrift::metadata::ThriftField module_MyService_putDataById_id_1;
  module_MyService_putDataById_id_1.id = 1;
  module_MyService_putDataById_id_1.name = "id";
  module_MyService_putDataById_id_1.is_optional = false;
  auto module_MyService_putDataById_id_1_type = std::make_unique<Primitive>(ThriftPrimitiveType::THRIFT_I64_TYPE);
  module_MyService_putDataById_id_1_type->writeAndGenType(module_MyService_putDataById_id_1.type, metadata);
  func.arguments.push_back(std::move(module_MyService_putDataById_id_1));
  ::apache::thrift::metadata::ThriftField module_MyService_putDataById_data_2;
  module_MyService_putDataById_data_2.id = 2;
  module_MyService_putDataById_data_2.name = "data";
  module_MyService_putDataById_data_2.is_optional = false;
  auto module_MyService_putDataById_data_2_type = std::make_unique<Primitive>(ThriftPrimitiveType::THRIFT_STRING_TYPE);
  module_MyService_putDataById_data_2_type->writeAndGenType(module_MyService_putDataById_data_2.type, metadata);
  func.arguments.push_back(std::move(module_MyService_putDataById_data_2));
  func.is_oneway_ref() = false;
  service.functions.push_back(std::move(func));
}

void ServiceMetadata<::cpp2::MyServiceSvIf>::gen(ThriftMetadata& metadata, ThriftServiceContext& context) {
  (void) metadata;
  ::apache::thrift::metadata::ThriftService module_MyService;
  module_MyService.name = "module.MyService";
  static const ThriftFunctionGenerator functions[] = {
    ServiceMetadata<::cpp2::MyServiceSvIf>::gen_ping,
    ServiceMetadata<::cpp2::MyServiceSvIf>::gen_getRandomData,
    ServiceMetadata<::cpp2::MyServiceSvIf>::gen_hasDataById,
    ServiceMetadata<::cpp2::MyServiceSvIf>::gen_getDataById,
    ServiceMetadata<::cpp2::MyServiceSvIf>::gen_putDataById,
  };
  for (auto& function_gen : functions) {
    function_gen(metadata, module_MyService);
  }
  context.set_service_info(std::move(module_MyService));
  ::apache::thrift::metadata::ThriftModuleContext module;
  module.set_name("module");
  context.set_module(std::move(module));
}
} // namespace md
} // namespace detail
} // namespace thrift
} // namespace apache
