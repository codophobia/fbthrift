/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
#include "thrift/compiler/test/fixtures/basic-stack-arguments/gen-cpp2/module_types.h"
#include "thrift/compiler/test/fixtures/basic-stack-arguments/gen-cpp2/module_types.tcc"

#include <thrift/lib/cpp2/gen/module_types_cpp.h>

#include "thrift/compiler/test/fixtures/basic-stack-arguments/gen-cpp2/module_data.h"


namespace apache { namespace thrift {

constexpr std::size_t const TEnumTraits<::cpp2::MyEnum>::size;
folly::Range<::cpp2::MyEnum const*> const TEnumTraits<::cpp2::MyEnum>::values = folly::range(::cpp2::_MyEnumEnumDataStorage::values);
folly::Range<folly::StringPiece const*> const TEnumTraits<::cpp2::MyEnum>::names = folly::range(::cpp2::_MyEnumEnumDataStorage::names);

char const* TEnumTraits<::cpp2::MyEnum>::findName(type value) {
  using factory = ::cpp2::_MyEnum_EnumMapFactory;
  static folly::Indestructible<factory::ValuesToNamesMapType> const map{
      factory::makeValuesToNamesMap()};
  auto found = map->find(value);
  return found == map->end() ? nullptr : found->second;
}

bool TEnumTraits<::cpp2::MyEnum>::findValue(char const* name, type* out) {
  using factory = ::cpp2::_MyEnum_EnumMapFactory;
  static folly::Indestructible<factory::NamesToValuesMapType> const map{
      factory::makeNamesToValuesMap()};
  auto found = map->find(name);
  return found == map->end() ? false : (*out = found->second, true);
}

}} // apache::thrift

namespace cpp2 {

const _MyEnum_EnumMapFactory::ValuesToNamesMapType _MyEnum_VALUES_TO_NAMES = _MyEnum_EnumMapFactory::makeValuesToNamesMap();
const _MyEnum_EnumMapFactory::NamesToValuesMapType _MyEnum_NAMES_TO_VALUES = _MyEnum_EnumMapFactory::makeNamesToValuesMap();

} // cpp2

namespace apache {
namespace thrift {
namespace detail {

void TccStructTraits<::cpp2::MyStruct>::translateFieldName(
    FOLLY_MAYBE_UNUSED folly::StringPiece _fname,
    FOLLY_MAYBE_UNUSED int16_t& fid,
    FOLLY_MAYBE_UNUSED apache::thrift::protocol::TType& _ftype) {
  if (false) {}
  else if (_fname == "MyIntField") {
    fid = 1;
    _ftype = apache::thrift::protocol::T_I64;
  }
  else if (_fname == "MyStringField") {
    fid = 2;
    _ftype = apache::thrift::protocol::T_STRING;
  }
}

} // namespace detail
} // namespace thrift
} // namespace apache

namespace cpp2 {

MyStruct::MyStruct(apache::thrift::FragileConstructor, int64_t MyIntField__arg, ::std::string MyStringField__arg) :
    MyIntField(std::move(MyIntField__arg)),
    MyStringField(std::move(MyStringField__arg)) {
  __isset.MyIntField = true;
  __isset.MyStringField = true;
}

void MyStruct::__clear() {
  // clear all fields
  MyIntField = 0;
  MyStringField = apache::thrift::StringTraits< std::string>::fromStringLiteral("");
  __isset = {};
}

bool MyStruct::operator==(const MyStruct& rhs) const {
  (void)rhs;
  auto& lhs = *this;
  (void)lhs;
  if (!(lhs.MyIntField == rhs.MyIntField)) {
    return false;
  }
  if (!(lhs.MyStringField == rhs.MyStringField)) {
    return false;
  }
  return true;
}

bool MyStruct::operator<(const MyStruct& rhs) const {
  (void)rhs;
  auto& lhs = *this;
  (void)lhs;
  if (!(lhs.MyIntField == rhs.MyIntField)) {
    return lhs.MyIntField < rhs.MyIntField;
  }
  if (!(lhs.MyStringField == rhs.MyStringField)) {
    return lhs.MyStringField < rhs.MyStringField;
  }
  return false;
}


void swap(MyStruct& a, MyStruct& b) {
  using ::std::swap;
  swap(a.MyIntField, b.MyIntField);
  swap(a.MyStringField, b.MyStringField);
  swap(a.__isset, b.__isset);
}

template void MyStruct::readNoXfer<>(apache::thrift::BinaryProtocolReader*);
template uint32_t MyStruct::write<>(apache::thrift::BinaryProtocolWriter*) const;
template uint32_t MyStruct::serializedSize<>(apache::thrift::BinaryProtocolWriter const*) const;
template uint32_t MyStruct::serializedSizeZC<>(apache::thrift::BinaryProtocolWriter const*) const;
template void MyStruct::readNoXfer<>(apache::thrift::CompactProtocolReader*);
template uint32_t MyStruct::write<>(apache::thrift::CompactProtocolWriter*) const;
template uint32_t MyStruct::serializedSize<>(apache::thrift::CompactProtocolWriter const*) const;
template uint32_t MyStruct::serializedSizeZC<>(apache::thrift::CompactProtocolWriter const*) const;

} // cpp2
