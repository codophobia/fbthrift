/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */

#include "src/gen-py3/module/metadata.h"

namespace cpp2 {
::apache::thrift::metadata::ThriftMetadata module_getThriftModuleMetadata() {
  ::apache::thrift::metadata::ThriftServiceMetadataResponse response;
  ::apache::thrift::metadata::ThriftMetadata& metadata = *response.metadata_ref();
  ::apache::thrift::detail::md::StructMetadata<MyData>::gen(metadata);
  ::apache::thrift::detail::md::StructMetadata<MyStruct>::gen(metadata);
  ::apache::thrift::detail::md::StructMetadata<MyDataPatch>::gen(metadata);
  ::apache::thrift::detail::md::StructMetadata<MyDataValuePatch>::gen(metadata);
  ::apache::thrift::detail::md::StructMetadata<OptionalMyDataValuePatch>::gen(metadata);
  ::apache::thrift::detail::md::StructMetadata<MyStructPatch>::gen(metadata);
  ::apache::thrift::detail::md::StructMetadata<MyStructField21Patch>::gen(metadata);
  ::apache::thrift::detail::md::StructMetadata<OptionalMyStructField21Patch>::gen(metadata);
  ::apache::thrift::detail::md::StructMetadata<MyStructField22Patch>::gen(metadata);
  ::apache::thrift::detail::md::StructMetadata<OptionalMyStructField22Patch>::gen(metadata);
  ::apache::thrift::detail::md::StructMetadata<MyStructField23Patch>::gen(metadata);
  ::apache::thrift::detail::md::StructMetadata<OptionalMyStructField23Patch>::gen(metadata);
  ::apache::thrift::detail::md::StructMetadata<MyStructValuePatch>::gen(metadata);
  ::apache::thrift::detail::md::StructMetadata<OptionalMyStructValuePatch>::gen(metadata);
  return metadata;
}
} // namespace cpp2
