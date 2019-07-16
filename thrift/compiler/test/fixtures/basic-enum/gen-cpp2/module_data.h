/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
#pragma once

#include <thrift/lib/cpp2/gen/module_data_h.h>

#include "thrift/compiler/test/fixtures/basic-enum/gen-cpp2/module_types.h"

namespace test { namespace fixtures { namespace enumstrict {

struct _EmptyEnumEnumDataStorage {
  using type = EmptyEnum;
  static constexpr const std::size_t size = 0;
  static constexpr const std::array<EmptyEnum, 0> values = {{
  }};
  static constexpr const std::array<folly::StringPiece, 0> names = {{
  }};
};

}}} // test::fixtures::enumstrict
namespace apache { namespace thrift {

template <> struct TEnumDataStorage<::test::fixtures::enumstrict::EmptyEnum> {
  using storage_type = ::test::fixtures::enumstrict::_EmptyEnumEnumDataStorage;
};

}} // apache::thrift
namespace test { namespace fixtures { namespace enumstrict {

struct _MyEnumEnumDataStorage {
  using type = MyEnum;
  static constexpr const std::size_t size = 2;
  static constexpr const std::array<MyEnum, 2> values = {{
    MyEnum::ONE,
    MyEnum::TWO,
  }};
  static constexpr const std::array<folly::StringPiece, 2> names = {{
    "ONE",
    "TWO",
  }};
};

}}} // test::fixtures::enumstrict
namespace apache { namespace thrift {

template <> struct TEnumDataStorage<::test::fixtures::enumstrict::MyEnum> {
  using storage_type = ::test::fixtures::enumstrict::_MyEnumEnumDataStorage;
};

}} // apache::thrift
namespace test { namespace fixtures { namespace enumstrict {

struct _MyBigEnumEnumDataStorage {
  using type = MyBigEnum;
  static constexpr const std::size_t size = 20;
  static constexpr const std::array<MyBigEnum, 20> values = {{
    MyBigEnum::UNKNOWN,
    MyBigEnum::ONE,
    MyBigEnum::TWO,
    MyBigEnum::THREE,
    MyBigEnum::FOUR,
    MyBigEnum::FIVE,
    MyBigEnum::SIX,
    MyBigEnum::SEVEN,
    MyBigEnum::EIGHT,
    MyBigEnum::NINE,
    MyBigEnum::TEN,
    MyBigEnum::ELEVEN,
    MyBigEnum::TWELVE,
    MyBigEnum::THIRTEEN,
    MyBigEnum::FOURTEEN,
    MyBigEnum::FIFTEEN,
    MyBigEnum::SIXTEEN,
    MyBigEnum::SEVENTEEN,
    MyBigEnum::EIGHTEEN,
    MyBigEnum::NINETEEN,
  }};
  static constexpr const std::array<folly::StringPiece, 20> names = {{
    "UNKNOWN",
    "ONE",
    "TWO",
    "THREE",
    "FOUR",
    "FIVE",
    "SIX",
    "SEVEN",
    "EIGHT",
    "NINE",
    "TEN",
    "ELEVEN",
    "TWELVE",
    "THIRTEEN",
    "FOURTEEN",
    "FIFTEEN",
    "SIXTEEN",
    "SEVENTEEN",
    "EIGHTEEN",
    "NINETEEN",
  }};
};

}}} // test::fixtures::enumstrict
namespace apache { namespace thrift {

template <> struct TEnumDataStorage<::test::fixtures::enumstrict::MyBigEnum> {
  using storage_type = ::test::fixtures::enumstrict::_MyBigEnumEnumDataStorage;
};

}} // apache::thrift

