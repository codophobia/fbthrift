#
# Autogenerated by Thrift
#
# DO NOT EDIT
#  @generated
#
import apache.thrift.metadata.lite_types as _fbthrift_metadata


import patch.lite_metadata

# TODO (ffrancet): This general pattern can be optimized by using tuples and dicts
# instead of re-generating thrift structs
def _fbthrift_gen_metadata_struct_MyData(metadata_struct: _fbthrift_metadata.ThriftMetadata) -> _fbthrift_metadata.ThriftMetadata:
    qualified_name = "module.MyData"

    if qualified_name in metadata_struct.structs:
        return metadata_struct
    fields = [
        _fbthrift_metadata.ThriftField(id=1, type=_fbthrift_metadata.ThriftType(t_primitive=_fbthrift_metadata.ThriftPrimitiveType.THRIFT_STRING_TYPE), name="data1", is_optional=False, structured_annotations=[
        ]),
        _fbthrift_metadata.ThriftField(id=2, type=_fbthrift_metadata.ThriftType(t_primitive=_fbthrift_metadata.ThriftPrimitiveType.THRIFT_I32_TYPE), name="data2", is_optional=False, structured_annotations=[
        ]),
    ]
    struct_dict = dict(metadata_struct.structs)
    struct_dict[qualified_name] = _fbthrift_metadata.ThriftStruct(name=qualified_name, fields=fields,
        is_union=False,
        structured_annotations=[
            _fbthrift_metadata.ThriftConstStruct(type=_fbthrift_metadata.ThriftStructType(name="patch.GeneratePatch"), fields= {  }),
        ])
    new_struct = metadata_struct(structs=struct_dict)

     # data1
     # data2

    return new_struct
def gen_metadata_struct_MyData() -> _fbthrift_metadata.ThriftMetadata:
    return _fbthrift_gen_metadata_struct_MyData(_fbthrift_metadata.ThriftMetadata(structs={}, enums={}, exceptions={}, services={}))

