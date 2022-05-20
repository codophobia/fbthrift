/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */

package test.fixtures.adapter;

import com.facebook.swift.codec.*;
import com.facebook.swift.codec.ThriftField.Requiredness;
import com.facebook.swift.codec.ThriftField.Recursiveness;
import com.google.common.collect.*;
import java.util.*;
import javax.annotation.Nullable;
import org.apache.thrift.*;
import org.apache.thrift.transport.*;
import org.apache.thrift.protocol.*;
import static com.google.common.base.MoreObjects.toStringHelper;
import static com.google.common.base.MoreObjects.ToStringHelper;

@SwiftGenerated
@com.facebook.swift.codec.ThriftStruct(value="Bar", builder=Bar.Builder.class)
public final class Bar implements com.facebook.thrift.payload.ThriftSerializable {

    @ThriftConstructor
    public Bar(
        @com.facebook.swift.codec.ThriftField(value=1, name="structField", requiredness=Requiredness.NONE) final test.fixtures.adapter.Foo structField,
        @com.facebook.swift.codec.ThriftField(value=2, name="optionalStructField", requiredness=Requiredness.OPTIONAL) final test.fixtures.adapter.Foo optionalStructField,
        @com.facebook.swift.codec.ThriftField(value=3, name="structListField", requiredness=Requiredness.NONE) final List<test.fixtures.adapter.Foo> structListField,
        @com.facebook.swift.codec.ThriftField(value=4, name="optionalStructListField", requiredness=Requiredness.OPTIONAL) final List<test.fixtures.adapter.Foo> optionalStructListField,
        @com.facebook.swift.codec.ThriftField(value=5, name="unionField", requiredness=Requiredness.NONE) final test.fixtures.adapter.Baz unionField,
        @com.facebook.swift.codec.ThriftField(value=6, name="optionalUnionField", requiredness=Requiredness.OPTIONAL) final test.fixtures.adapter.Baz optionalUnionField
    ) {
        this.structField = structField;
        this.optionalStructField = optionalStructField;
        this.structListField = structListField;
        this.optionalStructListField = optionalStructListField;
        this.unionField = unionField;
        this.optionalUnionField = optionalUnionField;
    }
    
    @ThriftConstructor
    protected Bar() {
      this.structField = null;
      this.optionalStructField = null;
      this.structListField = null;
      this.optionalStructListField = null;
      this.unionField = null;
      this.optionalUnionField = null;
    }
    
    public static class Builder {
    
        private test.fixtures.adapter.Foo structField = null;
        private test.fixtures.adapter.Foo optionalStructField = null;
        private List<test.fixtures.adapter.Foo> structListField = null;
        private List<test.fixtures.adapter.Foo> optionalStructListField = null;
        private test.fixtures.adapter.Baz unionField = null;
        private test.fixtures.adapter.Baz optionalUnionField = null;
    
        @com.facebook.swift.codec.ThriftField(value=1, name="structField", requiredness=Requiredness.NONE)
        public Builder setStructField(test.fixtures.adapter.Foo structField) {
            this.structField = structField;
            return this;
        }
    
        public test.fixtures.adapter.Foo getStructField() { return structField; }
    
            @com.facebook.swift.codec.ThriftField(value=2, name="optionalStructField", requiredness=Requiredness.OPTIONAL)
        public Builder setOptionalStructField(test.fixtures.adapter.Foo optionalStructField) {
            this.optionalStructField = optionalStructField;
            return this;
        }
    
        public test.fixtures.adapter.Foo getOptionalStructField() { return optionalStructField; }
    
            @com.facebook.swift.codec.ThriftField(value=3, name="structListField", requiredness=Requiredness.NONE)
        public Builder setStructListField(List<test.fixtures.adapter.Foo> structListField) {
            this.structListField = structListField;
            return this;
        }
    
        public List<test.fixtures.adapter.Foo> getStructListField() { return structListField; }
    
            @com.facebook.swift.codec.ThriftField(value=4, name="optionalStructListField", requiredness=Requiredness.OPTIONAL)
        public Builder setOptionalStructListField(List<test.fixtures.adapter.Foo> optionalStructListField) {
            this.optionalStructListField = optionalStructListField;
            return this;
        }
    
        public List<test.fixtures.adapter.Foo> getOptionalStructListField() { return optionalStructListField; }
    
