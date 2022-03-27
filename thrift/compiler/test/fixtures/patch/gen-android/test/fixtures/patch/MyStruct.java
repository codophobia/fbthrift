/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package test.fixtures.patch;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;
import java.util.Collections;
import java.util.BitSet;
import java.util.Arrays;
import com.facebook.thrift.*;
import com.facebook.thrift.annotations.*;
import com.facebook.thrift.async.*;
import com.facebook.thrift.meta_data.*;
import com.facebook.thrift.server.*;
import com.facebook.thrift.transport.*;
import com.facebook.thrift.protocol.*;

@SuppressWarnings({ "unused", "serial" })
public class MyStruct implements TBase, java.io.Serializable, Cloneable {
  private static final TStruct STRUCT_DESC = new TStruct("MyStruct");
  private static final TField BOOL_VAL_FIELD_DESC = new TField("boolVal", TType.BOOL, (short)1);
  private static final TField BYTE_VAL_FIELD_DESC = new TField("byteVal", TType.BYTE, (short)2);
  private static final TField I16_VAL_FIELD_DESC = new TField("i16Val", TType.I16, (short)3);
  private static final TField I32_VAL_FIELD_DESC = new TField("i32Val", TType.I32, (short)4);
  private static final TField I64_VAL_FIELD_DESC = new TField("i64Val", TType.I64, (short)5);
  private static final TField FLOAT_VAL_FIELD_DESC = new TField("floatVal", TType.FLOAT, (short)6);
  private static final TField DOUBLE_VAL_FIELD_DESC = new TField("doubleVal", TType.DOUBLE, (short)7);
  private static final TField STRING_VAL_FIELD_DESC = new TField("stringVal", TType.STRING, (short)8);
  private static final TField BINARY_VAL_FIELD_DESC = new TField("binaryVal", TType.STRING, (short)9);
  private static final TField STRUCT_VAL_FIELD_DESC = new TField("structVal", TType.STRUCT, (short)10);
  private static final TField OPT_BOOL_VAL_FIELD_DESC = new TField("optBoolVal", TType.BOOL, (short)11);
  private static final TField OPT_BYTE_VAL_FIELD_DESC = new TField("optByteVal", TType.BYTE, (short)12);
  private static final TField OPT_I16_VAL_FIELD_DESC = new TField("optI16Val", TType.I16, (short)13);
  private static final TField OPT_I32_VAL_FIELD_DESC = new TField("optI32Val", TType.I32, (short)14);
  private static final TField OPT_I64_VAL_FIELD_DESC = new TField("optI64Val", TType.I64, (short)15);
  private static final TField OPT_FLOAT_VAL_FIELD_DESC = new TField("optFloatVal", TType.FLOAT, (short)16);
  private static final TField OPT_DOUBLE_VAL_FIELD_DESC = new TField("optDoubleVal", TType.DOUBLE, (short)17);
  private static final TField OPT_STRING_VAL_FIELD_DESC = new TField("optStringVal", TType.STRING, (short)18);
  private static final TField OPT_BINARY_VAL_FIELD_DESC = new TField("optBinaryVal", TType.STRING, (short)19);
  private static final TField OPT_STRUCT_VAL_FIELD_DESC = new TField("optStructVal", TType.STRUCT, (short)20);
  private static final TField OPT_LIST_VAL_FIELD_DESC = new TField("optListVal", TType.LIST, (short)21);
  private static final TField OPT_SET_VAL_FIELD_DESC = new TField("optSetVal", TType.SET, (short)22);
  private static final TField OPT_MAP_VAL_FIELD_DESC = new TField("optMapVal", TType.MAP, (short)23);

