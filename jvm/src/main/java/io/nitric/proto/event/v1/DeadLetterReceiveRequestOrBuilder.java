// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/event/v1/event.proto

package io.nitric.proto.event.v1;

public interface DeadLetterReceiveRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:nitric.event.v1.DeadLetterReceiveRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The nitric name for the dead-letter target
   * this will automatically be resolved to the provider specific identifier.
   * </pre>
   *
   * <code>string name = 1 [(.validate.rules) = { ... }</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * The nitric name for the dead-letter target
   * this will automatically be resolved to the provider specific identifier.
   * </pre>
   *
   * <code>string name = 1 [(.validate.rules) = { ... }</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * The max number of items to pop off the queue, may be capped by provider specific limitations
   * </pre>
   *
   * <code>int32 depth = 2;</code>
   * @return The depth.
   */
  int getDepth();
}
