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
  [[deprecated("This constructor is deprecated")]]
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
    return "::cpp2::Banal";
  }

 private:
  template <class Protocol_>
  void readNoXfer(Protocol_* iprot);

  friend class ::apache::thrift::Cpp2Ops< Banal >;
};

void swap(Banal& a, Banal& b);

template <class Protocol_>
uint32_t Banal::read(Protocol_* iprot) {
  auto _xferStart = iprot->getCursorPosition();
  readNoXfer(iprot);
  return iprot->getCursorPosition() - _xferStart;
}

} // cpp2
namespace cpp2 {
class Fiery final : private apache::thrift::detail::st::ComparisonOperators<Fiery>, public apache::thrift::TException {
 public:

  Fiery() {}

  explicit Fiery(const std::string& __message) :
      message(__message) {}

  explicit Fiery(std::string&& __message) :
      message(std::move(__message)) {}
  // FragileConstructor for use in initialization lists only.
  [[deprecated("This constructor is deprecated")]]
  Fiery(apache::thrift::FragileConstructor, ::std::string message__arg);
  template <typename _T>
  void __set_field(::apache::thrift::detail::argument_wrapper<1, _T> arg) {
    message = arg.extract();
  }

  Fiery(Fiery&&) = default;

  Fiery(const Fiery&) = default;

  Fiery& operator=(Fiery&&) = default;

  Fiery& operator=(const Fiery&) = default;
  void __clear();
  ::std::string message;
  bool operator==(const Fiery& rhs) const;
  bool operator<(const Fiery& rhs) const;

  const ::std::string& get_message() const& {
    return message;
  }

  ::std::string get_message() && {
    return std::move(message);
  }

  template <typename T_Fiery_message_struct_setter = ::std::string>
  ::std::string& set_message(T_Fiery_message_struct_setter&& message_) {
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

template <class Protocol_>
uint32_t Fiery::read(Protocol_* iprot) {
  auto _xferStart = iprot->getCursorPosition();
  readNoXfer(iprot);
  return iprot->getCursorPosition() - _xferStart;
}

} // cpp2
namespace cpp2 {
class Serious final : private apache::thrift::detail::st::ComparisonOperators<Serious>, public apache::thrift::TException {
 public:

  Serious() {}

  explicit Serious(const std::string& __message) :
      sonnet(__message) {}

  explicit Serious(std::string&& __message) :
      sonnet(std::move(__message)) {}
  // FragileConstructor for use in initialization lists only.
  [[deprecated("This constructor is deprecated")]]
  Serious(apache::thrift::FragileConstructor, ::std::string sonnet__arg);
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
  ::std::string sonnet;

  struct __isset {
    bool sonnet;
  } __isset = {};
  bool operator==(const Serious& rhs) const;
  bool operator<(const Serious& rhs) const;

  THRIFT_NOLINK ::apache::thrift::optional_field_ref<const ::std::string&> sonnet_ref() const& {
    return {sonnet, __isset.sonnet};
  }

  THRIFT_NOLINK ::apache::thrift::optional_field_ref<const ::std::string&&> sonnet_ref() const&& {
    return {std::move(sonnet), __isset.sonnet};
  }

  THRIFT_NOLINK ::apache::thrift::optional_field_ref<::std::string&> sonnet_ref() & {
    return {sonnet, __isset.sonnet};
  }

  THRIFT_NOLINK ::apache::thrift::optional_field_ref<::std::string&&> sonnet_ref() && {
    return {std::move(sonnet), __isset.sonnet};
  }

  const ::std::string* get_sonnet() const& {
    return __isset.sonnet ? std::addressof(sonnet) : nullptr;
  }

  ::std::string* get_sonnet() & {
    return __isset.sonnet ? std::addressof(sonnet) : nullptr;
  }
  ::std::string* get_sonnet() && = delete;

  template <typename T_Serious_sonnet_struct_setter = ::std::string>
  ::std::string& set_sonnet(T_Serious_sonnet_struct_setter&& sonnet_) {
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

template <class Protocol_>
uint32_t Serious::read(Protocol_* iprot) {
  auto _xferStart = iprot->getCursorPosition();
  readNoXfer(iprot);
  return iprot->getCursorPosition() - _xferStart;
}

} // cpp2
