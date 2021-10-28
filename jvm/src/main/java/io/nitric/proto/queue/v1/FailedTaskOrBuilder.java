// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/queue/v1/queue.proto

package io.nitric.proto.queue.v1;

public interface FailedTaskOrBuilder extends
    // @@protoc_insertion_point(interface_extends:nitric.queue.v1.FailedTask)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The task that failed to be pushed
   * </pre>
   *
   * <code>.nitric.queue.v1.NitricTask task = 1;</code>
   * @return Whether the task field is set.
   */
  boolean hasTask();
  /**
   * <pre>
   * The task that failed to be pushed
   * </pre>
   *
   * <code>.nitric.queue.v1.NitricTask task = 1;</code>
   * @return The task.
   */
  io.nitric.proto.queue.v1.NitricTask getTask();
  /**
   * <pre>
   * The task that failed to be pushed
   * </pre>
   *
   * <code>.nitric.queue.v1.NitricTask task = 1;</code>
   */
  io.nitric.proto.queue.v1.NitricTaskOrBuilder getTaskOrBuilder();

  /**
   * <pre>
   * A message describing the failure
   * </pre>
   *
   * <code>string message = 2;</code>
   * @return The message.
   */
  java.lang.String getMessage();
  /**
   * <pre>
   * A message describing the failure
   * </pre>
   *
   * <code>string message = 2;</code>
   * @return The bytes for message.
   */
  com.google.protobuf.ByteString
      getMessageBytes();
}