            @com.facebook.swift.codec.ThriftField(value=5, name="unionField", requiredness=Requiredness.NONE)
        public Builder setUnionField(test.fixtures.adapter.Baz unionField) {
            this.unionField = unionField;
            return this;
        }
    
        public test.fixtures.adapter.Baz getUnionField() { return unionField; }
    
            @com.facebook.swift.codec.ThriftField(value=6, name="optionalUnionField", requiredness=Requiredness.OPTIONAL)
        public Builder setOptionalUnionField(test.fixtures.adapter.Baz optionalUnionField) {
            this.optionalUnionField = optionalUnionField;
            return this;
        }
    
        public test.fixtures.adapter.Baz getOptionalUnionField() { return optionalUnionField; }
    
        public Builder() { }
        public Builder(Bar other) {
            this.structField = other.structField;
            this.optionalStructField = other.optionalStructField;
            this.structListField = other.structListField;
            this.optionalStructListField = other.optionalStructListField;
            this.unionField = other.unionField;
            this.optionalUnionField = other.optionalUnionField;
        }
    
        @ThriftConstructor
        public Bar build() {
            Bar result = new Bar (
                this.structField,
                this.optionalStructField,
                this.structListField,
                this.optionalStructListField,
                this.unionField,
                this.optionalUnionField
            );
            return result;
        }
    }
                            public static final Map<String, Integer> NAMES_TO_IDS = new HashMap();
    public static final Map<String, Integer> THRIFT_NAMES_TO_IDS = new HashMap();
    public static final Map<Integer, TField> FIELD_METADATA = new HashMap<>();
    private static final TStruct STRUCT_DESC = new TStruct("Bar");
    private final test.fixtures.adapter.Foo structField;
    public static final int _STRUCTFIELD = 1;
    private static final TField STRUCT_FIELD_FIELD_DESC = new TField("structField", TType.STRUCT, (short)1);
        private final test.fixtures.adapter.Foo optionalStructField;
    public static final int _OPTIONALSTRUCTFIELD = 2;
    private static final TField OPTIONAL_STRUCT_FIELD_FIELD_DESC = new TField("optionalStructField", TType.STRUCT, (short)2);
        private final List<test.fixtures.adapter.Foo> structListField;
    public static final int _STRUCTLISTFIELD = 3;
    private static final TField STRUCT_LIST_FIELD_FIELD_DESC = new TField("structListField", TType.LIST, (short)3);
        private final List<test.fixtures.adapter.Foo> optionalStructListField;
    public static final int _OPTIONALSTRUCTLISTFIELD = 4;
    private static final TField OPTIONAL_STRUCT_LIST_FIELD_FIELD_DESC = new TField("optionalStructListField", TType.LIST, (short)4);
        private final test.fixtures.adapter.Baz unionField;
    public static final int _UNIONFIELD = 5;
    private static final TField UNION_FIELD_FIELD_DESC = new TField("unionField", TType.STRUCT, (short)5);
        private final test.fixtures.adapter.Baz optionalUnionField;
    public static final int _OPTIONALUNIONFIELD = 6;
    private static final TField OPTIONAL_UNION_FIELD_FIELD_DESC = new TField("optionalUnionField", TType.STRUCT, (short)6);
    static {
      NAMES_TO_IDS.put("structField", 1);
      THRIFT_NAMES_TO_IDS.put("structField", 1);
      FIELD_METADATA.put(1, STRUCT_FIELD_FIELD_DESC);
      NAMES_TO_IDS.put("optionalStructField", 2);
      THRIFT_NAMES_TO_IDS.put("optionalStructField", 2);
      FIELD_METADATA.put(2, OPTIONAL_STRUCT_FIELD_FIELD_DESC);
      NAMES_TO_IDS.put("structListField", 3);
      THRIFT_NAMES_TO_IDS.put("structListField", 3);
      FIELD_METADATA.put(3, STRUCT_LIST_FIELD_FIELD_DESC);
      NAMES_TO_IDS.put("optionalStructListField", 4);
      THRIFT_NAMES_TO_IDS.put("optionalStructListField", 4);
      FIELD_METADATA.put(4, OPTIONAL_STRUCT_LIST_FIELD_FIELD_DESC);
      NAMES_TO_IDS.put("unionField", 5);
      THRIFT_NAMES_TO_IDS.put("unionField", 5);
      FIELD_METADATA.put(5, UNION_FIELD_FIELD_DESC);
      NAMES_TO_IDS.put("optionalUnionField", 6);
      THRIFT_NAMES_TO_IDS.put("optionalUnionField", 6);
      FIELD_METADATA.put(6, OPTIONAL_UNION_FIELD_FIELD_DESC);
    }
    
