/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */

package test.fixtures.optionals;

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
@com.facebook.swift.codec.ThriftStruct(value="Color", builder=Color.Builder.class)
public final class Color implements com.facebook.thrift.payload.ThriftSerializable {

    @ThriftConstructor
    public Color(
        @com.facebook.swift.codec.ThriftField(value=1, name="red", requiredness=Requiredness.NONE) final double red,
        @com.facebook.swift.codec.ThriftField(value=2, name="green", requiredness=Requiredness.NONE) final double green,
        @com.facebook.swift.codec.ThriftField(value=3, name="blue", requiredness=Requiredness.NONE) final double blue,
        @com.facebook.swift.codec.ThriftField(value=4, name="alpha", requiredness=Requiredness.NONE) final double alpha
    ) {
        this.red = red;
        this.green = green;
        this.blue = blue;
        this.alpha = alpha;
    }
    
    @ThriftConstructor
    protected Color() {
      this.red = 0.;
      this.green = 0.;
      this.blue = 0.;
      this.alpha = 0.;
    }
    
    public static class Builder {
    
        private double red = 0.;
        private double green = 0.;
        private double blue = 0.;
        private double alpha = 0.;
    
        @com.facebook.swift.codec.ThriftField(value=1, name="red", requiredness=Requiredness.NONE)
        public Builder setRed(double red) {
            this.red = red;
            return this;
        }
    
        public double getRed() { return red; }
    
            @com.facebook.swift.codec.ThriftField(value=2, name="green", requiredness=Requiredness.NONE)
        public Builder setGreen(double green) {
            this.green = green;
            return this;
        }
    
        public double getGreen() { return green; }
    
            @com.facebook.swift.codec.ThriftField(value=3, name="blue", requiredness=Requiredness.NONE)
        public Builder setBlue(double blue) {
            this.blue = blue;
            return this;
        }
    
        public double getBlue() { return blue; }
    
            @com.facebook.swift.codec.ThriftField(value=4, name="alpha", requiredness=Requiredness.NONE)
        public Builder setAlpha(double alpha) {
            this.alpha = alpha;
            return this;
        }
    
        public double getAlpha() { return alpha; }
    
        public Builder() { }
        public Builder(Color other) {
            this.red = other.red;
            this.green = other.green;
            this.blue = other.blue;
            this.alpha = other.alpha;
        }
    
        @ThriftConstructor
        public Color build() {
            Color result = new Color (
                this.red,
                this.green,
                this.blue,
                this.alpha
            );
            return result;
        }
    }
                    public static final Map<String, Integer> NAMES_TO_IDS = new HashMap();
    public static final Map<String, Integer> THRIFT_NAMES_TO_IDS = new HashMap();
    public static final Map<Integer, TField> FIELD_METADATA = new HashMap<>();
    private static final TStruct STRUCT_DESC = new TStruct("Color");
    private final double red;
    public static final int _RED = 1;
    private static final TField RED_FIELD_DESC = new TField("red", TType.DOUBLE, (short)1);
        private final double green;
    public static final int _GREEN = 2;
    private static final TField GREEN_FIELD_DESC = new TField("green", TType.DOUBLE, (short)2);
        private final double blue;
    public static final int _BLUE = 3;
    private static final TField BLUE_FIELD_DESC = new TField("blue", TType.DOUBLE, (short)3);
        private final double alpha;
    public static final int _ALPHA = 4;
    private static final TField ALPHA_FIELD_DESC = new TField("alpha", TType.DOUBLE, (short)4);
    static {
      NAMES_TO_IDS.put("red", 1);
      THRIFT_NAMES_TO_IDS.put("red", 1);
      FIELD_METADATA.put(1, RED_FIELD_DESC);
      NAMES_TO_IDS.put("green", 2);
      THRIFT_NAMES_TO_IDS.put("green", 2);
      FIELD_METADATA.put(2, GREEN_FIELD_DESC);
      NAMES_TO_IDS.put("blue", 3);
      THRIFT_NAMES_TO_IDS.put("blue", 3);
      FIELD_METADATA.put(3, BLUE_FIELD_DESC);
      NAMES_TO_IDS.put("alpha", 4);
      THRIFT_NAMES_TO_IDS.put("alpha", 4);
      FIELD_METADATA.put(4, ALPHA_FIELD_DESC);
    }
    
    
    @com.facebook.swift.codec.ThriftField(value=1, name="red", requiredness=Requiredness.NONE)
    public double getRed() { return red; }
    
    
    
    @com.facebook.swift.codec.ThriftField(value=2, name="green", requiredness=Requiredness.NONE)
    public double getGreen() { return green; }
    
    
    
    @com.facebook.swift.codec.ThriftField(value=3, name="blue", requiredness=Requiredness.NONE)
    public double getBlue() { return blue; }
    
    
    
    @com.facebook.swift.codec.ThriftField(value=4, name="alpha", requiredness=Requiredness.NONE)
    public double getAlpha() { return alpha; }
    
    @java.lang.Override
    public String toString() {
        ToStringHelper helper = toStringHelper(this);
        helper.add("red", red);
        helper.add("green", green);
        helper.add("blue", blue);
        helper.add("alpha", alpha);
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
    
        Color other = (Color)o;
    
        return
            Objects.equals(red, other.red) &&
    Objects.equals(green, other.green) &&
    Objects.equals(blue, other.blue) &&
    Objects.equals(alpha, other.alpha) &&
            true;
    }
    
    @java.lang.Override
    public int hashCode() {
        return Arrays.deepHashCode(new java.lang.Object[] {
            red,
            green,
            blue,
            alpha
        });
    }
    
    
    public static com.facebook.thrift.payload.Reader<Color> asReader() {
      return Color::read0;
    }
    
    public static Color read0(TProtocol oprot) throws TException {
      TField __field;
      oprot.readStructBegin(Color.NAMES_TO_IDS, Color.THRIFT_NAMES_TO_IDS, Color.FIELD_METADATA);
      Color.Builder builder = new Color.Builder();
      while (true) {
        __field = oprot.readFieldBegin();
        if (__field.type == TType.STOP) { break; }
        switch (__field.id) {
        case _RED:
          if (__field.type == TType.DOUBLE) {
            double red = oprot.readDouble();
            builder.setRed(red);
          } else {
            TProtocolUtil.skip(oprot, __field.type);
          }
          break;
        case _GREEN:
          if (__field.type == TType.DOUBLE) {
            double green = oprot.readDouble();
            builder.setGreen(green);
          } else {
            TProtocolUtil.skip(oprot, __field.type);
          }
          break;
        case _BLUE:
          if (__field.type == TType.DOUBLE) {
            double blue = oprot.readDouble();
            builder.setBlue(blue);
          } else {
            TProtocolUtil.skip(oprot, __field.type);
          }
          break;
        case _ALPHA:
          if (__field.type == TType.DOUBLE) {
            double alpha = oprot.readDouble();
            builder.setAlpha(alpha);
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
      oprot.writeFieldBegin(RED_FIELD_DESC);
      oprot.writeDouble(this.red);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(GREEN_FIELD_DESC);
      oprot.writeDouble(this.green);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(BLUE_FIELD_DESC);
      oprot.writeDouble(this.blue);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(ALPHA_FIELD_DESC);
      oprot.writeDouble(this.alpha);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }
    
    private static class _ColorLazy {
        private static final Color _DEFAULT = new Color.Builder().build();
    }
    
    public static Color defaultInstance() {
        return  _ColorLazy._DEFAULT;
    }
}
