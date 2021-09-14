// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/faas/v1/faas.proto

package io.nitric.proto.faas.v1;

public interface HttpTriggerContextOrBuilder extends
    // @@protoc_insertion_point(interface_extends:nitric.faas.v1.HttpTriggerContext)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The request method
   * </pre>
   *
   * <code>string method = 1;</code>
   * @return The method.
   */
  java.lang.String getMethod();
  /**
   * <pre>
   * The request method
   * </pre>
   *
   * <code>string method = 1;</code>
   * @return The bytes for method.
   */
  com.google.protobuf.ByteString
      getMethodBytes();

  /**
   * <pre>
   * The path of the request
   * </pre>
   *
   * <code>string path = 2;</code>
   * @return The path.
   */
  java.lang.String getPath();
  /**
   * <pre>
   * The path of the request
   * </pre>
   *
   * <code>string path = 2;</code>
   * @return The bytes for path.
   */
  com.google.protobuf.ByteString
      getPathBytes();

  /**
   * <pre>
   * The old request headers (preserving for backwards compatibility)
   * TODO: Remove in 1.0
   * </pre>
   *
   * <code>map&lt;string, string&gt; headers_old = 3 [deprecated = true];</code>
   */
  @java.lang.Deprecated int getHeadersOldCount();
  /**
   * <pre>
   * The old request headers (preserving for backwards compatibility)
   * TODO: Remove in 1.0
   * </pre>
   *
   * <code>map&lt;string, string&gt; headers_old = 3 [deprecated = true];</code>
   */
  @java.lang.Deprecated boolean containsHeadersOld(
      java.lang.String key);
  /**
   * Use {@link #getHeadersOldMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getHeadersOld();
  /**
   * <pre>
   * The old request headers (preserving for backwards compatibility)
   * TODO: Remove in 1.0
   * </pre>
   *
   * <code>map&lt;string, string&gt; headers_old = 3 [deprecated = true];</code>
   */
  @java.lang.Deprecated java.util.Map<java.lang.String, java.lang.String>
  getHeadersOldMap();
  /**
   * <pre>
   * The old request headers (preserving for backwards compatibility)
   * TODO: Remove in 1.0
   * </pre>
   *
   * <code>map&lt;string, string&gt; headers_old = 3 [deprecated = true];</code>
   */
  @java.lang.Deprecated 
  java.lang.String getHeadersOldOrDefault(
      java.lang.String key,
      java.lang.String defaultValue);
  /**
   * <pre>
   * The old request headers (preserving for backwards compatibility)
   * TODO: Remove in 1.0
   * </pre>
   *
   * <code>map&lt;string, string&gt; headers_old = 3 [deprecated = true];</code>
   */
  @java.lang.Deprecated 
  java.lang.String getHeadersOldOrThrow(
      java.lang.String key);

  /**
   * <pre>
   * The query params (if parseable by the membrane)
   * </pre>
   *
   * <code>map&lt;string, string&gt; query_params = 4;</code>
   */
  int getQueryParamsCount();
  /**
   * <pre>
   * The query params (if parseable by the membrane)
   * </pre>
   *
   * <code>map&lt;string, string&gt; query_params = 4;</code>
   */
  boolean containsQueryParams(
      java.lang.String key);
  /**
   * Use {@link #getQueryParamsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getQueryParams();
  /**
   * <pre>
   * The query params (if parseable by the membrane)
   * </pre>
   *
   * <code>map&lt;string, string&gt; query_params = 4;</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getQueryParamsMap();
  /**
   * <pre>
   * The query params (if parseable by the membrane)
   * </pre>
   *
   * <code>map&lt;string, string&gt; query_params = 4;</code>
   */

  java.lang.String getQueryParamsOrDefault(
      java.lang.String key,
      java.lang.String defaultValue);
  /**
   * <pre>
   * The query params (if parseable by the membrane)
   * </pre>
   *
   * <code>map&lt;string, string&gt; query_params = 4;</code>
   */

  java.lang.String getQueryParamsOrThrow(
      java.lang.String key);

  /**
   * <pre>
   * HTTP request headers
   * </pre>
   *
   * <code>map&lt;string, .nitric.faas.v1.HeaderValue&gt; headers = 5;</code>
   */
  int getHeadersCount();
  /**
   * <pre>
   * HTTP request headers
   * </pre>
   *
   * <code>map&lt;string, .nitric.faas.v1.HeaderValue&gt; headers = 5;</code>
   */
  boolean containsHeaders(
      java.lang.String key);
  /**
   * Use {@link #getHeadersMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, io.nitric.proto.faas.v1.HeaderValue>
  getHeaders();
  /**
   * <pre>
   * HTTP request headers
   * </pre>
   *
   * <code>map&lt;string, .nitric.faas.v1.HeaderValue&gt; headers = 5;</code>
   */
  java.util.Map<java.lang.String, io.nitric.proto.faas.v1.HeaderValue>
  getHeadersMap();
  /**
   * <pre>
   * HTTP request headers
   * </pre>
   *
   * <code>map&lt;string, .nitric.faas.v1.HeaderValue&gt; headers = 5;</code>
   */

  io.nitric.proto.faas.v1.HeaderValue getHeadersOrDefault(
      java.lang.String key,
      io.nitric.proto.faas.v1.HeaderValue defaultValue);
  /**
   * <pre>
   * HTTP request headers
   * </pre>
   *
   * <code>map&lt;string, .nitric.faas.v1.HeaderValue&gt; headers = 5;</code>
   */

  io.nitric.proto.faas.v1.HeaderValue getHeadersOrThrow(
      java.lang.String key);
}
