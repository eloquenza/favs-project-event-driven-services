/**
 * Autogenerated by Avro
 *
 * <p>DO NOT EDIT DIRECTLY
 */
package edu.hsh.favs.project.escqrs.events.order;

import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.SchemaStore;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;

@org.apache.avro.specific.AvroGenerated
public class OrderCreatedEvent extends org.apache.avro.specific.SpecificRecordBase
    implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -1645974530053124767L;
  public static final org.apache.avro.Schema SCHEMA$ =
      new org.apache.avro.Schema.Parser()
          .parse(
              "{\"type\":\"record\",\"name\":\"OrderCreatedEvent\",\"namespace\":\"edu.hsh.favs.project.escqrs.events.order\",\"fields\":[{\"name\":\"orderId\",\"type\":\"long\"},{\"name\":\"customerId\",\"type\":\"long\"},{\"name\":\"productId\",\"type\":\"long\"},{\"name\":\"state\",\"type\":\"string\"}]}");

  public static org.apache.avro.Schema getClassSchema() {
    return SCHEMA$;
  }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<OrderCreatedEvent> ENCODER =
      new BinaryMessageEncoder<OrderCreatedEvent>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<OrderCreatedEvent> DECODER =
      new BinaryMessageDecoder<OrderCreatedEvent>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   *
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<OrderCreatedEvent> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   *
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<OrderCreatedEvent> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link
   * SchemaStore}.
   *
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<OrderCreatedEvent> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<OrderCreatedEvent>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this OrderCreatedEvent to a ByteBuffer.
   *
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a OrderCreatedEvent from a ByteBuffer.
   *
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a OrderCreatedEvent instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of
   *     this class
   */
  public static OrderCreatedEvent fromByteBuffer(java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  private long orderId;
  private long customerId;
  private long productId;
  private java.lang.CharSequence state;

  /**
   * Default constructor. Note that this does not initialize fields to their default values from the
   * schema. If that is desired then one should use <code>newBuilder()</code>.
   */
  public OrderCreatedEvent() {}

  /**
   * All-args constructor.
   *
   * @param orderId The new value for orderId
   * @param customerId The new value for customerId
   * @param productId The new value for productId
   * @param state The new value for state
   */
  public OrderCreatedEvent(
      java.lang.Long orderId,
      java.lang.Long customerId,
      java.lang.Long productId,
      java.lang.CharSequence state) {
    this.orderId = orderId;
    this.customerId = customerId;
    this.productId = productId;
    this.state = state;
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
        return orderId;
      case 1:
        return customerId;
      case 2:
        return productId;
      case 3:
        return state;
      default:
        throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value = "unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
      case 0:
        orderId = (java.lang.Long) value$;
        break;
      case 1:
        customerId = (java.lang.Long) value$;
        break;
      case 2:
        productId = (java.lang.Long) value$;
        break;
      case 3:
        state = (java.lang.CharSequence) value$;
        break;
      default:
        throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'orderId' field.
   *
   * @return The value of the 'orderId' field.
   */
  public long getOrderId() {
    return orderId;
  }

  /**
   * Sets the value of the 'orderId' field.
   *
   * @param value the value to set.
   */
  public void setOrderId(long value) {
    this.orderId = value;
  }

  /**
   * Gets the value of the 'customerId' field.
   *
   * @return The value of the 'customerId' field.
   */
  public long getCustomerId() {
    return customerId;
  }

  /**
   * Sets the value of the 'customerId' field.
   *
   * @param value the value to set.
   */
  public void setCustomerId(long value) {
    this.customerId = value;
  }

  /**
   * Gets the value of the 'productId' field.
   *
   * @return The value of the 'productId' field.
   */
  public long getProductId() {
    return productId;
  }

  /**
   * Sets the value of the 'productId' field.
   *
   * @param value the value to set.
   */
  public void setProductId(long value) {
    this.productId = value;
  }

  /**
   * Gets the value of the 'state' field.
   *
   * @return The value of the 'state' field.
   */
  public java.lang.CharSequence getState() {
    return state;
  }

  /**
   * Sets the value of the 'state' field.
   *
   * @param value the value to set.
   */
  public void setState(java.lang.CharSequence value) {
    this.state = value;
  }

  /**
   * Creates a new OrderCreatedEvent RecordBuilder.
   *
   * @return A new OrderCreatedEvent RecordBuilder
   */
  public static edu.hsh.favs.project.escqrs.events.order.OrderCreatedEvent.Builder newBuilder() {
    return new edu.hsh.favs.project.escqrs.events.order.OrderCreatedEvent.Builder();
  }

  /**
   * Creates a new OrderCreatedEvent RecordBuilder by copying an existing Builder.
   *
   * @param other The existing builder to copy.
   * @return A new OrderCreatedEvent RecordBuilder
   */
  public static edu.hsh.favs.project.escqrs.events.order.OrderCreatedEvent.Builder newBuilder(
      edu.hsh.favs.project.escqrs.events.order.OrderCreatedEvent.Builder other) {
    if (other == null) {
      return new edu.hsh.favs.project.escqrs.events.order.OrderCreatedEvent.Builder();
    } else {
      return new edu.hsh.favs.project.escqrs.events.order.OrderCreatedEvent.Builder(other);
    }
  }

  /**
   * Creates a new OrderCreatedEvent RecordBuilder by copying an existing OrderCreatedEvent
   * instance.
   *
   * @param other The existing instance to copy.
   * @return A new OrderCreatedEvent RecordBuilder
   */
  public static edu.hsh.favs.project.escqrs.events.order.OrderCreatedEvent.Builder newBuilder(
      edu.hsh.favs.project.escqrs.events.order.OrderCreatedEvent other) {
    if (other == null) {
      return new edu.hsh.favs.project.escqrs.events.order.OrderCreatedEvent.Builder();
    } else {
      return new edu.hsh.favs.project.escqrs.events.order.OrderCreatedEvent.Builder(other);
    }
  }

  /** RecordBuilder for OrderCreatedEvent instances. */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder
      extends org.apache.avro.specific.SpecificRecordBuilderBase<OrderCreatedEvent>
      implements org.apache.avro.data.RecordBuilder<OrderCreatedEvent> {

    private long orderId;
    private long customerId;
    private long productId;
    private java.lang.CharSequence state;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     *
     * @param other The existing Builder to copy.
     */
    private Builder(edu.hsh.favs.project.escqrs.events.order.OrderCreatedEvent.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.orderId)) {
        this.orderId = data().deepCopy(fields()[0].schema(), other.orderId);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.customerId)) {
        this.customerId = data().deepCopy(fields()[1].schema(), other.customerId);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.productId)) {
        this.productId = data().deepCopy(fields()[2].schema(), other.productId);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (isValidValue(fields()[3], other.state)) {
        this.state = data().deepCopy(fields()[3].schema(), other.state);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
    }

    /**
     * Creates a Builder by copying an existing OrderCreatedEvent instance
     *
     * @param other The existing instance to copy.
     */
    private Builder(edu.hsh.favs.project.escqrs.events.order.OrderCreatedEvent other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.orderId)) {
        this.orderId = data().deepCopy(fields()[0].schema(), other.orderId);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.customerId)) {
        this.customerId = data().deepCopy(fields()[1].schema(), other.customerId);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.productId)) {
        this.productId = data().deepCopy(fields()[2].schema(), other.productId);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.state)) {
        this.state = data().deepCopy(fields()[3].schema(), other.state);
        fieldSetFlags()[3] = true;
      }
    }

    /**
     * Gets the value of the 'orderId' field.
     *
     * @return The value.
     */
    public long getOrderId() {
      return orderId;
    }

    /**
     * Sets the value of the 'orderId' field.
     *
     * @param value The value of 'orderId'.
     * @return This builder.
     */
    public edu.hsh.favs.project.escqrs.events.order.OrderCreatedEvent.Builder setOrderId(
        long value) {
      validate(fields()[0], value);
      this.orderId = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
     * Checks whether the 'orderId' field has been set.
     *
     * @return True if the 'orderId' field has been set, false otherwise.
     */
    public boolean hasOrderId() {
      return fieldSetFlags()[0];
    }

    /**
     * Clears the value of the 'orderId' field.
     *
     * @return This builder.
     */
    public edu.hsh.favs.project.escqrs.events.order.OrderCreatedEvent.Builder clearOrderId() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
     * Gets the value of the 'customerId' field.
     *
     * @return The value.
     */
    public long getCustomerId() {
      return customerId;
    }

    /**
     * Sets the value of the 'customerId' field.
     *
     * @param value The value of 'customerId'.
     * @return This builder.
     */
    public edu.hsh.favs.project.escqrs.events.order.OrderCreatedEvent.Builder setCustomerId(
        long value) {
      validate(fields()[1], value);
      this.customerId = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
     * Checks whether the 'customerId' field has been set.
     *
     * @return True if the 'customerId' field has been set, false otherwise.
     */
    public boolean hasCustomerId() {
      return fieldSetFlags()[1];
    }

    /**
     * Clears the value of the 'customerId' field.
     *
     * @return This builder.
     */
    public edu.hsh.favs.project.escqrs.events.order.OrderCreatedEvent.Builder clearCustomerId() {
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
     * Gets the value of the 'productId' field.
     *
     * @return The value.
     */
    public long getProductId() {
      return productId;
    }

    /**
     * Sets the value of the 'productId' field.
     *
     * @param value The value of 'productId'.
     * @return This builder.
     */
    public edu.hsh.favs.project.escqrs.events.order.OrderCreatedEvent.Builder setProductId(
        long value) {
      validate(fields()[2], value);
      this.productId = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
     * Checks whether the 'productId' field has been set.
     *
     * @return True if the 'productId' field has been set, false otherwise.
     */
    public boolean hasProductId() {
      return fieldSetFlags()[2];
    }

    /**
     * Clears the value of the 'productId' field.
     *
     * @return This builder.
     */
    public edu.hsh.favs.project.escqrs.events.order.OrderCreatedEvent.Builder clearProductId() {
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
     * Gets the value of the 'state' field.
     *
     * @return The value.
     */
    public java.lang.CharSequence getState() {
      return state;
    }

    /**
     * Sets the value of the 'state' field.
     *
     * @param value The value of 'state'.
     * @return This builder.
     */
    public edu.hsh.favs.project.escqrs.events.order.OrderCreatedEvent.Builder setState(
        java.lang.CharSequence value) {
      validate(fields()[3], value);
      this.state = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
     * Checks whether the 'state' field has been set.
     *
     * @return True if the 'state' field has been set, false otherwise.
     */
    public boolean hasState() {
      return fieldSetFlags()[3];
    }

    /**
     * Clears the value of the 'state' field.
     *
     * @return This builder.
     */
    public edu.hsh.favs.project.escqrs.events.order.OrderCreatedEvent.Builder clearState() {
      state = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public OrderCreatedEvent build() {
      try {
        OrderCreatedEvent record = new OrderCreatedEvent();
        record.orderId =
            fieldSetFlags()[0] ? this.orderId : (java.lang.Long) defaultValue(fields()[0]);
        record.customerId =
            fieldSetFlags()[1] ? this.customerId : (java.lang.Long) defaultValue(fields()[1]);
        record.productId =
            fieldSetFlags()[2] ? this.productId : (java.lang.Long) defaultValue(fields()[2]);
        record.state =
            fieldSetFlags()[3] ? this.state : (java.lang.CharSequence) defaultValue(fields()[3]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<OrderCreatedEvent> WRITER$ =
      (org.apache.avro.io.DatumWriter<OrderCreatedEvent>) MODEL$.createDatumWriter(SCHEMA$);

  @Override
  public void writeExternal(java.io.ObjectOutput out) throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<OrderCreatedEvent> READER$ =
      (org.apache.avro.io.DatumReader<OrderCreatedEvent>) MODEL$.createDatumReader(SCHEMA$);

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
    out.writeLong(this.orderId);

    out.writeLong(this.customerId);

    out.writeLong(this.productId);

    out.writeString(this.state);
  }

  @Override
  public void customDecode(org.apache.avro.io.ResolvingDecoder in) throws java.io.IOException {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.orderId = in.readLong();

      this.customerId = in.readLong();

      this.productId = in.readLong();

      this.state = in.readString(this.state instanceof Utf8 ? (Utf8) this.state : null);

    } else {
      for (int i = 0; i < 4; i++) {
        switch (fieldOrder[i].pos()) {
          case 0:
            this.orderId = in.readLong();
            break;

          case 1:
            this.customerId = in.readLong();
            break;

          case 2:
            this.productId = in.readLong();
            break;

          case 3:
            this.state = in.readString(this.state instanceof Utf8 ? (Utf8) this.state : null);
            break;

          default:
            throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}
