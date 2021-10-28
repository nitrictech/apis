// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/faas/v1/faas.proto

package io.nitric.proto.faas.v1;

/**
 * <pre>
 * The worker has successfully processed a trigger
 * </pre>
 *
 * Protobuf type {@code nitric.faas.v1.TriggerResponse}
 */
public final class TriggerResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:nitric.faas.v1.TriggerResponse)
    TriggerResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TriggerResponse.newBuilder() to construct.
  private TriggerResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TriggerResponse() {
    data_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new TriggerResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private TriggerResponse(
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

            data_ = input.readBytes();
            break;
          }
          case 82: {
            io.nitric.proto.faas.v1.HttpResponseContext.Builder subBuilder = null;
            if (contextCase_ == 10) {
              subBuilder = ((io.nitric.proto.faas.v1.HttpResponseContext) context_).toBuilder();
            }
            context_ =
                input.readMessage(io.nitric.proto.faas.v1.HttpResponseContext.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom((io.nitric.proto.faas.v1.HttpResponseContext) context_);
              context_ = subBuilder.buildPartial();
            }
            contextCase_ = 10;
            break;
          }
          case 90: {
            io.nitric.proto.faas.v1.TopicResponseContext.Builder subBuilder = null;
            if (contextCase_ == 11) {
              subBuilder = ((io.nitric.proto.faas.v1.TopicResponseContext) context_).toBuilder();
            }
            context_ =
                input.readMessage(io.nitric.proto.faas.v1.TopicResponseContext.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom((io.nitric.proto.faas.v1.TopicResponseContext) context_);
              context_ = subBuilder.buildPartial();
            }
            contextCase_ = 11;
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
    return io.nitric.proto.faas.v1.NitricFaas.internal_static_nitric_faas_v1_TriggerResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.nitric.proto.faas.v1.NitricFaas.internal_static_nitric_faas_v1_TriggerResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.nitric.proto.faas.v1.TriggerResponse.class, io.nitric.proto.faas.v1.TriggerResponse.Builder.class);
  }

  private int contextCase_ = 0;
  private java.lang.Object context_;
  public enum ContextCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    HTTP(10),
    TOPIC(11),
    CONTEXT_NOT_SET(0);
    private final int value;
    private ContextCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static ContextCase valueOf(int value) {
      return forNumber(value);
    }

    public static ContextCase forNumber(int value) {
      switch (value) {
        case 10: return HTTP;
        case 11: return TOPIC;
        case 0: return CONTEXT_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public ContextCase
  getContextCase() {
    return ContextCase.forNumber(
        contextCase_);
  }

  public static final int DATA_FIELD_NUMBER = 1;
  private com.google.protobuf.ByteString data_;
  /**
   * <pre>
   * The data returned in the response
   * </pre>
   *
   * <code>bytes data = 1;</code>
   * @return The data.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getData() {
    return data_;
  }

  public static final int HTTP_FIELD_NUMBER = 10;
  /**
   * <pre>
   * response to a http request
   * </pre>
   *
   * <code>.nitric.faas.v1.HttpResponseContext http = 10;</code>
   * @return Whether the http field is set.
   */
  @java.lang.Override
  public boolean hasHttp() {
    return contextCase_ == 10;
  }
  /**
   * <pre>
   * response to a http request
   * </pre>
   *
   * <code>.nitric.faas.v1.HttpResponseContext http = 10;</code>
   * @return The http.
   */
  @java.lang.Override
  public io.nitric.proto.faas.v1.HttpResponseContext getHttp() {
    if (contextCase_ == 10) {
       return (io.nitric.proto.faas.v1.HttpResponseContext) context_;
    }
    return io.nitric.proto.faas.v1.HttpResponseContext.getDefaultInstance();
  }
  /**
   * <pre>
   * response to a http request
   * </pre>
   *
   * <code>.nitric.faas.v1.HttpResponseContext http = 10;</code>
   */
  @java.lang.Override
  public io.nitric.proto.faas.v1.HttpResponseContextOrBuilder getHttpOrBuilder() {
    if (contextCase_ == 10) {
       return (io.nitric.proto.faas.v1.HttpResponseContext) context_;
    }
    return io.nitric.proto.faas.v1.HttpResponseContext.getDefaultInstance();
  }

  public static final int TOPIC_FIELD_NUMBER = 11;
  /**
   * <pre>
   * response to a topic trigger
   * </pre>
   *
   * <code>.nitric.faas.v1.TopicResponseContext topic = 11;</code>
   * @return Whether the topic field is set.
   */
  @java.lang.Override
  public boolean hasTopic() {
    return contextCase_ == 11;
  }
  /**
   * <pre>
   * response to a topic trigger
   * </pre>
   *
   * <code>.nitric.faas.v1.TopicResponseContext topic = 11;</code>
   * @return The topic.
   */
  @java.lang.Override
  public io.nitric.proto.faas.v1.TopicResponseContext getTopic() {
    if (contextCase_ == 11) {
       return (io.nitric.proto.faas.v1.TopicResponseContext) context_;
    }
    return io.nitric.proto.faas.v1.TopicResponseContext.getDefaultInstance();
  }
  /**
   * <pre>
   * response to a topic trigger
   * </pre>
   *
   * <code>.nitric.faas.v1.TopicResponseContext topic = 11;</code>
   */
  @java.lang.Override
  public io.nitric.proto.faas.v1.TopicResponseContextOrBuilder getTopicOrBuilder() {
    if (contextCase_ == 11) {
       return (io.nitric.proto.faas.v1.TopicResponseContext) context_;
    }
    return io.nitric.proto.faas.v1.TopicResponseContext.getDefaultInstance();
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
    if (!data_.isEmpty()) {
      output.writeBytes(1, data_);
    }
    if (contextCase_ == 10) {
      output.writeMessage(10, (io.nitric.proto.faas.v1.HttpResponseContext) context_);
    }
    if (contextCase_ == 11) {
      output.writeMessage(11, (io.nitric.proto.faas.v1.TopicResponseContext) context_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!data_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(1, data_);
    }
    if (contextCase_ == 10) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(10, (io.nitric.proto.faas.v1.HttpResponseContext) context_);
    }
    if (contextCase_ == 11) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(11, (io.nitric.proto.faas.v1.TopicResponseContext) context_);
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
    if (!(obj instanceof io.nitric.proto.faas.v1.TriggerResponse)) {
      return super.equals(obj);
    }
    io.nitric.proto.faas.v1.TriggerResponse other = (io.nitric.proto.faas.v1.TriggerResponse) obj;

    if (!getData()
        .equals(other.getData())) return false;
    if (!getContextCase().equals(other.getContextCase())) return false;
    switch (contextCase_) {
      case 10:
        if (!getHttp()
            .equals(other.getHttp())) return false;
        break;
      case 11:
        if (!getTopic()
            .equals(other.getTopic())) return false;
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
    hash = (37 * hash) + DATA_FIELD_NUMBER;
    hash = (53 * hash) + getData().hashCode();
    switch (contextCase_) {
      case 10:
        hash = (37 * hash) + HTTP_FIELD_NUMBER;
        hash = (53 * hash) + getHttp().hashCode();
        break;
      case 11:
        hash = (37 * hash) + TOPIC_FIELD_NUMBER;
        hash = (53 * hash) + getTopic().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.nitric.proto.faas.v1.TriggerResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.nitric.proto.faas.v1.TriggerResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.nitric.proto.faas.v1.TriggerResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.nitric.proto.faas.v1.TriggerResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.nitric.proto.faas.v1.TriggerResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.nitric.proto.faas.v1.TriggerResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.nitric.proto.faas.v1.TriggerResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.nitric.proto.faas.v1.TriggerResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.nitric.proto.faas.v1.TriggerResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.nitric.proto.faas.v1.TriggerResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.nitric.proto.faas.v1.TriggerResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.nitric.proto.faas.v1.TriggerResponse parseFrom(
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
  public static Builder newBuilder(io.nitric.proto.faas.v1.TriggerResponse prototype) {
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
   * <pre>
   * The worker has successfully processed a trigger
   * </pre>
   *
   * Protobuf type {@code nitric.faas.v1.TriggerResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:nitric.faas.v1.TriggerResponse)
      io.nitric.proto.faas.v1.TriggerResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.nitric.proto.faas.v1.NitricFaas.internal_static_nitric_faas_v1_TriggerResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.nitric.proto.faas.v1.NitricFaas.internal_static_nitric_faas_v1_TriggerResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.nitric.proto.faas.v1.TriggerResponse.class, io.nitric.proto.faas.v1.TriggerResponse.Builder.class);
    }

    // Construct using io.nitric.proto.faas.v1.TriggerResponse.newBuilder()
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
      data_ = com.google.protobuf.ByteString.EMPTY;

      contextCase_ = 0;
      context_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.nitric.proto.faas.v1.NitricFaas.internal_static_nitric_faas_v1_TriggerResponse_descriptor;
    }

    @java.lang.Override
    public io.nitric.proto.faas.v1.TriggerResponse getDefaultInstanceForType() {
      return io.nitric.proto.faas.v1.TriggerResponse.getDefaultInstance();
    }

    @java.lang.Override
    public io.nitric.proto.faas.v1.TriggerResponse build() {
      io.nitric.proto.faas.v1.TriggerResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.nitric.proto.faas.v1.TriggerResponse buildPartial() {
      io.nitric.proto.faas.v1.TriggerResponse result = new io.nitric.proto.faas.v1.TriggerResponse(this);
      result.data_ = data_;
      if (contextCase_ == 10) {
        if (httpBuilder_ == null) {
          result.context_ = context_;
        } else {
          result.context_ = httpBuilder_.build();
        }
      }
      if (contextCase_ == 11) {
        if (topicBuilder_ == null) {
          result.context_ = context_;
        } else {
          result.context_ = topicBuilder_.build();
        }
      }
      result.contextCase_ = contextCase_;
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
      if (other instanceof io.nitric.proto.faas.v1.TriggerResponse) {
        return mergeFrom((io.nitric.proto.faas.v1.TriggerResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.nitric.proto.faas.v1.TriggerResponse other) {
      if (other == io.nitric.proto.faas.v1.TriggerResponse.getDefaultInstance()) return this;
      if (other.getData() != com.google.protobuf.ByteString.EMPTY) {
        setData(other.getData());
      }
      switch (other.getContextCase()) {
        case HTTP: {
          mergeHttp(other.getHttp());
          break;
        }
        case TOPIC: {
          mergeTopic(other.getTopic());
          break;
        }
        case CONTEXT_NOT_SET: {
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
      io.nitric.proto.faas.v1.TriggerResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.nitric.proto.faas.v1.TriggerResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int contextCase_ = 0;
    private java.lang.Object context_;
    public ContextCase
        getContextCase() {
      return ContextCase.forNumber(
          contextCase_);
    }

    public Builder clearContext() {
      contextCase_ = 0;
      context_ = null;
      onChanged();
      return this;
    }


    private com.google.protobuf.ByteString data_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <pre>
     * The data returned in the response
     * </pre>
     *
     * <code>bytes data = 1;</code>
     * @return The data.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getData() {
      return data_;
    }
    /**
     * <pre>
     * The data returned in the response
     * </pre>
     *
     * <code>bytes data = 1;</code>
     * @param value The data to set.
     * @return This builder for chaining.
     */
    public Builder setData(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      data_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The data returned in the response
     * </pre>
     *
     * <code>bytes data = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearData() {
      
      data_ = getDefaultInstance().getData();
      onChanged();
      return this;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
        io.nitric.proto.faas.v1.HttpResponseContext, io.nitric.proto.faas.v1.HttpResponseContext.Builder, io.nitric.proto.faas.v1.HttpResponseContextOrBuilder> httpBuilder_;
    /**
     * <pre>
     * response to a http request
     * </pre>
     *
     * <code>.nitric.faas.v1.HttpResponseContext http = 10;</code>
     * @return Whether the http field is set.
     */
    @java.lang.Override
    public boolean hasHttp() {
      return contextCase_ == 10;
    }
    /**
     * <pre>
     * response to a http request
     * </pre>
     *
     * <code>.nitric.faas.v1.HttpResponseContext http = 10;</code>
     * @return The http.
     */
    @java.lang.Override
    public io.nitric.proto.faas.v1.HttpResponseContext getHttp() {
      if (httpBuilder_ == null) {
        if (contextCase_ == 10) {
          return (io.nitric.proto.faas.v1.HttpResponseContext) context_;
        }
        return io.nitric.proto.faas.v1.HttpResponseContext.getDefaultInstance();
      } else {
        if (contextCase_ == 10) {
          return httpBuilder_.getMessage();
        }
        return io.nitric.proto.faas.v1.HttpResponseContext.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * response to a http request
     * </pre>
     *
     * <code>.nitric.faas.v1.HttpResponseContext http = 10;</code>
     */
    public Builder setHttp(io.nitric.proto.faas.v1.HttpResponseContext value) {
      if (httpBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        context_ = value;
        onChanged();
      } else {
        httpBuilder_.setMessage(value);
      }
      contextCase_ = 10;
      return this;
    }
    /**
     * <pre>
     * response to a http request
     * </pre>
     *
     * <code>.nitric.faas.v1.HttpResponseContext http = 10;</code>
     */
    public Builder setHttp(
        io.nitric.proto.faas.v1.HttpResponseContext.Builder builderForValue) {
      if (httpBuilder_ == null) {
        context_ = builderForValue.build();
        onChanged();
      } else {
        httpBuilder_.setMessage(builderForValue.build());
      }
      contextCase_ = 10;
      return this;
    }
    /**
     * <pre>
     * response to a http request
     * </pre>
     *
     * <code>.nitric.faas.v1.HttpResponseContext http = 10;</code>
     */
    public Builder mergeHttp(io.nitric.proto.faas.v1.HttpResponseContext value) {
      if (httpBuilder_ == null) {
        if (contextCase_ == 10 &&
            context_ != io.nitric.proto.faas.v1.HttpResponseContext.getDefaultInstance()) {
          context_ = io.nitric.proto.faas.v1.HttpResponseContext.newBuilder((io.nitric.proto.faas.v1.HttpResponseContext) context_)
              .mergeFrom(value).buildPartial();
        } else {
          context_ = value;
        }
        onChanged();
      } else {
        if (contextCase_ == 10) {
          httpBuilder_.mergeFrom(value);
        }
        httpBuilder_.setMessage(value);
      }
      contextCase_ = 10;
      return this;
    }
    /**
     * <pre>
     * response to a http request
     * </pre>
     *
     * <code>.nitric.faas.v1.HttpResponseContext http = 10;</code>
     */
    public Builder clearHttp() {
      if (httpBuilder_ == null) {
        if (contextCase_ == 10) {
          contextCase_ = 0;
          context_ = null;
          onChanged();
        }
      } else {
        if (contextCase_ == 10) {
          contextCase_ = 0;
          context_ = null;
        }
        httpBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * response to a http request
     * </pre>
     *
     * <code>.nitric.faas.v1.HttpResponseContext http = 10;</code>
     */
    public io.nitric.proto.faas.v1.HttpResponseContext.Builder getHttpBuilder() {
      return getHttpFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * response to a http request
     * </pre>
     *
     * <code>.nitric.faas.v1.HttpResponseContext http = 10;</code>
     */
    @java.lang.Override
    public io.nitric.proto.faas.v1.HttpResponseContextOrBuilder getHttpOrBuilder() {
      if ((contextCase_ == 10) && (httpBuilder_ != null)) {
        return httpBuilder_.getMessageOrBuilder();
      } else {
        if (contextCase_ == 10) {
          return (io.nitric.proto.faas.v1.HttpResponseContext) context_;
        }
        return io.nitric.proto.faas.v1.HttpResponseContext.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * response to a http request
     * </pre>
     *
     * <code>.nitric.faas.v1.HttpResponseContext http = 10;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.nitric.proto.faas.v1.HttpResponseContext, io.nitric.proto.faas.v1.HttpResponseContext.Builder, io.nitric.proto.faas.v1.HttpResponseContextOrBuilder> 
        getHttpFieldBuilder() {
      if (httpBuilder_ == null) {
        if (!(contextCase_ == 10)) {
          context_ = io.nitric.proto.faas.v1.HttpResponseContext.getDefaultInstance();
        }
        httpBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.nitric.proto.faas.v1.HttpResponseContext, io.nitric.proto.faas.v1.HttpResponseContext.Builder, io.nitric.proto.faas.v1.HttpResponseContextOrBuilder>(
                (io.nitric.proto.faas.v1.HttpResponseContext) context_,
                getParentForChildren(),
                isClean());
        context_ = null;
      }
      contextCase_ = 10;
      onChanged();;
      return httpBuilder_;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
        io.nitric.proto.faas.v1.TopicResponseContext, io.nitric.proto.faas.v1.TopicResponseContext.Builder, io.nitric.proto.faas.v1.TopicResponseContextOrBuilder> topicBuilder_;
    /**
     * <pre>
     * response to a topic trigger
     * </pre>
     *
     * <code>.nitric.faas.v1.TopicResponseContext topic = 11;</code>
     * @return Whether the topic field is set.
     */
    @java.lang.Override
    public boolean hasTopic() {
      return contextCase_ == 11;
    }
    /**
     * <pre>
     * response to a topic trigger
     * </pre>
     *
     * <code>.nitric.faas.v1.TopicResponseContext topic = 11;</code>
     * @return The topic.
     */
    @java.lang.Override
    public io.nitric.proto.faas.v1.TopicResponseContext getTopic() {
      if (topicBuilder_ == null) {
        if (contextCase_ == 11) {
          return (io.nitric.proto.faas.v1.TopicResponseContext) context_;
        }
        return io.nitric.proto.faas.v1.TopicResponseContext.getDefaultInstance();
      } else {
        if (contextCase_ == 11) {
          return topicBuilder_.getMessage();
        }
        return io.nitric.proto.faas.v1.TopicResponseContext.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * response to a topic trigger
     * </pre>
     *
     * <code>.nitric.faas.v1.TopicResponseContext topic = 11;</code>
     */
    public Builder setTopic(io.nitric.proto.faas.v1.TopicResponseContext value) {
      if (topicBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        context_ = value;
        onChanged();
      } else {
        topicBuilder_.setMessage(value);
      }
      contextCase_ = 11;
      return this;
    }
    /**
     * <pre>
     * response to a topic trigger
     * </pre>
     *
     * <code>.nitric.faas.v1.TopicResponseContext topic = 11;</code>
     */
    public Builder setTopic(
        io.nitric.proto.faas.v1.TopicResponseContext.Builder builderForValue) {
      if (topicBuilder_ == null) {
        context_ = builderForValue.build();
        onChanged();
      } else {
        topicBuilder_.setMessage(builderForValue.build());
      }
      contextCase_ = 11;
      return this;
    }
    /**
     * <pre>
     * response to a topic trigger
     * </pre>
     *
     * <code>.nitric.faas.v1.TopicResponseContext topic = 11;</code>
     */
    public Builder mergeTopic(io.nitric.proto.faas.v1.TopicResponseContext value) {
      if (topicBuilder_ == null) {
        if (contextCase_ == 11 &&
            context_ != io.nitric.proto.faas.v1.TopicResponseContext.getDefaultInstance()) {
          context_ = io.nitric.proto.faas.v1.TopicResponseContext.newBuilder((io.nitric.proto.faas.v1.TopicResponseContext) context_)
              .mergeFrom(value).buildPartial();
        } else {
          context_ = value;
        }
        onChanged();
      } else {
        if (contextCase_ == 11) {
          topicBuilder_.mergeFrom(value);
        }
        topicBuilder_.setMessage(value);
      }
      contextCase_ = 11;
      return this;
    }
    /**
     * <pre>
     * response to a topic trigger
     * </pre>
     *
     * <code>.nitric.faas.v1.TopicResponseContext topic = 11;</code>
     */
    public Builder clearTopic() {
      if (topicBuilder_ == null) {
        if (contextCase_ == 11) {
          contextCase_ = 0;
          context_ = null;
          onChanged();
        }
      } else {
        if (contextCase_ == 11) {
          contextCase_ = 0;
          context_ = null;
        }
        topicBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * response to a topic trigger
     * </pre>
     *
     * <code>.nitric.faas.v1.TopicResponseContext topic = 11;</code>
     */
    public io.nitric.proto.faas.v1.TopicResponseContext.Builder getTopicBuilder() {
      return getTopicFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * response to a topic trigger
     * </pre>
     *
     * <code>.nitric.faas.v1.TopicResponseContext topic = 11;</code>
     */
    @java.lang.Override
    public io.nitric.proto.faas.v1.TopicResponseContextOrBuilder getTopicOrBuilder() {
      if ((contextCase_ == 11) && (topicBuilder_ != null)) {
        return topicBuilder_.getMessageOrBuilder();
      } else {
        if (contextCase_ == 11) {
          return (io.nitric.proto.faas.v1.TopicResponseContext) context_;
        }
        return io.nitric.proto.faas.v1.TopicResponseContext.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * response to a topic trigger
     * </pre>
     *
     * <code>.nitric.faas.v1.TopicResponseContext topic = 11;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.nitric.proto.faas.v1.TopicResponseContext, io.nitric.proto.faas.v1.TopicResponseContext.Builder, io.nitric.proto.faas.v1.TopicResponseContextOrBuilder> 
        getTopicFieldBuilder() {
      if (topicBuilder_ == null) {
        if (!(contextCase_ == 11)) {
          context_ = io.nitric.proto.faas.v1.TopicResponseContext.getDefaultInstance();
        }
        topicBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.nitric.proto.faas.v1.TopicResponseContext, io.nitric.proto.faas.v1.TopicResponseContext.Builder, io.nitric.proto.faas.v1.TopicResponseContextOrBuilder>(
                (io.nitric.proto.faas.v1.TopicResponseContext) context_,
                getParentForChildren(),
                isClean());
        context_ = null;
      }
      contextCase_ = 11;
      onChanged();;
      return topicBuilder_;
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


    // @@protoc_insertion_point(builder_scope:nitric.faas.v1.TriggerResponse)
  }

  // @@protoc_insertion_point(class_scope:nitric.faas.v1.TriggerResponse)
  private static final io.nitric.proto.faas.v1.TriggerResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.nitric.proto.faas.v1.TriggerResponse();
  }

  public static io.nitric.proto.faas.v1.TriggerResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TriggerResponse>
      PARSER = new com.google.protobuf.AbstractParser<TriggerResponse>() {
    @java.lang.Override
    public TriggerResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new TriggerResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<TriggerResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TriggerResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.nitric.proto.faas.v1.TriggerResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