# TODO (ffrancet): This general pattern can be optimized by using tuples and dicts
# instead of re-generating thrift structs
def _fbthrift_gen_metadata_struct_MyStruct(metadata_struct: _fbthrift_metadata.ThriftMetadata) -> _fbthrift_metadata.ThriftMetadata:
    qualified_name = "module.MyStruct"

    if qualified_name in metadata_struct.structs:
        return metadata_struct
    fields = [
        _fbthrift_metadata.ThriftField(id=1, type=_fbthrift_metadata.ThriftType(t_primitive=_fbthrift_metadata.ThriftPrimitiveType.THRIFT_BOOL_TYPE), name="boolVal", is_optional=False, structured_annotations=[
        ]),
        _fbthrift_metadata.ThriftField(id=2, type=_fbthrift_metadata.ThriftType(t_primitive=_fbthrift_metadata.ThriftPrimitiveType.THRIFT_BYTE_TYPE), name="byteVal", is_optional=False, structured_annotations=[
        ]),
        _fbthrift_metadata.ThriftField(id=3, type=_fbthrift_metadata.ThriftType(t_primitive=_fbthrift_metadata.ThriftPrimitiveType.THRIFT_I16_TYPE), name="i16Val", is_optional=False, structured_annotations=[
        ]),
        _fbthrift_metadata.ThriftField(id=4, type=_fbthrift_metadata.ThriftType(t_primitive=_fbthrift_metadata.ThriftPrimitiveType.THRIFT_I32_TYPE), name="i32Val", is_optional=False, structured_annotations=[
        ]),
        _fbthrift_metadata.ThriftField(id=5, type=_fbthrift_metadata.ThriftType(t_primitive=_fbthrift_metadata.ThriftPrimitiveType.THRIFT_I64_TYPE), name="i64Val", is_optional=False, structured_annotations=[
        ]),
        _fbthrift_metadata.ThriftField(id=6, type=_fbthrift_metadata.ThriftType(t_primitive=_fbthrift_metadata.ThriftPrimitiveType.THRIFT_DOUBLE_TYPE), name="floatVal", is_optional=False, structured_annotations=[
        ]),
        _fbthrift_metadata.ThriftField(id=7, type=_fbthrift_metadata.ThriftType(t_primitive=_fbthrift_metadata.ThriftPrimitiveType.THRIFT_FLOAT_TYPE), name="doubleVal", is_optional=False, structured_annotations=[
        ]),
        _fbthrift_metadata.ThriftField(id=8, type=_fbthrift_metadata.ThriftType(t_primitive=_fbthrift_metadata.ThriftPrimitiveType.THRIFT_STRING_TYPE), name="stringVal", is_optional=False, structured_annotations=[
        ]),
        _fbthrift_metadata.ThriftField(id=9, type=_fbthrift_metadata.ThriftType(t_primitive=_fbthrift_metadata.ThriftPrimitiveType.THRIFT_BINARY_TYPE), name="binaryVal", is_optional=False, structured_annotations=[
        ]),
        _fbthrift_metadata.ThriftField(id=10, type=_fbthrift_metadata.ThriftType(t_struct=_fbthrift_metadata.ThriftStructType(name="module.MyData")), name="structVal", is_optional=False, structured_annotations=[
        ]),
        _fbthrift_metadata.ThriftField(id=11, type=_fbthrift_metadata.ThriftType(t_primitive=_fbthrift_metadata.ThriftPrimitiveType.THRIFT_BOOL_TYPE), name="optBoolVal", is_optional=False, structured_annotations=[
        ]),
        _fbthrift_metadata.ThriftField(id=12, type=_fbthrift_metadata.ThriftType(t_primitive=_fbthrift_metadata.ThriftPrimitiveType.THRIFT_BYTE_TYPE), name="optByteVal", is_optional=False, structured_annotations=[
        ]),
        _fbthrift_metadata.ThriftField(id=13, type=_fbthrift_metadata.ThriftType(t_primitive=_fbthrift_metadata.ThriftPrimitiveType.THRIFT_I16_TYPE), name="optI16Val", is_optional=False, structured_annotations=[
        ]),
        _fbthrift_metadata.ThriftField(id=14, type=_fbthrift_metadata.ThriftType(t_primitive=_fbthrift_metadata.ThriftPrimitiveType.THRIFT_I32_TYPE), name="optI32Val", is_optional=False, structured_annotations=[
        ]),
        _fbthrift_metadata.ThriftField(id=15, type=_fbthrift_metadata.ThriftType(t_primitive=_fbthrift_metadata.ThriftPrimitiveType.THRIFT_I64_TYPE), name="optI64Val", is_optional=False, structured_annotations=[
        ]),
        _fbthrift_metadata.ThriftField(id=16, type=_fbthrift_metadata.ThriftType(t_primitive=_fbthrift_metadata.ThriftPrimitiveType.THRIFT_DOUBLE_TYPE), name="optFloatVal", is_optional=False, structured_annotations=[
        ]),
        _fbthrift_metadata.ThriftField(id=17, type=_fbthrift_metadata.ThriftType(t_primitive=_fbthrift_metadata.ThriftPrimitiveType.THRIFT_FLOAT_TYPE), name="optDoubleVal", is_optional=False, structured_annotations=[
        ]),
        _fbthrift_metadata.ThriftField(id=18, type=_fbthrift_metadata.ThriftType(t_primitive=_fbthrift_metadata.ThriftPrimitiveType.THRIFT_STRING_TYPE), name="optStringVal", is_optional=False, structured_annotations=[
        ]),
        _fbthrift_metadata.ThriftField(id=19, type=_fbthrift_metadata.ThriftType(t_primitive=_fbthrift_metadata.ThriftPrimitiveType.THRIFT_BINARY_TYPE), name="optBinaryVal", is_optional=False, structured_annotations=[
        ]),
        _fbthrift_metadata.ThriftField(id=20, type=_fbthrift_metadata.ThriftType(t_struct=_fbthrift_metadata.ThriftStructType(name="module.MyData")), name="optStructVal", is_optional=False, structured_annotations=[
        ]),
        _fbthrift_metadata.ThriftField(id=21, type=_fbthrift_metadata.ThriftType(t_list=_fbthrift_metadata.ThriftListType(valueType=_fbthrift_metadata.ThriftType(t_primitive=_fbthrift_metadata.ThriftPrimitiveType.THRIFT_I16_TYPE))), name="optListVal", is_optional=False, structured_annotations=[
        ]),
        _fbthrift_metadata.ThriftField(id=22, type=_fbthrift_metadata.ThriftType(t_set=_fbthrift_metadata.ThriftSetType(valueType=_fbthrift_metadata.ThriftType(t_primitive=_fbthrift_metadata.ThriftPrimitiveType.THRIFT_STRING_TYPE))), name="optSetVal", is_optional=False, structured_annotations=[
        ]),
        _fbthrift_metadata.ThriftField(id=23, type=_fbthrift_metadata.ThriftType(t_map=_fbthrift_metadata.ThriftMapType(keyType=_fbthrift_metadata.ThriftType(t_primitive=_fbthrift_metadata.ThriftPrimitiveType.THRIFT_STRING_TYPE),valueType=_fbthrift_metadata.ThriftType(t_primitive=_fbthrift_metadata.ThriftPrimitiveType.THRIFT_STRING_TYPE))), name="optMapVal", is_optional=False, structured_annotations=[
        ]),
    ]
    struct_dict = dict(metadata_struct.structs)
    struct_dict[qualified_name] = _fbthrift_metadata.ThriftStruct(name=qualified_name, fields=fields,
        is_union=False,
        structured_annotations=[
            _fbthrift_metadata.ThriftConstStruct(type=_fbthrift_metadata.ThriftStructType(name="patch.GeneratePatch"), fields= {  }),
        ])
    new_struct = metadata_struct(structs=struct_dict)

     # boolVal
     # byteVal
     # i16Val
     # i32Val
     # i64Val
     # floatVal
     # doubleVal
     # stringVal
     # binaryVal
    new_struct = _fbthrift_gen_metadata_struct_MyData(new_struct) # structVal
     # optBoolVal
     # optByteVal
     # optI16Val
     # optI32Val
     # optI64Val
     # optFloatVal
     # optDoubleVal
     # optStringVal
     # optBinaryVal
    new_struct = _fbthrift_gen_metadata_struct_MyData(new_struct) # optStructVal
     # optListVal
     # optSetVal
     # key
     # val  # optMapVal

    return new_struct
def gen_metadata_struct_MyStruct() -> _fbthrift_metadata.ThriftMetadata:
    return _fbthrift_gen_metadata_struct_MyStruct(_fbthrift_metadata.ThriftMetadata(structs={}, enums={}, exceptions={}, services={}))

