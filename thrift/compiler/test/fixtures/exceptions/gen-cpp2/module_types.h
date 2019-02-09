/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
#pragma once

#include <thrift/lib/cpp2/GeneratedHeaderHelper.h>
#include <thrift/lib/cpp2/Thrift.h>
#include <thrift/lib/cpp2/gen/module_types_h.h>
#include <thrift/lib/cpp2/protocol/Protocol.h>


// BEGIN declare_enums

// END declare_enums
// BEGIN struct_indirection

// END struct_indirection
// BEGIN forward_declare
namespace cpp2 {
class Banal;
class Fiery;
class Serious;
} // cpp2
// END forward_declare
// BEGIN typedefs

// END typedefs
// BEGIN hash_and_equal_to
// END hash_and_equal_to
namespace cpp2 {
class Banal final : private apache::thrift::detail::st::ComparisonOperators<Banal>, public apache::thrift::TException {
 public:

  Banal() {}
  // FragileConstructor for use in initialization lists only.
  Banal(apache::thrift::FragileConstructor);

  Banal(Banal&&) = default;

  Banal(const Banal&) = default;

  Banal& operator=(Banal&&) = default;

  Banal& operator=(const Banal&) = default;
  void __clear();
  bool operator==(const Banal& rhs) const;
  bool operator<(const Banal& rhs) const;

  template <class Protocol_>
  uint32_t read(Protocol_* iprot);
  template <class Protocol_>
  uint32_t serializedSize(Protocol_ const* prot_) const;
  template <class Protocol_>
  uint32_t serializedSizeZC(Protocol_ const* prot_) const;
  template <class Protocol_>
  uint32_t write(Protocol_* prot_) const;

  const char* what() const noexcept override {
    return " ::cpp2::Banal";
  }

 private:
  template <class Protocol_>
  void readNoXfer(Protocol_* iprot);

  friend class ::apache::thrift::Cpp2Ops< Banal >;
};

void swap(Banal& a, Banal& b);
extern template void Banal::readNoXfer<>(apache::thrift::BinaryProtocolReader*);
extern template uint32_t Banal::write<>(apache::thrift::BinaryProtocolWriter*) const;
extern template uint32_t Banal::serializedSize<>(apache::thrift::BinaryProtocolWriter const*) const;
extern template uint32_t Banal::serializedSizeZC<>(apache::thrift::BinaryProtocolWriter const*) const;
extern template void Banal::readNoXfer<>(apache::thrift::CompactProtocolReader*);
extern template uint32_t Banal::write<>(apache::thrift::CompactProtocolWriter*) const;
extern template uint32_t Banal::serializedSize<>(apache::thrift::CompactProtocolWriter const*) const;
extern template uint32_t Banal::serializedSizeZC<>(apache::thrift::CompactProtocolWriter const*) const;

template <class Protocol_>
uint32_t Banal::read(Protocol_* iprot) {
  auto _xferStart = iprot->getCurrentPosition().getCurrentPosition();
  readNoXfer(iprot);
  return iprot->getCurrentPosition().getCurrentPosition() - _xferStart;
}

} // cpp2
namespace apache { namespace thrift {

template <> inline void Cpp2Ops< ::cpp2::Banal>::clear( ::cpp2::Banal* obj) {
  return obj->__clear();
}

template <> inline constexpr apache::thrift::protocol::TType Cpp2Ops< ::cpp2::Banal>::thriftType() {
  return apache::thrift::protocol::T_STRUCT;
}

template <> template <class Protocol> uint32_t Cpp2Ops< ::cpp2::Banal>::write(Protocol* proto,  ::cpp2::Banal const* obj) {
  return obj->write(proto);
}

template <> template <class Protocol> void Cpp2Ops< ::cpp2::Banal>::read(Protocol* proto,  ::cpp2::Banal* obj) {
  return obj->readNoXfer(proto);
}

template <> template <class Protocol> uint32_t Cpp2Ops< ::cpp2::Banal>::serializedSize(Protocol const* proto,  ::cpp2::Banal const* obj) {
  return obj->serializedSize(proto);
}

template <> template <class Protocol> uint32_t Cpp2Ops< ::cpp2::Banal>::serializedSizeZC(Protocol const* proto,  ::cpp2::Banal const* obj) {
  return obj->serializedSizeZC(proto);
}

}} // apache::thrift
namespace cpp2 {
class Fiery final : private apache::thrift::detail::st::ComparisonOperators<Fiery>, public apache::thrift::TException {
 public:

  Fiery() {}

  explicit Fiery(const std::string& __message) :
      message(__message) {}

