/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */

package test.fixtures.module2;

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
@com.facebook.swift.codec.ThriftStruct(value="Struct", builder=Struct.Builder.class)
public final class Struct implements com.facebook.thrift.payload.ThriftSerializable {

    @ThriftConstructor
    public Struct(
        @com.facebook.swift.codec.ThriftField(value=1, name="first", requiredness=Requiredness.NONE) final test.fixtures.module0.Struct first,
        @com.facebook.swift.codec.ThriftField(value=2, name="second", requiredness=Requiredness.NONE) final test.fixtures.module1.Struct second
    ) {
        this.first = first;
        this.second = second;
    }
    
    @ThriftConstructor
    protected Struct() {
      this.first = null;
      this.second = null;
    }
    
    public static class Builder {
    
        private test.fixtures.module0.Struct first = null;
        private test.fixtures.module1.Struct second = null;
    
        @com.facebook.swift.codec.ThriftField(value=1, name="first", requiredness=Requiredness.NONE)
        public Builder setFirst(test.fixtures.module0.Struct first) {
            this.first = first;
            return this;
        }
    
        public test.fixtures.module0.Struct getFirst() { return first; }
    
            @com.facebook.swift.codec.ThriftField(value=2, name="second", requiredness=Requiredness.NONE)
        public Builder setSecond(test.fixtures.module1.Struct second) {
            this.second = second;
            return this;
        }
    
        public test.fixtures.module1.Struct getSecond() { return second; }
    
        public Builder() { }
        public Builder(Struct other) {
            this.first = other.first;
            this.second = other.second;
        }
    
        @ThriftConstructor
        public Struct build() {
            Struct result = new Struct (
                this.first,
                this.second
            );
            return result;
        }
    }
            public static final Map<String, Integer> NAMES_TO_IDS = new HashMap();
    public static final Map<String, Integer> THRIFT_NAMES_TO_IDS = new HashMap();
    public static final Map<Integer, TField> FIELD_METADATA = new HashMap<>();
    private static final TStruct STRUCT_DESC = new TStruct("Struct");
    private final test.fixtures.module0.Struct first;
    public static final int _FIRST = 1;
    private static final TField FIRST_FIELD_DESC = new TField("first", TType.STRUCT, (short)1);
        private final test.fixtures.module1.Struct second;
    public static final int _SECOND = 2;
    private static final TField SECOND_FIELD_DESC = new TField("second", TType.STRUCT, (short)2);
    static {
      NAMES_TO_IDS.put("first", 1);
      THRIFT_NAMES_TO_IDS.put("first", 1);
      FIELD_METADATA.put(1, FIRST_FIELD_DESC);
      NAMES_TO_IDS.put("second", 2);
      THRIFT_NAMES_TO_IDS.put("second", 2);
      FIELD_METADATA.put(2, SECOND_FIELD_DESC);
    }
    
    @Nullable
    @com.facebook.swift.codec.ThriftField(value=1, name="first", requiredness=Requiredness.NONE)
    public test.fixtures.module0.Struct getFirst() { return first; }
    
    
    @Nullable
    @com.facebook.swift.codec.ThriftField(value=2, name="second", requiredness=Requiredness.NONE)
    public test.fixtures.module1.Struct getSecond() { return second; }
    
    @java.lang.Override
    public String toString() {
        ToStringHelper helper = toStringHelper(this);
        helper.add("first", first);
        helper.add("second", second);
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
    
        Struct other = (Struct)o;
    
        return
            Objects.equals(first, other.first) &&
    Objects.equals(second, other.second) &&
            true;
    }
    
    @java.lang.Override
    public int hashCode() {
        return Arrays.deepHashCode(new java.lang.Object[] {
            first,
            second
        });
    }
    
    
    public static com.facebook.thrift.payload.Reader<Struct> asReader() {
      return Struct::read0;
    }
    
    public static Struct read0(TProtocol oprot) throws TException {
      TField __field;
      oprot.readStructBegin(Struct.NAMES_TO_IDS, Struct.THRIFT_NAMES_TO_IDS, Struct.FIELD_METADATA);
      Struct.Builder builder = new Struct.Builder();
      while (true) {
        __field = oprot.readFieldBegin();
        if (__field.type == TType.STOP) { break; }
        switch (__field.id) {
        case _FIRST:
          if (__field.type == TType.STRUCT) {
            test.fixtures.module0.Struct first = test.fixtures.module0.Struct.read0(oprot);
            builder.setFirst(first);
          } else {
            TProtocolUtil.skip(oprot, __field.type);
          }
          break;
        case _SECOND:
          if (__field.type == TType.STRUCT) {
            test.fixtures.module1.Struct second = test.fixtures.module1.Struct.read0(oprot);
            builder.setSecond(second);
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
      if (this.first != null) {
        oprot.writeFieldBegin(FIRST_FIELD_DESC);
        this.first.write0(oprot);
        oprot.writeFieldEnd();
      }
      if (this.second != null) {
        oprot.writeFieldBegin(SECOND_FIELD_DESC);
        this.second.write0(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }
    
    private static class _StructLazy {
        private static final Struct _DEFAULT = new Struct.Builder().build();
    }
    
    public static Struct defaultInstance() {
        return  _StructLazy._DEFAULT;
    }
}
