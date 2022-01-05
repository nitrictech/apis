// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/faas/v1/faas.proto

package io.nitric.proto.faas.v1;

/**
 * Protobuf type {@code nitric.faas.v1.ScheduleWorker}
 */
public final class ScheduleWorker extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:nitric.faas.v1.ScheduleWorker)
    ScheduleWorkerOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ScheduleWorker.newBuilder() to construct.
  private ScheduleWorker(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ScheduleWorker() {
    key_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ScheduleWorker();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ScheduleWorker(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            key_ = s;
            break;
          }
          case 82: {
            io.nitric.proto.faas.v1.ScheduleRate.Builder subBuilder = null;
            if (cadenceCase_ == 10) {
              subBuilder = ((io.nitric.proto.faas.v1.ScheduleRate) cadence_).toBuilder();
            }
            cadence_ =
                input.readMessage(io.nitric.proto.faas.v1.ScheduleRate.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom((io.nitric.proto.faas.v1.ScheduleRate) cadence_);
              cadence_ = subBuilder.buildPartial();
            }
            cadenceCase_ = 10;
            break;
          }
          case 90: {
            io.nitric.proto.faas.v1.ScheduleCron.Builder subBuilder = null;
            if (cadenceCase_ == 11) {
              subBuilder = ((io.nitric.proto.faas.v1.ScheduleCron) cadence_).toBuilder();
            }
            cadence_ =
                input.readMessage(io.nitric.proto.faas.v1.ScheduleCron.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom((io.nitric.proto.faas.v1.ScheduleCron) cadence_);
              cadence_ = subBuilder.buildPartial();
            }
            cadenceCase_ = 11;
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.nitric.proto.faas.v1.NitricFaas.internal_static_nitric_faas_v1_ScheduleWorker_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.nitric.proto.faas.v1.NitricFaas.internal_static_nitric_faas_v1_ScheduleWorker_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.nitric.proto.faas.v1.ScheduleWorker.class, io.nitric.proto.faas.v1.ScheduleWorker.Builder.class);
  }

  private int cadenceCase_ = 0;
  private java.lang.Object cadence_;
  public enum CadenceCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    RATE(10),
    CRON(11),
    CADENCE_NOT_SET(0);
    private final int value;
    private CadenceCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static CadenceCase valueOf(int value) {
      return forNumber(value);
    }

    public static CadenceCase forNumber(int value) {
      switch (value) {
        case 10: return RATE;
        case 11: return CRON;
        case 0: return CADENCE_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public CadenceCase
  getCadenceCase() {
    return CadenceCase.forNumber(
        cadenceCase_);
  }

  public static final int KEY_FIELD_NUMBER = 1;
  private volatile java.lang.Object key_;
  /**
   * <code>string key = 1;</code>
   * @return The key.
   */
  @java.lang.Override
  public java.lang.String getKey() {
    java.lang.Object ref = key_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      key_ = s;
      return s;
    }
  }
  /**
   * <code>string key = 1;</code>
   * @return The bytes for key.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getKeyBytes() {
    java.lang.Object ref = key_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      key_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int RATE_FIELD_NUMBER = 10;
  /**
   * <code>.nitric.faas.v1.ScheduleRate rate = 10;</code>
   * @return Whether the rate field is set.
   */
  @java.lang.Override
  public boolean hasRate() {
    return cadenceCase_ == 10;
  }
  /**
   * <code>.nitric.faas.v1.ScheduleRate rate = 10;</code>
   * @return The rate.
   */
  @java.lang.Override
  public io.nitric.proto.faas.v1.ScheduleRate getRate() {
    if (cadenceCase_ == 10) {
       return (io.nitric.proto.faas.v1.ScheduleRate) cadence_;
    }
    return io.nitric.proto.faas.v1.ScheduleRate.getDefaultInstance();
  }
  /**
   * <code>.nitric.faas.v1.ScheduleRate rate = 10;</code>
   */
  @java.lang.Override
  public io.nitric.proto.faas.v1.ScheduleRateOrBuilder getRateOrBuilder() {
    if (cadenceCase_ == 10) {
       return (io.nitric.proto.faas.v1.ScheduleRate) cadence_;
    }
    return io.nitric.proto.faas.v1.ScheduleRate.getDefaultInstance();
  }

  public static final int CRON_FIELD_NUMBER = 11;
  /**
   * <code>.nitric.faas.v1.ScheduleCron cron = 11;</code>
   * @return Whether the cron field is set.
   */
  @java.lang.Override
  public boolean hasCron() {
    return cadenceCase_ == 11;
  }
  /**
   * <code>.nitric.faas.v1.ScheduleCron cron = 11;</code>
   * @return The cron.
   */
  @java.lang.Override
  public io.nitric.proto.faas.v1.ScheduleCron getCron() {
    if (cadenceCase_ == 11) {
       return (io.nitric.proto.faas.v1.ScheduleCron) cadence_;
    }
    return io.nitric.proto.faas.v1.ScheduleCron.getDefaultInstance();
  }
  /**
   * <code>.nitric.faas.v1.ScheduleCron cron = 11;</code>
   */
  @java.lang.Override
  public io.nitric.proto.faas.v1.ScheduleCronOrBuilder getCronOrBuilder() {
    if (cadenceCase_ == 11) {
       return (io.nitric.proto.faas.v1.ScheduleCron) cadence_;
    }
    return io.nitric.proto.faas.v1.ScheduleCron.getDefaultInstance();
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getKeyBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, key_);
    }
    if (cadenceCase_ == 10) {
      output.writeMessage(10, (io.nitric.proto.faas.v1.ScheduleRate) cadence_);
    }
    if (cadenceCase_ == 11) {
      output.writeMessage(11, (io.nitric.proto.faas.v1.ScheduleCron) cadence_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getKeyBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, key_);
    }
    if (cadenceCase_ == 10) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(10, (io.nitric.proto.faas.v1.ScheduleRate) cadence_);
    }
    if (cadenceCase_ == 11) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(11, (io.nitric.proto.faas.v1.ScheduleCron) cadence_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof io.nitric.proto.faas.v1.ScheduleWorker)) {
      return super.equals(obj);
    }
    io.nitric.proto.faas.v1.ScheduleWorker other = (io.nitric.proto.faas.v1.ScheduleWorker) obj;

    if (!getKey()
        .equals(other.getKey())) return false;
    if (!getCadenceCase().equals(other.getCadenceCase())) return false;
    switch (cadenceCase_) {
      case 10:
        if (!getRate()
            .equals(other.getRate())) return false;
        break;
      case 11:
        if (!getCron()
            .equals(other.getCron())) return false;
        break;
      case 0:
      default:
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + KEY_FIELD_NUMBER;
    hash = (53 * hash) + getKey().hashCode();
    switch (cadenceCase_) {
      case 10:
        hash = (37 * hash) + RATE_FIELD_NUMBER;
        hash = (53 * hash) + getRate().hashCode();
        break;
      case 11:
        hash = (37 * hash) + CRON_FIELD_NUMBER;
        hash = (53 * hash) + getCron().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.nitric.proto.faas.v1.ScheduleWorker parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.nitric.proto.faas.v1.ScheduleWorker parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.nitric.proto.faas.v1.ScheduleWorker parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.nitric.proto.faas.v1.ScheduleWorker parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.nitric.proto.faas.v1.ScheduleWorker parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.nitric.proto.faas.v1.ScheduleWorker parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.nitric.proto.faas.v1.ScheduleWorker parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.nitric.proto.faas.v1.ScheduleWorker parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.nitric.proto.faas.v1.ScheduleWorker parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.nitric.proto.faas.v1.ScheduleWorker parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.nitric.proto.faas.v1.ScheduleWorker parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.nitric.proto.faas.v1.ScheduleWorker parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(io.nitric.proto.faas.v1.ScheduleWorker prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code nitric.faas.v1.ScheduleWorker}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:nitric.faas.v1.ScheduleWorker)
      io.nitric.proto.faas.v1.ScheduleWorkerOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.nitric.proto.faas.v1.NitricFaas.internal_static_nitric_faas_v1_ScheduleWorker_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.nitric.proto.faas.v1.NitricFaas.internal_static_nitric_faas_v1_ScheduleWorker_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.nitric.proto.faas.v1.ScheduleWorker.class, io.nitric.proto.faas.v1.ScheduleWorker.Builder.class);
    }

    // Construct using io.nitric.proto.faas.v1.ScheduleWorker.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      key_ = "";

      cadenceCase_ = 0;
      cadence_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.nitric.proto.faas.v1.NitricFaas.internal_static_nitric_faas_v1_ScheduleWorker_descriptor;
    }

    @java.lang.Override
    public io.nitric.proto.faas.v1.ScheduleWorker getDefaultInstanceForType() {
      return io.nitric.proto.faas.v1.ScheduleWorker.getDefaultInstance();
    }

    @java.lang.Override
    public io.nitric.proto.faas.v1.ScheduleWorker build() {
      io.nitric.proto.faas.v1.ScheduleWorker result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.nitric.proto.faas.v1.ScheduleWorker buildPartial() {
      io.nitric.proto.faas.v1.ScheduleWorker result = new io.nitric.proto.faas.v1.ScheduleWorker(this);
      result.key_ = key_;
      if (cadenceCase_ == 10) {
        if (rateBuilder_ == null) {
          result.cadence_ = cadence_;
        } else {
          result.cadence_ = rateBuilder_.build();
        }
      }
      if (cadenceCase_ == 11) {
        if (cronBuilder_ == null) {
          result.cadence_ = cadence_;
        } else {
          result.cadence_ = cronBuilder_.build();
        }
      }
      result.cadenceCase_ = cadenceCase_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof io.nitric.proto.faas.v1.ScheduleWorker) {
        return mergeFrom((io.nitric.proto.faas.v1.ScheduleWorker)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.nitric.proto.faas.v1.ScheduleWorker other) {
      if (other == io.nitric.proto.faas.v1.ScheduleWorker.getDefaultInstance()) return this;
      if (!other.getKey().isEmpty()) {
        key_ = other.key_;
        onChanged();
      }
      switch (other.getCadenceCase()) {
        case RATE: {
          mergeRate(other.getRate());
          break;
        }
        case CRON: {
          mergeCron(other.getCron());
          break;
        }
        case CADENCE_NOT_SET: {
          break;
        }
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      io.nitric.proto.faas.v1.ScheduleWorker parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.nitric.proto.faas.v1.ScheduleWorker) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int cadenceCase_ = 0;
    private java.lang.Object cadence_;
    public CadenceCase
        getCadenceCase() {
      return CadenceCase.forNumber(
          cadenceCase_);
    }

    public Builder clearCadence() {
      cadenceCase_ = 0;
      cadence_ = null;
      onChanged();
      return this;
    }


    private java.lang.Object key_ = "";
    /**
     * <code>string key = 1;</code>
     * @return The key.
     */
    public java.lang.String getKey() {
      java.lang.Object ref = key_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        key_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string key = 1;</code>
     * @return The bytes for key.
     */
    public com.google.protobuf.ByteString
        getKeyBytes() {
      java.lang.Object ref = key_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        key_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string key = 1;</code>
     * @param value The key to set.
     * @return This builder for chaining.
     */
    public Builder setKey(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      key_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string key = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearKey() {
      
      key_ = getDefaultInstance().getKey();
      onChanged();
      return this;
    }
    /**
     * <code>string key = 1;</code>
     * @param value The bytes for key to set.
     * @return This builder for chaining.
     */
    public Builder setKeyBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      key_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
        io.nitric.proto.faas.v1.ScheduleRate, io.nitric.proto.faas.v1.ScheduleRate.Builder, io.nitric.proto.faas.v1.ScheduleRateOrBuilder> rateBuilder_;
    /**
     * <code>.nitric.faas.v1.ScheduleRate rate = 10;</code>
     * @return Whether the rate field is set.
     */
    @java.lang.Override
    public boolean hasRate() {
      return cadenceCase_ == 10;
    }
    /**
     * <code>.nitric.faas.v1.ScheduleRate rate = 10;</code>
     * @return The rate.
     */
    @java.lang.Override
    public io.nitric.proto.faas.v1.ScheduleRate getRate() {
      if (rateBuilder_ == null) {
        if (cadenceCase_ == 10) {
          return (io.nitric.proto.faas.v1.ScheduleRate) cadence_;
        }
        return io.nitric.proto.faas.v1.ScheduleRate.getDefaultInstance();
      } else {
        if (cadenceCase_ == 10) {
          return rateBuilder_.getMessage();
        }
        return io.nitric.proto.faas.v1.ScheduleRate.getDefaultInstance();
      }
    }
    /**
     * <code>.nitric.faas.v1.ScheduleRate rate = 10;</code>
     */
    public Builder setRate(io.nitric.proto.faas.v1.ScheduleRate value) {
      if (rateBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        cadence_ = value;
        onChanged();
      } else {
        rateBuilder_.setMessage(value);
      }
      cadenceCase_ = 10;
      return this;
    }
    /**
     * <code>.nitric.faas.v1.ScheduleRate rate = 10;</code>
     */
    public Builder setRate(
        io.nitric.proto.faas.v1.ScheduleRate.Builder builderForValue) {
      if (rateBuilder_ == null) {
        cadence_ = builderForValue.build();
        onChanged();
      } else {
        rateBuilder_.setMessage(builderForValue.build());
      }
      cadenceCase_ = 10;
      return this;
    }
    /**
     * <code>.nitric.faas.v1.ScheduleRate rate = 10;</code>
     */
    public Builder mergeRate(io.nitric.proto.faas.v1.ScheduleRate value) {
      if (rateBuilder_ == null) {
        if (cadenceCase_ == 10 &&
            cadence_ != io.nitric.proto.faas.v1.ScheduleRate.getDefaultInstance()) {
          cadence_ = io.nitric.proto.faas.v1.ScheduleRate.newBuilder((io.nitric.proto.faas.v1.ScheduleRate) cadence_)
              .mergeFrom(value).buildPartial();
        } else {
          cadence_ = value;
        }
        onChanged();
      } else {
        if (cadenceCase_ == 10) {
          rateBuilder_.mergeFrom(value);
        }
        rateBuilder_.setMessage(value);
      }
      cadenceCase_ = 10;
      return this;
    }
    /**
     * <code>.nitric.faas.v1.ScheduleRate rate = 10;</code>
     */
    public Builder clearRate() {
      if (rateBuilder_ == null) {
        if (cadenceCase_ == 10) {
          cadenceCase_ = 0;
          cadence_ = null;
          onChanged();
        }
      } else {
        if (cadenceCase_ == 10) {
          cadenceCase_ = 0;
          cadence_ = null;
        }
        rateBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>.nitric.faas.v1.ScheduleRate rate = 10;</code>
     */
    public io.nitric.proto.faas.v1.ScheduleRate.Builder getRateBuilder() {
      return getRateFieldBuilder().getBuilder();
    }
    /**
     * <code>.nitric.faas.v1.ScheduleRate rate = 10;</code>
     */
    @java.lang.Override
    public io.nitric.proto.faas.v1.ScheduleRateOrBuilder getRateOrBuilder() {
      if ((cadenceCase_ == 10) && (rateBuilder_ != null)) {
        return rateBuilder_.getMessageOrBuilder();
      } else {
        if (cadenceCase_ == 10) {
          return (io.nitric.proto.faas.v1.ScheduleRate) cadence_;
        }
        return io.nitric.proto.faas.v1.ScheduleRate.getDefaultInstance();
      }
    }
    /**
     * <code>.nitric.faas.v1.ScheduleRate rate = 10;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.nitric.proto.faas.v1.ScheduleRate, io.nitric.proto.faas.v1.ScheduleRate.Builder, io.nitric.proto.faas.v1.ScheduleRateOrBuilder> 
        getRateFieldBuilder() {
      if (rateBuilder_ == null) {
        if (!(cadenceCase_ == 10)) {
          cadence_ = io.nitric.proto.faas.v1.ScheduleRate.getDefaultInstance();
        }
        rateBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.nitric.proto.faas.v1.ScheduleRate, io.nitric.proto.faas.v1.ScheduleRate.Builder, io.nitric.proto.faas.v1.ScheduleRateOrBuilder>(
                (io.nitric.proto.faas.v1.ScheduleRate) cadence_,
                getParentForChildren(),
                isClean());
        cadence_ = null;
      }
      cadenceCase_ = 10;
      onChanged();;
      return rateBuilder_;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
        io.nitric.proto.faas.v1.ScheduleCron, io.nitric.proto.faas.v1.ScheduleCron.Builder, io.nitric.proto.faas.v1.ScheduleCronOrBuilder> cronBuilder_;
    /**
     * <code>.nitric.faas.v1.ScheduleCron cron = 11;</code>
     * @return Whether the cron field is set.
     */
    @java.lang.Override
    public boolean hasCron() {
      return cadenceCase_ == 11;
    }
    /**
     * <code>.nitric.faas.v1.ScheduleCron cron = 11;</code>
     * @return The cron.
     */
    @java.lang.Override
    public io.nitric.proto.faas.v1.ScheduleCron getCron() {
      if (cronBuilder_ == null) {
        if (cadenceCase_ == 11) {
          return (io.nitric.proto.faas.v1.ScheduleCron) cadence_;
        }
        return io.nitric.proto.faas.v1.ScheduleCron.getDefaultInstance();
      } else {
        if (cadenceCase_ == 11) {
          return cronBuilder_.getMessage();
        }
        return io.nitric.proto.faas.v1.ScheduleCron.getDefaultInstance();
      }
    }
    /**
     * <code>.nitric.faas.v1.ScheduleCron cron = 11;</code>
     */
    public Builder setCron(io.nitric.proto.faas.v1.ScheduleCron value) {
      if (cronBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        cadence_ = value;
        onChanged();
      } else {
        cronBuilder_.setMessage(value);
      }
      cadenceCase_ = 11;
      return this;
    }
    /**
     * <code>.nitric.faas.v1.ScheduleCron cron = 11;</code>
     */
    public Builder setCron(
        io.nitric.proto.faas.v1.ScheduleCron.Builder builderForValue) {
      if (cronBuilder_ == null) {
        cadence_ = builderForValue.build();
        onChanged();
      } else {
        cronBuilder_.setMessage(builderForValue.build());
      }
      cadenceCase_ = 11;
      return this;
    }
    /**
     * <code>.nitric.faas.v1.ScheduleCron cron = 11;</code>
     */
    public Builder mergeCron(io.nitric.proto.faas.v1.ScheduleCron value) {
      if (cronBuilder_ == null) {
        if (cadenceCase_ == 11 &&
            cadence_ != io.nitric.proto.faas.v1.ScheduleCron.getDefaultInstance()) {
          cadence_ = io.nitric.proto.faas.v1.ScheduleCron.newBuilder((io.nitric.proto.faas.v1.ScheduleCron) cadence_)
              .mergeFrom(value).buildPartial();
        } else {
          cadence_ = value;
        }
        onChanged();
      } else {
        if (cadenceCase_ == 11) {
          cronBuilder_.mergeFrom(value);
        }
        cronBuilder_.setMessage(value);
      }
      cadenceCase_ = 11;
      return this;
    }
    /**
     * <code>.nitric.faas.v1.ScheduleCron cron = 11;</code>
     */
    public Builder clearCron() {
      if (cronBuilder_ == null) {
        if (cadenceCase_ == 11) {
          cadenceCase_ = 0;
          cadence_ = null;
          onChanged();
        }
      } else {
        if (cadenceCase_ == 11) {
          cadenceCase_ = 0;
          cadence_ = null;
        }
        cronBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>.nitric.faas.v1.ScheduleCron cron = 11;</code>
     */
    public io.nitric.proto.faas.v1.ScheduleCron.Builder getCronBuilder() {
      return getCronFieldBuilder().getBuilder();
    }
    /**
     * <code>.nitric.faas.v1.ScheduleCron cron = 11;</code>
     */
    @java.lang.Override
    public io.nitric.proto.faas.v1.ScheduleCronOrBuilder getCronOrBuilder() {
      if ((cadenceCase_ == 11) && (cronBuilder_ != null)) {
        return cronBuilder_.getMessageOrBuilder();
      } else {
        if (cadenceCase_ == 11) {
          return (io.nitric.proto.faas.v1.ScheduleCron) cadence_;
        }
        return io.nitric.proto.faas.v1.ScheduleCron.getDefaultInstance();
      }
    }
    /**
     * <code>.nitric.faas.v1.ScheduleCron cron = 11;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.nitric.proto.faas.v1.ScheduleCron, io.nitric.proto.faas.v1.ScheduleCron.Builder, io.nitric.proto.faas.v1.ScheduleCronOrBuilder> 
        getCronFieldBuilder() {
      if (cronBuilder_ == null) {
        if (!(cadenceCase_ == 11)) {
          cadence_ = io.nitric.proto.faas.v1.ScheduleCron.getDefaultInstance();
        }
        cronBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.nitric.proto.faas.v1.ScheduleCron, io.nitric.proto.faas.v1.ScheduleCron.Builder, io.nitric.proto.faas.v1.ScheduleCronOrBuilder>(
                (io.nitric.proto.faas.v1.ScheduleCron) cadence_,
                getParentForChildren(),
                isClean());
        cadence_ = null;
      }
      cadenceCase_ = 11;
      onChanged();;
      return cronBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:nitric.faas.v1.ScheduleWorker)
  }

  // @@protoc_insertion_point(class_scope:nitric.faas.v1.ScheduleWorker)
  private static final io.nitric.proto.faas.v1.ScheduleWorker DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.nitric.proto.faas.v1.ScheduleWorker();
  }

  public static io.nitric.proto.faas.v1.ScheduleWorker getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ScheduleWorker>
      PARSER = new com.google.protobuf.AbstractParser<ScheduleWorker>() {
    @java.lang.Override
    public ScheduleWorker parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ScheduleWorker(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ScheduleWorker> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ScheduleWorker> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.nitric.proto.faas.v1.ScheduleWorker getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
