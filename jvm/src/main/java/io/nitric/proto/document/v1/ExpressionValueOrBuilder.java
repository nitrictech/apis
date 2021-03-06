// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/document/v1/document.proto

package io.nitric.proto.document.v1;

public interface ExpressionValueOrBuilder extends
    // @@protoc_insertion_point(interface_extends:nitric.document.v1.ExpressionValue)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Represents an integer value.
   * </pre>
   *
   * <code>int64 int_value = 1;</code>
   * @return The intValue.
   */
  long getIntValue();

  /**
   * <pre>
   * Represents a double value.
   * </pre>
   *
   * <code>double double_value = 2;</code>
   * @return The doubleValue.
   */
  double getDoubleValue();

  /**
   * <pre>
   * Represents a string value.
   * </pre>
   *
   * <code>string string_value = 3;</code>
   * @return The stringValue.
   */
  java.lang.String getStringValue();
  /**
   * <pre>
   * Represents a string value.
   * </pre>
   *
   * <code>string string_value = 3;</code>
   * @return The bytes for stringValue.
   */
  com.google.protobuf.ByteString
      getStringValueBytes();

  /**
   * <pre>
   * Represents a boolean value.
   * </pre>
   *
   * <code>bool bool_value = 4;</code>
   * @return The boolValue.
   */
  boolean getBoolValue();

  public io.nitric.proto.document.v1.ExpressionValue.KindCase getKindCase();
}