    @Nullable
    @com.facebook.swift.codec.ThriftField(value=1, name="structField", requiredness=Requiredness.NONE)
    public test.fixtures.adapter.Foo getStructField() { return structField; }
    
    
    @Nullable
    @com.facebook.swift.codec.ThriftField(value=2, name="optionalStructField", requiredness=Requiredness.OPTIONAL)
    public test.fixtures.adapter.Foo getOptionalStructField() { return optionalStructField; }
    
    
    @Nullable
    @com.facebook.swift.codec.ThriftField(value=3, name="structListField", requiredness=Requiredness.NONE)
    public List<test.fixtures.adapter.Foo> getStructListField() { return structListField; }
    
    
    @Nullable
    @com.facebook.swift.codec.ThriftField(value=4, name="optionalStructListField", requiredness=Requiredness.OPTIONAL)
    public List<test.fixtures.adapter.Foo> getOptionalStructListField() { return optionalStructListField; }
    
    
    @Nullable
    @com.facebook.swift.codec.ThriftField(value=5, name="unionField", requiredness=Requiredness.NONE)
    public test.fixtures.adapter.Baz getUnionField() { return unionField; }
    
    
    @Nullable
    @com.facebook.swift.codec.ThriftField(value=6, name="optionalUnionField", requiredness=Requiredness.OPTIONAL)
    public test.fixtures.adapter.Baz getOptionalUnionField() { return optionalUnionField; }
    
    @java.lang.Override
    public String toString() {
        ToStringHelper helper = toStringHelper(this);
        helper.add("structField", structField);
        helper.add("optionalStructField", optionalStructField);
        helper.add("structListField", structListField);
        helper.add("optionalStructListField", optionalStructListField);
        helper.add("unionField", unionField);
        helper.add("optionalUnionField", optionalUnionField);
        return helper.toString();
    }
    
    @java.lang.Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
    
        Bar other = (Bar)o;
    
