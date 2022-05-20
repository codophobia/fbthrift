/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */

package test.fixtures.patch;

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
@com.facebook.swift.codec.ThriftStruct(value="OptionalMyStructValuePatch", builder=OptionalMyStructValuePatch.Builder.class)
public final class OptionalMyStructValuePatch implements com.facebook.thrift.payload.ThriftSerializable {

    @ThriftConstructor
    public OptionalMyStructValuePatch(
        @com.facebook.swift.codec.ThriftField(value=2, name="clear", requiredness=) final boolean clear,
        @com.facebook.swift.codec.ThriftField(value=3, name="patch", requiredness=) final test.fixtures.patch.MyStructValuePatch patch,
        @com.facebook.swift.codec.ThriftField(value=4, name="ensure", requiredness=Requiredness.OPTIONAL) final test.fixtures.patch.MyStruct ensure,
        @com.facebook.swift.codec.ThriftField(value=5, name="patchAfter", requiredness=) final test.fixtures.patch.MyStructValuePatch patchAfter
    ) {
        this.clear = clear;
        this.patch = patch;
        this.ensure = ensure;
        this.patchAfter = patchAfter;
    }
    
    @ThriftConstructor
    protected OptionalMyStructValuePatch() {
      this.clear = false;
      this.patch = null;
      this.ensure = null;
      this.patchAfter = null;
    }
    
    public static class Builder {
    
        private boolean clear = false;
        private test.fixtures.patch.MyStructValuePatch patch = null;
        private test.fixtures.patch.MyStruct ensure = null;
        private test.fixtures.patch.MyStructValuePatch patchAfter = null;
    
        @com.facebook.swift.codec.ThriftField(value=2, name="clear", requiredness=)
        public Builder setClear(boolean clear) {
            this.clear = clear;
            return this;
        }
    
        public boolean isClear() { return clear; }
    
            @com.facebook.swift.codec.ThriftField(value=3, name="patch", requiredness=)
        public Builder setPatch(test.fixtures.patch.MyStructValuePatch patch) {
            this.patch = patch;
            return this;
        }
    
        public test.fixtures.patch.MyStructValuePatch getPatch() { return patch; }
    
            @com.facebook.swift.codec.ThriftField(value=4, name="ensure", requiredness=Requiredness.OPTIONAL)
        public Builder setEnsure(test.fixtures.patch.MyStruct ensure) {
            this.ensure = ensure;
            return this;
        }
    
        public test.fixtures.patch.MyStruct getEnsure() { return ensure; }
    
            @com.facebook.swift.codec.ThriftField(value=5, name="patchAfter", requiredness=)
        public Builder setPatchAfter(test.fixtures.patch.MyStructValuePatch patchAfter) {
            this.patchAfter = patchAfter;
            return this;
        }
    
        public test.fixtures.patch.MyStructValuePatch getPatchAfter() { return patchAfter; }
    
        public Builder() { }
        public Builder(OptionalMyStructValuePatch other) {
            this.clear = other.clear;
            this.patch = other.patch;
            this.ensure = other.ensure;
            this.patchAfter = other.patchAfter;
        }
    
        @ThriftConstructor
        public OptionalMyStructValuePatch build() {
            OptionalMyStructValuePatch result = new OptionalMyStructValuePatch (
                this.clear,
                this.patch,
                this.ensure,
                this.patchAfter
            );
            return result;
        }
    }
                    public static final Map<String, Integer> NAMES_TO_IDS = new HashMap();
    public static final Map<String, Integer> THRIFT_NAMES_TO_IDS = new HashMap();
    public static final Map<Integer, TField> FIELD_METADATA = new HashMap<>();
    private static final TStruct STRUCT_DESC = new TStruct("OptionalMyStructValuePatch");
    private final boolean clear;
    public static final int _CLEAR = 2;
    private static final TField CLEAR_FIELD_DESC = new TField("clear", TType.BOOL, (short)2);
        private final test.fixtures.patch.MyStructValuePatch patch;
    public static final int _PATCH = 3;
    private static final TField PATCH_FIELD_DESC = new TField("patch", TType.STRUCT, (short)3);
        private final test.fixtures.patch.MyStruct ensure;
    public static final int _ENSURE = 4;
    private static final TField ENSURE_FIELD_DESC = new TField("ensure", TType.STRUCT, (short)4);
        private final test.fixtures.patch.MyStructValuePatch patchAfter;
    public static final int _PATCHAFTER = 5;
    private static final TField PATCH_AFTER_FIELD_DESC = new TField("patchAfter", TType.STRUCT, (short)5);
    static {
      NAMES_TO_IDS.put("clear", 2);
      THRIFT_NAMES_TO_IDS.put("clear", 2);
      FIELD_METADATA.put(2, CLEAR_FIELD_DESC);
      NAMES_TO_IDS.put("patch", 3);
      THRIFT_NAMES_TO_IDS.put("patch", 3);
      FIELD_METADATA.put(3, PATCH_FIELD_DESC);
      NAMES_TO_IDS.put("ensure", 4);
      THRIFT_NAMES_TO_IDS.put("ensure", 4);
      FIELD_METADATA.put(4, ENSURE_FIELD_DESC);
      NAMES_TO_IDS.put("patchAfter", 5);
      THRIFT_NAMES_TO_IDS.put("patchAfter", 5);
      FIELD_METADATA.put(5, PATCH_AFTER_FIELD_DESC);
      com.facebook.thrift.type.TypeRegistry.add(new com.facebook.thrift.type.Type(
        new com.facebook.thrift.type.UniversalName("test.dev/fixtures/patch/OptionalMyStructValuePatch"), 
        OptionalMyStructValuePatch.class, OptionalMyStructValuePatch::read0));
    }
    
    
    @com.facebook.swift.codec.ThriftField(value=2, name="clear", requiredness=)
    public boolean isClear() { return clear; }
    
    
    @Nullable
    @com.facebook.swift.codec.ThriftField(value=3, name="patch", requiredness=)
    public test.fixtures.patch.MyStructValuePatch getPatch() { return patch; }
    
    
    @Nullable
    @com.facebook.swift.codec.ThriftField(value=4, name="ensure", requiredness=Requiredness.OPTIONAL)
    public test.fixtures.patch.MyStruct getEnsure() { return ensure; }
    
    
    @Nullable
    @com.facebook.swift.codec.ThriftField(value=5, name="patchAfter", requiredness=)
    public test.fixtures.patch.MyStructValuePatch getPatchAfter() { return patchAfter; }
    
