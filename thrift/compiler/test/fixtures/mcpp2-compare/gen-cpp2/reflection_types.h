/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
#pragma once

#include <thrift/lib/cpp2/gen/module_types_h.h>



// BEGIN declare_enums

// END declare_enums
// BEGIN struct_indirection

// END struct_indirection
// BEGIN forward_declare
namespace cpp2 {
class ReflectionStruct;
} // cpp2
// END forward_declare
// BEGIN typedefs

// END typedefs
// BEGIN hash_and_equal_to
// END hash_and_equal_to
namespace cpp2 {
class ReflectionStruct final : private apache::thrift::detail::st::ComparisonOperators<ReflectionStruct> {
 public:

  ReflectionStruct() :
      fieldA(5) {}
  // FragileConstructor for use in initialization lists only.
  [[deprecated("This constructor is deprecated")]]
  ReflectionStruct(apache::thrift::FragileConstructor, int32_t fieldA__arg);
  template <typename _T>
  void __set_field(::apache::thrift::detail::argument_wrapper<1, _T> arg) {
    fieldA = arg.extract();
    __isset.fieldA = true;
  }

  ReflectionStruct(ReflectionStruct&&) = default;

  ReflectionStruct(const ReflectionStruct&) = default;

  ReflectionStruct& operator=(ReflectionStruct&&) = default;

  ReflectionStruct& operator=(const ReflectionStruct&) = default;
  void __clear();
  int32_t fieldA;

  struct __isset {
    bool fieldA;
  } __isset = {};
  bool operator==(const ReflectionStruct& rhs) const;
  bool operator<(const ReflectionStruct& rhs) const;

  int32_t get_fieldA() const {
    return fieldA;
  }

  int32_t& set_fieldA(int32_t fieldA_) {
    fieldA = fieldA_;
    __isset.fieldA = true;
    return fieldA;
  }

  template <class Protocol_>
  uint32_t read(Protocol_* iprot);
  template <class Protocol_>
  uint32_t serializedSize(Protocol_ const* prot_) const;
  template <class Protocol_>
  uint32_t serializedSizeZC(Protocol_ const* prot_) const;
  template <class Protocol_>
  uint32_t write(Protocol_* prot_) const;

 private:
  template <class Protocol_>
  void readNoXfer(Protocol_* iprot);

  friend class ::apache::thrift::Cpp2Ops< ReflectionStruct >;
};

void swap(ReflectionStruct& a, ReflectionStruct& b);

template <class Protocol_>
uint32_t ReflectionStruct::read(Protocol_* iprot) {
  auto _xferStart = iprot->getCursorPosition();
  readNoXfer(iprot);
  return iprot->getCursorPosition() - _xferStart;
}

} // cpp2
