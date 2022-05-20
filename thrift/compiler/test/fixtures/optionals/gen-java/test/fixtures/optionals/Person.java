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
@com.facebook.swift.codec.ThriftStruct(value="Person", builder=Person.Builder.class)
public final class Person implements com.facebook.thrift.payload.ThriftSerializable {

    @ThriftConstructor
    public Person(
        @com.facebook.swift.codec.ThriftField(value=1, name="id", requiredness=Requiredness.NONE) final long id,
        @com.facebook.swift.codec.ThriftField(value=2, name="name", requiredness=Requiredness.NONE) final String name,
        @com.facebook.swift.codec.ThriftField(value=3, name="age", requiredness=Requiredness.OPTIONAL) final Short age,
        @com.facebook.swift.codec.ThriftField(value=4, name="address", requiredness=Requiredness.OPTIONAL) final String address,
        @com.facebook.swift.codec.ThriftField(value=5, name="favoriteColor", requiredness=Requiredness.OPTIONAL) final test.fixtures.optionals.Color favoriteColor,
        @com.facebook.swift.codec.ThriftField(value=6, name="friends", requiredness=Requiredness.OPTIONAL) final Set<Long> friends,
        @com.facebook.swift.codec.ThriftField(value=7, name="bestFriend", requiredness=Requiredness.OPTIONAL) final Long bestFriend,
        @com.facebook.swift.codec.ThriftField(value=8, name="petNames", requiredness=Requiredness.OPTIONAL) final Map<test.fixtures.optionals.Animal, String> petNames,
        @com.facebook.swift.codec.ThriftField(value=9, name="afraidOfAnimal", requiredness=Requiredness.OPTIONAL) final test.fixtures.optionals.Animal afraidOfAnimal,
        @com.facebook.swift.codec.ThriftField(value=10, name="vehicles", requiredness=Requiredness.OPTIONAL) final List<test.fixtures.optionals.Vehicle> vehicles
    ) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
        this.favoriteColor = favoriteColor;
        this.friends = friends;
        this.bestFriend = bestFriend;
        this.petNames = petNames;
        this.afraidOfAnimal = afraidOfAnimal;
        this.vehicles = vehicles;
    }
    
    @ThriftConstructor
    protected Person() {
      this.id = 0L;
      this.name = null;
      this.age = null;
      this.address = null;
      this.favoriteColor = null;
      this.friends = null;
      this.bestFriend = null;
      this.petNames = null;
      this.afraidOfAnimal = null;
      this.vehicles = null;
    }
    
    public static class Builder {
    
        private long id = 0L;
        private String name = null;
        private Short age = null;
        private String address = null;
        private test.fixtures.optionals.Color favoriteColor = null;
        private Set<Long> friends = null;
        private Long bestFriend = null;
        private Map<test.fixtures.optionals.Animal, String> petNames = null;
        private test.fixtures.optionals.Animal afraidOfAnimal = null;
        private List<test.fixtures.optionals.Vehicle> vehicles = null;
    
        @com.facebook.swift.codec.ThriftField(value=1, name="id", requiredness=Requiredness.NONE)
        public Builder setId(long id) {
            this.id = id;
            return this;
        }
    
        public long getId() { return id; }
    
            @com.facebook.swift.codec.ThriftField(value=2, name="name", requiredness=Requiredness.NONE)
        public Builder setName(String name) {
            this.name = name;
            return this;
        }
    
        public String getName() { return name; }
    
            @com.facebook.swift.codec.ThriftField(value=3, name="age", requiredness=Requiredness.OPTIONAL)
        public Builder setAge(Short age) {
            this.age = age;
            return this;
        }
    
        public Short getAge() { return age; }
    
            @com.facebook.swift.codec.ThriftField(value=4, name="address", requiredness=Requiredness.OPTIONAL)
        public Builder setAddress(String address) {
            this.address = address;
            return this;
        }
    
        public String getAddress() { return address; }
    
            @com.facebook.swift.codec.ThriftField(value=5, name="favoriteColor", requiredness=Requiredness.OPTIONAL)
        public Builder setFavoriteColor(test.fixtures.optionals.Color favoriteColor) {
            this.favoriteColor = favoriteColor;
            return this;
        }
    
        public test.fixtures.optionals.Color getFavoriteColor() { return favoriteColor; }
    
            @com.facebook.swift.codec.ThriftField(value=6, name="friends", requiredness=Requiredness.OPTIONAL)
        public Builder setFriends(Set<Long> friends) {
            this.friends = friends;
            return this;
        }
    
        public Set<Long> getFriends() { return friends; }
    
            @com.facebook.swift.codec.ThriftField(value=7, name="bestFriend", requiredness=Requiredness.OPTIONAL)
        public Builder setBestFriend(Long bestFriend) {
            this.bestFriend = bestFriend;
            return this;
        }
    
        public Long getBestFriend() { return bestFriend; }
    
            @com.facebook.swift.codec.ThriftField(value=8, name="petNames", requiredness=Requiredness.OPTIONAL)
        public Builder setPetNames(Map<test.fixtures.optionals.Animal, String> petNames) {
            this.petNames = petNames;
            return this;
        }
    
        public Map<test.fixtures.optionals.Animal, String> getPetNames() { return petNames; }
    
            @com.facebook.swift.codec.ThriftField(value=9, name="afraidOfAnimal", requiredness=Requiredness.OPTIONAL)
        public Builder setAfraidOfAnimal(test.fixtures.optionals.Animal afraidOfAnimal) {
            this.afraidOfAnimal = afraidOfAnimal;
            return this;
        }
    
        public test.fixtures.optionals.Animal getAfraidOfAnimal() { return afraidOfAnimal; }
    
            @com.facebook.swift.codec.ThriftField(value=10, name="vehicles", requiredness=Requiredness.OPTIONAL)
        public Builder setVehicles(List<test.fixtures.optionals.Vehicle> vehicles) {
            this.vehicles = vehicles;
            return this;
        }
    
        public List<test.fixtures.optionals.Vehicle> getVehicles() { return vehicles; }
    
        public Builder() { }
        public Builder(Person other) {
            this.id = other.id;
            this.name = other.name;
            this.age = other.age;
            this.address = other.address;
            this.favoriteColor = other.favoriteColor;
            this.friends = other.friends;
            this.bestFriend = other.bestFriend;
            this.petNames = other.petNames;
            this.afraidOfAnimal = other.afraidOfAnimal;
            this.vehicles = other.vehicles;
        }
    
        @ThriftConstructor
        public Person build() {
            Person result = new Person (
                this.id,
                this.name,
                this.age,
                this.address,
                this.favoriteColor,
                this.friends,
                this.bestFriend,
                this.petNames,
                this.afraidOfAnimal,
                this.vehicles
            );
            return result;
        }
    }
                                            public static final Map<String, Integer> NAMES_TO_IDS = new HashMap();
    public static final Map<String, Integer> THRIFT_NAMES_TO_IDS = new HashMap();
    public static final Map<Integer, TField> FIELD_METADATA = new HashMap<>();
    private static final TStruct STRUCT_DESC = new TStruct("Person");
    private final long id;
    public static final int _ID = 1;
    private static final TField ID_FIELD_DESC = new TField("id", TType.I64, (short)1);
        private final String name;
    public static final int _NAME = 2;
    private static final TField NAME_FIELD_DESC = new TField("name", TType.STRING, (short)2);
        private final Short age;
    public static final int _AGE = 3;
    private static final TField AGE_FIELD_DESC = new TField("age", TType.I16, (short)3);
        private final String address;
    public static final int _ADDRESS = 4;
    private static final TField ADDRESS_FIELD_DESC = new TField("address", TType.STRING, (short)4);
        private final test.fixtures.optionals.Color favoriteColor;
    public static final int _FAVORITECOLOR = 5;
    private static final TField FAVORITE_COLOR_FIELD_DESC = new TField("favoriteColor", TType.STRUCT, (short)5);
        private final Set<Long> friends;
    public static final int _FRIENDS = 6;
    private static final TField FRIENDS_FIELD_DESC = new TField("friends", TType.SET, (short)6);
        private final Long bestFriend;
    public static final int _BESTFRIEND = 7;
    private static final TField BEST_FRIEND_FIELD_DESC = new TField("bestFriend", TType.I64, (short)7);
        private final Map<test.fixtures.optionals.Animal, String> petNames;
    public static final int _PETNAMES = 8;
    private static final TField PET_NAMES_FIELD_DESC = new TField("petNames", TType.MAP, (short)8);
        private final test.fixtures.optionals.Animal afraidOfAnimal;
    public static final int _AFRAIDOFANIMAL = 9;
    private static final TField AFRAID_OF_ANIMAL_FIELD_DESC = new TField("afraidOfAnimal", TType.I32, (short)9);
        private final List<test.fixtures.optionals.Vehicle> vehicles;
    public static final int _VEHICLES = 10;
    private static final TField VEHICLES_FIELD_DESC = new TField("vehicles", TType.LIST, (short)10);
    static {
      NAMES_TO_IDS.put("id", 1);
      THRIFT_NAMES_TO_IDS.put("id", 1);
      FIELD_METADATA.put(1, ID_FIELD_DESC);
      NAMES_TO_IDS.put("name", 2);
      THRIFT_NAMES_TO_IDS.put("name", 2);
      FIELD_METADATA.put(2, NAME_FIELD_DESC);
      NAMES_TO_IDS.put("age", 3);
      THRIFT_NAMES_TO_IDS.put("age", 3);
      FIELD_METADATA.put(3, AGE_FIELD_DESC);
      NAMES_TO_IDS.put("address", 4);
      THRIFT_NAMES_TO_IDS.put("address", 4);
      FIELD_METADATA.put(4, ADDRESS_FIELD_DESC);
      NAMES_TO_IDS.put("favoriteColor", 5);
      THRIFT_NAMES_TO_IDS.put("favoriteColor", 5);
      FIELD_METADATA.put(5, FAVORITE_COLOR_FIELD_DESC);
      NAMES_TO_IDS.put("friends", 6);
      THRIFT_NAMES_TO_IDS.put("friends", 6);
      FIELD_METADATA.put(6, FRIENDS_FIELD_DESC);
      NAMES_TO_IDS.put("bestFriend", 7);
      THRIFT_NAMES_TO_IDS.put("bestFriend", 7);
      FIELD_METADATA.put(7, BEST_FRIEND_FIELD_DESC);
      NAMES_TO_IDS.put("petNames", 8);
      THRIFT_NAMES_TO_IDS.put("petNames", 8);
      FIELD_METADATA.put(8, PET_NAMES_FIELD_DESC);
      NAMES_TO_IDS.put("afraidOfAnimal", 9);
      THRIFT_NAMES_TO_IDS.put("afraidOfAnimal", 9);
      FIELD_METADATA.put(9, AFRAID_OF_ANIMAL_FIELD_DESC);
      NAMES_TO_IDS.put("vehicles", 10);
      THRIFT_NAMES_TO_IDS.put("vehicles", 10);
      FIELD_METADATA.put(10, VEHICLES_FIELD_DESC);
    }
    
    
    @com.facebook.swift.codec.ThriftField(value=1, name="id", requiredness=Requiredness.NONE)
    public long getId() { return id; }
    
    
    @Nullable
    @com.facebook.swift.codec.ThriftField(value=2, name="name", requiredness=Requiredness.NONE)
    public String getName() { return name; }
    
    
    @Nullable
    @com.facebook.swift.codec.ThriftField(value=3, name="age", requiredness=Requiredness.OPTIONAL)
    public Short getAge() { return age; }
    
    
    @Nullable
    @com.facebook.swift.codec.ThriftField(value=4, name="address", requiredness=Requiredness.OPTIONAL)
    public String getAddress() { return address; }
    
    
    @Nullable
    @com.facebook.swift.codec.ThriftField(value=5, name="favoriteColor", requiredness=Requiredness.OPTIONAL)
    public test.fixtures.optionals.Color getFavoriteColor() { return favoriteColor; }
    
    
    @Nullable
    @com.facebook.swift.codec.ThriftField(value=6, name="friends", requiredness=Requiredness.OPTIONAL)
    public Set<Long> getFriends() { return friends; }
    
    
    @Nullable
    @com.facebook.swift.codec.ThriftField(value=7, name="bestFriend", requiredness=Requiredness.OPTIONAL)
    public Long getBestFriend() { return bestFriend; }
    
    
    @Nullable
    @com.facebook.swift.codec.ThriftField(value=8, name="petNames", requiredness=Requiredness.OPTIONAL)
    public Map<test.fixtures.optionals.Animal, String> getPetNames() { return petNames; }
    
    
    @Nullable
    @com.facebook.swift.codec.ThriftField(value=9, name="afraidOfAnimal", requiredness=Requiredness.OPTIONAL)
    public test.fixtures.optionals.Animal getAfraidOfAnimal() { return afraidOfAnimal; }
    
    
    @Nullable
    @com.facebook.swift.codec.ThriftField(value=10, name="vehicles", requiredness=Requiredness.OPTIONAL)
    public List<test.fixtures.optionals.Vehicle> getVehicles() { return vehicles; }
    
    @java.lang.Override
    public String toString() {
        ToStringHelper helper = toStringHelper(this);
        helper.add("id", id);
        helper.add("name", name);
        helper.add("age", age);
        helper.add("address", address);
        helper.add("favoriteColor", favoriteColor);
        helper.add("friends", friends);
        helper.add("bestFriend", bestFriend);
        helper.add("petNames", petNames);
        helper.add("afraidOfAnimal", afraidOfAnimal);
        helper.add("vehicles", vehicles);
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
    
        Person other = (Person)o;
    
        return
            Objects.equals(id, other.id) &&
    Objects.equals(name, other.name) &&
    Objects.equals(age, other.age) &&
    Objects.equals(address, other.address) &&
    Objects.equals(favoriteColor, other.favoriteColor) &&
    Objects.equals(friends, other.friends) &&
    Objects.equals(bestFriend, other.bestFriend) &&
    Objects.equals(petNames, other.petNames) &&
    Objects.equals(afraidOfAnimal, other.afraidOfAnimal) &&
    Objects.equals(vehicles, other.vehicles) &&
            true;
    }
    
    @java.lang.Override
    public int hashCode() {
        return Arrays.deepHashCode(new java.lang.Object[] {
            id,
            name,
            age,
            address,
            favoriteColor,
            friends,
            bestFriend,
            petNames,
            afraidOfAnimal,
            vehicles
        });
    }
    
    
    public static com.facebook.thrift.payload.Reader<Person> asReader() {
      return Person::read0;
    }
    
    public static Person read0(TProtocol oprot) throws TException {
      TField __field;
      oprot.readStructBegin(Person.NAMES_TO_IDS, Person.THRIFT_NAMES_TO_IDS, Person.FIELD_METADATA);
      Person.Builder builder = new Person.Builder();
      while (true) {
        __field = oprot.readFieldBegin();
        if (__field.type == TType.STOP) { break; }
        switch (__field.id) {
        case _ID:
          if (__field.type == TType.I64) {
            long id = oprot.readI64();
            builder.setId(id);
          } else {
            TProtocolUtil.skip(oprot, __field.type);
          }
          break;
        case _NAME:
          if (__field.type == TType.STRING) {
            String name = oprot.readString();
            builder.setName(name);
          } else {
            TProtocolUtil.skip(oprot, __field.type);
          }
          break;
        case _AGE:
          if (__field.type == TType.I16) {
            Short age = oprot.readI16();
            builder.setAge(age);
          } else {
            TProtocolUtil.skip(oprot, __field.type);
          }
          break;
        case _ADDRESS:
          if (__field.type == TType.STRING) {
            String address = oprot.readString();
            builder.setAddress(address);
          } else {
            TProtocolUtil.skip(oprot, __field.type);
          }
          break;
        case _FAVORITECOLOR:
          if (__field.type == TType.STRUCT) {
            test.fixtures.optionals.Color favoriteColor = test.fixtures.optionals.Color.read0(oprot);
            builder.setFavoriteColor(favoriteColor);
          } else {
            TProtocolUtil.skip(oprot, __field.type);
          }
          break;
        case _FRIENDS:
          if (__field.type == TType.SET) {
            Set<Long> friends;
            {
            TSet _set = oprot.readSetBegin();
            friends = new HashSet<Long>(Math.max(0, _set.size));
            for (int _i = 0; (_set.size < 0) ? oprot.peekSet() : (_i < _set.size); _i++) {
                
                long _value1 = oprot.readI64();
                friends.add(_value1);
            }
            oprot.readSetEnd();
            }
            builder.setFriends(friends);
          } else {
            TProtocolUtil.skip(oprot, __field.type);
          }
          break;
        case _BESTFRIEND:
          if (__field.type == TType.I64) {
            Long bestFriend = oprot.readI64();
            builder.setBestFriend(bestFriend);
          } else {
            TProtocolUtil.skip(oprot, __field.type);
          }
          break;
        case _PETNAMES:
          if (__field.type == TType.MAP) {
            Map<test.fixtures.optionals.Animal, String> petNames;
            {
            TMap _map = oprot.readMapBegin();
            petNames = new HashMap<test.fixtures.optionals.Animal, String>(Math.max(0, _map.size));
            for (int _i = 0; (_map.size < 0) ? oprot.peekMap() : (_i < _map.size); _i++) {
                
                test.fixtures.optionals.Animal _key1 = test.fixtures.optionals.Animal.fromInteger(oprot.readI32());
                String _value1 = oprot.readString();
                petNames.put(_key1, _value1);
            }
            }
            oprot.readMapEnd();
            builder.setPetNames(petNames);
          } else {
            TProtocolUtil.skip(oprot, __field.type);
          }
          break;
        case _AFRAIDOFANIMAL:
          if (__field.type == TType.I32) {
            test.fixtures.optionals.Animal afraidOfAnimal = test.fixtures.optionals.Animal.fromInteger(oprot.readI32());
            builder.setAfraidOfAnimal(afraidOfAnimal);
          } else {
            TProtocolUtil.skip(oprot, __field.type);
          }
          break;
        case _VEHICLES:
          if (__field.type == TType.LIST) {
            List<test.fixtures.optionals.Vehicle> vehicles;
            {
            TList _list = oprot.readListBegin();
            vehicles = new ArrayList<test.fixtures.optionals.Vehicle>(Math.max(0, _list.size));
            for (int _i = 0; (_list.size < 0) ? oprot.peekList() : (_i < _list.size); _i++) {
                
                test.fixtures.optionals.Vehicle _value1 = test.fixtures.optionals.Vehicle.read0(oprot);
                vehicles.add(_value1);
            }
            oprot.readListEnd();
            }
            builder.setVehicles(vehicles);
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
      oprot.writeFieldBegin(ID_FIELD_DESC);
      oprot.writeI64(this.id);
      oprot.writeFieldEnd();
      if (this.name != null) {
        oprot.writeFieldBegin(NAME_FIELD_DESC);
        oprot.writeString(this.name);
        oprot.writeFieldEnd();
      }
      if (this.age != null) {
        oprot.writeFieldBegin(AGE_FIELD_DESC);
        oprot.writeI16(this.age);
        oprot.writeFieldEnd();
      }
      if (this.address != null) {
        oprot.writeFieldBegin(ADDRESS_FIELD_DESC);
        oprot.writeString(this.address);
        oprot.writeFieldEnd();
      }
      if (this.favoriteColor != null) {
        oprot.writeFieldBegin(FAVORITE_COLOR_FIELD_DESC);
        this.favoriteColor.write0(oprot);
        oprot.writeFieldEnd();
      }
      if (this.friends != null) {
        oprot.writeFieldBegin(FRIENDS_FIELD_DESC);
        Set<Long> _iter0 = this.friends;
        oprot.writeSetBegin(new TSet(TType.I64, _iter0.size()));
        for (long _iter1 : _iter0) {
          oprot.writeI64(_iter1);
        }
        oprot.writeSetEnd();
        oprot.writeFieldEnd();
      }
      if (this.bestFriend != null) {
        oprot.writeFieldBegin(BEST_FRIEND_FIELD_DESC);
        oprot.writeI64(this.bestFriend);
        oprot.writeFieldEnd();
      }
      if (this.petNames != null) {
        oprot.writeFieldBegin(PET_NAMES_FIELD_DESC);
        Map<test.fixtures.optionals.Animal, String> _iter0 = this.petNames;
        oprot.writeMapBegin(new TMap(TType.I32, TType.STRING, _iter0.size()));
        for (Map.Entry<test.fixtures.optionals.Animal, String> _iter1 : _iter0.entrySet()) {
          oprot.writeI32(_iter1 == null ? 0 : _iter1.getKey().getValue());
          oprot.writeString(_iter1.getValue());
        }
        oprot.writeMapEnd();
        oprot.writeFieldEnd();
      }
      if (this.afraidOfAnimal != null) {
        oprot.writeFieldBegin(AFRAID_OF_ANIMAL_FIELD_DESC);
        oprot.writeI32(this.afraidOfAnimal == null ? 0 : this.afraidOfAnimal.getValue());
        oprot.writeFieldEnd();
      }
      if (this.vehicles != null) {
        oprot.writeFieldBegin(VEHICLES_FIELD_DESC);
        List<test.fixtures.optionals.Vehicle> _iter0 = this.vehicles;
        oprot.writeListBegin(new TList(TType.STRUCT, _iter0.size()));
        for (test.fixtures.optionals.Vehicle _iter1 : _iter0) {
          _iter1.write0(oprot);
        }
        oprot.writeListEnd();
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }
    
    private static class _PersonLazy {
        private static final Person _DEFAULT = new Person.Builder().build();
    }
    
    public static Person defaultInstance() {
        return  _PersonLazy._DEFAULT;
    }
}