  public final Boolean boolVal;
  public final Byte byteVal;
  public final Short i16Val;
  public final Integer i32Val;
  public final Long i64Val;
  public final Float floatVal;
  public final Double doubleVal;
  public final String stringVal;
  public final byte[] binaryVal;
  public final MyData structVal;
  public final Boolean optBoolVal;
  public final Byte optByteVal;
  public final Short optI16Val;
  public final Integer optI32Val;
  public final Long optI64Val;
  public final Float optFloatVal;
  public final Double optDoubleVal;
  public final String optStringVal;
  public final byte[] optBinaryVal;
  public final MyData optStructVal;
  public final List<Short> optListVal;
  public final Set<String> optSetVal;
  public final Map<String,String> optMapVal;
  public static final int BOOLVAL = 1;
  public static final int BYTEVAL = 2;
  public static final int I16VAL = 3;
  public static final int I32VAL = 4;
  public static final int I64VAL = 5;
  public static final int FLOATVAL = 6;
  public static final int DOUBLEVAL = 7;
  public static final int STRINGVAL = 8;
  public static final int BINARYVAL = 9;
  public static final int STRUCTVAL = 10;
  public static final int OPTBOOLVAL = 11;
  public static final int OPTBYTEVAL = 12;
  public static final int OPTI16VAL = 13;
  public static final int OPTI32VAL = 14;
  public static final int OPTI64VAL = 15;
  public static final int OPTFLOATVAL = 16;
  public static final int OPTDOUBLEVAL = 17;
  public static final int OPTSTRINGVAL = 18;
  public static final int OPTBINARYVAL = 19;
  public static final int OPTSTRUCTVAL = 20;
  public static final int OPTLISTVAL = 21;
  public static final int OPTSETVAL = 22;
  public static final int OPTMAPVAL = 23;