        return
            Objects.equals(structField, other.structField) &&
    Objects.equals(optionalStructField, other.optionalStructField) &&
    Objects.equals(structListField, other.structListField) &&
    Objects.equals(optionalStructListField, other.optionalStructListField) &&
    Objects.equals(unionField, other.unionField) &&
    Objects.equals(optionalUnionField, other.optionalUnionField) &&
            true;
    }
    
    @java.lang.Override
    public int hashCode() {
        return Arrays.deepHashCode(new java.lang.Object[] {
            structField,
            optionalStructField,
            structListField,
            optionalStructListField,
            unionField,
            optionalUnionField
        });
    }
    
    
    public static com.facebook.thrift.payload.Reader<Bar> asReader() {
      return Bar::read0;
    }
    
    public static Bar read0(TProtocol oprot) throws TException {
      TField __field;
      oprot.readStructBegin(Bar.NAMES_TO_IDS, Bar.THRIFT_NAMES_TO_IDS, Bar.FIELD_METADATA);
      Bar.Builder builder = new Bar.Builder();
      while (true) {
        __field = oprot.readFieldBegin();
        if (__field.type == TType.STOP) { break; }
        switch (__field.id) {
        case _STRUCTFIELD:
          if (__field.type == TType.STRUCT) {
            test.fixtures.adapter.Foo structField = test.fixtures.adapter.Foo.read0(oprot);
            builder.setStructField(structField);
          } else {
            TProtocolUtil.skip(oprot, __field.type);
          }
          break;
        case _OPTIONALSTRUCTFIELD:
          if (__field.type == TType.STRUCT) {
            test.fixtures.adapter.Foo optionalStructField = test.fixtures.adapter.Foo.read0(oprot);
            builder.setOptionalStructField(optionalStructField);
          } else {
            TProtocolUtil.skip(oprot, __field.type);
          }
          break;
        case _STRUCTLISTFIELD:
          if (__field.type == TType.LIST) {
            List<test.fixtures.adapter.Foo> structListField;
            {
            TList _list = oprot.readListBegin();
            structListField = new ArrayList<test.fixtures.adapter.Foo>(Math.max(0, _list.size));
            for (int _i = 0; (_list.size < 0) ? oprot.peekList() : (_i < _list.size); _i++) {
                
                test.fixtures.adapter.Foo _value1 = test.fixtures.adapter.Foo.read0(oprot);
                structListField.add(_value1);
            }
            oprot.readListEnd();
            }
            builder.setStructListField(structListField);
          } else {
            TProtocolUtil.skip(oprot, __field.type);
          }
          break;
        case _OPTIONALSTRUCTLISTFIELD:
          if (__field.type == TType.LIST) {
            List<test.fixtures.adapter.Foo> optionalStructListField;
            {
            TList _list = oprot.readListBegin();
            optionalStructListField = new ArrayList<test.fixtures.adapter.Foo>(Math.max(0, _list.size));
            for (int _i = 0; (_list.size < 0) ? oprot.peekList() : (_i < _list.size); _i++) {
                
                test.fixtures.adapter.Foo _value1 = test.fixtures.adapter.Foo.read0(oprot);
                optionalStructListField.add(_value1);
            }
            oprot.readListEnd();
            }
            builder.setOptionalStructListField(optionalStructListField);
          } else {
            TProtocolUtil.skip(oprot, __field.type);
          }
          break;
        case _UNIONFIELD:
          if (__field.type == TType.STRUCT) {
            test.fixtures.adapter.Baz unionField = test.fixtures.adapter.Baz.read0(oprot);
            builder.setUnionField(unionField);
          } else {
            TProtocolUtil.skip(oprot, __field.type);
          }
          break;
        case _OPTIONALUNIONFIELD:
          if (__field.type == TType.STRUCT) {
            test.fixtures.adapter.Baz optionalUnionField = test.fixtures.adapter.Baz.read0(oprot);
            builder.setOptionalUnionField(optionalUnionField);
          } else {
            TProtocolUtil.skip(oprot, __field.type);
          }
          break;
        default:
          TProtocolUtil.skip(oprot, __field.type);
          break;
        }
        oprot.readFieldEnd();
      }
      oprot.readStructEnd();
      return builder.build();
    }
    
    public void write0(TProtocol oprot) throws TException {
      oprot.writeStructBegin(STRUCT_DESC);
      if (this.structField != null) {
        oprot.writeFieldBegin(STRUCT_FIELD_FIELD_DESC);
        this.structField.write0(oprot);
        oprot.writeFieldEnd();
      }
      if (this.optionalStructField != null) {
        oprot.writeFieldBegin(OPTIONAL_STRUCT_FIELD_FIELD_DESC);
        this.optionalStructField.write0(oprot);
        oprot.writeFieldEnd();
      }
      if (this.structListField != null) {
        oprot.writeFieldBegin(STRUCT_LIST_FIELD_FIELD_DESC);
        List<test.fixtures.adapter.Foo> _iter0 = this.structListField;
        oprot.writeListBegin(new TList(TType.STRUCT, _iter0.size()));
        for (test.fixtures.adapter.Foo _iter1 : _iter0) {
          _iter1.write0(oprot);
        }
        oprot.writeListEnd();
        oprot.writeFieldEnd();
      }
      if (this.optionalStructListField != null) {
        oprot.writeFieldBegin(OPTIONAL_STRUCT_LIST_FIELD_FIELD_DESC);
        List<test.fixtures.adapter.Foo> _iter0 = this.optionalStructListField;
        oprot.writeListBegin(new TList(TType.STRUCT, _iter0.size()));
        for (test.fixtures.adapter.Foo _iter1 : _iter0) {
          _iter1.write0(oprot);
        }
        oprot.writeListEnd();
        oprot.writeFieldEnd();
      }
      if (this.unionField != null) {
        oprot.writeFieldBegin(UNION_FIELD_FIELD_DESC);
        this.unionField.write0(oprot);
        oprot.writeFieldEnd();
      }
      if (this.optionalUnionField != null) {
        oprot.writeFieldBegin(OPTIONAL_UNION_FIELD_FIELD_DESC);
        this.optionalUnionField.write0(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }
    
    private static class _BarLazy {
        private static final Bar _DEFAULT = new Bar.Builder().build();
    }
    
    public static Bar defaultInstance() {
        return  _BarLazy._DEFAULT;
    }
}
