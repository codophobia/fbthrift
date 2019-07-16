/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
#pragma once

#include "thrift/compiler/test/fixtures/qualified/gen-cpp2/module2_types.h"

#include <thrift/lib/cpp2/gen/module_types_tcc.h>


namespace apache {
namespace thrift {
namespace detail {

template <>
struct TccStructTraits<::module2::Struct> {
  static void translateFieldName(
      folly::StringPiece _fname,
      int16_t& fid,
      apache::thrift::protocol::TType& _ftype);
};
template <>
struct TccStructTraits<::module2::BigStruct> {
  static void translateFieldName(
      folly::StringPiece _fname,
      int16_t& fid,
      apache::thrift::protocol::TType& _ftype);
};

} // namespace detail
} // namespace thrift
} // namespace apache

namespace module2 {

template <class Protocol_>
void Struct::readNoXfer(Protocol_* iprot) {
  apache::thrift::detail::ProtocolReaderStructReadState<Protocol_> _readState;

  _readState.readStructBegin(iprot);

  using apache::thrift::TProtocolException;


  if (UNLIKELY(!_readState.advanceToNextField(
          iprot,
          0,
          1,
          apache::thrift::protocol::T_STRUCT))) {
    goto _loop;
  }
_readField_first:
  {
    ::apache::thrift::Cpp2Ops<  ::module0::Struct>::read(iprot, &this->first);
    this->__isset.first = true;
  }

  if (UNLIKELY(!_readState.advanceToNextField(
          iprot,
          1,
          2,
          apache::thrift::protocol::T_STRUCT))) {
    goto _loop;
  }
_readField_second:
  {
    ::apache::thrift::Cpp2Ops<  ::module1::Struct>::read(iprot, &this->second);
    this->__isset.second = true;
  }

  if (UNLIKELY(!_readState.advanceToNextField(
          iprot,
          2,
          0,
          apache::thrift::protocol::T_STOP))) {
    goto _loop;
  }

_end:
  _readState.readStructEnd(iprot);

  return;

_loop:
  if (_readState.fieldType == apache::thrift::protocol::T_STOP) {
    goto _end;
  }
  if (iprot->kUsesFieldNames()) {
    apache::thrift::detail::TccStructTraits<Struct>::translateFieldName(_readState.fieldName(), _readState.fieldId, _readState.fieldType);
  }

  switch (_readState.fieldId) {
    case 1:
    {
      if (LIKELY(_readState.isCompatibleWithType(iprot, apache::thrift::protocol::T_STRUCT))) {
        goto _readField_first;
      } else {
        goto _skip;
      }
    }
    case 2:
    {
      if (LIKELY(_readState.isCompatibleWithType(iprot, apache::thrift::protocol::T_STRUCT))) {
        goto _readField_second;
      } else {
        goto _skip;
      }
    }
    default:
    {
_skip:
      _readState.skip(iprot);
      _readState.readFieldEnd(iprot);
      _readState.readFieldBeginNoInline(iprot);
      goto _loop;
    }
  }
}

template <class Protocol_>
uint32_t Struct::serializedSize(Protocol_ const* prot_) const {
  uint32_t xfer = 0;
  xfer += prot_->serializedStructSize("Struct");
  xfer += prot_->serializedFieldSize("first", apache::thrift::protocol::T_STRUCT, 1);
  xfer += ::apache::thrift::Cpp2Ops<  ::module0::Struct>::serializedSize(prot_, &this->first);
  xfer += prot_->serializedFieldSize("second", apache::thrift::protocol::T_STRUCT, 2);
  xfer += ::apache::thrift::Cpp2Ops<  ::module1::Struct>::serializedSize(prot_, &this->second);
  xfer += prot_->serializedSizeStop();
  return xfer;
}

template <class Protocol_>
uint32_t Struct::serializedSizeZC(Protocol_ const* prot_) const {
  uint32_t xfer = 0;
  xfer += prot_->serializedStructSize("Struct");
  xfer += prot_->serializedFieldSize("first", apache::thrift::protocol::T_STRUCT, 1);
  xfer += ::apache::thrift::Cpp2Ops<  ::module0::Struct>::serializedSizeZC(prot_, &this->first);
  xfer += prot_->serializedFieldSize("second", apache::thrift::protocol::T_STRUCT, 2);
  xfer += ::apache::thrift::Cpp2Ops<  ::module1::Struct>::serializedSizeZC(prot_, &this->second);
  xfer += prot_->serializedSizeStop();
  return xfer;
}

template <class Protocol_>
uint32_t Struct::write(Protocol_* prot_) const {
  uint32_t xfer = 0;
  xfer += prot_->writeStructBegin("Struct");
  xfer += prot_->writeFieldBegin("first", apache::thrift::protocol::T_STRUCT, 1);
  xfer += ::apache::thrift::Cpp2Ops<  ::module0::Struct>::write(prot_, &this->first);
  xfer += prot_->writeFieldEnd();
  xfer += prot_->writeFieldBegin("second", apache::thrift::protocol::T_STRUCT, 2);
  xfer += ::apache::thrift::Cpp2Ops<  ::module1::Struct>::write(prot_, &this->second);
  xfer += prot_->writeFieldEnd();
  xfer += prot_->writeFieldStop();
  xfer += prot_->writeStructEnd();
  return xfer;
}

extern template void Struct::readNoXfer<>(apache::thrift::BinaryProtocolReader*);
extern template uint32_t Struct::write<>(apache::thrift::BinaryProtocolWriter*) const;
extern template uint32_t Struct::serializedSize<>(apache::thrift::BinaryProtocolWriter const*) const;
extern template uint32_t Struct::serializedSizeZC<>(apache::thrift::BinaryProtocolWriter const*) const;
extern template void Struct::readNoXfer<>(apache::thrift::CompactProtocolReader*);
extern template uint32_t Struct::write<>(apache::thrift::CompactProtocolWriter*) const;
extern template uint32_t Struct::serializedSize<>(apache::thrift::CompactProtocolWriter const*) const;
extern template uint32_t Struct::serializedSizeZC<>(apache::thrift::CompactProtocolWriter const*) const;

} // module2
namespace module2 {

template <class Protocol_>
void BigStruct::readNoXfer(Protocol_* iprot) {
  apache::thrift::detail::ProtocolReaderStructReadState<Protocol_> _readState;

  _readState.readStructBegin(iprot);

  using apache::thrift::TProtocolException;


  if (UNLIKELY(!_readState.advanceToNextField(
          iprot,
          0,
          1,
          apache::thrift::protocol::T_STRUCT))) {
    goto _loop;
  }
_readField_s:
  {
    ::apache::thrift::Cpp2Ops<  ::module2::Struct>::read(iprot, &this->s);
    this->__isset.s = true;
  }

  if (UNLIKELY(!_readState.advanceToNextField(
          iprot,
          1,
          2,
          apache::thrift::protocol::T_I32))) {
    goto _loop;
  }
_readField_id:
  {
    ::apache::thrift::detail::pm::protocol_methods< ::apache::thrift::type_class::integral, int32_t>::read(*iprot, this->id);
    this->__isset.id = true;
  }

  if (UNLIKELY(!_readState.advanceToNextField(
          iprot,
          2,
          0,
          apache::thrift::protocol::T_STOP))) {
    goto _loop;
  }

_end:
  _readState.readStructEnd(iprot);

  return;

_loop:
  if (_readState.fieldType == apache::thrift::protocol::T_STOP) {
    goto _end;
  }
  if (iprot->kUsesFieldNames()) {
    apache::thrift::detail::TccStructTraits<BigStruct>::translateFieldName(_readState.fieldName(), _readState.fieldId, _readState.fieldType);
  }

  switch (_readState.fieldId) {
    case 1:
    {
      if (LIKELY(_readState.isCompatibleWithType(iprot, apache::thrift::protocol::T_STRUCT))) {
        goto _readField_s;
      } else {
        goto _skip;
      }
    }
    case 2:
    {
      if (LIKELY(_readState.isCompatibleWithType(iprot, apache::thrift::protocol::T_I32))) {
        goto _readField_id;
      } else {
        goto _skip;
      }
    }
    default:
    {
_skip:
      _readState.skip(iprot);
      _readState.readFieldEnd(iprot);
      _readState.readFieldBeginNoInline(iprot);
      goto _loop;
    }
  }
}

template <class Protocol_>
uint32_t BigStruct::serializedSize(Protocol_ const* prot_) const {
  uint32_t xfer = 0;
  xfer += prot_->serializedStructSize("BigStruct");
  xfer += prot_->serializedFieldSize("s", apache::thrift::protocol::T_STRUCT, 1);
  xfer += ::apache::thrift::Cpp2Ops<  ::module2::Struct>::serializedSize(prot_, &this->s);
  xfer += prot_->serializedFieldSize("id", apache::thrift::protocol::T_I32, 2);
  xfer += ::apache::thrift::detail::pm::protocol_methods< ::apache::thrift::type_class::integral, int32_t>::serializedSize<false>(*prot_, this->id);
  xfer += prot_->serializedSizeStop();
  return xfer;
}

template <class Protocol_>
uint32_t BigStruct::serializedSizeZC(Protocol_ const* prot_) const {
  uint32_t xfer = 0;
  xfer += prot_->serializedStructSize("BigStruct");
  xfer += prot_->serializedFieldSize("s", apache::thrift::protocol::T_STRUCT, 1);
  xfer += ::apache::thrift::Cpp2Ops<  ::module2::Struct>::serializedSizeZC(prot_, &this->s);
  xfer += prot_->serializedFieldSize("id", apache::thrift::protocol::T_I32, 2);
  xfer += ::apache::thrift::detail::pm::protocol_methods< ::apache::thrift::type_class::integral, int32_t>::serializedSize<false>(*prot_, this->id);
  xfer += prot_->serializedSizeStop();
  return xfer;
}

template <class Protocol_>
uint32_t BigStruct::write(Protocol_* prot_) const {
  uint32_t xfer = 0;
  xfer += prot_->writeStructBegin("BigStruct");
  xfer += prot_->writeFieldBegin("s", apache::thrift::protocol::T_STRUCT, 1);
  xfer += ::apache::thrift::Cpp2Ops<  ::module2::Struct>::write(prot_, &this->s);
  xfer += prot_->writeFieldEnd();
  xfer += prot_->writeFieldBegin("id", apache::thrift::protocol::T_I32, 2);
  xfer += ::apache::thrift::detail::pm::protocol_methods< ::apache::thrift::type_class::integral, int32_t>::write(*prot_, this->id);
  xfer += prot_->writeFieldEnd();
  xfer += prot_->writeFieldStop();
  xfer += prot_->writeStructEnd();
  return xfer;
}

extern template void BigStruct::readNoXfer<>(apache::thrift::BinaryProtocolReader*);
extern template uint32_t BigStruct::write<>(apache::thrift::BinaryProtocolWriter*) const;
extern template uint32_t BigStruct::serializedSize<>(apache::thrift::BinaryProtocolWriter const*) const;
extern template uint32_t BigStruct::serializedSizeZC<>(apache::thrift::BinaryProtocolWriter const*) const;
extern template void BigStruct::readNoXfer<>(apache::thrift::CompactProtocolReader*);
extern template uint32_t BigStruct::write<>(apache::thrift::CompactProtocolWriter*) const;
extern template uint32_t BigStruct::serializedSize<>(apache::thrift::CompactProtocolWriter const*) const;
extern template uint32_t BigStruct::serializedSizeZC<>(apache::thrift::CompactProtocolWriter const*) const;

} // module2