    @java.lang.Override
    public String toString() {
        ToStringHelper helper = toStringHelper(this);
        helper.add("clear", clear);
        helper.add("patch", patch);
        helper.add("ensure", ensure);
        helper.add("patchAfter", patchAfter);
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
    
        OptionalMyStructValuePatch other = (OptionalMyStructValuePatch)o;
    
        return
            Objects.equals(clear, other.clear) &&
    Objects.equals(patch, other.patch) &&
    Objects.equals(ensure, other.ensure) &&
    Objects.equals(patchAfter, other.patchAfter) &&
            true;
    }
    
    @java.lang.Override
    public int hashCode() {
        return Arrays.deepHashCode(new java.lang.Object[] {
            clear,
            patch,
            ensure,
            patchAfter
        });
    }
    
    
    public static com.facebook.thrift.payload.Reader<OptionalMyStructValuePatch> asReader() {
      return OptionalMyStructValuePatch::read0;
    }
    
    public static OptionalMyStructValuePatch read0(TProtocol oprot) throws TException {
      TField __field;
      oprot.readStructBegin(OptionalMyStructValuePatch.NAMES_TO_IDS, OptionalMyStructValuePatch.THRIFT_NAMES_TO_IDS, OptionalMyStructValuePatch.FIELD_METADATA);
      OptionalMyStructValuePatch.Builder builder = new OptionalMyStructValuePatch.Builder();
      while (true) {
        __field = oprot.readFieldBegin();
        if (__field.type == TType.STOP) { break; }
        switch (__field.id) {
        case _CLEAR:
          if (__field.type == TType.BOOL) {
            boolean clear = oprot.readBool();
            builder.setClear(clear);
          } else {
            TProtocolUtil.skip(oprot, __field.type);
          }
          break;
        case _PATCH:
          if (__field.type == TType.STRUCT) {
            test.fixtures.patch.MyStructValuePatch patch = test.fixtures.patch.MyStructValuePatch.read0(oprot);
            builder.setPatch(patch);
          } else {
            TProtocolUtil.skip(oprot, __field.type);
          }
          break;
        case _ENSURE:
          if (__field.type == TType.STRUCT) {
            test.fixtures.patch.MyStruct ensure = test.fixtures.patch.MyStruct.read0(oprot);
            builder.setEnsure(ensure);
          } else {
            TProtocolUtil.skip(oprot, __field.type);
          }
          break;
        case _PATCHAFTER:
          if (__field.type == TType.STRUCT) {
            test.fixtures.patch.MyStructValuePatch patchAfter = test.fixtures.patch.MyStructValuePatch.read0(oprot);
            builder.setPatchAfter(patchAfter);
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
      oprot.writeFieldBegin(CLEAR_FIELD_DESC);
      oprot.writeBool(this.clear);
      oprot.writeFieldEnd();
      if (this.patch != null) {
        oprot.writeFieldBegin(PATCH_FIELD_DESC);
        this.patch.write0(oprot);
        oprot.writeFieldEnd();
      }
      if (this.ensure != null) {
        oprot.writeFieldBegin(ENSURE_FIELD_DESC);
        this.ensure.write0(oprot);
        oprot.writeFieldEnd();
      }
      if (this.patchAfter != null) {
        oprot.writeFieldBegin(PATCH_AFTER_FIELD_DESC);
        this.patchAfter.write0(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }
    
    private static class _OptionalMyStructValuePatchLazy {
        private static final OptionalMyStructValuePatch _DEFAULT = new OptionalMyStructValuePatch.Builder().build();
    }
    
    public static OptionalMyStructValuePatch defaultInstance() {
        return  _OptionalMyStructValuePatchLazy._DEFAULT;
    }
}