# TODO (ffrancet): This general pattern can be optimized by using tuples and dicts
# instead of re-generating thrift structs
def _fbthrift_gen_metadata_struct_MyDataPatch(metadata_struct: _fbthrift_metadata.ThriftMetadata) -> _fbthrift_metadata.ThriftMetadata:
    qualified_name = "module.MyDataPatch"

    if qualified_name in metadata_struct.structs:
        return metadata_struct
    fields = [
        _fbthrift_metadata.ThriftField(id=1, type=_fbthrift_metadata.ThriftType(t_struct=_fbthrift_metadata.ThriftStructType(name="module.StringPatch")), name="data1", is_optional=False, structured_annotations=[
        ]),
        _fbthrift_metadata.ThriftField(id=2, type=_fbthrift_metadata.ThriftType(t_struct=_fbthrift_metadata.ThriftStructType(name="module.I32Patch")), name="data2", is_optional=False, structured_annotations=[
        ]),
    ]
    struct_dict = dict(metadata_struct.structs)
    struct_dict[qualified_name] = _fbthrift_metadata.ThriftStruct(name=qualified_name, fields=fields,
        is_union=False,
        structured_annotations=[
        ])
    new_struct = metadata_struct(structs=struct_dict)

    new_struct = patch.lite_metadata._fbthrift_gen_metadata_struct_StringPatch(new_struct) # data1
    new_struct = patch.lite_metadata._fbthrift_gen_metadata_struct_I32Patch(new_struct) # data2

    return new_struct
def gen_metadata_struct_MyDataPatch() -> _fbthrift_metadata.ThriftMetadata:
    return _fbthrift_gen_metadata_struct_MyDataPatch(_fbthrift_metadata.ThriftMetadata(structs={}, enums={}, exceptions={}, services={}))

# TODO (ffrancet): This general pattern can be optimized by using tuples and dicts
# instead of re-generating thrift structs
def _fbthrift_gen_metadata_struct_MyDataValuePatch(metadata_struct: _fbthrift_metadata.ThriftMetadata) -> _fbthrift_metadata.ThriftMetadata:
    qualified_name = "module.MyDataValuePatch"

    if qualified_name in metadata_struct.structs:
        return metadata_struct
    fields = [
        _fbthrift_metadata.ThriftField(id=1, type=_fbthrift_metadata.ThriftType(t_struct=_fbthrift_metadata.ThriftStructType(name="module.MyData")), name="assign", is_optional=False, structured_annotations=[
        ]),
        _fbthrift_metadata.ThriftField(id=2, type=_fbthrift_metadata.ThriftType(t_primitive=_fbthrift_metadata.ThriftPrimitiveType.THRIFT_BOOL_TYPE), name="clear", is_optional=False, structured_annotations=[
        ]),
        _fbthrift_metadata.ThriftField(id=3, type=_fbthrift_metadata.ThriftType(t_struct=_fbthrift_metadata.ThriftStructType(name="module.MyDataPatch")), name="patch", is_optional=False, structured_annotations=[
        ]),
    ]
    struct_dict = dict(metadata_struct.structs)
    struct_dict[qualified_name] = _fbthrift_metadata.ThriftStruct(name=qualified_name, fields=fields,
        is_union=False,
        structured_annotations=[
        ])
    new_struct = metadata_struct(structs=struct_dict)

    new_struct = _fbthrift_gen_metadata_struct_MyData(new_struct) # assign
     # clear
    new_struct = _fbthrift_gen_metadata_struct_MyDataPatch(new_struct) # patch

    return new_struct
def gen_metadata_struct_MyDataValuePatch() -> _fbthrift_metadata.ThriftMetadata:
    return _fbthrift_gen_metadata_struct_MyDataValuePatch(_fbthrift_metadata.ThriftMetadata(structs={}, enums={}, exceptions={}, services={}))

# TODO (ffrancet): This general pattern can be optimized by using tuples and dicts
# instead of re-generating thrift structs
def _fbthrift_gen_metadata_struct_OptionalMyDataValuePatch(metadata_struct: _fbthrift_metadata.ThriftMetadata) -> _fbthrift_metadata.ThriftMetadata:
    qualified_name = "module.OptionalMyDataValuePatch"

    if qualified_name in metadata_struct.structs:
        return metadata_struct
    fields = [
        _fbthrift_metadata.ThriftField(id=2, type=_fbthrift_metadata.ThriftType(t_primitive=_fbthrift_metadata.ThriftPrimitiveType.THRIFT_BOOL_TYPE), name="clear", is_optional=False, structured_annotations=[
        ]),
        _fbthrift_metadata.ThriftField(id=3, type=_fbthrift_metadata.ThriftType(t_struct=_fbthrift_metadata.ThriftStructType(name="module.MyDataValuePatch")), name="patch", is_optional=False, structured_annotations=[
        ]),
        _fbthrift_metadata.ThriftField(id=1, type=_fbthrift_metadata.ThriftType(t_struct=_fbthrift_metadata.ThriftStructType(name="module.MyData")), name="ensure", is_optional=False, structured_annotations=[
        ]),
        _fbthrift_metadata.ThriftField(id=4, type=_fbthrift_metadata.ThriftType(t_struct=_fbthrift_metadata.ThriftStructType(name="module.MyDataValuePatch")), name="patchAfter", is_optional=False, structured_annotations=[
        ]),
    ]
    struct_dict = dict(metadata_struct.structs)
    struct_dict[qualified_name] = _fbthrift_metadata.ThriftStruct(name=qualified_name, fields=fields,
        is_union=False,
        structured_annotations=[
        ])
    new_struct = metadata_struct(structs=struct_dict)

     # clear
    new_struct = _fbthrift_gen_metadata_struct_MyDataValuePatch(new_struct) # patch
    new_struct = _fbthrift_gen_metadata_struct_MyData(new_struct) # ensure
    new_struct = _fbthrift_gen_metadata_struct_MyDataValuePatch(new_struct) # patchAfter

    return new_struct
def gen_metadata_struct_OptionalMyDataValuePatch() -> _fbthrift_metadata.ThriftMetadata:
    return _fbthrift_gen_metadata_struct_OptionalMyDataValuePatch(_fbthrift_metadata.ThriftMetadata(structs={}, enums={}, exceptions={}, services={}))