  explicit Fiery(std::string&& __message) :
      message(std::move(__message)) {}
  // FragileConstructor for use in initialization lists only.
  Fiery(apache::thrift::FragileConstructor, std::string message__arg);
  template <typename _T>
  void __set_field(::apache::thrift::detail::argument_wrapper<1, _T> arg) {
    message = arg.extract();
  }

  Fiery(Fiery&&) = default;

  Fiery(const Fiery&) = default;

  Fiery& operator=(Fiery&&) = default;

  Fiery& operator=(const Fiery&) = default;
  void __clear();
  std::string message;
  bool operator==(const Fiery& rhs) const;
  bool operator<(const Fiery& rhs) const;

  const std::string& get_message() const& {
    return message;
  }

  std::string get_message() && {
    return std::move(message);
  }

  template <typename T_Fiery_message_struct_setter = std::string>
  std::string& set_message(T_Fiery_message_struct_setter&& message_) {
    message = std::forward<T_Fiery_message_struct_setter>(message_);
    return message;
  }

  template <class Protocol_>
  uint32_t read(Protocol_* iprot);
  template <class Protocol_>
  uint32_t serializedSize(Protocol_ const* prot_) const;
  template <class Protocol_>
  uint32_t serializedSizeZC(Protocol_ const* prot_) const;
  template <class Protocol_>
  uint32_t write(Protocol_* prot_) const;

  const char* what() const noexcept override {
    return message.c_str();
  }

 private:
  template <class Protocol_>
  void readNoXfer(Protocol_* iprot);

  friend class ::apache::thrift::Cpp2Ops< Fiery >;
};

void swap(Fiery& a, Fiery& b);
extern template void Fiery::readNoXfer<>(apache::thrift::BinaryProtocolReader*);
extern template uint32_t Fiery::write<>(apache::thrift::BinaryProtocolWriter*) const;
extern template uint32_t Fiery::serializedSize<>(apache::thrift::BinaryProtocolWriter const*) const;
extern template uint32_t Fiery::serializedSizeZC<>(apache::thrift::BinaryProtocolWriter const*) const;
extern template void Fiery::readNoXfer<>(apache::thrift::CompactProtocolReader*);
extern template uint32_t Fiery::write<>(apache::thrift::CompactProtocolWriter*) const;
extern template uint32_t Fiery::serializedSize<>(apache::thrift::CompactProtocolWriter const*) const;
extern template uint32_t Fiery::serializedSizeZC<>(apache::thrift::CompactProtocolWriter const*) const;

template <class Protocol_>
uint32_t Fiery::read(Protocol_* iprot) {
  auto _xferStart = iprot->getCurrentPosition().getCurrentPosition();
  readNoXfer(iprot);
  return iprot->getCurrentPosition().getCurrentPosition() - _xferStart;
}

} // cpp2
namespace apache { namespace thrift {

template <> inline void Cpp2Ops< ::cpp2::Fiery>::clear( ::cpp2::Fiery* obj) {
  return obj->__clear();
}

template <> inline constexpr apache::thrift::protocol::TType Cpp2Ops< ::cpp2::Fiery>::thriftType() {
  return apache::thrift::protocol::T_STRUCT;
}

template <> template <class Protocol> uint32_t Cpp2Ops< ::cpp2::Fiery>::write(Protocol* proto,  ::cpp2::Fiery const* obj) {
  return obj->write(proto);
}

template <> template <class Protocol> void Cpp2Ops< ::cpp2::Fiery>::read(Protocol* proto,  ::cpp2::Fiery* obj) {
  return obj->readNoXfer(proto);
}

template <> template <class Protocol> uint32_t Cpp2Ops< ::cpp2::Fiery>::serializedSize(Protocol const* proto,  ::cpp2::Fiery const* obj) {
  return obj->serializedSize(proto);
}

template <> template <class Protocol> uint32_t Cpp2Ops< ::cpp2::Fiery>::serializedSizeZC(Protocol const* proto,  ::cpp2::Fiery const* obj) {
  return obj->serializedSizeZC(proto);
}

}} // apache::thrift
namespace cpp2 {
class Serious final : private apache::thrift::detail::st::ComparisonOperators<Serious>, public apache::thrift::TException {
 public:

  Serious() {}

  explicit Serious(const std::string& __message) :
      sonnet(__message) {}

  explicit Serious(std::string&& __message) :
      sonnet(std::move(__message)) {}
  // FragileConstructor for use in initialization lists only.
  Serious(apache::thrift::FragileConstructor, std::string sonnet__arg);
  template <typename _T>
  void __set_field(::apache::thrift::detail::argument_wrapper<1, _T> arg) {
    sonnet = arg.extract();
    __isset.sonnet = true;
  }

