/**
 * Autogenerated by Thrift for src/module.thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated @nocommit
 */
#include <thrift/lib/cpp2/gen/module_metadata_cpp.h>
#include "thrift/compiler/test/fixtures/exceptions/gen-cpp2/module_metadata.h"

// some of these functions can be so large that the compiler gives up optimizing
// them - and issues a warning which may be treated as an error!
//
// these functions are so rarely called that it is probably okay for them not to
// be optimized in practice
FOLLY_CLANG_DISABLE_WARNING("-Wignored-optimization-argument")

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


const ::apache::thrift::metadata::ThriftStruct&
StructMetadata<::cpp2::Fiery>::gen(ThriftMetadata& metadata) {
  auto res = metadata.structs_ref()->emplace("module.Fiery", ::apache::thrift::metadata::ThriftStruct{});
  if (!res.second) {
    return res.first->second;
  }
  ::apache::thrift::metadata::ThriftStruct& module_Fiery = res.first->second;
  module_Fiery.name_ref() = "module.Fiery";
  module_Fiery.is_union_ref() = false;
  static const EncodedThriftField
  module_Fiery_fields[] = {
    {1, "message", false, std::make_unique<Primitive>(ThriftPrimitiveType::THRIFT_STRING_TYPE), std::vector<ThriftConstStruct>{}},
  };
  for (const auto& f : module_Fiery_fields) {
    ::apache::thrift::metadata::ThriftField field;
    field.id_ref() = f.id;
    field.name_ref() = f.name;
    field.is_optional_ref() = f.is_optional;
    f.metadata_type_interface->writeAndGenType(*field.type_ref(), metadata);
    field.structured_annotations_ref() = f.structured_annotations;
    module_Fiery.fields_ref()->push_back(std::move(field));
  }
  return res.first->second;
}
const ::apache::thrift::metadata::ThriftStruct&
StructMetadata<::cpp2::Serious>::gen(ThriftMetadata& metadata) {
  auto res = metadata.structs_ref()->emplace("module.Serious", ::apache::thrift::metadata::ThriftStruct{});
  if (!res.second) {
    return res.first->second;
  }
  ::apache::thrift::metadata::ThriftStruct& module_Serious = res.first->second;
  module_Serious.name_ref() = "module.Serious";
  module_Serious.is_union_ref() = false;
  static const EncodedThriftField
  module_Serious_fields[] = {
    {1, "sonnet", true, std::make_unique<Primitive>(ThriftPrimitiveType::THRIFT_STRING_TYPE), std::vector<ThriftConstStruct>{}},
  };
  for (const auto& f : module_Serious_fields) {
    ::apache::thrift::metadata::ThriftField field;
    field.id_ref() = f.id;
    field.name_ref() = f.name;
    field.is_optional_ref() = f.is_optional;
    f.metadata_type_interface->writeAndGenType(*field.type_ref(), metadata);
    field.structured_annotations_ref() = f.structured_annotations;
    module_Serious.fields_ref()->push_back(std::move(field));
  }
  return res.first->second;
}
const ::apache::thrift::metadata::ThriftStruct&
StructMetadata<::cpp2::ComplexFieldNames>::gen(ThriftMetadata& metadata) {
  auto res = metadata.structs_ref()->emplace("module.ComplexFieldNames", ::apache::thrift::metadata::ThriftStruct{});
  if (!res.second) {
    return res.first->second;
  }
  ::apache::thrift::metadata::ThriftStruct& module_ComplexFieldNames = res.first->second;
  module_ComplexFieldNames.name_ref() = "module.ComplexFieldNames";
  module_ComplexFieldNames.is_union_ref() = false;
  static const EncodedThriftField
  module_ComplexFieldNames_fields[] = {
    {1, "error_message", false, std::make_unique<Primitive>(ThriftPrimitiveType::THRIFT_STRING_TYPE), std::vector<ThriftConstStruct>{}},
    {2, "internal_error_message", false, std::make_unique<Primitive>(ThriftPrimitiveType::THRIFT_STRING_TYPE), std::vector<ThriftConstStruct>{}},
  };
  for (const auto& f : module_ComplexFieldNames_fields) {
    ::apache::thrift::metadata::ThriftField field;
    field.id_ref() = f.id;
    field.name_ref() = f.name;
    field.is_optional_ref() = f.is_optional;
    f.metadata_type_interface->writeAndGenType(*field.type_ref(), metadata);
    field.structured_annotations_ref() = f.structured_annotations;
    module_ComplexFieldNames.fields_ref()->push_back(std::move(field));
  }
  return res.first->second;
}
const ::apache::thrift::metadata::ThriftStruct&
StructMetadata<::cpp2::CustomFieldNames>::gen(ThriftMetadata& metadata) {
  auto res = metadata.structs_ref()->emplace("module.CustomFieldNames", ::apache::thrift::metadata::ThriftStruct{});
  if (!res.second) {
    return res.first->second;
  }
  ::apache::thrift::metadata::ThriftStruct& module_CustomFieldNames = res.first->second;
  module_CustomFieldNames.name_ref() = "module.CustomFieldNames";
  module_CustomFieldNames.is_union_ref() = false;
  static const EncodedThriftField
  module_CustomFieldNames_fields[] = {
    {1, "error_message", false, std::make_unique<Primitive>(ThriftPrimitiveType::THRIFT_STRING_TYPE), std::vector<ThriftConstStruct>{}},
    {2, "internal_error_message", false, std::make_unique<Primitive>(ThriftPrimitiveType::THRIFT_STRING_TYPE), std::vector<ThriftConstStruct>{}},
  };
  for (const auto& f : module_CustomFieldNames_fields) {
    ::apache::thrift::metadata::ThriftField field;
    field.id_ref() = f.id;
    field.name_ref() = f.name;
    field.is_optional_ref() = f.is_optional;
    f.metadata_type_interface->writeAndGenType(*field.type_ref(), metadata);
    field.structured_annotations_ref() = f.structured_annotations;
    module_CustomFieldNames.fields_ref()->push_back(std::move(field));
  }
  return res.first->second;
}
const ::apache::thrift::metadata::ThriftStruct&
StructMetadata<::cpp2::ExceptionWithPrimitiveField>::gen(ThriftMetadata& metadata) {
  auto res = metadata.structs_ref()->emplace("module.ExceptionWithPrimitiveField", ::apache::thrift::metadata::ThriftStruct{});
  if (!res.second) {
    return res.first->second;
  }
  ::apache::thrift::metadata::ThriftStruct& module_ExceptionWithPrimitiveField = res.first->second;
  module_ExceptionWithPrimitiveField.name_ref() = "module.ExceptionWithPrimitiveField";
  module_ExceptionWithPrimitiveField.is_union_ref() = false;
  static const EncodedThriftField
  module_ExceptionWithPrimitiveField_fields[] = {
    {1, "message", false, std::make_unique<Primitive>(ThriftPrimitiveType::THRIFT_STRING_TYPE), std::vector<ThriftConstStruct>{}},
    {2, "error_code", false, std::make_unique<Primitive>(ThriftPrimitiveType::THRIFT_I32_TYPE), std::vector<ThriftConstStruct>{}},
  };
  for (const auto& f : module_ExceptionWithPrimitiveField_fields) {
    ::apache::thrift::metadata::ThriftField field;
    field.id_ref() = f.id;
    field.name_ref() = f.name;
    field.is_optional_ref() = f.is_optional;
    f.metadata_type_interface->writeAndGenType(*field.type_ref(), metadata);
    field.structured_annotations_ref() = f.structured_annotations;
    module_ExceptionWithPrimitiveField.fields_ref()->push_back(std::move(field));
  }
  return res.first->second;
}
const ::apache::thrift::metadata::ThriftStruct&
StructMetadata<::cpp2::Banal>::gen(ThriftMetadata& metadata) {
  auto res = metadata.structs_ref()->emplace("module.Banal", ::apache::thrift::metadata::ThriftStruct{});
  if (!res.second) {
    return res.first->second;
  }
  ::apache::thrift::metadata::ThriftStruct& module_Banal = res.first->second;
  module_Banal.name_ref() = "module.Banal";
  module_Banal.is_union_ref() = false;
  return res.first->second;
}