# TODO (ffrancet): This general pattern can be optimized by using tuples and dicts
# instead of re-generating thrift structs
def _fbthrift_gen_metadata_struct_MyStructPatch(metadata_struct: _fbthrift_metadata.ThriftMetadata) -> _fbthrift_metadata.ThriftMetadata:
    qualified_name = "module.MyStructPatch"

    if qualified_name in metadata_struct.structs:
        return metadata_struct
    fields = [
        _fbthrift_metadata.ThriftField(id=1, type=_fbthrift_metadata.ThriftType(t_struct=_fbthrift_metadata.ThriftStructType(name="module.BoolPatch")), name="boolVal", is_optional=False, structured_annotations=[
        ]),
        _fbthrift_metadata.ThriftField(id=2, type=_fbthrift_metadata.ThriftType(t_struct=_fbthrift_metadata.ThriftStructType(name="module.BytePatch")), name="byteVal", is_optional=False, structured_annotations=[
        ]),
        _fbthrift_metadata.ThriftField(id=3, type=_fbthrift_metadata.ThriftType(t_struct=_fbthrift_metadata.ThriftStructType(name="module.I16Patch")), name="i16Val", is_optional=False, structured_annotations=[
        ]),
        _fbthrift_metadata.ThriftField(id=4, type=_fbthrift_metadata.ThriftType(t_struct=_fbthrift_metadata.ThriftStructType(name="module.I32Patch")), name="i32Val", is_optional=False, structured_annotations=[
        ]),
        _fbthrift_metadata.ThriftField(id=5, type=_fbthrift_metadata.ThriftType(t_struct=_fbthrift_metadata.ThriftStructType(name="module.I64Patch")), name="i64Val", is_optional=False, structured_annotations=[
        ]),
        _fbthrift_metadata.ThriftField(id=6, type=_fbthrift_metadata.ThriftType(t_struct=_fbthrift_metadata.ThriftStructType(name="module.FloatPatch")), name="floatVal", is_optional=False, structured_annotations=[
        ]),
        _fbthrift_metadata.ThriftField(id=7, type=_fbthrift_metadata.ThriftType(t_struct=_fbthrift_metadata.ThriftStructType(name="module.DoublePatch")), name="doubleVal", is_optional=False, structured_annotations=[
        ]),
        _fbthrift_metadata.ThriftField(id=8, type=_fbthrift_metadata.ThriftType(t_struct=_fbthrift_metadata.ThriftStructType(name="module.StringPatch")), name="stringVal", is_optional=False, structured_annotations=[
        ]),
        _fbthrift_metadata.ThriftField(id=9, type=_fbthrift_metadata.ThriftType(t_struct=_fbthrift_metadata.ThriftStructType(name="module.BinaryPatch")), name="binaryVal", is_optional=False, structured_annotations=[
        ]),
        _fbthrift_metadata.ThriftField(id=10, type=_fbthrift_metadata.ThriftType(t_struct=_fbthrift_metadata.ThriftStructType(name="module.MyDataValuePatch")), name="structVal", is_optional=False, structured_annotations=[
        ]),
        _fbthrift_metadata.ThriftField(id=11, type=_fbthrift_metadata.ThriftType(t_struct=_fbthrift_metadata.ThriftStructType(name="module.OptionalBoolPatch")), name="optBoolVal", is_optional=False, structured_annotations=[
        ]),
        _fbthrift_metadata.ThriftField(id=12, type=_fbthrift_metadata.ThriftType(t_struct=_fbthrift_metadata.ThriftStructType(name="module.OptionalBytePatch")), name="optByteVal", is_optional=False, structured_annotations=[
        ]),
        _fbthrift_metadata.ThriftField(id=13, type=_fbthrift_metadata.ThriftType(t_struct=_fbthrift_metadata.ThriftStructType(name="module.OptionalI16Patch")), name="optI16Val", is_optional=False, structured_annotations=[
        ]),
        _fbthrift_metadata.ThriftField(id=14, type=_fbthrift_metadata.ThriftType(t_struct=_fbthrift_metadata.ThriftStructType(name="module.OptionalI32Patch")), name="optI32Val", is_optional=False, structured_annotations=[
        ]),
        _fbthrift_metadata.ThriftField(id=15, type=_fbthrift_metadata.ThriftType(t_struct=_fbthrift_metadata.ThriftStructType(name="module.OptionalI64Patch")), name="optI64Val", is_optional=False, structured_annotations=[
        ]),
        _fbthrift_metadata.ThriftField(id=16, type=_fbthrift_metadata.ThriftType(t_struct=_fbthrift_metadata.ThriftStructType(name="module.OptionalFloatPatch")), name="optFloatVal", is_optional=False, structured_annotations=[
        ]),
        _fbthrift_metadata.ThriftField(id=17, type=_fbthrift_metadata.ThriftType(t_struct=_fbthrift_metadata.ThriftStructType(name="module.OptionalDoublePatch")), name="optDoubleVal", is_optional=False, structured_annotations=[
        ]),
        _fbthrift_metadata.ThriftField(id=18, type=_fbthrift_metadata.ThriftType(t_struct=_fbthrift_metadata.ThriftStructType(name="module.OptionalStringPatch")), name="optStringVal", is_optional=False, structured_annotations=[
        ]),
        _fbthrift_metadata.ThriftField(id=19, type=_fbthrift_metadata.ThriftType(t_struct=_fbthrift_metadata.ThriftStructType(name="module.OptionalBinaryPatch")), name="optBinaryVal", is_optional=False, structured_annotations=[
        ]),
        _fbthrift_metadata.ThriftField(id=20, type=_fbthrift_metadata.ThriftType(t_struct=_fbthrift_metadata.ThriftStructType(name="module.OptionalMyDataValuePatch")), name="optStructVal", is_optional=False, structured_annotations=[
        ]),
        _fbthrift_metadata.ThriftField(id=21, type=_fbthrift_metadata.ThriftType(t_struct=_fbthrift_metadata.ThriftStructType(name="module.OptionalMyStructField21Patch")), name="optListVal", is_optional=False, structured_annotations=[
        ]),
        _fbthrift_metadata.ThriftField(id=22, type=_fbthrift_metadata.ThriftType(t_struct=_fbthrift_metadata.ThriftStructType(name="module.OptionalMyStructField22Patch")), name="optSetVal", is_optional=False, structured_annotations=[
        ]),
        _fbthrift_metadata.ThriftField(id=23, type=_fbthrift_metadata.ThriftType(t_struct=_fbthrift_metadata.ThriftStructType(name="module.OptionalMyStructField23Patch")), name="optMapVal", is_optional=False, structured_annotations=[
        ]),
    ]
    struct_dict = dict(metadata_struct.structs)
    struct_dict[qualified_name] = _fbthrift_metadata.ThriftStruct(name=qualified_name, fields=fields,
        is_union=False,
        structured_annotations=[
        ])
    new_struct = metadata_struct(structs=struct_dict)

    new_struct = patch.lite_metadata._fbthrift_gen_metadata_struct_BoolPatch(new_struct) # boolVal
    new_struct = patch.lite_metadata._fbthrift_gen_metadata_struct_BytePatch(new_struct) # byteVal
    new_struct = patch.lite_metadata._fbthrift_gen_metadata_struct_I16Patch(new_struct) # i16Val
    new_struct = patch.lite_metadata._fbthrift_gen_metadata_struct_I32Patch(new_struct) # i32Val
    new_struct = patch.lite_metadata._fbthrift_gen_metadata_struct_I64Patch(new_struct) # i64Val
    new_struct = patch.lite_metadata._fbthrift_gen_metadata_struct_FloatPatch(new_struct) # floatVal
    new_struct = patch.lite_metadata._fbthrift_gen_metadata_struct_DoublePatch(new_struct) # doubleVal
    new_struct = patch.lite_metadata._fbthrift_gen_metadata_struct_StringPatch(new_struct) # stringVal
    new_struct = patch.lite_metadata._fbthrift_gen_metadata_struct_BinaryPatch(new_struct) # binaryVal
    new_struct = _fbthrift_gen_metadata_struct_MyDataValuePatch(new_struct) # structVal
    new_struct = patch.lite_metadata._fbthrift_gen_metadata_struct_OptionalBoolPatch(new_struct) # optBoolVal
    new_struct = patch.lite_metadata._fbthrift_gen_metadata_struct_OptionalBytePatch(new_struct) # optByteVal
    new_struct = patch.lite_metadata._fbthrift_gen_metadata_struct_OptionalI16Patch(new_struct) # optI16Val
    new_struct = patch.lite_metadata._fbthrift_gen_metadata_struct_OptionalI32Patch(new_struct) # optI32Val
    new_struct = patch.lite_metadata._fbthrift_gen_metadata_struct_OptionalI64Patch(new_struct) # optI64Val
    new_struct = patch.lite_metadata._fbthrift_gen_metadata_struct_OptionalFloatPatch(new_struct) # optFloatVal
    new_struct = patch.lite_metadata._fbthrift_gen_metadata_struct_OptionalDoublePatch(new_struct) # optDoubleVal
    new_struct = patch.lite_metadata._fbthrift_gen_metadata_struct_OptionalStringPatch(new_struct) # optStringVal
    new_struct = patch.lite_metadata._fbthrift_gen_metadata_struct_OptionalBinaryPatch(new_struct) # optBinaryVal
    new_struct = _fbthrift_gen_metadata_struct_OptionalMyDataValuePatch(new_struct) # optStructVal
    new_struct = _fbthrift_gen_metadata_struct_OptionalMyStructField21Patch(new_struct) # optListVal
    new_struct = _fbthrift_gen_metadata_struct_OptionalMyStructField22Patch(new_struct) # optSetVal
    new_struct = _fbthrift_gen_metadata_struct_OptionalMyStructField23Patch(new_struct) # optMapVal

    return new_struct