  Serious(Serious&&) = default;

  Serious(const Serious&) = default;

  Serious& operator=(Serious&&) = default;

  Serious& operator=(const Serious&) = default;
  void __clear();
  std::string sonnet;

  struct __isset {
    bool sonnet;
  } __isset = {};
  bool operator==(const Serious& rhs) const;
  bool operator<(const Serious& rhs) const;

  THRIFT_NOLINK ::apache::thrift::optional_field_ref<const std::string&> sonnet_ref() const& {
    return {sonnet, __isset.sonnet};
  }

  THRIFT_NOLINK ::apache::thrift::optional_field_ref<std::string&> sonnet_ref() & {
    return {sonnet, __isset.sonnet};
  }

  THRIFT_NOLINK ::apache::thrift::optional_field_ref<std::string&&> sonnet_ref() && {
    return {std::move(sonnet), __isset.sonnet};
  }

  const std::string* get_sonnet() const& {
    return __isset.sonnet ? std::addressof(sonnet) : nullptr;
  }

  std::string* get_sonnet() & {
    return __isset.sonnet ? std::addressof(sonnet) : nullptr;
  }
  std::string* get_sonnet() && = delete;

  template <typename T_Serious_sonnet_struct_setter = std::string>
  std::string& set_sonnet(T_Serious_sonnet_struct_setter&& sonnet_) {
    sonnet = std::forward<T_Serious_sonnet_struct_setter>(sonnet_);
    __isset.sonnet = true;
    return sonnet;
  }

  template <class Protocol_>
  uint32_t read(Protocol_* iprot);
  template <class Protocol_>
  uint32_t serializedSize(Protocol_ const* prot_) const;
  template <class Protocol_>
  uint32_t serializedSizeZC(Protocol_ const* prot_) const;
  template <class Protocol_>
  uint32_t write(Protocol_* prot_) const;

  const char* what() const noexcept override {
    return sonnet.c_str();
  }

 private:
  template <class Protocol_>
  void readNoXfer(Protocol_* iprot);

  friend class ::apache::thrift::Cpp2Ops< Serious >;
};

void swap(Serious& a, Serious& b);
extern template void Serious::readNoXfer<>(apache::thrift::BinaryProtocolReader*);
extern template uint32_t Serious::write<>(apache::thrift::BinaryProtocolWriter*) const;
extern template uint32_t Serious::serializedSize<>(apache::thrift::BinaryProtocolWriter const*) const;
extern template uint32_t Serious::serializedSizeZC<>(apache::thrift::BinaryProtocolWriter const*) const;
extern template void Serious::readNoXfer<>(apache::thrift::CompactProtocolReader*);
extern template uint32_t Serious::write<>(apache::thrift::CompactProtocolWriter*) const;
extern template uint32_t Serious::serializedSize<>(apache::thrift::CompactProtocolWriter const*) const;
extern template uint32_t Serious::serializedSizeZC<>(apache::thrift::CompactProtocolWriter const*) const;

template <class Protocol_>
uint32_t Serious::read(Protocol_* iprot) {
  auto _xferStart = iprot->getCurrentPosition().getCurrentPosition();
  readNoXfer(iprot);
  return iprot->getCurrentPosition().getCurrentPosition() - _xferStart;
}

} // cpp2
namespace apache { namespace thrift {

template <> inline void Cpp2Ops< ::cpp2::Serious>::clear( ::cpp2::Serious* obj) {
  return obj->__clear();
}

template <> inline constexpr apache::thrift::protocol::TType Cpp2Ops< ::cpp2::Serious>::thriftType() {
  return apache::thrift::protocol::T_STRUCT;
}

template <> template <class Protocol> uint32_t Cpp2Ops< ::cpp2::Serious>::write(Protocol* proto,  ::cpp2::Serious const* obj) {
  return obj->write(proto);
}

template <> template <class Protocol> void Cpp2Ops< ::cpp2::Serious>::read(Protocol* proto,  ::cpp2::Serious* obj) {
  return obj->readNoXfer(proto);
}

template <> template <class Protocol> uint32_t Cpp2Ops< ::cpp2::Serious>::serializedSize(Protocol const* proto,  ::cpp2::Serious const* obj) {
  return obj->serializedSize(proto);
}

template <> template <class Protocol> uint32_t Cpp2Ops< ::cpp2::Serious>::serializedSizeZC(Protocol const* proto,  ::cpp2::Serious const* obj) {
  return obj->serializedSizeZC(proto);
}

}} // apache::thrift
