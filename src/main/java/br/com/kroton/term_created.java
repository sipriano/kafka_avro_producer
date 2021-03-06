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
public class term_created extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 3908028520845794121L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"term_created\",\"namespace\":\"br.com.kroton\",\"fields\":[{\"name\":\"id\",\"type\":\"string\"},{\"name\":\"name\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"startDate\",\"type\":[\"null\",{\"type\":\"long\",\"connect.version\":1,\"connect.name\":\"org.apache.kafka.connect.data.Timestamp\",\"logicalType\":\"timestamp-millis\"}],\"default\":null},{\"name\":\"endDate\",\"type\":[\"null\",{\"type\":\"long\",\"connect.version\":1,\"connect.name\":\"org.apache.kafka.connect.data.Timestamp\",\"logicalType\":\"timestamp-millis\"}],\"default\":null},{\"name\":\"gradingPeriodSequence\",\"type\":[\"null\",\"float\"],\"default\":null},{\"name\":\"instructionalDays\",\"type\":[\"null\",\"float\"],\"default\":null},{\"name\":\"type\",\"type\":\"string\"},{\"name\":\"account\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"parentTerm\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"createdAt\",\"type\":[{\"type\":\"long\",\"connect.version\":1,\"connect.name\":\"org.apache.kafka.connect.data.Timestamp\",\"logicalType\":\"timestamp-millis\"}]},{\"name\":\"userCreated\",\"type\":\"string\"}],\"connect.name\":\"br.com.kroton.term_created\"}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();
static {
    MODEL$.addLogicalTypeConversion(new org.apache.avro.data.TimeConversions.TimestampMillisConversion());
  }

  private static final BinaryMessageEncoder<term_created> ENCODER =
      new BinaryMessageEncoder<term_created>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<term_created> DECODER =
      new BinaryMessageDecoder<term_created>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<term_created> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<term_created> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<term_created> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<term_created>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this term_created to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a term_created from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a term_created instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static term_created fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

   private java.lang.CharSequence id;
   private java.lang.CharSequence name;
   private java.time.Instant startDate;
   private java.time.Instant endDate;
   private java.lang.Float gradingPeriodSequence;
   private java.lang.Float instructionalDays;
   private java.lang.CharSequence type;
   private java.lang.CharSequence account;
   private java.lang.CharSequence parentTerm;
   private java.lang.Object createdAt;
   private java.lang.CharSequence userCreated;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public term_created() {}

  /**
   * All-args constructor.
   * @param id The new value for id
   * @param name The new value for name
   * @param startDate The new value for startDate
   * @param endDate The new value for endDate
   * @param gradingPeriodSequence The new value for gradingPeriodSequence
   * @param instructionalDays The new value for instructionalDays
   * @param type The new value for type
   * @param account The new value for account
   * @param parentTerm The new value for parentTerm
   * @param createdAt The new value for createdAt
   * @param userCreated The new value for userCreated
   */
  public term_created(java.lang.CharSequence id, java.lang.CharSequence name, java.time.Instant startDate, java.time.Instant endDate, java.lang.Float gradingPeriodSequence, java.lang.Float instructionalDays, java.lang.CharSequence type, java.lang.CharSequence account, java.lang.CharSequence parentTerm, java.lang.Object createdAt, java.lang.CharSequence userCreated) {
    this.id = id;
    this.name = name;
    this.startDate = startDate;
    this.endDate = endDate;
    this.gradingPeriodSequence = gradingPeriodSequence;
    this.instructionalDays = instructionalDays;
    this.type = type;
    this.account = account;
    this.parentTerm = parentTerm;
    this.createdAt = createdAt;
    this.userCreated = userCreated;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return id;
    case 1: return name;
    case 2: return startDate;
    case 3: return endDate;
    case 4: return gradingPeriodSequence;
    case 5: return instructionalDays;
    case 6: return type;
    case 7: return account;
    case 8: return parentTerm;
    case 9: return createdAt;
    case 10: return userCreated;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: id = (java.lang.CharSequence)value$; break;
    case 1: name = (java.lang.CharSequence)value$; break;
    case 2: startDate = (java.time.Instant)value$; break;
    case 3: endDate = (java.time.Instant)value$; break;
    case 4: gradingPeriodSequence = (java.lang.Float)value$; break;
    case 5: instructionalDays = (java.lang.Float)value$; break;
    case 6: type = (java.lang.CharSequence)value$; break;
    case 7: account = (java.lang.CharSequence)value$; break;
    case 8: parentTerm = (java.lang.CharSequence)value$; break;
    case 9: createdAt = value$; break;
    case 10: userCreated = (java.lang.CharSequence)value$; break;
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
   * Gets the value of the 'startDate' field.
   * @return The value of the 'startDate' field.
   */
  public java.time.Instant getStartDate() {
    return startDate;
  }


  /**
   * Sets the value of the 'startDate' field.
   * @param value the value to set.
   */
  public void setStartDate(java.time.Instant value) {
    this.startDate = value;
  }

  /**
   * Gets the value of the 'endDate' field.
   * @return The value of the 'endDate' field.
   */
  public java.time.Instant getEndDate() {
    return endDate;
  }


  /**
   * Sets the value of the 'endDate' field.
   * @param value the value to set.
   */
  public void setEndDate(java.time.Instant value) {
    this.endDate = value;
  }

  /**
   * Gets the value of the 'gradingPeriodSequence' field.
   * @return The value of the 'gradingPeriodSequence' field.
   */
  public java.lang.Float getGradingPeriodSequence() {
    return gradingPeriodSequence;
  }


  /**
   * Sets the value of the 'gradingPeriodSequence' field.
   * @param value the value to set.
   */
  public void setGradingPeriodSequence(java.lang.Float value) {
    this.gradingPeriodSequence = value;
  }

  /**
   * Gets the value of the 'instructionalDays' field.
   * @return The value of the 'instructionalDays' field.
   */
  public java.lang.Float getInstructionalDays() {
    return instructionalDays;
  }


  /**
   * Sets the value of the 'instructionalDays' field.
   * @param value the value to set.
   */
  public void setInstructionalDays(java.lang.Float value) {
    this.instructionalDays = value;
  }

  /**
   * Gets the value of the 'type' field.
   * @return The value of the 'type' field.
   */
  public java.lang.CharSequence getType() {
    return type;
  }


  /**
   * Sets the value of the 'type' field.
   * @param value the value to set.
   */
  public void setType(java.lang.CharSequence value) {
    this.type = value;
  }

  /**
   * Gets the value of the 'account' field.
   * @return The value of the 'account' field.
   */
  public java.lang.CharSequence getAccount() {
    return account;
  }


  /**
   * Sets the value of the 'account' field.
   * @param value the value to set.
   */
  public void setAccount(java.lang.CharSequence value) {
    this.account = value;
  }

  /**
   * Gets the value of the 'parentTerm' field.
   * @return The value of the 'parentTerm' field.
   */
  public java.lang.CharSequence getParentTerm() {
    return parentTerm;
  }


  /**
   * Sets the value of the 'parentTerm' field.
   * @param value the value to set.
   */
  public void setParentTerm(java.lang.CharSequence value) {
    this.parentTerm = value;
  }

  /**
   * Gets the value of the 'createdAt' field.
   * @return The value of the 'createdAt' field.
   */
  public java.lang.Object getCreatedAt() {
    return createdAt;
  }


  /**
   * Sets the value of the 'createdAt' field.
   * @param value the value to set.
   */
  public void setCreatedAt(java.lang.Object value) {
    this.createdAt = value;
  }

  /**
   * Gets the value of the 'userCreated' field.
   * @return The value of the 'userCreated' field.
   */
  public java.lang.CharSequence getUserCreated() {
    return userCreated;
  }


  /**
   * Sets the value of the 'userCreated' field.
   * @param value the value to set.
   */
  public void setUserCreated(java.lang.CharSequence value) {
    this.userCreated = value;
  }

  /**
   * Creates a new term_created RecordBuilder.
   * @return A new term_created RecordBuilder
   */
  public static br.com.kroton.term_created.Builder newBuilder() {
    return new br.com.kroton.term_created.Builder();
  }

  /**
   * Creates a new term_created RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new term_created RecordBuilder
   */
  public static br.com.kroton.term_created.Builder newBuilder(br.com.kroton.term_created.Builder other) {
    if (other == null) {
      return new br.com.kroton.term_created.Builder();
    } else {
      return new br.com.kroton.term_created.Builder(other);
    }
  }

  /**
   * Creates a new term_created RecordBuilder by copying an existing term_created instance.
   * @param other The existing instance to copy.
   * @return A new term_created RecordBuilder
   */
  public static br.com.kroton.term_created.Builder newBuilder(br.com.kroton.term_created other) {
    if (other == null) {
      return new br.com.kroton.term_created.Builder();
    } else {
      return new br.com.kroton.term_created.Builder(other);
    }
  }

  /**
   * RecordBuilder for term_created instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<term_created>
    implements org.apache.avro.data.RecordBuilder<term_created> {

    private java.lang.CharSequence id;
    private java.lang.CharSequence name;
    private java.time.Instant startDate;
    private java.time.Instant endDate;
    private java.lang.Float gradingPeriodSequence;
    private java.lang.Float instructionalDays;
    private java.lang.CharSequence type;
    private java.lang.CharSequence account;
    private java.lang.CharSequence parentTerm;
    private java.lang.Object createdAt;
    private java.lang.CharSequence userCreated;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(br.com.kroton.term_created.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.name)) {
        this.name = data().deepCopy(fields()[1].schema(), other.name);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.startDate)) {
        this.startDate = data().deepCopy(fields()[2].schema(), other.startDate);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (isValidValue(fields()[3], other.endDate)) {
        this.endDate = data().deepCopy(fields()[3].schema(), other.endDate);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
      if (isValidValue(fields()[4], other.gradingPeriodSequence)) {
        this.gradingPeriodSequence = data().deepCopy(fields()[4].schema(), other.gradingPeriodSequence);
        fieldSetFlags()[4] = other.fieldSetFlags()[4];
      }
      if (isValidValue(fields()[5], other.instructionalDays)) {
        this.instructionalDays = data().deepCopy(fields()[5].schema(), other.instructionalDays);
        fieldSetFlags()[5] = other.fieldSetFlags()[5];
      }
      if (isValidValue(fields()[6], other.type)) {
        this.type = data().deepCopy(fields()[6].schema(), other.type);
        fieldSetFlags()[6] = other.fieldSetFlags()[6];
      }
      if (isValidValue(fields()[7], other.account)) {
        this.account = data().deepCopy(fields()[7].schema(), other.account);
        fieldSetFlags()[7] = other.fieldSetFlags()[7];
      }
      if (isValidValue(fields()[8], other.parentTerm)) {
        this.parentTerm = data().deepCopy(fields()[8].schema(), other.parentTerm);
        fieldSetFlags()[8] = other.fieldSetFlags()[8];
      }
      if (isValidValue(fields()[9], other.createdAt)) {
        this.createdAt = data().deepCopy(fields()[9].schema(), other.createdAt);
        fieldSetFlags()[9] = other.fieldSetFlags()[9];
      }
      if (isValidValue(fields()[10], other.userCreated)) {
        this.userCreated = data().deepCopy(fields()[10].schema(), other.userCreated);
        fieldSetFlags()[10] = other.fieldSetFlags()[10];
      }
    }

    /**
     * Creates a Builder by copying an existing term_created instance
     * @param other The existing instance to copy.
     */
    private Builder(br.com.kroton.term_created other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.name)) {
        this.name = data().deepCopy(fields()[1].schema(), other.name);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.startDate)) {
        this.startDate = data().deepCopy(fields()[2].schema(), other.startDate);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.endDate)) {
        this.endDate = data().deepCopy(fields()[3].schema(), other.endDate);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.gradingPeriodSequence)) {
        this.gradingPeriodSequence = data().deepCopy(fields()[4].schema(), other.gradingPeriodSequence);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.instructionalDays)) {
        this.instructionalDays = data().deepCopy(fields()[5].schema(), other.instructionalDays);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.type)) {
        this.type = data().deepCopy(fields()[6].schema(), other.type);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.account)) {
        this.account = data().deepCopy(fields()[7].schema(), other.account);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.parentTerm)) {
        this.parentTerm = data().deepCopy(fields()[8].schema(), other.parentTerm);
        fieldSetFlags()[8] = true;
      }
      if (isValidValue(fields()[9], other.createdAt)) {
        this.createdAt = data().deepCopy(fields()[9].schema(), other.createdAt);
        fieldSetFlags()[9] = true;
      }
      if (isValidValue(fields()[10], other.userCreated)) {
        this.userCreated = data().deepCopy(fields()[10].schema(), other.userCreated);
        fieldSetFlags()[10] = true;
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
    public br.com.kroton.term_created.Builder setId(java.lang.CharSequence value) {
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
    public br.com.kroton.term_created.Builder clearId() {
      id = null;
      fieldSetFlags()[0] = false;
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
    public br.com.kroton.term_created.Builder setName(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.name = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'name' field has been set.
      * @return True if the 'name' field has been set, false otherwise.
      */
    public boolean hasName() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'name' field.
      * @return This builder.
      */
    public br.com.kroton.term_created.Builder clearName() {
      name = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'startDate' field.
      * @return The value.
      */
    public java.time.Instant getStartDate() {
      return startDate;
    }


    /**
      * Sets the value of the 'startDate' field.
      * @param value The value of 'startDate'.
      * @return This builder.
      */
    public br.com.kroton.term_created.Builder setStartDate(java.time.Instant value) {
      validate(fields()[2], value);
      this.startDate = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'startDate' field has been set.
      * @return True if the 'startDate' field has been set, false otherwise.
      */
    public boolean hasStartDate() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'startDate' field.
      * @return This builder.
      */
    public br.com.kroton.term_created.Builder clearStartDate() {
      startDate = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'endDate' field.
      * @return The value.
      */
    public java.time.Instant getEndDate() {
      return endDate;
    }


    /**
      * Sets the value of the 'endDate' field.
      * @param value The value of 'endDate'.
      * @return This builder.
      */
    public br.com.kroton.term_created.Builder setEndDate(java.time.Instant value) {
      validate(fields()[3], value);
      this.endDate = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'endDate' field has been set.
      * @return True if the 'endDate' field has been set, false otherwise.
      */
    public boolean hasEndDate() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'endDate' field.
      * @return This builder.
      */
    public br.com.kroton.term_created.Builder clearEndDate() {
      endDate = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'gradingPeriodSequence' field.
      * @return The value.
      */
    public java.lang.Float getGradingPeriodSequence() {
      return gradingPeriodSequence;
    }


    /**
      * Sets the value of the 'gradingPeriodSequence' field.
      * @param value The value of 'gradingPeriodSequence'.
      * @return This builder.
      */
    public br.com.kroton.term_created.Builder setGradingPeriodSequence(java.lang.Float value) {
      validate(fields()[4], value);
      this.gradingPeriodSequence = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'gradingPeriodSequence' field has been set.
      * @return True if the 'gradingPeriodSequence' field has been set, false otherwise.
      */
    public boolean hasGradingPeriodSequence() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'gradingPeriodSequence' field.
      * @return This builder.
      */
    public br.com.kroton.term_created.Builder clearGradingPeriodSequence() {
      gradingPeriodSequence = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'instructionalDays' field.
      * @return The value.
      */
    public java.lang.Float getInstructionalDays() {
      return instructionalDays;
    }


    /**
      * Sets the value of the 'instructionalDays' field.
      * @param value The value of 'instructionalDays'.
      * @return This builder.
      */
    public br.com.kroton.term_created.Builder setInstructionalDays(java.lang.Float value) {
      validate(fields()[5], value);
      this.instructionalDays = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'instructionalDays' field has been set.
      * @return True if the 'instructionalDays' field has been set, false otherwise.
      */
    public boolean hasInstructionalDays() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'instructionalDays' field.
      * @return This builder.
      */
    public br.com.kroton.term_created.Builder clearInstructionalDays() {
      instructionalDays = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /**
      * Gets the value of the 'type' field.
      * @return The value.
      */
    public java.lang.CharSequence getType() {
      return type;
    }


    /**
      * Sets the value of the 'type' field.
      * @param value The value of 'type'.
      * @return This builder.
      */
    public br.com.kroton.term_created.Builder setType(java.lang.CharSequence value) {
      validate(fields()[6], value);
      this.type = value;
      fieldSetFlags()[6] = true;
      return this;
    }

    /**
      * Checks whether the 'type' field has been set.
      * @return True if the 'type' field has been set, false otherwise.
      */
    public boolean hasType() {
      return fieldSetFlags()[6];
    }


    /**
      * Clears the value of the 'type' field.
      * @return This builder.
      */
    public br.com.kroton.term_created.Builder clearType() {
      type = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    /**
      * Gets the value of the 'account' field.
      * @return The value.
      */
    public java.lang.CharSequence getAccount() {
      return account;
    }


    /**
      * Sets the value of the 'account' field.
      * @param value The value of 'account'.
      * @return This builder.
      */
    public br.com.kroton.term_created.Builder setAccount(java.lang.CharSequence value) {
      validate(fields()[7], value);
      this.account = value;
      fieldSetFlags()[7] = true;
      return this;
    }

    /**
      * Checks whether the 'account' field has been set.
      * @return True if the 'account' field has been set, false otherwise.
      */
    public boolean hasAccount() {
      return fieldSetFlags()[7];
    }


    /**
      * Clears the value of the 'account' field.
      * @return This builder.
      */
    public br.com.kroton.term_created.Builder clearAccount() {
      account = null;
      fieldSetFlags()[7] = false;
      return this;
    }

    /**
      * Gets the value of the 'parentTerm' field.
      * @return The value.
      */
    public java.lang.CharSequence getParentTerm() {
      return parentTerm;
    }


    /**
      * Sets the value of the 'parentTerm' field.
      * @param value The value of 'parentTerm'.
      * @return This builder.
      */
    public br.com.kroton.term_created.Builder setParentTerm(java.lang.CharSequence value) {
      validate(fields()[8], value);
      this.parentTerm = value;
      fieldSetFlags()[8] = true;
      return this;
    }

    /**
      * Checks whether the 'parentTerm' field has been set.
      * @return True if the 'parentTerm' field has been set, false otherwise.
      */
    public boolean hasParentTerm() {
      return fieldSetFlags()[8];
    }


    /**
      * Clears the value of the 'parentTerm' field.
      * @return This builder.
      */
    public br.com.kroton.term_created.Builder clearParentTerm() {
      parentTerm = null;
      fieldSetFlags()[8] = false;
      return this;
    }

    /**
      * Gets the value of the 'createdAt' field.
      * @return The value.
      */
    public java.lang.Object getCreatedAt() {
      return createdAt;
    }


    /**
      * Sets the value of the 'createdAt' field.
      * @param value The value of 'createdAt'.
      * @return This builder.
      */
    public br.com.kroton.term_created.Builder setCreatedAt(java.lang.Object value) {
      validate(fields()[9], value);
      this.createdAt = value;
      fieldSetFlags()[9] = true;
      return this;
    }

    /**
      * Checks whether the 'createdAt' field has been set.
      * @return True if the 'createdAt' field has been set, false otherwise.
      */
    public boolean hasCreatedAt() {
      return fieldSetFlags()[9];
    }


    /**
      * Clears the value of the 'createdAt' field.
      * @return This builder.
      */
    public br.com.kroton.term_created.Builder clearCreatedAt() {
      createdAt = null;
      fieldSetFlags()[9] = false;
      return this;
    }

    /**
      * Gets the value of the 'userCreated' field.
      * @return The value.
      */
    public java.lang.CharSequence getUserCreated() {
      return userCreated;
    }


    /**
      * Sets the value of the 'userCreated' field.
      * @param value The value of 'userCreated'.
      * @return This builder.
      */
    public br.com.kroton.term_created.Builder setUserCreated(java.lang.CharSequence value) {
      validate(fields()[10], value);
      this.userCreated = value;
      fieldSetFlags()[10] = true;
      return this;
    }

    /**
      * Checks whether the 'userCreated' field has been set.
      * @return True if the 'userCreated' field has been set, false otherwise.
      */
    public boolean hasUserCreated() {
      return fieldSetFlags()[10];
    }


    /**
      * Clears the value of the 'userCreated' field.
      * @return This builder.
      */
    public br.com.kroton.term_created.Builder clearUserCreated() {
      userCreated = null;
      fieldSetFlags()[10] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public term_created build() {
      try {
        term_created record = new term_created();
        record.id = fieldSetFlags()[0] ? this.id : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.name = fieldSetFlags()[1] ? this.name : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.startDate = fieldSetFlags()[2] ? this.startDate : (java.time.Instant) defaultValue(fields()[2]);
        record.endDate = fieldSetFlags()[3] ? this.endDate : (java.time.Instant) defaultValue(fields()[3]);
        record.gradingPeriodSequence = fieldSetFlags()[4] ? this.gradingPeriodSequence : (java.lang.Float) defaultValue(fields()[4]);
        record.instructionalDays = fieldSetFlags()[5] ? this.instructionalDays : (java.lang.Float) defaultValue(fields()[5]);
        record.type = fieldSetFlags()[6] ? this.type : (java.lang.CharSequence) defaultValue(fields()[6]);
        record.account = fieldSetFlags()[7] ? this.account : (java.lang.CharSequence) defaultValue(fields()[7]);
        record.parentTerm = fieldSetFlags()[8] ? this.parentTerm : (java.lang.CharSequence) defaultValue(fields()[8]);
        record.createdAt = fieldSetFlags()[9] ? this.createdAt :  defaultValue(fields()[9]);
        record.userCreated = fieldSetFlags()[10] ? this.userCreated : (java.lang.CharSequence) defaultValue(fields()[10]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<term_created>
    WRITER$ = (org.apache.avro.io.DatumWriter<term_created>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<term_created>
    READER$ = (org.apache.avro.io.DatumReader<term_created>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}