def gen_metadata_struct_MyStructPatch() -> _fbthrift_metadata.ThriftMetadata:
    return _fbthrift_gen_metadata_struct_MyStructPatch(_fbthrift_metadata.ThriftMetadata(structs={}, enums={}, exceptions={}, services={}))

# TODO (ffrancet): This general pattern can be optimized by using tuples and dicts
# instead of re-generating thrift structs
def _fbthrift_gen_metadata_struct_MyStructField21Patch(metadata_struct: _fbthrift_metadata.ThriftMetadata) -> _fbthrift_metadata.ThriftMetadata:
    qualified_name = "module.MyStructField21Patch"

    if qualified_name in metadata_struct.structs:
        return metadata_struct
    fields = [
        _fbthrift_metadata.ThriftField(id=1, type=_fbthrift_metadata.ThriftType(t_list=_fbthrift_metadata.ThriftListType(valueType=_fbthrift_metadata.ThriftType(t_primitive=_fbthrift_metadata.ThriftPrimitiveType.THRIFT_I16_TYPE))), name="assign", is_optional=False, structured_annotations=[
        ]),
    ]
    struct_dict = dict(metadata_struct.structs)
    struct_dict[qualified_name] = _fbthrift_metadata.ThriftStruct(name=qualified_name, fields=fields,
        is_union=False,
        structured_annotations=[
        ])
    new_struct = metadata_struct(structs=struct_dict)

     # assign

    return new_struct
