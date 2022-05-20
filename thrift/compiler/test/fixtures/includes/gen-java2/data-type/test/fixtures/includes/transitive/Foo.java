/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */

package test.fixtures.includes.transitive;

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
@com.facebook.swift.codec.ThriftStruct(value="Foo", builder=Foo.Builder.class)
public final class Foo implements com.facebook.thrift.payload.ThriftSerializable {

    @ThriftConstructor
    public Foo(
        @com.facebook.swift.codec.ThriftField(value=1, name="a", requiredness=Requiredness.NONE) final long a
    ) {
        this.a = a;
    }
    
    @ThriftConstructor
    protected Foo() {
      this.a = 2L;
    }
    
    public static class Builder {
    
        private long a = 2L;
    
        @com.facebook.swift.codec.ThriftField(value=1, name="a", requiredness=Requiredness.NONE)
        public Builder setA(long a) {
            this.a = a;
            return this;
        }
    
        public long getA() { return a; }
    
        public Builder() { }
        public Builder(Foo other) {
            this.a = other.a;
        }
    
        @ThriftConstructor
        public Foo build() {
            Foo result = new Foo (
                this.a
            );
            return result;
        }
    }
        public static final Map<String, Integer> NAMES_TO_IDS = new HashMap();
    public static final Map<String, Integer> THRIFT_NAMES_TO_IDS = new HashMap();
    public static final Map<Integer, TField> FIELD_METADATA = new HashMap<>();
    private static final TStruct STRUCT_DESC = new TStruct("Foo");
    private final long a;
    public static final int _A = 1;
    private static final TField A_FIELD_DESC = new TField("a", TType.I64, (short)1);
    static {
      NAMES_TO_IDS.put("a", 1);
      THRIFT_NAMES_TO_IDS.put("a", 1);
      FIELD_METADATA.put(1, A_FIELD_DESC);
    }
    
    
    @com.facebook.swift.codec.ThriftField(value=1, name="a", requiredness=Requiredness.NONE)
    public long getA() { return a; }
    
    @java.lang.Override
    public String toString() {
        ToStringHelper helper = toStringHelper(this);
        helper.add("a", a);
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
    
        Foo other = (Foo)o;
    
        return
            Objects.equals(a, other.a) &&
            true;
    }
    
    @java.lang.Override
    public int hashCode() {
        return Arrays.deepHashCode(new java.lang.Object[] {
            a
        });
    }
    
    
    public static com.facebook.thrift.payload.Reader<Foo> asReader() {
      return Foo::read0;
    }
    
    public static Foo read0(TProtocol oprot) throws TException {
      TField __field;
      oprot.readStructBegin(Foo.NAMES_TO_IDS, Foo.THRIFT_NAMES_TO_IDS, Foo.FIELD_METADATA);
      Foo.Builder builder = new Foo.Builder();
      while (true) {
        __field = oprot.readFieldBegin();
        if (__field.type == TType.STOP) { break; }
        switch (__field.id) {
        case _A:
          if (__field.type == TType.I64) {
            long a = oprot.readI64();
            builder.setA(a);
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
      oprot.writeFieldBegin(A_FIELD_DESC);
      oprot.writeI64(this.a);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }
    
    private static class _FooLazy {
        private static final Foo _DEFAULT = new Foo.Builder().build();
    }
    
    public static Foo defaultInstance() {
        return  _FooLazy._DEFAULT;
    }
}
