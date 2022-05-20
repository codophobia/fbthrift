/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */

package test.fixtures.complex_union;

import com.facebook.swift.codec.*;
import com.facebook.swift.codec.ThriftField.Requiredness;
import com.facebook.swift.codec.ThriftField.Recursiveness;
import java.util.*;
import org.apache.thrift.*;
import org.apache.thrift.transport.*;
import org.apache.thrift.protocol.*;

import static com.google.common.base.MoreObjects.toStringHelper;

@SwiftGenerated
@ThriftUnion("ValUnion")
public final class ValUnion implements com.facebook.thrift.payload.ThriftSerializable {
    private static final TStruct STRUCT_DESC = new TStruct("ValUnion");
    private static final Map<String, Integer> NAMES_TO_IDS = new HashMap();
    public static final Map<String, Integer> THRIFT_NAMES_TO_IDS = new HashMap();
    private static final Map<Integer, TField> FIELD_METADATA = new HashMap<>();

    public static final int _V1 = 1;
    private static final TField V1_FIELD_DESC = new TField("v1", TType.STRUCT, (short)1);
    public static final int _V2 = 2;
    private static final TField V2_FIELD_DESC = new TField("v2", TType.STRUCT, (short)2);

    static {
      NAMES_TO_IDS.put("v1", 1);
      THRIFT_NAMES_TO_IDS.put("v1", 1);
      FIELD_METADATA.put(1, V1_FIELD_DESC);
      NAMES_TO_IDS.put("v2", 2);
      THRIFT_NAMES_TO_IDS.put("v2", 2);
      FIELD_METADATA.put(2, V2_FIELD_DESC);
    }

    private java.lang.Object value;
    private short id;

    @ThriftConstructor
    public ValUnion() {
    }
    
    public static ValUnion fromV1(final test.fixtures.complex_union.Val v1) {
        ValUnion res = new ValUnion();
        res.value = v1;
        res.id = 1;
        return res;
    }
    
    public static ValUnion fromV2(final test.fixtures.complex_union.Val v2) {
        ValUnion res = new ValUnion();
        res.value = v2;
        res.id = 2;
        return res;
    }
    
    @com.facebook.swift.codec.ThriftField
    @Deprecated
    public void setV1(final test.fixtures.complex_union.Val v1) {
        this.value = v1;
        this.id = 1;
    }
    @com.facebook.swift.codec.ThriftField
    @Deprecated
    public void setV2(final test.fixtures.complex_union.Val v2) {
        this.value = v2;
        this.id = 2;
    }

    @com.facebook.swift.codec.ThriftField(value=1, name="v1", requiredness=Requiredness.NONE)
    public test.fixtures.complex_union.Val getV1() {
        if (this.id != 1) {
            throw new IllegalStateException("Not a v1 element!");
        }
        return (test.fixtures.complex_union.Val) value;
    }

    public boolean isSetV1() {
        return this.id == 1;
    }

    @com.facebook.swift.codec.ThriftField(value=2, name="v2", requiredness=Requiredness.NONE)
    public test.fixtures.complex_union.Val getV2() {
        if (this.id != 2) {
            throw new IllegalStateException("Not a v2 element!");
        }
        return (test.fixtures.complex_union.Val) value;
    }

    public boolean isSetV2() {
        return this.id == 2;
    }

    @ThriftUnionId
    public short getThriftId() {
        return this.id;
    }

    public String getThriftName() {
        TField tField = (TField) FIELD_METADATA.get((int) this.id);
        if (tField == null) {
            return "null";
        } else {
            return tField.name;
        }
    }

    public void accept(Visitor visitor) {
        if (isSetV1()) {
            visitor.visitV1(getV1());
            return;
        }
        if (isSetV2()) {
            visitor.visitV2(getV2());
            return;
        }
    }

    @Override
    public String toString() {
        return toStringHelper(this)
            .add("value", value)
            .add("id", id)
            .add("name", getThriftName())
            .add("type", value == null ? "<null>" : value.getClass().getSimpleName())
            .toString();
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        ValUnion other = (ValUnion)o;

        return Objects.equals(this.id, other.id)
                && Objects.deepEquals(this.value, other.value);
    }

    @Override
    public int hashCode() {
        return Arrays.deepHashCode(new java.lang.Object[] {
            id,
            value,
        });
    }

    public interface Visitor {
        void visitV1(test.fixtures.complex_union.Val v1);
        void visitV2(test.fixtures.complex_union.Val v2);
    }

    public void write0(TProtocol oprot) throws TException {
      if (this.id != 0 && this.value == null ){
         return;
      }
      oprot.writeStructBegin(STRUCT_DESC);
      switch (this.id) {
      case _V1: {
        oprot.writeFieldBegin(V1_FIELD_DESC);
        test.fixtures.complex_union.Val v1 = (test.fixtures.complex_union.Val)this.value;
        v1.write0(oprot);
        oprot.writeFieldEnd();
        break;
      }
      case _V2: {
        oprot.writeFieldBegin(V2_FIELD_DESC);
        test.fixtures.complex_union.Val v2 = (test.fixtures.complex_union.Val)this.value;
        v2.write0(oprot);
        oprot.writeFieldEnd();
        break;
      }
      default:
          // ignore unknown field
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }
    
    
    public static com.facebook.thrift.payload.Reader<ValUnion> asReader() {
      return ValUnion::read0;
    }
    
    public static ValUnion read0(TProtocol oprot) throws TException {
      ValUnion res = new ValUnion();
      res.value = null;
      res.id = (short) 0;
      oprot.readStructBegin(ValUnion.NAMES_TO_IDS, ValUnion.THRIFT_NAMES_TO_IDS, ValUnion.FIELD_METADATA);
      TField __field = oprot.readFieldBegin();
      if (__field.type != TType.STOP) {
          switch (__field.id) {
          case _V1:
            if (__field.type == V1_FIELD_DESC.type) {
              test.fixtures.complex_union.Val v1 = test.fixtures.complex_union.Val.read0(oprot);
              res.value = v1;
            }
            break;
          case _V2:
            if (__field.type == V2_FIELD_DESC.type) {
              test.fixtures.complex_union.Val v2 = test.fixtures.complex_union.Val.read0(oprot);
              res.value = v2;
            }
            break;
          default:
            TProtocolUtil.skip(oprot, __field.type);
          }
        if (res.value != null) {
          res.id = __field.id;
        }
        oprot.readFieldEnd();
        TField __stopField = oprot.readFieldBegin(); // Consume the STOP byte
        if (__stopField.type != TType.STOP) {
          throw new TProtocolException(TProtocolException.INVALID_DATA, "Union 'ValUnion' is missing a STOP byte");
        }
      }
      oprot.readStructEnd();
      return res;
    }
}