def gen_metadata_struct_MyStructField21Patch() -> _fbthrift_metadata.ThriftMetadata:
    return _fbthrift_gen_metadata_struct_MyStructField21Patch(_fbthrift_metadata.ThriftMetadata(structs={}, enums={}, exceptions={}, services={}))

# TODO (ffrancet): This general pattern can be optimized by using tuples and dicts
# instead of re-generating thrift structs
def _fbthrift_gen_metadata_struct_OptionalMyStructField21Patch(metadata_struct: _fbthrift_metadata.ThriftMetadata) -> _fbthrift_metadata.ThriftMetadata:
    qualified_name = "module.OptionalMyStructField21Patch"

    if qualified_name in metadata_struct.structs:
        return metadata_struct
    fields = [
        _fbthrift_metadata.ThriftField(id=2, type=_fbthrift_metadata.ThriftType(t_primitive=_fbthrift_metadata.ThriftPrimitiveType.THRIFT_BOOL_TYPE), name="clear", is_optional=False, structured_annotations=[
        ]),
        _fbthrift_metadata.ThriftField(id=3, type=_fbthrift_metadata.ThriftType(t_struct=_fbthrift_metadata.ThriftStructType(name="module.MyStructField21Patch")), name="patch", is_optional=False, structured_annotations=[
        ]),
        _fbthrift_metadata.ThriftField(id=1, type=_fbthrift_metadata.ThriftType(t_list=_fbthrift_metadata.ThriftListType(valueType=_fbthrift_metadata.ThriftType(t_primitive=_fbthrift_metadata.ThriftPrimitiveType.THRIFT_I16_TYPE))), name="ensure", is_optional=False, structured_annotations=[
        ]),
        _fbthrift_metadata.ThriftField(id=4, type=_fbthrift_metadata.ThriftType(t_struct=_fbthrift_metadata.ThriftStructType(name="module.MyStructField21Patch")), name="patchAfter", is_optional=False, structured_annotations=[
        ]),
    ]
    struct_dict = dict(metadata_struct.structs)
    struct_dict[qualified_name] = _fbthrift_metadata.ThriftStruct(name=qualified_name, fields=fields,
        is_union=False,
        structured_annotations=[
        ])
    new_struct = metadata_struct(structs=struct_dict)

     # clear
    new_struct = _fbthrift_gen_metadata_struct_MyStructField21Patch(new_struct) # patch
     # ensure
    new_struct = _fbthrift_gen_metadata_struct_MyStructField21Patch(new_struct) # patchAfter

    return new_struct
def gen_metadata_struct_OptionalMyStructField21Patch() -> _fbthrift_metadata.ThriftMetadata:
    return _fbthrift_gen_metadata_struct_OptionalMyStructField21Patch(_fbthrift_metadata.ThriftMetadata(structs={}, enums={}, exceptions={}, services={}))

# TODO (ffrancet): This general pattern can be optimized by using tuples and dicts
# instead of re-generating thrift structs
def _fbthrift_gen_metadata_struct_MyStructField22Patch(metadata_struct: _fbthrift_metadata.ThriftMetadata) -> _fbthrift_metadata.ThriftMetadata:
    qualified_name = "module.MyStructField22Patch"

    if qualified_name in metadata_struct.structs:
        return metadata_struct
    fields = [
        _fbthrift_metadata.ThriftField(id=1, type=_fbthrift_metadata.ThriftType(t_set=_fbthrift_metadata.ThriftSetType(valueType=_fbthrift_metadata.ThriftType(t_primitive=_fbthrift_metadata.ThriftPrimitiveType.THRIFT_STRING_TYPE))), name="assign", is_optional=False, structured_annotations=[
        ]),
    ]
    struct_dict = dict(metadata_struct.structs)
    struct_dict[qualified_name] = _fbthrift_metadata.ThriftStruct(name=qualified_name, fields=fields,
        is_union=False,
        structured_annotations=[
        ])
    new_struct = metadata_struct(structs=struct_dict)

     # assign

    return new_struct
def gen_metadata_struct_MyStructField22Patch() -> _fbthrift_metadata.ThriftMetadata:
    return _fbthrift_gen_metadata_struct_MyStructField22Patch(_fbthrift_metadata.ThriftMetadata(structs={}, enums={}, exceptions={}, services={}))

# TODO (ffrancet): This general pattern can be optimized by using tuples and dicts
# instead of re-generating thrift structs
def _fbthrift_gen_metadata_struct_OptionalMyStructField22Patch(metadata_struct: _fbthrift_metadata.ThriftMetadata) -> _fbthrift_metadata.ThriftMetadata:
    qualified_name = "module.OptionalMyStructField22Patch"

    if qualified_name in metadata_struct.structs:
        return metadata_struct
    fields = [
        _fbthrift_metadata.ThriftField(id=2, type=_fbthrift_metadata.ThriftType(t_primitive=_fbthrift_metadata.ThriftPrimitiveType.THRIFT_BOOL_TYPE), name="clear", is_optional=False, structured_annotations=[
        ]),
        _fbthrift_metadata.ThriftField(id=3, type=_fbthrift_metadata.ThriftType(t_struct=_fbthrift_metadata.ThriftStructType(name="module.MyStructField22Patch")), name="patch", is_optional=False, structured_annotations=[
        ]),
        _fbthrift_metadata.ThriftField(id=1, type=_fbthrift_metadata.ThriftType(t_set=_fbthrift_metadata.ThriftSetType(valueType=_fbthrift_metadata.ThriftType(t_primitive=_fbthrift_metadata.ThriftPrimitiveType.THRIFT_STRING_TYPE))), name="ensure", is_optional=False, structured_annotations=[
        ]),
        _fbthrift_metadata.ThriftField(id=4, type=_fbthrift_metadata.ThriftType(t_struct=_fbthrift_metadata.ThriftStructType(name="module.MyStructField22Patch")), name="patchAfter", is_optional=False, structured_annotations=[
        ]),
    ]
    struct_dict = dict(metadata_struct.structs)
    struct_dict[qualified_name] = _fbthrift_metadata.ThriftStruct(name=qualified_name, fields=fields,
        is_union=False,
        structured_annotations=[
        ])
    new_struct = metadata_struct(structs=struct_dict)

     # clear
    new_struct = _fbthrift_gen_metadata_struct_MyStructField22Patch(new_struct) # patch
     # ensure
    new_struct = _fbthrift_gen_metadata_struct_MyStructField22Patch(new_struct) # patchAfter

    return new_struct