  public MyStruct(
      Boolean boolVal,
      Byte byteVal,
      Short i16Val,
      Integer i32Val,
      Long i64Val,
      Float floatVal,
      Double doubleVal,
      String stringVal,
      byte[] binaryVal,
      MyData structVal,
      Boolean optBoolVal,
      Byte optByteVal,
      Short optI16Val,
      Integer optI32Val,
      Long optI64Val,
      Float optFloatVal,
      Double optDoubleVal,
      String optStringVal,
      byte[] optBinaryVal,
      MyData optStructVal,
      List<Short> optListVal,
      Set<String> optSetVal,
      Map<String,String> optMapVal) {
    this.boolVal = boolVal;
    this.byteVal = byteVal;
    this.i16Val = i16Val;
    this.i32Val = i32Val;
    this.i64Val = i64Val;
    this.floatVal = floatVal;
    this.doubleVal = doubleVal;
    this.stringVal = stringVal;
    this.binaryVal = binaryVal;
    this.structVal = structVal;
    this.optBoolVal = optBoolVal;
    this.optByteVal = optByteVal;
    this.optI16Val = optI16Val;
    this.optI32Val = optI32Val;
    this.optI64Val = optI64Val;
    this.optFloatVal = optFloatVal;
    this.optDoubleVal = optDoubleVal;
    this.optStringVal = optStringVal;
    this.optBinaryVal = optBinaryVal;
    this.optStructVal = optStructVal;
    this.optListVal = optListVal;
    this.optSetVal = optSetVal;
    this.optMapVal = optMapVal;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public MyStruct(MyStruct other) {
    if (other.isSetBoolVal()) {
      this.boolVal = TBaseHelper.deepCopy(other.boolVal);
    } else {
      this.boolVal = null;
    }
    if (other.isSetByteVal()) {
      this.byteVal = TBaseHelper.deepCopy(other.byteVal);
    } else {
      this.byteVal = null;
    }
    if (other.isSetI16Val()) {
      this.i16Val = TBaseHelper.deepCopy(other.i16Val);
    } else {
      this.i16Val = null;
    }
    if (other.isSetI32Val()) {
      this.i32Val = TBaseHelper.deepCopy(other.i32Val);
    } else {
      this.i32Val = null;
    }
    if (other.isSetI64Val()) {
      this.i64Val = TBaseHelper.deepCopy(other.i64Val);
    } else {
      this.i64Val = null;
    }
    if (other.isSetFloatVal()) {
      this.floatVal = TBaseHelper.deepCopy(other.floatVal);
    } else {
      this.floatVal = null;
    }
    if (other.isSetDoubleVal()) {
      this.doubleVal = TBaseHelper.deepCopy(other.doubleVal);
    } else {
      this.doubleVal = null;
    }
    if (other.isSetStringVal()) {
      this.stringVal = TBaseHelper.deepCopy(other.stringVal);
    } else {
      this.stringVal = null;
    }
    if (other.isSetBinaryVal()) {
      this.binaryVal = TBaseHelper.deepCopy(other.binaryVal);
    } else {
      this.binaryVal = null;
    }
    if (other.isSetStructVal()) {
      this.structVal = TBaseHelper.deepCopy(other.structVal);
    } else {
      this.structVal = null;
    }
    if (other.isSetOptBoolVal()) {
      this.optBoolVal = TBaseHelper.deepCopy(other.optBoolVal);
    } else {
      this.optBoolVal = null;
    }
    if (other.isSetOptByteVal()) {
      this.optByteVal = TBaseHelper.deepCopy(other.optByteVal);
    } else {
      this.optByteVal = null;
    }
    if (other.isSetOptI16Val()) {
      this.optI16Val = TBaseHelper.deepCopy(other.optI16Val);
    } else {
      this.optI16Val = null;
    }
    if (other.isSetOptI32Val()) {
      this.optI32Val = TBaseHelper.deepCopy(other.optI32Val);
    } else {
      this.optI32Val = null;
    }
    if (other.isSetOptI64Val()) {
      this.optI64Val = TBaseHelper.deepCopy(other.optI64Val);
    } else {
      this.optI64Val = null;
    }
    if (other.isSetOptFloatVal()) {
      this.optFloatVal = TBaseHelper.deepCopy(other.optFloatVal);
    } else {
      this.optFloatVal = null;
    }
    if (other.isSetOptDoubleVal()) {
      this.optDoubleVal = TBaseHelper.deepCopy(other.optDoubleVal);
    } else {
      this.optDoubleVal = null;
    }
    if (other.isSetOptStringVal()) {
      this.optStringVal = TBaseHelper.deepCopy(other.optStringVal);
    } else {
      this.optStringVal = null;
    }
    if (other.isSetOptBinaryVal()) {
      this.optBinaryVal = TBaseHelper.deepCopy(other.optBinaryVal);
    } else {
      this.optBinaryVal = null;
    }
    if (other.isSetOptStructVal()) {
      this.optStructVal = TBaseHelper.deepCopy(other.optStructVal);
    } else {
      this.optStructVal = null;
    }
    if (other.isSetOptListVal()) {
      this.optListVal = TBaseHelper.deepCopy(other.optListVal);
    } else {
      this.optListVal = null;
    }
    if (other.isSetOptSetVal()) {
      this.optSetVal = TBaseHelper.deepCopy(other.optSetVal);
    } else {
      this.optSetVal = null;
    }
    if (other.isSetOptMapVal()) {
      this.optMapVal = TBaseHelper.deepCopy(other.optMapVal);
    } else {
      this.optMapVal = null;
    }
  }

  public MyStruct deepCopy() {
    return new MyStruct(this);
  }

  public Boolean isBoolVal() {
    return this.boolVal;
  }

  // Returns true if field boolVal is set (has been assigned a value) and false otherwise
  public boolean isSetBoolVal() {
    return this.boolVal != null;
  }

  public Byte getByteVal() {
    return this.byteVal;
  }

  // Returns true if field byteVal is set (has been assigned a value) and false otherwise
  public boolean isSetByteVal() {
    return this.byteVal != null;
  }

  public Short getI16Val() {
    return this.i16Val;
  }

  // Returns true if field i16Val is set (has been assigned a value) and false otherwise
  public boolean isSetI16Val() {
    return this.i16Val != null;
  }

  public Integer getI32Val() {
    return this.i32Val;
  }

  // Returns true if field i32Val is set (has been assigned a value) and false otherwise
  public boolean isSetI32Val() {
    return this.i32Val != null;
  }

  public Long getI64Val() {
    return this.i64Val;
  }

  // Returns true if field i64Val is set (has been assigned a value) and false otherwise
  public boolean isSetI64Val() {
    return this.i64Val != null;
  }

  public Float getFloatVal() {
    return this.floatVal;
  }

  // Returns true if field floatVal is set (has been assigned a value) and false otherwise
  public boolean isSetFloatVal() {
    return this.floatVal != null;
  }

  public Double getDoubleVal() {
    return this.doubleVal;
  }

  // Returns true if field doubleVal is set (has been assigned a value) and false otherwise
  public boolean isSetDoubleVal() {
    return this.doubleVal != null;
  }

  public String getStringVal() {
    return this.stringVal;
  }

  // Returns true if field stringVal is set (has been assigned a value) and false otherwise
  public boolean isSetStringVal() {
    return this.stringVal != null;
  }

  public byte[] getBinaryVal() {
    return this.binaryVal;
  }

  // Returns true if field binaryVal is set (has been assigned a value) and false otherwise
  public boolean isSetBinaryVal() {
    return this.binaryVal != null;
  }

  public MyData getStructVal() {
    return this.structVal;
  }

  // Returns true if field structVal is set (has been assigned a value) and false otherwise
  public boolean isSetStructVal() {
    return this.structVal != null;
  }

  public Boolean isOptBoolVal() {
    return this.optBoolVal;
  }

  // Returns true if field optBoolVal is set (has been assigned a value) and false otherwise
  public boolean isSetOptBoolVal() {
    return this.optBoolVal != null;
  }

  public Byte getOptByteVal() {
    return this.optByteVal;
  }

  // Returns true if field optByteVal is set (has been assigned a value) and false otherwise
  public boolean isSetOptByteVal() {
    return this.optByteVal != null;
  }

  public Short getOptI16Val() {
    return this.optI16Val;
  }

  // Returns true if field optI16Val is set (has been assigned a value) and false otherwise
  public boolean isSetOptI16Val() {
    return this.optI16Val != null;
  }

  public Integer getOptI32Val() {
    return this.optI32Val;
  }

  // Returns true if field optI32Val is set (has been assigned a value) and false otherwise
  public boolean isSetOptI32Val() {
    return this.optI32Val != null;
  }

  public Long getOptI64Val() {
    return this.optI64Val;
  }

  // Returns true if field optI64Val is set (has been assigned a value) and false otherwise
  public boolean isSetOptI64Val() {
    return this.optI64Val != null;
  }

  public Float getOptFloatVal() {
    return this.optFloatVal;
  }

  // Returns true if field optFloatVal is set (has been assigned a value) and false otherwise
  public boolean isSetOptFloatVal() {
    return this.optFloatVal != null;
  }

  public Double getOptDoubleVal() {
    return this.optDoubleVal;
  }

  // Returns true if field optDoubleVal is set (has been assigned a value) and false otherwise
  public boolean isSetOptDoubleVal() {
    return this.optDoubleVal != null;
  }

  public String getOptStringVal() {
    return this.optStringVal;
  }

  // Returns true if field optStringVal is set (has been assigned a value) and false otherwise
  public boolean isSetOptStringVal() {
    return this.optStringVal != null;
  }

  public byte[] getOptBinaryVal() {
    return this.optBinaryVal;
  }

  // Returns true if field optBinaryVal is set (has been assigned a value) and false otherwise
  public boolean isSetOptBinaryVal() {
    return this.optBinaryVal != null;
  }

  public MyData getOptStructVal() {
    return this.optStructVal;
  }

  // Returns true if field optStructVal is set (has been assigned a value) and false otherwise
  public boolean isSetOptStructVal() {
    return this.optStructVal != null;
  }

  public List<Short> getOptListVal() {
    return this.optListVal;
  }

  // Returns true if field optListVal is set (has been assigned a value) and false otherwise
  public boolean isSetOptListVal() {
    return this.optListVal != null;
  }

  public Set<String> getOptSetVal() {
    return this.optSetVal;
  }

  // Returns true if field optSetVal is set (has been assigned a value) and false otherwise
  public boolean isSetOptSetVal() {
    return this.optSetVal != null;
  }

  public Map<String,String> getOptMapVal() {
    return this.optMapVal;
  }

  // Returns true if field optMapVal is set (has been assigned a value) and false otherwise
  public boolean isSetOptMapVal() {
    return this.optMapVal != null;
  }

  @Override
  public boolean equals(Object _that) {
    if (_that == null)
      return false;
    if (this == _that)
      return true;
    if (!(_that instanceof MyStruct))
      return false;
    MyStruct that = (MyStruct)_that;

    if (!TBaseHelper.equalsNobinary(this.isSetBoolVal(), that.isSetBoolVal(), this.boolVal, that.boolVal)) { return false; }

    if (!TBaseHelper.equalsNobinary(this.isSetByteVal(), that.isSetByteVal(), this.byteVal, that.byteVal)) { return false; }

    if (!TBaseHelper.equalsNobinary(this.isSetI16Val(), that.isSetI16Val(), this.i16Val, that.i16Val)) { return false; }

    if (!TBaseHelper.equalsNobinary(this.isSetI32Val(), that.isSetI32Val(), this.i32Val, that.i32Val)) { return false; }

    if (!TBaseHelper.equalsNobinary(this.isSetI64Val(), that.isSetI64Val(), this.i64Val, that.i64Val)) { return false; }

    if (!TBaseHelper.equalsNobinary(this.isSetFloatVal(), that.isSetFloatVal(), this.floatVal, that.floatVal)) { return false; }

    if (!TBaseHelper.equalsNobinary(this.isSetDoubleVal(), that.isSetDoubleVal(), this.doubleVal, that.doubleVal)) { return false; }

    if (!TBaseHelper.equalsNobinary(this.isSetStringVal(), that.isSetStringVal(), this.stringVal, that.stringVal)) { return false; }

    if (!TBaseHelper.equalsSlow(this.isSetBinaryVal(), that.isSetBinaryVal(), this.binaryVal, that.binaryVal)) { return false; }

    if (!TBaseHelper.equalsNobinary(this.isSetStructVal(), that.isSetStructVal(), this.structVal, that.structVal)) { return false; }

    if (!TBaseHelper.equalsNobinary(this.isSetOptBoolVal(), that.isSetOptBoolVal(), this.optBoolVal, that.optBoolVal)) { return false; }

    if (!TBaseHelper.equalsNobinary(this.isSetOptByteVal(), that.isSetOptByteVal(), this.optByteVal, that.optByteVal)) { return false; }

    if (!TBaseHelper.equalsNobinary(this.isSetOptI16Val(), that.isSetOptI16Val(), this.optI16Val, that.optI16Val)) { return false; }

    if (!TBaseHelper.equalsNobinary(this.isSetOptI32Val(), that.isSetOptI32Val(), this.optI32Val, that.optI32Val)) { return false; }

    if (!TBaseHelper.equalsNobinary(this.isSetOptI64Val(), that.isSetOptI64Val(), this.optI64Val, that.optI64Val)) { return false; }

    if (!TBaseHelper.equalsNobinary(this.isSetOptFloatVal(), that.isSetOptFloatVal(), this.optFloatVal, that.optFloatVal)) { return false; }

    if (!TBaseHelper.equalsNobinary(this.isSetOptDoubleVal(), that.isSetOptDoubleVal(), this.optDoubleVal, that.optDoubleVal)) { return false; }

    if (!TBaseHelper.equalsNobinary(this.isSetOptStringVal(), that.isSetOptStringVal(), this.optStringVal, that.optStringVal)) { return false; }

    if (!TBaseHelper.equalsSlow(this.isSetOptBinaryVal(), that.isSetOptBinaryVal(), this.optBinaryVal, that.optBinaryVal)) { return false; }

    if (!TBaseHelper.equalsNobinary(this.isSetOptStructVal(), that.isSetOptStructVal(), this.optStructVal, that.optStructVal)) { return false; }

    if (!TBaseHelper.equalsNobinary(this.isSetOptListVal(), that.isSetOptListVal(), this.optListVal, that.optListVal)) { return false; }

    if (!TBaseHelper.equalsNobinary(this.isSetOptSetVal(), that.isSetOptSetVal(), this.optSetVal, that.optSetVal)) { return false; }

    if (!TBaseHelper.equalsNobinary(this.isSetOptMapVal(), that.isSetOptMapVal(), this.optMapVal, that.optMapVal)) { return false; }

    return true;
  }

  @Override
  public int hashCode() {
    return Arrays.deepHashCode(new Object[] {boolVal, byteVal, i16Val, i32Val, i64Val, floatVal, doubleVal, stringVal, binaryVal, structVal, optBoolVal, optByteVal, optI16Val, optI32Val, optI64Val, optFloatVal, optDoubleVal, optStringVal, optBinaryVal, optStructVal, optListVal, optSetVal, optMapVal});
  }

  // This is required to satisfy the TBase interface, but can't be implemented on immutable struture.
  public void read(TProtocol iprot) throws TException {
    throw new TException("unimplemented in android immutable structure");
  }

  public static MyStruct deserialize(TProtocol iprot) throws TException {
    Boolean tmp_boolVal = null;
    Byte tmp_byteVal = null;
    Short tmp_i16Val = null;
    Integer tmp_i32Val = null;
    Long tmp_i64Val = null;
    Float tmp_floatVal = null;
    Double tmp_doubleVal = null;
    String tmp_stringVal = null;
    byte[] tmp_binaryVal = null;
    MyData tmp_structVal = null;
    Boolean tmp_optBoolVal = null;
    Byte tmp_optByteVal = null;
    Short tmp_optI16Val = null;
    Integer tmp_optI32Val = null;
    Long tmp_optI64Val = null;
    Float tmp_optFloatVal = null;
    Double tmp_optDoubleVal = null;
    String tmp_optStringVal = null;
    byte[] tmp_optBinaryVal = null;
    MyData tmp_optStructVal = null;
    List<Short> tmp_optListVal = null;
    Set<String> tmp_optSetVal = null;
    Map<String,String> tmp_optMapVal = null;
    TField __field;
    iprot.readStructBegin();
    while (true)
    {
      __field = iprot.readFieldBegin();
      if (__field.type == TType.STOP) {
        break;
      }
      switch (__field.id)
      {
        case BOOLVAL:
          if (__field.type == TType.BOOL) {
            tmp_boolVal = iprot.readBool();
          } else {
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        case BYTEVAL:
          if (__field.type == TType.BYTE) {
            tmp_byteVal = iprot.readByte();
          } else {
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        case I16VAL:
          if (__field.type == TType.I16) {
            tmp_i16Val = iprot.readI16();
          } else {
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        case I32VAL:
          if (__field.type == TType.I32) {
            tmp_i32Val = iprot.readI32();
          } else {
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        case I64VAL:
          if (__field.type == TType.I64) {
            tmp_i64Val = iprot.readI64();
          } else {
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        case FLOATVAL:
          if (__field.type == TType.FLOAT) {
            tmp_floatVal = iprot.readFloat();
          } else {
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        case DOUBLEVAL:
          if (__field.type == TType.DOUBLE) {
            tmp_doubleVal = iprot.readDouble();
          } else {
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        case STRINGVAL:
          if (__field.type == TType.STRING) {
            tmp_stringVal = iprot.readString();
          } else {
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        case BINARYVAL:
          if (__field.type == TType.STRING) {
            tmp_binaryVal = iprot.readBinary();
          } else {
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        case STRUCTVAL:
          if (__field.type == TType.STRUCT) {
            tmp_structVal = MyData.deserialize(iprot);
          } else {
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        case OPTBOOLVAL:
          if (__field.type == TType.BOOL) {
            tmp_optBoolVal = iprot.readBool();
          } else {
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        case OPTBYTEVAL:
          if (__field.type == TType.BYTE) {
            tmp_optByteVal = iprot.readByte();
          } else {
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        case OPTI16VAL:
          if (__field.type == TType.I16) {
            tmp_optI16Val = iprot.readI16();
          } else {
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        case OPTI32VAL:
          if (__field.type == TType.I32) {
            tmp_optI32Val = iprot.readI32();
          } else {
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        case OPTI64VAL:
          if (__field.type == TType.I64) {
            tmp_optI64Val = iprot.readI64();
          } else {
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        case OPTFLOATVAL:
          if (__field.type == TType.FLOAT) {
            tmp_optFloatVal = iprot.readFloat();
          } else {
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        case OPTDOUBLEVAL:
          if (__field.type == TType.DOUBLE) {
            tmp_optDoubleVal = iprot.readDouble();
          } else {
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        case OPTSTRINGVAL:
          if (__field.type == TType.STRING) {
            tmp_optStringVal = iprot.readString();
          } else {
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        case OPTBINARYVAL:
          if (__field.type == TType.STRING) {
            tmp_optBinaryVal = iprot.readBinary();
          } else {
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        case OPTSTRUCTVAL:
          if (__field.type == TType.STRUCT) {
            tmp_optStructVal = MyData.deserialize(iprot);
          } else {
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        case OPTLISTVAL:
          if (__field.type == TType.LIST) {
            {
              TList _list0 = iprot.readListBegin();
              tmp_optListVal = new ArrayList<Short>(Math.max(0, _list0.size));
              for (int _i1 = 0; 
                   (_list0.size < 0) ? iprot.peekList() : (_i1 < _list0.size); 
                   ++_i1)
              {
                Short _elem2;
                _elem2 = iprot.readI16();
                tmp_optListVal.add(_elem2);
              }
              iprot.readListEnd();
            }
          } else {
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        case OPTSETVAL:
          if (__field.type == TType.SET) {
            {
              TSet _set3 = iprot.readSetBegin();
              tmp_optSetVal = new HashSet<String>(Math.max(0, 2*_set3.size));
              for (int _i4 = 0; 
                   (_set3.size < 0) ? iprot.peekSet() : (_i4 < _set3.size); 
                   ++_i4)
              {
                String _elem5;
                _elem5 = iprot.readString();
                tmp_optSetVal.add(_elem5);
              }
              iprot.readSetEnd();
            }
          } else {
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        case OPTMAPVAL:
          if (__field.type == TType.MAP) {
            {
              TMap _map6 = iprot.readMapBegin();
              tmp_optMapVal = new HashMap<String,String>(Math.max(0, 2*_map6.size));
              for (int _i7 = 0; 
                   (_map6.size < 0) ? iprot.peekMap() : (_i7 < _map6.size); 
                   ++_i7)
              {
                String _key8;
                String _val9;
                _key8 = iprot.readString();
                _val9 = iprot.readString();
                tmp_optMapVal.put(_key8, _val9);
              }
              iprot.readMapEnd();
            }
          } else {
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        default:
          TProtocolUtil.skip(iprot, __field.type);
          break;
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();

    MyStruct _that;
    _that = new MyStruct(
      tmp_boolVal
      ,tmp_byteVal
      ,tmp_i16Val
      ,tmp_i32Val
      ,tmp_i64Val
      ,tmp_floatVal
      ,tmp_doubleVal
      ,tmp_stringVal
      ,tmp_binaryVal
      ,tmp_structVal
      ,tmp_optBoolVal
      ,tmp_optByteVal
      ,tmp_optI16Val
      ,tmp_optI32Val
      ,tmp_optI64Val
      ,tmp_optFloatVal
      ,tmp_optDoubleVal
      ,tmp_optStringVal
      ,tmp_optBinaryVal
      ,tmp_optStructVal
      ,tmp_optListVal
      ,tmp_optSetVal
      ,tmp_optMapVal
    );
    _that.validate();
    return _that;
  }

  public void write(TProtocol oprot) throws TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    if (this.boolVal != null) {
      oprot.writeFieldBegin(BOOL_VAL_FIELD_DESC);
      oprot.writeBool(this.boolVal);
      oprot.writeFieldEnd();
    }
    if (this.byteVal != null) {
      oprot.writeFieldBegin(BYTE_VAL_FIELD_DESC);
      oprot.writeByte(this.byteVal);
      oprot.writeFieldEnd();
    }
    if (this.i16Val != null) {
      oprot.writeFieldBegin(I16_VAL_FIELD_DESC);
      oprot.writeI16(this.i16Val);
      oprot.writeFieldEnd();
    }
    if (this.i32Val != null) {
      oprot.writeFieldBegin(I32_VAL_FIELD_DESC);
      oprot.writeI32(this.i32Val);
      oprot.writeFieldEnd();
    }
    if (this.i64Val != null) {
      oprot.writeFieldBegin(I64_VAL_FIELD_DESC);
      oprot.writeI64(this.i64Val);
      oprot.writeFieldEnd();
    }
    if (this.floatVal != null) {
      oprot.writeFieldBegin(FLOAT_VAL_FIELD_DESC);
      oprot.writeFloat(this.floatVal);
      oprot.writeFieldEnd();
    }
    if (this.doubleVal != null) {
      oprot.writeFieldBegin(DOUBLE_VAL_FIELD_DESC);
      oprot.writeDouble(this.doubleVal);
      oprot.writeFieldEnd();
    }
    if (this.stringVal != null) {
      oprot.writeFieldBegin(STRING_VAL_FIELD_DESC);
      oprot.writeString(this.stringVal);
      oprot.writeFieldEnd();
    }
    if (this.binaryVal != null) {
      oprot.writeFieldBegin(BINARY_VAL_FIELD_DESC);
      oprot.writeBinary(this.binaryVal);
      oprot.writeFieldEnd();
    }
    if (this.structVal != null) {
      oprot.writeFieldBegin(STRUCT_VAL_FIELD_DESC);
      this.structVal.write(oprot);
      oprot.writeFieldEnd();
    }
    if (this.optBoolVal != null) {
      if (isSetOptBoolVal()) {
        oprot.writeFieldBegin(OPT_BOOL_VAL_FIELD_DESC);
        oprot.writeBool(this.optBoolVal);
        oprot.writeFieldEnd();
      }
    }
    if (this.optByteVal != null) {
      if (isSetOptByteVal()) {
        oprot.writeFieldBegin(OPT_BYTE_VAL_FIELD_DESC);
        oprot.writeByte(this.optByteVal);
        oprot.writeFieldEnd();
      }
    }
    if (this.optI16Val != null) {
      if (isSetOptI16Val()) {
        oprot.writeFieldBegin(OPT_I16_VAL_FIELD_DESC);
        oprot.writeI16(this.optI16Val);
        oprot.writeFieldEnd();
      }
    }
    if (this.optI32Val != null) {
      if (isSetOptI32Val()) {
        oprot.writeFieldBegin(OPT_I32_VAL_FIELD_DESC);
        oprot.writeI32(this.optI32Val);
        oprot.writeFieldEnd();
      }
    }
    if (this.optI64Val != null) {
      if (isSetOptI64Val()) {
        oprot.writeFieldBegin(OPT_I64_VAL_FIELD_DESC);
        oprot.writeI64(this.optI64Val);
        oprot.writeFieldEnd();
      }
    }
    if (this.optFloatVal != null) {
      if (isSetOptFloatVal()) {
        oprot.writeFieldBegin(OPT_FLOAT_VAL_FIELD_DESC);
        oprot.writeFloat(this.optFloatVal);
        oprot.writeFieldEnd();
      }
    }
    if (this.optDoubleVal != null) {
      if (isSetOptDoubleVal()) {
        oprot.writeFieldBegin(OPT_DOUBLE_VAL_FIELD_DESC);
        oprot.writeDouble(this.optDoubleVal);
        oprot.writeFieldEnd();
      }
    }
    if (this.optStringVal != null) {
      if (isSetOptStringVal()) {
        oprot.writeFieldBegin(OPT_STRING_VAL_FIELD_DESC);
        oprot.writeString(this.optStringVal);
        oprot.writeFieldEnd();
      }
    }
    if (this.optBinaryVal != null) {
      if (isSetOptBinaryVal()) {
        oprot.writeFieldBegin(OPT_BINARY_VAL_FIELD_DESC);
        oprot.writeBinary(this.optBinaryVal);
        oprot.writeFieldEnd();
      }
    }
    if (this.optStructVal != null) {
      if (isSetOptStructVal()) {
        oprot.writeFieldBegin(OPT_STRUCT_VAL_FIELD_DESC);
        this.optStructVal.write(oprot);
        oprot.writeFieldEnd();
      }
    }
    if (this.optListVal != null) {
      if (isSetOptListVal()) {
        oprot.writeFieldBegin(OPT_LIST_VAL_FIELD_DESC);
        {
          oprot.writeListBegin(new TList(TType.I16, this.optListVal.size()));
          for (Short _iter10 : this.optListVal)          {
            oprot.writeI16(_iter10);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
    }
    if (this.optSetVal != null) {
      if (isSetOptSetVal()) {
        oprot.writeFieldBegin(OPT_SET_VAL_FIELD_DESC);
        {
          oprot.writeSetBegin(new TSet(TType.STRING, this.optSetVal.size()));
          for (String _iter11 : this.optSetVal)          {
            oprot.writeString(_iter11);
          }
          oprot.writeSetEnd();
        }
        oprot.writeFieldEnd();
      }
    }
    if (this.optMapVal != null) {
      if (isSetOptMapVal()) {
        oprot.writeFieldBegin(OPT_MAP_VAL_FIELD_DESC);
        {
          oprot.writeMapBegin(new TMap(TType.STRING, TType.STRING, this.optMapVal.size()));
          for (Map.Entry<String, String> _iter12 : this.optMapVal.entrySet())          {
            oprot.writeString(_iter12.getKey());
            oprot.writeString(_iter12.getValue());
          }
          oprot.writeMapEnd();
        }
        oprot.writeFieldEnd();
      }
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    return toString(1, true);
  }

  @Override
  public String toString(int indent, boolean prettyPrint) {
    return TBaseHelper.toStringHelper(this, indent, prettyPrint);
  }

  public void validate() throws TException {
    // check for required fields
  }

}