void ExceptionMetadata<::cpp2::Fiery>::gen(ThriftMetadata& metadata) {
  auto res = metadata.exceptions_ref()->emplace("module.Fiery", ::apache::thrift::metadata::ThriftException{});
  if (!res.second) {
    return;
  }
  ::apache::thrift::metadata::ThriftException& module_Fiery = res.first->second;
  module_Fiery.name_ref() = "module.Fiery";
  static const EncodedThriftField
  module_Fiery_fields[] = {
    {1, "message", false, std::make_unique<Primitive>(ThriftPrimitiveType::THRIFT_STRING_TYPE), std::vector<ThriftConstStruct>{}},
  };
  for (const auto& f : module_Fiery_fields) {
    ::apache::thrift::metadata::ThriftField field;
    field.id_ref() = f.id;
    field.name_ref() = f.name;
    field.is_optional_ref() = f.is_optional;
    f.metadata_type_interface->writeAndGenType(*field.type_ref(), metadata);
    module_Fiery.fields_ref()->push_back(std::move(field));
  }
}
void ExceptionMetadata<::cpp2::Serious>::gen(ThriftMetadata& metadata) {
  auto res = metadata.exceptions_ref()->emplace("module.Serious", ::apache::thrift::metadata::ThriftException{});
  if (!res.second) {
    return;
  }
  ::apache::thrift::metadata::ThriftException& module_Serious = res.first->second;
  module_Serious.name_ref() = "module.Serious";
  static const EncodedThriftField
  module_Serious_fields[] = {
    {1, "sonnet", true, std::make_unique<Primitive>(ThriftPrimitiveType::THRIFT_STRING_TYPE), std::vector<ThriftConstStruct>{}},
  };
  for (const auto& f : module_Serious_fields) {
    ::apache::thrift::metadata::ThriftField field;
    field.id_ref() = f.id;
    field.name_ref() = f.name;
    field.is_optional_ref() = f.is_optional;
    f.metadata_type_interface->writeAndGenType(*field.type_ref(), metadata);
    module_Serious.fields_ref()->push_back(std::move(field));
  }
}
void ExceptionMetadata<::cpp2::ComplexFieldNames>::gen(ThriftMetadata& metadata) {
  auto res = metadata.exceptions_ref()->emplace("module.ComplexFieldNames", ::apache::thrift::metadata::ThriftException{});
  if (!res.second) {
    return;
  }
  ::apache::thrift::metadata::ThriftException& module_ComplexFieldNames = res.first->second;
  module_ComplexFieldNames.name_ref() = "module.ComplexFieldNames";
  static const EncodedThriftField
  module_ComplexFieldNames_fields[] = {
    {1, "error_message", false, std::make_unique<Primitive>(ThriftPrimitiveType::THRIFT_STRING_TYPE), std::vector<ThriftConstStruct>{}},
    {2, "internal_error_message", false, std::make_unique<Primitive>(ThriftPrimitiveType::THRIFT_STRING_TYPE), std::vector<ThriftConstStruct>{}},
  };
  for (const auto& f : module_ComplexFieldNames_fields) {
    ::apache::thrift::metadata::ThriftField field;
    field.id_ref() = f.id;
    field.name_ref() = f.name;
    field.is_optional_ref() = f.is_optional;
    f.metadata_type_interface->writeAndGenType(*field.type_ref(), metadata);
    module_ComplexFieldNames.fields_ref()->push_back(std::move(field));
  }
}
void ExceptionMetadata<::cpp2::CustomFieldNames>::gen(ThriftMetadata& metadata) {
  auto res = metadata.exceptions_ref()->emplace("module.CustomFieldNames", ::apache::thrift::metadata::ThriftException{});
  if (!res.second) {
    return;
  }
  ::apache::thrift::metadata::ThriftException& module_CustomFieldNames = res.first->second;
  module_CustomFieldNames.name_ref() = "module.CustomFieldNames";
  static const EncodedThriftField
  module_CustomFieldNames_fields[] = {
    {1, "error_message", false, std::make_unique<Primitive>(ThriftPrimitiveType::THRIFT_STRING_TYPE), std::vector<ThriftConstStruct>{}},
    {2, "internal_error_message", false, std::make_unique<Primitive>(ThriftPrimitiveType::THRIFT_STRING_TYPE), std::vector<ThriftConstStruct>{}},
  };
  for (const auto& f : module_CustomFieldNames_fields) {
    ::apache::thrift::metadata::ThriftField field;
    field.id_ref() = f.id;
    field.name_ref() = f.name;
    field.is_optional_ref() = f.is_optional;
    f.metadata_type_interface->writeAndGenType(*field.type_ref(), metadata);
    module_CustomFieldNames.fields_ref()->push_back(std::move(field));
  }
}
void ExceptionMetadata<::cpp2::ExceptionWithPrimitiveField>::gen(ThriftMetadata& metadata) {
  auto res = metadata.exceptions_ref()->emplace("module.ExceptionWithPrimitiveField", ::apache::thrift::metadata::ThriftException{});
  if (!res.second) {
    return;
  }
  ::apache::thrift::metadata::ThriftException& module_ExceptionWithPrimitiveField = res.first->second;
  module_ExceptionWithPrimitiveField.name_ref() = "module.ExceptionWithPrimitiveField";
  static const EncodedThriftField
  module_ExceptionWithPrimitiveField_fields[] = {
    {1, "message", false, std::make_unique<Primitive>(ThriftPrimitiveType::THRIFT_STRING_TYPE), std::vector<ThriftConstStruct>{}},
    {2, "error_code", false, std::make_unique<Primitive>(ThriftPrimitiveType::THRIFT_I32_TYPE), std::vector<ThriftConstStruct>{}},
  };
  for (const auto& f : module_ExceptionWithPrimitiveField_fields) {
    ::apache::thrift::metadata::ThriftField field;
    field.id_ref() = f.id;
    field.name_ref() = f.name;
    field.is_optional_ref() = f.is_optional;
    f.metadata_type_interface->writeAndGenType(*field.type_ref(), metadata);
    module_ExceptionWithPrimitiveField.fields_ref()->push_back(std::move(field));
  }
}
void ExceptionMetadata<::cpp2::Banal>::gen(ThriftMetadata& metadata) {
  auto res = metadata.exceptions_ref()->emplace("module.Banal", ::apache::thrift::metadata::ThriftException{});
  if (!res.second) {
    return;
  }
  ::apache::thrift::metadata::ThriftException& module_Banal = res.first->second;
  module_Banal.name_ref() = "module.Banal";
}
void ServiceMetadata<::cpp2::RaiserSvIf>::gen_doBland(ThriftMetadata& metadata, ThriftService& service) {
  ::apache::thrift::metadata::ThriftFunction func;
  (void)metadata;
  func.name_ref() = "doBland";
  auto func_ret_type = std::make_unique<Primitive>(ThriftPrimitiveType::THRIFT_VOID_TYPE);
  func_ret_type->writeAndGenType(*func.return_type_ref(), metadata);
  func.is_oneway_ref() = false;
  service.functions_ref()->push_back(std::move(func));
}
void ServiceMetadata<::cpp2::RaiserSvIf>::gen_doRaise(ThriftMetadata& metadata, ThriftService& service) {
  ::apache::thrift::metadata::ThriftFunction func;
  (void)metadata;
  func.name_ref() = "doRaise";
  auto func_ret_type = std::make_unique<Primitive>(ThriftPrimitiveType::THRIFT_VOID_TYPE);
  func_ret_type->writeAndGenType(*func.return_type_ref(), metadata);
  ::apache::thrift::metadata::ThriftField module_Raiser_doRaise_b_1;
  module_Raiser_doRaise_b_1.id_ref() = 1;
  module_Raiser_doRaise_b_1.name_ref() = "b";
  module_Raiser_doRaise_b_1.is_optional_ref() = false;
  auto module_Raiser_doRaise_b_1_type = std::make_unique<Typedef>("module.Banal", std::make_unique<Struct< ::cpp2::Banal>>("module.Banal"), std::vector<ThriftConstStruct>{});
  module_Raiser_doRaise_b_1_type->writeAndGenType(*module_Raiser_doRaise_b_1.type_ref(), metadata);
  func.exceptions_ref()->push_back(std::move(module_Raiser_doRaise_b_1));
  ExceptionMetadata< ::cpp2::Banal>::gen(metadata);
  ::apache::thrift::metadata::ThriftField module_Raiser_doRaise_f_2;
  module_Raiser_doRaise_f_2.id_ref() = 2;
  module_Raiser_doRaise_f_2.name_ref() = "f";
  module_Raiser_doRaise_f_2.is_optional_ref() = false;
  auto module_Raiser_doRaise_f_2_type = std::make_unique<Struct< ::cpp2::Fiery>>("module.Fiery");
  module_Raiser_doRaise_f_2_type->writeAndGenType(*module_Raiser_doRaise_f_2.type_ref(), metadata);
  func.exceptions_ref()->push_back(std::move(module_Raiser_doRaise_f_2));
  ExceptionMetadata< ::cpp2::Fiery>::gen(metadata);
  ::apache::thrift::metadata::ThriftField module_Raiser_doRaise_s_3;
  module_Raiser_doRaise_s_3.id_ref() = 3;
  module_Raiser_doRaise_s_3.name_ref() = "s";
  module_Raiser_doRaise_s_3.is_optional_ref() = false;
  auto module_Raiser_doRaise_s_3_type = std::make_unique<Struct< ::cpp2::Serious>>("module.Serious");
  module_Raiser_doRaise_s_3_type->writeAndGenType(*module_Raiser_doRaise_s_3.type_ref(), metadata);
  func.exceptions_ref()->push_back(std::move(module_Raiser_doRaise_s_3));
  ExceptionMetadata< ::cpp2::Serious>::gen(metadata);
  func.is_oneway_ref() = false;
  service.functions_ref()->push_back(std::move(func));
}
void ServiceMetadata<::cpp2::RaiserSvIf>::gen_get200(ThriftMetadata& metadata, ThriftService& service) {
  ::apache::thrift::metadata::ThriftFunction func;
  (void)metadata;
  func.name_ref() = "get200";
  auto func_ret_type = std::make_unique<Primitive>(ThriftPrimitiveType::THRIFT_STRING_TYPE);
  func_ret_type->writeAndGenType(*func.return_type_ref(), metadata);
  func.is_oneway_ref() = false;
  service.functions_ref()->push_back(std::move(func));
}
void ServiceMetadata<::cpp2::RaiserSvIf>::gen_get500(ThriftMetadata& metadata, ThriftService& service) {
  ::apache::thrift::metadata::ThriftFunction func;
  (void)metadata;
  func.name_ref() = "get500";
  auto func_ret_type = std::make_unique<Primitive>(ThriftPrimitiveType::THRIFT_STRING_TYPE);
  func_ret_type->writeAndGenType(*func.return_type_ref(), metadata);
  ::apache::thrift::metadata::ThriftField module_Raiser_get500_f_1;
  module_Raiser_get500_f_1.id_ref() = 1;
  module_Raiser_get500_f_1.name_ref() = "f";
  module_Raiser_get500_f_1.is_optional_ref() = false;
  auto module_Raiser_get500_f_1_type = std::make_unique<Struct< ::cpp2::Fiery>>("module.Fiery");
  module_Raiser_get500_f_1_type->writeAndGenType(*module_Raiser_get500_f_1.type_ref(), metadata);
  func.exceptions_ref()->push_back(std::move(module_Raiser_get500_f_1));
  ExceptionMetadata< ::cpp2::Fiery>::gen(metadata);
  ::apache::thrift::metadata::ThriftField module_Raiser_get500_b_2;
  module_Raiser_get500_b_2.id_ref() = 2;
  module_Raiser_get500_b_2.name_ref() = "b";
  module_Raiser_get500_b_2.is_optional_ref() = false;
  auto module_Raiser_get500_b_2_type = std::make_unique<Typedef>("module.Banal", std::make_unique<Struct< ::cpp2::Banal>>("module.Banal"), std::vector<ThriftConstStruct>{});
  module_Raiser_get500_b_2_type->writeAndGenType(*module_Raiser_get500_b_2.type_ref(), metadata);
  func.exceptions_ref()->push_back(std::move(module_Raiser_get500_b_2));
  ExceptionMetadata< ::cpp2::Banal>::gen(metadata);
  ::apache::thrift::metadata::ThriftField module_Raiser_get500_s_3;
  module_Raiser_get500_s_3.id_ref() = 3;
  module_Raiser_get500_s_3.name_ref() = "s";
  module_Raiser_get500_s_3.is_optional_ref() = false;
  auto module_Raiser_get500_s_3_type = std::make_unique<Struct< ::cpp2::Serious>>("module.Serious");
  module_Raiser_get500_s_3_type->writeAndGenType(*module_Raiser_get500_s_3.type_ref(), metadata);
  func.exceptions_ref()->push_back(std::move(module_Raiser_get500_s_3));
  ExceptionMetadata< ::cpp2::Serious>::gen(metadata);
  func.is_oneway_ref() = false;
  service.functions_ref()->push_back(std::move(func));
}

