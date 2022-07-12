// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/resource/v1/resource.proto

package io.nitric.proto.resource.v1;

public interface ResourceDeclareRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:nitric.resource.v1.ResourceDeclareRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.nitric.resource.v1.Resource resource = 1;</code>
   * @return Whether the resource field is set.
   */
  boolean hasResource();
  /**
   * <code>.nitric.resource.v1.Resource resource = 1;</code>
   * @return The resource.
   */
  io.nitric.proto.resource.v1.Resource getResource();
  /**
   * <code>.nitric.resource.v1.Resource resource = 1;</code>
   */
  io.nitric.proto.resource.v1.ResourceOrBuilder getResourceOrBuilder();

  /**
   * <code>.nitric.resource.v1.PolicyResource policy = 10;</code>
   * @return Whether the policy field is set.
   */
  boolean hasPolicy();
  /**
   * <code>.nitric.resource.v1.PolicyResource policy = 10;</code>
   * @return The policy.
   */
  io.nitric.proto.resource.v1.PolicyResource getPolicy();
  /**
   * <code>.nitric.resource.v1.PolicyResource policy = 10;</code>
   */
  io.nitric.proto.resource.v1.PolicyResourceOrBuilder getPolicyOrBuilder();

  /**
   * <code>.nitric.resource.v1.BucketResource bucket = 11;</code>
   * @return Whether the bucket field is set.
   */
  boolean hasBucket();
  /**
   * <code>.nitric.resource.v1.BucketResource bucket = 11;</code>
   * @return The bucket.
   */
  io.nitric.proto.resource.v1.BucketResource getBucket();
  /**
   * <code>.nitric.resource.v1.BucketResource bucket = 11;</code>
   */
  io.nitric.proto.resource.v1.BucketResourceOrBuilder getBucketOrBuilder();

  /**
   * <code>.nitric.resource.v1.QueueResource queue = 12;</code>
   * @return Whether the queue field is set.
   */
  boolean hasQueue();
  /**
   * <code>.nitric.resource.v1.QueueResource queue = 12;</code>
   * @return The queue.
   */
  io.nitric.proto.resource.v1.QueueResource getQueue();
  /**
   * <code>.nitric.resource.v1.QueueResource queue = 12;</code>
   */
  io.nitric.proto.resource.v1.QueueResourceOrBuilder getQueueOrBuilder();

  /**
   * <code>.nitric.resource.v1.TopicResource topic = 13;</code>
   * @return Whether the topic field is set.
   */
  boolean hasTopic();
  /**
   * <code>.nitric.resource.v1.TopicResource topic = 13;</code>
   * @return The topic.
   */
  io.nitric.proto.resource.v1.TopicResource getTopic();
  /**
   * <code>.nitric.resource.v1.TopicResource topic = 13;</code>
   */
  io.nitric.proto.resource.v1.TopicResourceOrBuilder getTopicOrBuilder();

  /**
   * <code>.nitric.resource.v1.CollectionResource collection = 14;</code>
   * @return Whether the collection field is set.
   */
  boolean hasCollection();
  /**
   * <code>.nitric.resource.v1.CollectionResource collection = 14;</code>
   * @return The collection.
   */
  io.nitric.proto.resource.v1.CollectionResource getCollection();
  /**
   * <code>.nitric.resource.v1.CollectionResource collection = 14;</code>
   */
  io.nitric.proto.resource.v1.CollectionResourceOrBuilder getCollectionOrBuilder();

  /**
   * <code>.nitric.resource.v1.SecretResource secret = 15;</code>
   * @return Whether the secret field is set.
   */
  boolean hasSecret();
  /**
   * <code>.nitric.resource.v1.SecretResource secret = 15;</code>
   * @return The secret.
   */
  io.nitric.proto.resource.v1.SecretResource getSecret();
  /**
   * <code>.nitric.resource.v1.SecretResource secret = 15;</code>
   */
  io.nitric.proto.resource.v1.SecretResourceOrBuilder getSecretOrBuilder();

  /**
   * <code>.nitric.resource.v1.ApiResource api = 16;</code>
   * @return Whether the api field is set.
   */
  boolean hasApi();
  /**
   * <code>.nitric.resource.v1.ApiResource api = 16;</code>
   * @return The api.
   */
  io.nitric.proto.resource.v1.ApiResource getApi();
  /**
   * <code>.nitric.resource.v1.ApiResource api = 16;</code>
   */
  io.nitric.proto.resource.v1.ApiResourceOrBuilder getApiOrBuilder();

  /**
   * <code>.nitric.resource.v1.DeadLetterResource dead_letter = 17;</code>
   * @return Whether the deadLetter field is set.
   */
  boolean hasDeadLetter();
  /**
   * <code>.nitric.resource.v1.DeadLetterResource dead_letter = 17;</code>
   * @return The deadLetter.
   */
  io.nitric.proto.resource.v1.DeadLetterResource getDeadLetter();
  /**
   * <code>.nitric.resource.v1.DeadLetterResource dead_letter = 17;</code>
   */
  io.nitric.proto.resource.v1.DeadLetterResourceOrBuilder getDeadLetterOrBuilder();

  public io.nitric.proto.resource.v1.ResourceDeclareRequest.ConfigCase getConfigCase();
}
