/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
#pragma once

#include <thrift/lib/cpp2/gen/module_constants_h.h>

#include "thrift/compiler/test/fixtures/includes/gen-cpp2/includes_types.h"

namespace cpp2 {

struct includes_constants {

  static  ::cpp2::Included const& ExampleIncluded();

  static constexpr int64_t const IncludedConstant_ = 42LL;

  static constexpr int64_t IncludedConstant() {
    return IncludedConstant_;
  }

};

} // cpp2
