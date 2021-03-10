/**
 * Autogenerated by Avro
 *
 * <p>DO NOT EDIT DIRECTLY
 */
package edu.hsh.favs.project.escqrs.events.customer;

import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.SchemaStore;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;

@org.apache.avro.specific.AvroGenerated
public class CustomerUpdatedEvent extends org.apache.avro.specific.SpecificRecordBase
    implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -8785053021835882499L;
  public static final org.apache.avro.Schema SCHEMA$ =
      new org.apache.avro.Schema.Parser()
          .parse(
              "{\"type\":\"record\",\"name\":\"CustomerUpdatedEvent\",\"namespace\":\"edu.hsh.favs.project.escqrs.events.customer\",\"fields\":[{\"name\":\"id\",\"type\":\"long\"},{\"name\":\"firstName\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"lastName\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"username\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"age\",\"type\":[\"null\",\"int\"],\"default\":null}]}");

  public static org.apache.avro.Schema getClassSchema() {
    return SCHEMA$;
  }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<CustomerUpdatedEvent> ENCODER =
      new BinaryMessageEncoder<CustomerUpdatedEvent>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<CustomerUpdatedEvent> DECODER =
      new BinaryMessageDecoder<CustomerUpdatedEvent>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   *
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<CustomerUpdatedEvent> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   *
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<CustomerUpdatedEvent> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link
   * SchemaStore}.
   *
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<CustomerUpdatedEvent> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<CustomerUpdatedEvent>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this CustomerUpdatedEvent to a ByteBuffer.
   *
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a CustomerUpdatedEvent from a ByteBuffer.
   *
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a CustomerUpdatedEvent instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of
   *     this class
   */
  public static CustomerUpdatedEvent fromByteBuffer(java.nio.ByteBuffer b)
      throws java.io.IOException {
    return DECODER.decode(b);
  }

  private long id;
  private java.lang.CharSequence firstName;
  private java.lang.CharSequence lastName;
  private java.lang.CharSequence username;
  private java.lang.Integer age;

  /**
   * Default constructor. Note that this does not initialize fields to their default values from the
   * schema. If that is desired then one should use <code>newBuilder()</code>.
   */
  public CustomerUpdatedEvent() {}

  /**
   * All-args constructor.
   *
   * @param id The new value for id
   * @param firstName The new value for firstName
   * @param lastName The new value for lastName
   * @param username The new value for username
   * @param age The new value for age
   */
  public CustomerUpdatedEvent(
      java.lang.Long id,
      java.lang.CharSequence firstName,
      java.lang.CharSequence lastName,
      java.lang.CharSequence username,
      java.lang.Integer age) {
    this.id = id;
    this.firstName = firstName;
    this.lastName = lastName;
    this.username = username;
    this.age = age;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() {
    return MODEL$;
  }

  public org.apache.avro.Schema getSchema() {
    return SCHEMA$;
  }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
      case 0:
        return id;
      case 1:
        return firstName;
      case 2:
        return lastName;
      case 3:
        return username;
      case 4:
        return age;
      default:
        throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value = "unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
      case 0:
        id = (java.lang.Long) value$;
        break;
      case 1:
        firstName = (java.lang.CharSequence) value$;
        break;
      case 2:
        lastName = (java.lang.CharSequence) value$;
        break;
      case 3:
        username = (java.lang.CharSequence) value$;
        break;
      case 4:
        age = (java.lang.Integer) value$;
        break;
      default:
        throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'id' field.
   *
   * @return The value of the 'id' field.
   */
  public long getId() {
    return id;
  }

  /**
   * Sets the value of the 'id' field.
   *
   * @param value the value to set.
   */
  public void setId(long value) {
    this.id = value;
  }

  /**
   * Gets the value of the 'firstName' field.
   *
   * @return The value of the 'firstName' field.
   */
  public java.lang.CharSequence getFirstName() {
    return firstName;
  }

  /**
   * Sets the value of the 'firstName' field.
   *
   * @param value the value to set.
   */
  public void setFirstName(java.lang.CharSequence value) {
    this.firstName = value;
  }

  /**
   * Gets the value of the 'lastName' field.
   *
   * @return The value of the 'lastName' field.
   */
  public java.lang.CharSequence getLastName() {
    return lastName;
  }

  /**
   * Sets the value of the 'lastName' field.
   *
   * @param value the value to set.
   */
  public void setLastName(java.lang.CharSequence value) {
    this.lastName = value;
  }

  /**
   * Gets the value of the 'username' field.
   *
   * @return The value of the 'username' field.
   */
  public java.lang.CharSequence getUsername() {
    return username;
  }

  /**
   * Sets the value of the 'username' field.
   *
   * @param value the value to set.
   */
  public void setUsername(java.lang.CharSequence value) {
    this.username = value;
  }

  /**
   * Gets the value of the 'age' field.
   *
   * @return The value of the 'age' field.
   */
  public java.lang.Integer getAge() {
    return age;
  }

  /**
   * Sets the value of the 'age' field.
   *
   * @param value the value to set.
   */
  public void setAge(java.lang.Integer value) {
    this.age = value;
  }

  /**
   * Creates a new CustomerUpdatedEvent RecordBuilder.
   *
   * @return A new CustomerUpdatedEvent RecordBuilder
   */
  public static edu.hsh.favs.project.escqrs.events.customer.CustomerUpdatedEvent.Builder
      newBuilder() {
    return new edu.hsh.favs.project.escqrs.events.customer.CustomerUpdatedEvent.Builder();
  }

  /**
   * Creates a new CustomerUpdatedEvent RecordBuilder by copying an existing Builder.
   *
   * @param other The existing builder to copy.
   * @return A new CustomerUpdatedEvent RecordBuilder
   */
  public static edu.hsh.favs.project.escqrs.events.customer.CustomerUpdatedEvent.Builder newBuilder(
      edu.hsh.favs.project.escqrs.events.customer.CustomerUpdatedEvent.Builder other) {
    if (other == null) {
      return new edu.hsh.favs.project.escqrs.events.customer.CustomerUpdatedEvent.Builder();
    } else {
      return new edu.hsh.favs.project.escqrs.events.customer.CustomerUpdatedEvent.Builder(other);
    }
  }

  /**
   * Creates a new CustomerUpdatedEvent RecordBuilder by copying an existing CustomerUpdatedEvent
   * instance.
   *
   * @param other The existing instance to copy.
   * @return A new CustomerUpdatedEvent RecordBuilder
   */
  public static edu.hsh.favs.project.escqrs.events.customer.CustomerUpdatedEvent.Builder newBuilder(
      edu.hsh.favs.project.escqrs.events.customer.CustomerUpdatedEvent other) {
    if (other == null) {
      return new edu.hsh.favs.project.escqrs.events.customer.CustomerUpdatedEvent.Builder();
    } else {
      return new edu.hsh.favs.project.escqrs.events.customer.CustomerUpdatedEvent.Builder(other);
    }
  }

  /** RecordBuilder for CustomerUpdatedEvent instances. */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder
      extends org.apache.avro.specific.SpecificRecordBuilderBase<CustomerUpdatedEvent>
      implements org.apache.avro.data.RecordBuilder<CustomerUpdatedEvent> {

    private long id;
    private java.lang.CharSequence firstName;
    private java.lang.CharSequence lastName;
    private java.lang.CharSequence username;
    private java.lang.Integer age;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     *
     * @param other The existing Builder to copy.
     */
    private Builder(
        edu.hsh.favs.project.escqrs.events.customer.CustomerUpdatedEvent.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.firstName)) {
        this.firstName = data().deepCopy(fields()[1].schema(), other.firstName);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.lastName)) {
        this.lastName = data().deepCopy(fields()[2].schema(), other.lastName);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (isValidValue(fields()[3], other.username)) {
        this.username = data().deepCopy(fields()[3].schema(), other.username);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
      if (isValidValue(fields()[4], other.age)) {
        this.age = data().deepCopy(fields()[4].schema(), other.age);
        fieldSetFlags()[4] = other.fieldSetFlags()[4];
      }
    }

    /**
     * Creates a Builder by copying an existing CustomerUpdatedEvent instance
     *
     * @param other The existing instance to copy.
     */
    private Builder(edu.hsh.favs.project.escqrs.events.customer.CustomerUpdatedEvent other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.firstName)) {
        this.firstName = data().deepCopy(fields()[1].schema(), other.firstName);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.lastName)) {
        this.lastName = data().deepCopy(fields()[2].schema(), other.lastName);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.username)) {
        this.username = data().deepCopy(fields()[3].schema(), other.username);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.age)) {
        this.age = data().deepCopy(fields()[4].schema(), other.age);
        fieldSetFlags()[4] = true;
      }
    }

    /**
     * Gets the value of the 'id' field.
     *
     * @return The value.
     */
    public long getId() {
      return id;
    }

    /**
     * Sets the value of the 'id' field.
     *
     * @param value The value of 'id'.
     * @return This builder.
     */
    public edu.hsh.favs.project.escqrs.events.customer.CustomerUpdatedEvent.Builder setId(
        long value) {
      validate(fields()[0], value);
      this.id = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
     * Checks whether the 'id' field has been set.
     *
     * @return True if the 'id' field has been set, false otherwise.
     */
    public boolean hasId() {
      return fieldSetFlags()[0];
    }

    /**
     * Clears the value of the 'id' field.
     *
     * @return This builder.
     */
    public edu.hsh.favs.project.escqrs.events.customer.CustomerUpdatedEvent.Builder clearId() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
     * Gets the value of the 'firstName' field.
     *
     * @return The value.
     */
    public java.lang.CharSequence getFirstName() {
      return firstName;
    }

    /**
     * Sets the value of the 'firstName' field.
     *
     * @param value The value of 'firstName'.
     * @return This builder.
     */
    public edu.hsh.favs.project.escqrs.events.customer.CustomerUpdatedEvent.Builder setFirstName(
        java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.firstName = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
     * Checks whether the 'firstName' field has been set.
     *
     * @return True if the 'firstName' field has been set, false otherwise.
     */
    public boolean hasFirstName() {
      return fieldSetFlags()[1];
    }

    /**
     * Clears the value of the 'firstName' field.
     *
     * @return This builder.
     */
    public edu.hsh.favs.project.escqrs.events.customer.CustomerUpdatedEvent.Builder
        clearFirstName() {
      firstName = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
     * Gets the value of the 'lastName' field.
     *
     * @return The value.
     */
    public java.lang.CharSequence getLastName() {
      return lastName;
    }

    /**
     * Sets the value of the 'lastName' field.
     *
     * @param value The value of 'lastName'.
     * @return This builder.
     */
    public edu.hsh.favs.project.escqrs.events.customer.CustomerUpdatedEvent.Builder setLastName(
        java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.lastName = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
     * Checks whether the 'lastName' field has been set.
     *
     * @return True if the 'lastName' field has been set, false otherwise.
     */
    public boolean hasLastName() {
      return fieldSetFlags()[2];
    }

    /**
     * Clears the value of the 'lastName' field.
     *
     * @return This builder.
     */
    public edu.hsh.favs.project.escqrs.events.customer.CustomerUpdatedEvent.Builder
        clearLastName() {
      lastName = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
     * Gets the value of the 'username' field.
     *
     * @return The value.
     */
    public java.lang.CharSequence getUsername() {
      return username;
    }

    /**
     * Sets the value of the 'username' field.
     *
     * @param value The value of 'username'.
     * @return This builder.
     */
    public edu.hsh.favs.project.escqrs.events.customer.CustomerUpdatedEvent.Builder setUsername(
        java.lang.CharSequence value) {
      validate(fields()[3], value);
      this.username = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
     * Checks whether the 'username' field has been set.
     *
     * @return True if the 'username' field has been set, false otherwise.
     */
    public boolean hasUsername() {
      return fieldSetFlags()[3];
    }

    /**
     * Clears the value of the 'username' field.
     *
     * @return This builder.
     */
    public edu.hsh.favs.project.escqrs.events.customer.CustomerUpdatedEvent.Builder
        clearUsername() {
      username = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
     * Gets the value of the 'age' field.
     *
     * @return The value.
     */
    public java.lang.Integer getAge() {
      return age;
    }

    /**
     * Sets the value of the 'age' field.
     *
     * @param value The value of 'age'.
     * @return This builder.
     */
    public edu.hsh.favs.project.escqrs.events.customer.CustomerUpdatedEvent.Builder setAge(
        java.lang.Integer value) {
      validate(fields()[4], value);
      this.age = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
     * Checks whether the 'age' field has been set.
     *
     * @return True if the 'age' field has been set, false otherwise.
     */
    public boolean hasAge() {
      return fieldSetFlags()[4];
    }

    /**
     * Clears the value of the 'age' field.
     *
     * @return This builder.
     */
    public edu.hsh.favs.project.escqrs.events.customer.CustomerUpdatedEvent.Builder clearAge() {
      age = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public CustomerUpdatedEvent build() {
      try {
        CustomerUpdatedEvent record = new CustomerUpdatedEvent();
        record.id = fieldSetFlags()[0] ? this.id : (java.lang.Long) defaultValue(fields()[0]);
        record.firstName =
            fieldSetFlags()[1]
                ? this.firstName
                : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.lastName =
            fieldSetFlags()[2] ? this.lastName : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.username =
            fieldSetFlags()[3] ? this.username : (java.lang.CharSequence) defaultValue(fields()[3]);
        record.age = fieldSetFlags()[4] ? this.age : (java.lang.Integer) defaultValue(fields()[4]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<CustomerUpdatedEvent> WRITER$ =
      (org.apache.avro.io.DatumWriter<CustomerUpdatedEvent>) MODEL$.createDatumWriter(SCHEMA$);

  @Override
  public void writeExternal(java.io.ObjectOutput out) throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<CustomerUpdatedEvent> READER$ =
      (org.apache.avro.io.DatumReader<CustomerUpdatedEvent>) MODEL$.createDatumReader(SCHEMA$);

  @Override
  public void readExternal(java.io.ObjectInput in) throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override
  protected boolean hasCustomCoders() {
    return true;
  }

  @Override
  public void customEncode(org.apache.avro.io.Encoder out) throws java.io.IOException {
    out.writeLong(this.id);

    if (this.firstName == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeString(this.firstName);
    }

    if (this.lastName == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeString(this.lastName);
    }

    if (this.username == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeString(this.username);
    }

    if (this.age == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeInt(this.age);
    }
  }

  @Override
  public void customDecode(org.apache.avro.io.ResolvingDecoder in) throws java.io.IOException {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.id = in.readLong();

      if (in.readIndex() != 1) {
        in.readNull();
        this.firstName = null;
      } else {
        this.firstName =
            in.readString(this.firstName instanceof Utf8 ? (Utf8) this.firstName : null);
      }

      if (in.readIndex() != 1) {
        in.readNull();
        this.lastName = null;
      } else {
        this.lastName = in.readString(this.lastName instanceof Utf8 ? (Utf8) this.lastName : null);
      }

      if (in.readIndex() != 1) {
        in.readNull();
        this.username = null;
      } else {
        this.username = in.readString(this.username instanceof Utf8 ? (Utf8) this.username : null);
      }

      if (in.readIndex() != 1) {
        in.readNull();
        this.age = null;
      } else {
        this.age = in.readInt();
      }

    } else {
      for (int i = 0; i < 5; i++) {
        switch (fieldOrder[i].pos()) {
          case 0:
            this.id = in.readLong();
            break;

          case 1:
            if (in.readIndex() != 1) {
              in.readNull();
              this.firstName = null;
            } else {
              this.firstName =
                  in.readString(this.firstName instanceof Utf8 ? (Utf8) this.firstName : null);
            }
            break;

          case 2:
            if (in.readIndex() != 1) {
              in.readNull();
              this.lastName = null;
            } else {
              this.lastName =
                  in.readString(this.lastName instanceof Utf8 ? (Utf8) this.lastName : null);
            }
            break;

          case 3:
            if (in.readIndex() != 1) {
              in.readNull();
              this.username = null;
            } else {
              this.username =
                  in.readString(this.username instanceof Utf8 ? (Utf8) this.username : null);
            }
            break;

          case 4:
            if (in.readIndex() != 1) {
              in.readNull();
              this.age = null;
            } else {
              this.age = in.readInt();
            }
            break;

          default:
            throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}
