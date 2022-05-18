// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/resource/v1/resource.proto

package io.nitric.proto.resource.v1;

/**
 * Protobuf type {@code nitric.resource.v1.ApiScopes}
 */
public final class ApiScopes extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:nitric.resource.v1.ApiScopes)
    ApiScopesOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ApiScopes.newBuilder() to construct.
  private ApiScopes(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ApiScopes() {
    scopes_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ApiScopes();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ApiScopes(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              scopes_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000001;
            }
            scopes_.add(s);
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        scopes_ = scopes_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.nitric.proto.resource.v1.Resources.internal_static_nitric_resource_v1_ApiScopes_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.nitric.proto.resource.v1.Resources.internal_static_nitric_resource_v1_ApiScopes_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.nitric.proto.resource.v1.ApiScopes.class, io.nitric.proto.resource.v1.ApiScopes.Builder.class);
  }

  public static final int SCOPES_FIELD_NUMBER = 1;
  private com.google.protobuf.LazyStringList scopes_;
  /**
   * <code>repeated string scopes = 1;</code>
   * @return A list containing the scopes.
   */
  public com.google.protobuf.ProtocolStringList
      getScopesList() {
    return scopes_;
  }
  /**
   * <code>repeated string scopes = 1;</code>
   * @return The count of scopes.
   */
  public int getScopesCount() {
    return scopes_.size();
  }
  /**
   * <code>repeated string scopes = 1;</code>
   * @param index The index of the element to return.
   * @return The scopes at the given index.
   */
  public java.lang.String getScopes(int index) {
    return scopes_.get(index);
  }
  /**
   * <code>repeated string scopes = 1;</code>
   * @param index The index of the value to return.
   * @return The bytes of the scopes at the given index.
   */
  public com.google.protobuf.ByteString
      getScopesBytes(int index) {
    return scopes_.getByteString(index);
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
    for (int i = 0; i < scopes_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, scopes_.getRaw(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < scopes_.size(); i++) {
        dataSize += computeStringSizeNoTag(scopes_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getScopesList().size();
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
    if (!(obj instanceof io.nitric.proto.resource.v1.ApiScopes)) {
      return super.equals(obj);
    }
    io.nitric.proto.resource.v1.ApiScopes other = (io.nitric.proto.resource.v1.ApiScopes) obj;

    if (!getScopesList()
        .equals(other.getScopesList())) return false;
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
    if (getScopesCount() > 0) {
      hash = (37 * hash) + SCOPES_FIELD_NUMBER;
      hash = (53 * hash) + getScopesList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.nitric.proto.resource.v1.ApiScopes parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.nitric.proto.resource.v1.ApiScopes parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.nitric.proto.resource.v1.ApiScopes parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.nitric.proto.resource.v1.ApiScopes parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.nitric.proto.resource.v1.ApiScopes parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.nitric.proto.resource.v1.ApiScopes parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.nitric.proto.resource.v1.ApiScopes parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.nitric.proto.resource.v1.ApiScopes parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.nitric.proto.resource.v1.ApiScopes parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.nitric.proto.resource.v1.ApiScopes parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.nitric.proto.resource.v1.ApiScopes parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.nitric.proto.resource.v1.ApiScopes parseFrom(
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
  public static Builder newBuilder(io.nitric.proto.resource.v1.ApiScopes prototype) {
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
   * Protobuf type {@code nitric.resource.v1.ApiScopes}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:nitric.resource.v1.ApiScopes)
      io.nitric.proto.resource.v1.ApiScopesOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.nitric.proto.resource.v1.Resources.internal_static_nitric_resource_v1_ApiScopes_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.nitric.proto.resource.v1.Resources.internal_static_nitric_resource_v1_ApiScopes_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.nitric.proto.resource.v1.ApiScopes.class, io.nitric.proto.resource.v1.ApiScopes.Builder.class);
    }

    // Construct using io.nitric.proto.resource.v1.ApiScopes.newBuilder()
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
      scopes_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.nitric.proto.resource.v1.Resources.internal_static_nitric_resource_v1_ApiScopes_descriptor;
    }

    @java.lang.Override
    public io.nitric.proto.resource.v1.ApiScopes getDefaultInstanceForType() {
      return io.nitric.proto.resource.v1.ApiScopes.getDefaultInstance();
    }

    @java.lang.Override
    public io.nitric.proto.resource.v1.ApiScopes build() {
      io.nitric.proto.resource.v1.ApiScopes result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.nitric.proto.resource.v1.ApiScopes buildPartial() {
      io.nitric.proto.resource.v1.ApiScopes result = new io.nitric.proto.resource.v1.ApiScopes(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) != 0)) {
        scopes_ = scopes_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.scopes_ = scopes_;
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
      if (other instanceof io.nitric.proto.resource.v1.ApiScopes) {
        return mergeFrom((io.nitric.proto.resource.v1.ApiScopes)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.nitric.proto.resource.v1.ApiScopes other) {
      if (other == io.nitric.proto.resource.v1.ApiScopes.getDefaultInstance()) return this;
      if (!other.scopes_.isEmpty()) {
        if (scopes_.isEmpty()) {
          scopes_ = other.scopes_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureScopesIsMutable();
          scopes_.addAll(other.scopes_);
        }
        onChanged();
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
      io.nitric.proto.resource.v1.ApiScopes parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.nitric.proto.resource.v1.ApiScopes) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.LazyStringList scopes_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureScopesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        scopes_ = new com.google.protobuf.LazyStringArrayList(scopes_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated string scopes = 1;</code>
     * @return A list containing the scopes.
     */
    public com.google.protobuf.ProtocolStringList
        getScopesList() {
      return scopes_.getUnmodifiableView();
    }
    /**
     * <code>repeated string scopes = 1;</code>
     * @return The count of scopes.
     */
    public int getScopesCount() {
      return scopes_.size();
    }
    /**
     * <code>repeated string scopes = 1;</code>
     * @param index The index of the element to return.
     * @return The scopes at the given index.
     */
    public java.lang.String getScopes(int index) {
      return scopes_.get(index);
    }
    /**
     * <code>repeated string scopes = 1;</code>
     * @param index The index of the value to return.
     * @return The bytes of the scopes at the given index.
     */
    public com.google.protobuf.ByteString
        getScopesBytes(int index) {
      return scopes_.getByteString(index);
    }
    /**
     * <code>repeated string scopes = 1;</code>
     * @param index The index to set the value at.
     * @param value The scopes to set.
     * @return This builder for chaining.
     */
    public Builder setScopes(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureScopesIsMutable();
      scopes_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string scopes = 1;</code>
     * @param value The scopes to add.
     * @return This builder for chaining.
     */
    public Builder addScopes(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureScopesIsMutable();
      scopes_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string scopes = 1;</code>
     * @param values The scopes to add.
     * @return This builder for chaining.
     */
    public Builder addAllScopes(
        java.lang.Iterable<java.lang.String> values) {
      ensureScopesIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, scopes_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string scopes = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearScopes() {
      scopes_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string scopes = 1;</code>
     * @param value The bytes of the scopes to add.
     * @return This builder for chaining.
     */
    public Builder addScopesBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureScopesIsMutable();
      scopes_.add(value);
      onChanged();
      return this;
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


    // @@protoc_insertion_point(builder_scope:nitric.resource.v1.ApiScopes)
  }

  // @@protoc_insertion_point(class_scope:nitric.resource.v1.ApiScopes)
  private static final io.nitric.proto.resource.v1.ApiScopes DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.nitric.proto.resource.v1.ApiScopes();
  }

  public static io.nitric.proto.resource.v1.ApiScopes getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ApiScopes>
      PARSER = new com.google.protobuf.AbstractParser<ApiScopes>() {
    @java.lang.Override
    public ApiScopes parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ApiScopes(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ApiScopes> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ApiScopes> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.nitric.proto.resource.v1.ApiScopes getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

