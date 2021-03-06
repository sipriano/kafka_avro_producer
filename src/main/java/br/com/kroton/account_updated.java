/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package br.com.kroton;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class account_updated extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -4204752696998603371L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"account_updated\",\"namespace\":\"br.com.kroton\",\"fields\":[{\"name\":\"id\",\"type\":\"string\"},{\"name\":\"recordType\",\"type\":\"string\"},{\"name\":\"recordGroup\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"name\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"code\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"updatedAt\",\"type\":[{\"type\":\"long\",\"connect.version\":1,\"connect.name\":\"org.apache.kafka.connect.data.Timestamp\",\"logicalType\":\"timestamp-millis\"}]},{\"name\":\"userUpdated\",\"type\":\"string\"}],\"connect.name\":\"br.com.kroton.account_updated\"}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();
static {
    MODEL$.addLogicalTypeConversion(new org.apache.avro.data.TimeConversions.TimestampMillisConversion());
  }

  private static final BinaryMessageEncoder<account_updated> ENCODER =
      new BinaryMessageEncoder<account_updated>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<account_updated> DECODER =
      new BinaryMessageDecoder<account_updated>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<account_updated> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<account_updated> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<account_updated> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<account_updated>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this account_updated to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a account_updated from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a account_updated instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static account_updated fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

   private java.lang.CharSequence id;
   private java.lang.CharSequence recordType;
   private java.lang.CharSequence recordGroup;
   private java.lang.CharSequence name;
   private java.lang.CharSequence code;
   private java.lang.Object updatedAt;
   private java.lang.CharSequence userUpdated;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public account_updated() {}

  /**
   * All-args constructor.
   * @param id The new value for id
   * @param recordType The new value for recordType
   * @param recordGroup The new value for recordGroup
   * @param name The new value for name
   * @param code The new value for code
   * @param updatedAt The new value for updatedAt
   * @param userUpdated The new value for userUpdated
   */
  public account_updated(java.lang.CharSequence id, java.lang.CharSequence recordType, java.lang.CharSequence recordGroup, java.lang.CharSequence name, java.lang.CharSequence code, java.lang.Object updatedAt, java.lang.CharSequence userUpdated) {
    this.id = id;
    this.recordType = recordType;
    this.recordGroup = recordGroup;
    this.name = name;
    this.code = code;
    this.updatedAt = updatedAt;
    this.userUpdated = userUpdated;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return id;
    case 1: return recordType;
    case 2: return recordGroup;
    case 3: return name;
    case 4: return code;
    case 5: return updatedAt;
    case 6: return userUpdated;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: id = (java.lang.CharSequence)value$; break;
    case 1: recordType = (java.lang.CharSequence)value$; break;
    case 2: recordGroup = (java.lang.CharSequence)value$; break;
    case 3: name = (java.lang.CharSequence)value$; break;
    case 4: code = (java.lang.CharSequence)value$; break;
    case 5: updatedAt = value$; break;
    case 6: userUpdated = (java.lang.CharSequence)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'id' field.
   * @return The value of the 'id' field.
   */
  public java.lang.CharSequence getId() {
    return id;
  }


  /**
   * Sets the value of the 'id' field.
   * @param value the value to set.
   */
  public void setId(java.lang.CharSequence value) {
    this.id = value;
  }

  /**
   * Gets the value of the 'recordType' field.
   * @return The value of the 'recordType' field.
   */
  public java.lang.CharSequence getRecordType() {
    return recordType;
  }


  /**
   * Sets the value of the 'recordType' field.
   * @param value the value to set.
   */
  public void setRecordType(java.lang.CharSequence value) {
    this.recordType = value;
  }

  /**
   * Gets the value of the 'recordGroup' field.
   * @return The value of the 'recordGroup' field.
   */
  public java.lang.CharSequence getRecordGroup() {
    return recordGroup;
  }


  /**
   * Sets the value of the 'recordGroup' field.
   * @param value the value to set.
   */
  public void setRecordGroup(java.lang.CharSequence value) {
    this.recordGroup = value;
  }

  /**
   * Gets the value of the 'name' field.
   * @return The value of the 'name' field.
   */
  public java.lang.CharSequence getName() {
    return name;
  }


  /**
   * Sets the value of the 'name' field.
   * @param value the value to set.
   */
  public void setName(java.lang.CharSequence value) {
    this.name = value;
  }

  /**
   * Gets the value of the 'code' field.
   * @return The value of the 'code' field.
   */
  public java.lang.CharSequence getCode() {
    return code;
  }


  /**
   * Sets the value of the 'code' field.
   * @param value the value to set.
   */
  public void setCode(java.lang.CharSequence value) {
    this.code = value;
  }

  /**
   * Gets the value of the 'updatedAt' field.
   * @return The value of the 'updatedAt' field.
   */
  public java.lang.Object getUpdatedAt() {
    return updatedAt;
  }


  /**
   * Sets the value of the 'updatedAt' field.
   * @param value the value to set.
   */
  public void setUpdatedAt(java.lang.Object value) {
    this.updatedAt = value;
  }

  /**
   * Gets the value of the 'userUpdated' field.
   * @return The value of the 'userUpdated' field.
   */
  public java.lang.CharSequence getUserUpdated() {
    return userUpdated;
  }


  /**
   * Sets the value of the 'userUpdated' field.
   * @param value the value to set.
   */
  public void setUserUpdated(java.lang.CharSequence value) {
    this.userUpdated = value;
  }

  /**
   * Creates a new account_updated RecordBuilder.
   * @return A new account_updated RecordBuilder
   */
  public static Builder newBuilder() {
    return new br.com.kroton.account_updated.Builder();
  }

  /**
   * Creates a new account_updated RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new account_updated RecordBuilder
   */
  public static Builder newBuilder(br.com.kroton.account_updated.Builder other) {
    if (other == null) {
      return new br.com.kroton.account_updated.Builder();
    } else {
      return new br.com.kroton.account_updated.Builder(other);
    }
  }

  /**
   * Creates a new account_updated RecordBuilder by copying an existing account_updated instance.
   * @param other The existing instance to copy.
   * @return A new account_updated RecordBuilder
   */
  public static Builder newBuilder(br.com.kroton.account_updated other) {
    if (other == null) {
      return new br.com.kroton.account_updated.Builder();
    } else {
      return new br.com.kroton.account_updated.Builder(other);
    }
  }

  /**
   * RecordBuilder for account_updated instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<account_updated>
    implements org.apache.avro.data.RecordBuilder<account_updated> {

    private java.lang.CharSequence id;
    private java.lang.CharSequence recordType;
    private java.lang.CharSequence recordGroup;
    private java.lang.CharSequence name;
    private java.lang.CharSequence code;
    private java.lang.Object updatedAt;
    private java.lang.CharSequence userUpdated;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(br.com.kroton.account_updated.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.recordType)) {
        this.recordType = data().deepCopy(fields()[1].schema(), other.recordType);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.recordGroup)) {
        this.recordGroup = data().deepCopy(fields()[2].schema(), other.recordGroup);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (isValidValue(fields()[3], other.name)) {
        this.name = data().deepCopy(fields()[3].schema(), other.name);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
      if (isValidValue(fields()[4], other.code)) {
        this.code = data().deepCopy(fields()[4].schema(), other.code);
        fieldSetFlags()[4] = other.fieldSetFlags()[4];
      }
      if (isValidValue(fields()[5], other.updatedAt)) {
        this.updatedAt = data().deepCopy(fields()[5].schema(), other.updatedAt);
        fieldSetFlags()[5] = other.fieldSetFlags()[5];
      }
      if (isValidValue(fields()[6], other.userUpdated)) {
        this.userUpdated = data().deepCopy(fields()[6].schema(), other.userUpdated);
        fieldSetFlags()[6] = other.fieldSetFlags()[6];
      }
    }

    /**
     * Creates a Builder by copying an existing account_updated instance
     * @param other The existing instance to copy.
     */
    private Builder(br.com.kroton.account_updated other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.recordType)) {
        this.recordType = data().deepCopy(fields()[1].schema(), other.recordType);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.recordGroup)) {
        this.recordGroup = data().deepCopy(fields()[2].schema(), other.recordGroup);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.name)) {
        this.name = data().deepCopy(fields()[3].schema(), other.name);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.code)) {
        this.code = data().deepCopy(fields()[4].schema(), other.code);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.updatedAt)) {
        this.updatedAt = data().deepCopy(fields()[5].schema(), other.updatedAt);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.userUpdated)) {
        this.userUpdated = data().deepCopy(fields()[6].schema(), other.userUpdated);
        fieldSetFlags()[6] = true;
      }
    }

    /**
      * Gets the value of the 'id' field.
      * @return The value.
      */
    public java.lang.CharSequence getId() {
      return id;
    }


    /**
      * Sets the value of the 'id' field.
      * @param value The value of 'id'.
      * @return This builder.
      */
    public Builder setId(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.id = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'id' field has been set.
      * @return True if the 'id' field has been set, false otherwise.
      */
    public boolean hasId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'id' field.
      * @return This builder.
      */
    public Builder clearId() {
      id = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'recordType' field.
      * @return The value.
      */
    public java.lang.CharSequence getRecordType() {
      return recordType;
    }


    /**
      * Sets the value of the 'recordType' field.
      * @param value The value of 'recordType'.
      * @return This builder.
      */
    public Builder setRecordType(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.recordType = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'recordType' field has been set.
      * @return True if the 'recordType' field has been set, false otherwise.
      */
    public boolean hasRecordType() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'recordType' field.
      * @return This builder.
      */
    public Builder clearRecordType() {
      recordType = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'recordGroup' field.
      * @return The value.
      */
    public java.lang.CharSequence getRecordGroup() {
      return recordGroup;
    }


    /**
      * Sets the value of the 'recordGroup' field.
      * @param value The value of 'recordGroup'.
      * @return This builder.
      */
    public Builder setRecordGroup(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.recordGroup = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'recordGroup' field has been set.
      * @return True if the 'recordGroup' field has been set, false otherwise.
      */
    public boolean hasRecordGroup() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'recordGroup' field.
      * @return This builder.
      */
    public Builder clearRecordGroup() {
      recordGroup = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'name' field.
      * @return The value.
      */
    public java.lang.CharSequence getName() {
      return name;
    }


    /**
      * Sets the value of the 'name' field.
      * @param value The value of 'name'.
      * @return This builder.
      */
    public Builder setName(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this.name = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'name' field has been set.
      * @return True if the 'name' field has been set, false otherwise.
      */
    public boolean hasName() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'name' field.
      * @return This builder.
      */
    public Builder clearName() {
      name = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'code' field.
      * @return The value.
      */
    public java.lang.CharSequence getCode() {
      return code;
    }


    /**
      * Sets the value of the 'code' field.
      * @param value The value of 'code'.
      * @return This builder.
      */
    public Builder setCode(java.lang.CharSequence value) {
      validate(fields()[4], value);
      this.code = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'code' field has been set.
      * @return True if the 'code' field has been set, false otherwise.
      */
    public boolean hasCode() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'code' field.
      * @return This builder.
      */
    public Builder clearCode() {
      code = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'updatedAt' field.
      * @return The value.
      */
    public java.lang.Object getUpdatedAt() {
      return updatedAt;
    }


    /**
      * Sets the value of the 'updatedAt' field.
      * @param value The value of 'updatedAt'.
      * @return This builder.
      */
    public Builder setUpdatedAt(java.lang.Object value) {
      validate(fields()[5], value);
      this.updatedAt = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'updatedAt' field has been set.
      * @return True if the 'updatedAt' field has been set, false otherwise.
      */
    public boolean hasUpdatedAt() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'updatedAt' field.
      * @return This builder.
      */
    public Builder clearUpdatedAt() {
      updatedAt = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /**
      * Gets the value of the 'userUpdated' field.
      * @return The value.
      */
    public java.lang.CharSequence getUserUpdated() {
      return userUpdated;
    }


    /**
      * Sets the value of the 'userUpdated' field.
      * @param value The value of 'userUpdated'.
      * @return This builder.
      */
    public Builder setUserUpdated(java.lang.CharSequence value) {
      validate(fields()[6], value);
      this.userUpdated = value;
      fieldSetFlags()[6] = true;
      return this;
    }

    /**
      * Checks whether the 'userUpdated' field has been set.
      * @return True if the 'userUpdated' field has been set, false otherwise.
      */
    public boolean hasUserUpdated() {
      return fieldSetFlags()[6];
    }


    /**
      * Clears the value of the 'userUpdated' field.
      * @return This builder.
      */
    public Builder clearUserUpdated() {
      userUpdated = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public account_updated build() {
      try {
        account_updated record = new account_updated();
        record.id = fieldSetFlags()[0] ? this.id : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.recordType = fieldSetFlags()[1] ? this.recordType : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.recordGroup = fieldSetFlags()[2] ? this.recordGroup : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.name = fieldSetFlags()[3] ? this.name : (java.lang.CharSequence) defaultValue(fields()[3]);
        record.code = fieldSetFlags()[4] ? this.code : (java.lang.CharSequence) defaultValue(fields()[4]);
        record.updatedAt = fieldSetFlags()[5] ? this.updatedAt :  defaultValue(fields()[5]);
        record.userUpdated = fieldSetFlags()[6] ? this.userUpdated : (java.lang.CharSequence) defaultValue(fields()[6]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<account_updated>
    WRITER$ = (org.apache.avro.io.DatumWriter<account_updated>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<account_updated>
    READER$ = (org.apache.avro.io.DatumReader<account_updated>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}










