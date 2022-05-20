/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */

package test.fixtures.constants;

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
@com.facebook.swift.codec.ThriftStruct(value="struct3", builder=Struct3.Builder.class)
public final class Struct3 implements com.facebook.thrift.payload.ThriftSerializable {

    @ThriftConstructor
    public Struct3(
        @com.facebook.swift.codec.ThriftField(value=1, name="a", requiredness=Requiredness.NONE) final String a,
        @com.facebook.swift.codec.ThriftField(value=2, name="b", requiredness=Requiredness.NONE) final int b,
        @com.facebook.swift.codec.ThriftField(value=3, name="c", requiredness=Requiredness.NONE) final test.fixtures.constants.Struct2 c
    ) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @ThriftConstructor
    protected Struct3() {
      this.a = null;
      this.b = 0;
      this.c = null;
    }
    
    public static class Builder {
    
        private String a = null;
        private int b = 0;
        private test.fixtures.constants.Struct2 c = null;
    
        @com.facebook.swift.codec.ThriftField(value=1, name="a", requiredness=Requiredness.NONE)
        public Builder setA(String a) {
            this.a = a;
            return this;
        }
    
        public String getA() { return a; }
    
            @com.facebook.swift.codec.ThriftField(value=2, name="b", requiredness=Requiredness.NONE)
        public Builder setB(int b) {
            this.b = b;
            return this;
        }
    
        public int getB() { return b; }
    
            @com.facebook.swift.codec.ThriftField(value=3, name="c", requiredness=Requiredness.NONE)
        public Builder setC(test.fixtures.constants.Struct2 c) {
            this.c = c;
            return this;
        }
    
        public test.fixtures.constants.Struct2 getC() { return c; }
    
        public Builder() { }
        public Builder(Struct3 other) {
            this.a = other.a;
            this.b = other.b;
            this.c = other.c;
        }
    
        @ThriftConstructor
        public Struct3 build() {
            Struct3 result = new Struct3 (
                this.a,
                this.b,
                this.c
            );
            return result;
        }
    }
                public static final Map<String, Integer> NAMES_TO_IDS = new HashMap();
    public static final Map<String, Integer> THRIFT_NAMES_TO_IDS = new HashMap();
    public static final Map<Integer, TField> FIELD_METADATA = new HashMap<>();
    private static final TStruct STRUCT_DESC = new TStruct("struct3");
    private final String a;
    public static final int _A = 1;
    private static final TField A_FIELD_DESC = new TField("a", TType.STRING, (short)1);
        private final int b;
    public static final int _B = 2;
    private static final TField B_FIELD_DESC = new TField("b", TType.I32, (short)2);
        private final test.fixtures.constants.Struct2 c;
    public static final int _C = 3;
    private static final TField C_FIELD_DESC = new TField("c", TType.STRUCT, (short)3);
    static {
      NAMES_TO_IDS.put("a", 1);
      THRIFT_NAMES_TO_IDS.put("a", 1);
      FIELD_METADATA.put(1, A_FIELD_DESC);
      NAMES_TO_IDS.put("b", 2);
      THRIFT_NAMES_TO_IDS.put("b", 2);
      FIELD_METADATA.put(2, B_FIELD_DESC);
      NAMES_TO_IDS.put("c", 3);
      THRIFT_NAMES_TO_IDS.put("c", 3);
      FIELD_METADATA.put(3, C_FIELD_DESC);
    }
    
    @Nullable
    @com.facebook.swift.codec.ThriftField(value=1, name="a", requiredness=Requiredness.NONE)
    public String getA() { return a; }
    
    
    
    @com.facebook.swift.codec.ThriftField(value=2, name="b", requiredness=Requiredness.NONE)
    public int getB() { return b; }
    
    
    @Nullable
    @com.facebook.swift.codec.ThriftField(value=3, name="c", requiredness=Requiredness.NONE)
    public test.fixtures.constants.Struct2 getC() { return c; }
    
    @java.lang.Override
    public String toString() {
        ToStringHelper helper = toStringHelper(this);
        helper.add("a", a);
        helper.add("b", b);
        helper.add("c", c);
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
    
        Struct3 other = (Struct3)o;
    
        return
            Objects.equals(a, other.a) &&
    Objects.equals(b, other.b) &&
    Objects.equals(c, other.c) &&
            true;
    }
    
    @java.lang.Override
    public int hashCode() {
        return Arrays.deepHashCode(new java.lang.Object[] {
            a,
            b,
            c
        });
    }
    
    
    public static com.facebook.thrift.payload.Reader<Struct3> asReader() {
      return Struct3::read0;
    }
    
    public static Struct3 read0(TProtocol oprot) throws TException {
      TField __field;
      oprot.readStructBegin(Struct3.NAMES_TO_IDS, Struct3.THRIFT_NAMES_TO_IDS, Struct3.FIELD_METADATA);
      Struct3.Builder builder = new Struct3.Builder();
      while (true) {
        __field = oprot.readFieldBegin();
        if (__field.type == TType.STOP) { break; }
        switch (__field.id) {
        case _A:
          if (__field.type == TType.STRING) {
            String a = oprot.readString();
            builder.setA(a);
          } else {
            TProtocolUtil.skip(oprot, __field.type);
          }
          break;
        case _B:
          if (__field.type == TType.I32) {
            int b = oprot.readI32();
            builder.setB(b);
          } else {
            TProtocolUtil.skip(oprot, __field.type);
          }
          break;
        case _C:
          if (__field.type == TType.STRUCT) {
            test.fixtures.constants.Struct2 c = test.fixtures.constants.Struct2.read0(oprot);
            builder.setC(c);
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
      if (this.a != null) {
        oprot.writeFieldBegin(A_FIELD_DESC);
        oprot.writeString(this.a);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(B_FIELD_DESC);
      oprot.writeI32(this.b);
      oprot.writeFieldEnd();
      if (this.c != null) {
        oprot.writeFieldBegin(C_FIELD_DESC);
        this.c.write0(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }
    
    private static class _Struct3Lazy {
        private static final Struct3 _DEFAULT = new Struct3.Builder().build();
    }
    
    public static Struct3 defaultInstance() {
        return  _Struct3Lazy._DEFAULT;
    }
}