def gen_metadata_struct_OptionalMyStructField22Patch() -> _fbthrift_metadata.ThriftMetadata:
    return _fbthrift_gen_metadata_struct_OptionalMyStructField22Patch(_fbthrift_metadata.ThriftMetadata(structs={}, enums={}, exceptions={}, services={}))

# TODO (ffrancet): This general pattern can be optimized by using tuples and dicts
# instead of re-generating thrift structs
def _fbthrift_gen_metadata_struct_MyStructField23Patch(metadata_struct: _fbthrift_metadata.ThriftMetadata) -> _fbthrift_metadata.ThriftMetadata:
    qualified_name = "module.MyStructField23Patch"

    if qualified_name in metadata_struct.structs:
        return metadata_struct
    fields = [
        _fbthrift_metadata.ThriftField(id=1, type=_fbthrift_metadata.ThriftType(t_map=_fbthrift_metadata.ThriftMapType(keyType=_fbthrift_metadata.ThriftType(t_primitive=_fbthrift_metadata.ThriftPrimitiveType.THRIFT_STRING_TYPE),valueType=_fbthrift_metadata.ThriftType(t_primitive=_fbthrift_metadata.ThriftPrimitiveType.THRIFT_STRING_TYPE))), name="assign", is_optional=False, structured_annotations=[
        ]),
    ]
    struct_dict = dict(metadata_struct.structs)
    struct_dict[qualified_name] = _fbthrift_metadata.ThriftStruct(name=qualified_name, fields=fields,
        is_union=False,
        structured_annotations=[
        ])
    new_struct = metadata_struct(structs=struct_dict)

     # key
     # val  # assign

    return new_struct
def gen_metadata_struct_MyStructField23Patch() -> _fbthrift_metadata.ThriftMetadata:
    return _fbthrift_gen_metadata_struct_MyStructField23Patch(_fbthrift_metadata.ThriftMetadata(structs={}, enums={}, exceptions={}, services={}))

# TODO (ffrancet): This general pattern can be optimized by using tuples and dicts
# instead of re-generating thrift structs
def _fbthrift_gen_metadata_struct_OptionalMyStructField23Patch(metadata_struct: _fbthrift_metadata.ThriftMetadata) -> _fbthrift_metadata.ThriftMetadata:
    qualified_name = "module.OptionalMyStructField23Patch"

    if qualified_name in metadata_struct.structs:
        return metadata_struct
    fields = [
        _fbthrift_metadata.ThriftField(id=2, type=_fbthrift_metadata.ThriftType(t_primitive=_fbthrift_metadata.ThriftPrimitiveType.THRIFT_BOOL_TYPE), name="clear", is_optional=False, structured_annotations=[
        ]),
        _fbthrift_metadata.ThriftField(id=3, type=_fbthrift_metadata.ThriftType(t_struct=_fbthrift_metadata.ThriftStructType(name="module.MyStructField23Patch")), name="patch", is_optional=False, structured_annotations=[
        ]),
        _fbthrift_metadata.ThriftField(id=1, type=_fbthrift_metadata.ThriftType(t_map=_fbthrift_metadata.ThriftMapType(keyType=_fbthrift_metadata.ThriftType(t_primitive=_fbthrift_metadata.ThriftPrimitiveType.THRIFT_STRING_TYPE),valueType=_fbthrift_metadata.ThriftType(t_primitive=_fbthrift_metadata.ThriftPrimitiveType.THRIFT_STRING_TYPE))), name="ensure", is_optional=False, structured_annotations=[
        ]),
        _fbthrift_metadata.ThriftField(id=4, type=_fbthrift_metadata.ThriftType(t_struct=_fbthrift_metadata.ThriftStructType(name="module.MyStructField23Patch")), name="patchAfter", is_optional=False, structured_annotations=[
        ]),
    ]
    struct_dict = dict(metadata_struct.structs)
    struct_dict[qualified_name] = _fbthrift_metadata.ThriftStruct(name=qualified_name, fields=fields,
        is_union=False,
        structured_annotations=[
        ])
    new_struct = metadata_struct(structs=struct_dict)

     # clear
    new_struct = _fbthrift_gen_metadata_struct_MyStructField23Patch(new_struct) # patch
     # key
     # val  # ensure
    new_struct = _fbthrift_gen_metadata_struct_MyStructField23Patch(new_struct) # patchAfter

    return new_struct
def gen_metadata_struct_OptionalMyStructField23Patch() -> _fbthrift_metadata.ThriftMetadata:
    return _fbthrift_gen_metadata_struct_OptionalMyStructField23Patch(_fbthrift_metadata.ThriftMetadata(structs={}, enums={}, exceptions={}, services={}))

