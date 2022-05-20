/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */

package test.fixtures.injectMetadataFields;

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
@com.facebook.swift.codec.ThriftStruct(value="FieldsInjectedToStruct", builder=FieldsInjectedToStruct.Builder.class)
public final class FieldsInjectedToStruct implements com.facebook.thrift.payload.ThriftSerializable {

    @ThriftConstructor
    public FieldsInjectedToStruct(
        @com.facebook.swift.codec.ThriftField(value=1, name="string_field", requiredness=Requiredness.NONE) final String stringField,
        @com.facebook.swift.codec.ThriftField(value=-1100, name="injected_field", isLegacyId=true, requiredness=Requiredness.NONE) final String injectedField
    ) {
        this.stringField = stringField;
        this.injectedField = injectedField;
    }
    
    @ThriftConstructor
    protected FieldsInjectedToStruct() {
      this.stringField = null;
      this.injectedField = null;
    }
    
    public static class Builder {
    
        private String stringField = null;
        private String injectedField = null;
    
        @com.facebook.swift.codec.ThriftField(value=1, name="string_field", requiredness=Requiredness.NONE)
        public Builder setStringField(String stringField) {
            this.stringField = stringField;
            return this;
        }
    
        public String getStringField() { return stringField; }
    
            @com.facebook.swift.codec.ThriftField(value=-1100, name="injected_field", isLegacyId=true, requiredness=Requiredness.NONE)
        public Builder setInjectedField(String injectedField) {
            this.injectedField = injectedField;
            return this;
        }
    
        public String getInjectedField() { return injectedField; }
    
        public Builder() { }
        public Builder(FieldsInjectedToStruct other) {
            this.stringField = other.stringField;
            this.injectedField = other.injectedField;
        }
    
        @ThriftConstructor
        public FieldsInjectedToStruct build() {
            FieldsInjectedToStruct result = new FieldsInjectedToStruct (
                this.stringField,
                this.injectedField
            );
            return result;
        }
    }
            public static final Map<String, Integer> NAMES_TO_IDS = new HashMap();
    public static final Map<String, Integer> THRIFT_NAMES_TO_IDS = new HashMap();
    public static final Map<Integer, TField> FIELD_METADATA = new HashMap<>();
    private static final TStruct STRUCT_DESC = new TStruct("FieldsInjectedToStruct");
    private final String stringField;
    public static final int _STRING_FIELD = 1;
    private static final TField STRING_FIELD_FIELD_DESC = new TField("string_field", TType.STRING, (short)1);
        private final String injectedField;
    public static final int _INJECTED_FIELD = -1100;
    private static final TField INJECTED_FIELD_FIELD_DESC = new TField("injected_field", TType.STRING, (short)-1100);
    static {
      NAMES_TO_IDS.put("stringField", 1);
      THRIFT_NAMES_TO_IDS.put("string_field", 1);
      FIELD_METADATA.put(1, STRING_FIELD_FIELD_DESC);
      NAMES_TO_IDS.put("injectedField", -1100);
      THRIFT_NAMES_TO_IDS.put("injected_field", -1100);
      FIELD_METADATA.put(-1100, INJECTED_FIELD_FIELD_DESC);
    }
    
    @Nullable
    @com.facebook.swift.codec.ThriftField(value=1, name="string_field", requiredness=Requiredness.NONE)
    public String getStringField() { return stringField; }
    
    
    @Nullable
    @com.facebook.swift.codec.ThriftField(value=-1100, name="injected_field", isLegacyId=true, requiredness=Requiredness.NONE)
    public String getInjectedField() { return injectedField; }
    
    @java.lang.Override
    public String toString() {
        ToStringHelper helper = toStringHelper(this);
        helper.add("stringField", stringField);
        helper.add("injectedField", injectedField);
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
    
        FieldsInjectedToStruct other = (FieldsInjectedToStruct)o;
    
        return
            Objects.equals(stringField, other.stringField) &&
    Objects.equals(injectedField, other.injectedField) &&
            true;
    }
    
    @java.lang.Override
    public int hashCode() {
        return Arrays.deepHashCode(new java.lang.Object[] {
            stringField,
            injectedField
        });
    }
    
    
    public static com.facebook.thrift.payload.Reader<FieldsInjectedToStruct> asReader() {
      return FieldsInjectedToStruct::read0;
    }
    
    public static FieldsInjectedToStruct read0(TProtocol oprot) throws TException {
      TField __field;
      oprot.readStructBegin(FieldsInjectedToStruct.NAMES_TO_IDS, FieldsInjectedToStruct.THRIFT_NAMES_TO_IDS, FieldsInjectedToStruct.FIELD_METADATA);
      FieldsInjectedToStruct.Builder builder = new FieldsInjectedToStruct.Builder();
      while (true) {
        __field = oprot.readFieldBegin();
        if (__field.type == TType.STOP) { break; }
        switch (__field.id) {
        case _STRING_FIELD:
          if (__field.type == TType.STRING) {
            String stringField = oprot.readString();
            builder.setStringField(stringField);
          } else {
            TProtocolUtil.skip(oprot, __field.type);
          }
          break;
        case _INJECTED_FIELD:
          if (__field.type == TType.STRING) {
            String injectedField = oprot.readString();
            builder.setInjectedField(injectedField);
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
      if (this.stringField != null) {
        oprot.writeFieldBegin(STRING_FIELD_FIELD_DESC);
        oprot.writeString(this.stringField);
        oprot.writeFieldEnd();
      }
      if (this.injectedField != null) {
        oprot.writeFieldBegin(INJECTED_FIELD_FIELD_DESC);
        oprot.writeString(this.injectedField);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }
    
    private static class _FieldsInjectedToStructLazy {
        private static final FieldsInjectedToStruct _DEFAULT = new FieldsInjectedToStruct.Builder().build();
    }
    
    public static FieldsInjectedToStruct defaultInstance() {
        return  _FieldsInjectedToStructLazy._DEFAULT;
    }
}