void ServiceMetadata<::cpp2::RaiserSvIf>::gen(::apache::thrift::metadata::ThriftServiceMetadataResponse& response) {
  const ::apache::thrift::metadata::ThriftServiceContextRef* self = genRecurse(*response.metadata_ref(), *response.services_ref());
  DCHECK(self != nullptr);
  // TODO(praihan): Remove ThriftServiceContext from response. But in the meantime, we need to fill the field with the result of looking up in ThriftMetadata.
  ::apache::thrift::metadata::ThriftServiceContext context;
  context.module_ref() = *self->module_ref();
  context.service_info_ref() = response.metadata_ref()->services_ref()->at(*self->service_name_ref());
  response.context_ref() = std::move(context);
}

const ThriftServiceContextRef* ServiceMetadata<::cpp2::RaiserSvIf>::genRecurse(ThriftMetadata& metadata, std::vector<ThriftServiceContextRef>& services) {
  (void) metadata;
  ::apache::thrift::metadata::ThriftService module_Raiser;
  module_Raiser.name_ref() = "module.Raiser";
  static const ThriftFunctionGenerator functions[] = {
    ServiceMetadata<::cpp2::RaiserSvIf>::gen_doBland,
    ServiceMetadata<::cpp2::RaiserSvIf>::gen_doRaise,
    ServiceMetadata<::cpp2::RaiserSvIf>::gen_get200,
    ServiceMetadata<::cpp2::RaiserSvIf>::gen_get500,
  };
  for (auto& function_gen : functions) {
    function_gen(metadata, module_Raiser);
  }
  // We need to keep the index around because a reference or iterator could be invalidated.
  auto selfIndex = services.size();
  services.emplace_back();
  ThriftServiceContextRef& context = services[selfIndex];
  metadata.services_ref()->emplace("module.Raiser", std::move(module_Raiser));
  context.service_name_ref() = "module.Raiser";
  ::apache::thrift::metadata::ThriftModuleContext module;
  module.name_ref() = "module";
  context.module_ref() = std::move(module);
  return &context;
}
} // namespace md
} // namespace detail
} // namespace thrift
} // namespace apache