# TODO (ffrancet): This general pattern can be optimized by using tuples and dicts
# instead of re-generating thrift structs
def _fbthrift_gen_metadata_struct_MyStructValuePatch(metadata_struct: _fbthrift_metadata.ThriftMetadata) -> _fbthrift_metadata.ThriftMetadata:
    qualified_name = "module.MyStructValuePatch"

    if qualified_name in metadata_struct.structs:
        return metadata_struct
    fields = [
        _fbthrift_metadata.ThriftField(id=1, type=_fbthrift_metadata.ThriftType(t_struct=_fbthrift_metadata.ThriftStructType(name="module.MyStruct")), name="assign", is_optional=False, structured_annotations=[
        ]),
        _fbthrift_metadata.ThriftField(id=2, type=_fbthrift_metadata.ThriftType(t_primitive=_fbthrift_metadata.ThriftPrimitiveType.THRIFT_BOOL_TYPE), name="clear", is_optional=False, structured_annotations=[
        ]),
        _fbthrift_metadata.ThriftField(id=3, type=_fbthrift_metadata.ThriftType(t_struct=_fbthrift_metadata.ThriftStructType(name="module.MyStructPatch")), name="patch", is_optional=False, structured_annotations=[
        ]),
    ]
    struct_dict = dict(metadata_struct.structs)
    struct_dict[qualified_name] = _fbthrift_metadata.ThriftStruct(name=qualified_name, fields=fields,
        is_union=False,
        structured_annotations=[
        ])
    new_struct = metadata_struct(structs=struct_dict)

    new_struct = _fbthrift_gen_metadata_struct_MyStruct(new_struct) # assign
     # clear
    new_struct = _fbthrift_gen_metadata_struct_MyStructPatch(new_struct) # patch

    return new_struct
def gen_metadata_struct_MyStructValuePatch() -> _fbthrift_metadata.ThriftMetadata:
    return _fbthrift_gen_metadata_struct_MyStructValuePatch(_fbthrift_metadata.ThriftMetadata(structs={}, enums={}, exceptions={}, services={}))

# TODO (ffrancet): This general pattern can be optimized by using tuples and dicts
# instead of re-generating thrift structs
def _fbthrift_gen_metadata_struct_OptionalMyStructValuePatch(metadata_struct: _fbthrift_metadata.ThriftMetadata) -> _fbthrift_metadata.ThriftMetadata:
    qualified_name = "module.OptionalMyStructValuePatch"

    if qualified_name in metadata_struct.structs:
        return metadata_struct
    fields = [
        _fbthrift_metadata.ThriftField(id=2, type=_fbthrift_metadata.ThriftType(t_primitive=_fbthrift_metadata.ThriftPrimitiveType.THRIFT_BOOL_TYPE), name="clear", is_optional=False, structured_annotations=[
        ]),
        _fbthrift_metadata.ThriftField(id=3, type=_fbthrift_metadata.ThriftType(t_struct=_fbthrift_metadata.ThriftStructType(name="module.MyStructValuePatch")), name="patch", is_optional=False, structured_annotations=[
        ]),
        _fbthrift_metadata.ThriftField(id=1, type=_fbthrift_metadata.ThriftType(t_struct=_fbthrift_metadata.ThriftStructType(name="module.MyStruct")), name="ensure", is_optional=False, structured_annotations=[
        ]),
        _fbthrift_metadata.ThriftField(id=4, type=_fbthrift_metadata.ThriftType(t_struct=_fbthrift_metadata.ThriftStructType(name="module.MyStructValuePatch")), name="patchAfter", is_optional=False, structured_annotations=[
        ]),
    ]
    struct_dict = dict(metadata_struct.structs)
    struct_dict[qualified_name] = _fbthrift_metadata.ThriftStruct(name=qualified_name, fields=fields,
        is_union=False,
        structured_annotations=[
        ])
    new_struct = metadata_struct(structs=struct_dict)

     # clear
    new_struct = _fbthrift_gen_metadata_struct_MyStructValuePatch(new_struct) # patch
    new_struct = _fbthrift_gen_metadata_struct_MyStruct(new_struct) # ensure
    new_struct = _fbthrift_gen_metadata_struct_MyStructValuePatch(new_struct) # patchAfter

    return new_struct
def gen_metadata_struct_OptionalMyStructValuePatch() -> _fbthrift_metadata.ThriftMetadata:
    return _fbthrift_gen_metadata_struct_OptionalMyStructValuePatch(_fbthrift_metadata.ThriftMetadata(structs={}, enums={}, exceptions={}, services={}))




def getThriftModuleMetadata() -> _fbthrift_metadata.ThriftMetadata:
    meta = _fbthrift_metadata.ThriftMetadata(structs={}, enums={}, exceptions={}, services={})
    meta = _fbthrift_gen_metadata_struct_MyData(meta)
    meta = _fbthrift_gen_metadata_struct_MyStruct(meta)
    meta = _fbthrift_gen_metadata_struct_MyDataPatch(meta)
    meta = _fbthrift_gen_metadata_struct_MyDataValuePatch(meta)
    meta = _fbthrift_gen_metadata_struct_OptionalMyDataValuePatch(meta)
    meta = _fbthrift_gen_metadata_struct_MyStructPatch(meta)
    meta = _fbthrift_gen_metadata_struct_MyStructField21Patch(meta)
    meta = _fbthrift_gen_metadata_struct_OptionalMyStructField21Patch(meta)
    meta = _fbthrift_gen_metadata_struct_MyStructField22Patch(meta)
    meta = _fbthrift_gen_metadata_struct_OptionalMyStructField22Patch(meta)
    meta = _fbthrift_gen_metadata_struct_MyStructField23Patch(meta)
    meta = _fbthrift_gen_metadata_struct_OptionalMyStructField23Patch(meta)
    meta = _fbthrift_gen_metadata_struct_MyStructValuePatch(meta)
    meta = _fbthrift_gen_metadata_struct_OptionalMyStructValuePatch(meta)
    return meta
