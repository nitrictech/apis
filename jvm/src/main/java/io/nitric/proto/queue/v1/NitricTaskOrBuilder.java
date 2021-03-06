// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/queue/v1/queue.proto

package io.nitric.proto.queue.v1;

public interface NitricTaskOrBuilder extends
    // @@protoc_insertion_point(interface_extends:nitric.queue.v1.NitricTask)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * A unique id for the task
   * </pre>
   *
   * <code>string id = 1;</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <pre>
   * A unique id for the task
   * </pre>
   *
   * <code>string id = 1;</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <pre>
   * The lease id unique to the pop request, this must be used to complete, extend the lease or release the task.
   * </pre>
   *
   * <code>string lease_id = 2;</code>
   * @return The leaseId.
   */
  java.lang.String getLeaseId();
  /**
   * <pre>
   * The lease id unique to the pop request, this must be used to complete, extend the lease or release the task.
   * </pre>
   *
   * <code>string lease_id = 2;</code>
   * @return The bytes for leaseId.
   */
  com.google.protobuf.ByteString
      getLeaseIdBytes();

  /**
   * <pre>
   * A content hint for the tasks payload
   * </pre>
   *
   * <code>string payload_type = 3;</code>
   * @return The payloadType.
   */
  java.lang.String getPayloadType();
  /**
   * <pre>
   * A content hint for the tasks payload
   * </pre>
   *
   * <code>string payload_type = 3;</code>
   * @return The bytes for payloadType.
   */
  com.google.protobuf.ByteString
      getPayloadTypeBytes();

  /**
   * <pre>
   * The payload of the task
   * </pre>
   *
   * <code>.google.protobuf.Struct payload = 4;</code>
   * @return Whether the payload field is set.
   */
  boolean hasPayload();
  /**
   * <pre>
   * The payload of the task
   * </pre>
   *
   * <code>.google.protobuf.Struct payload = 4;</code>
   * @return The payload.
   */
  com.google.protobuf.Struct getPayload();
  /**
   * <pre>
   * The payload of the task
   * </pre>
   *
   * <code>.google.protobuf.Struct payload = 4;</code>
   */
  com.google.protobuf.StructOrBuilder getPayloadOrBuilder();
}
