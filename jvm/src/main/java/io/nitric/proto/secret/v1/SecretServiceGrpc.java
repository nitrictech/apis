package io.nitric.proto.secret.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * The Nitric Secret Service contract
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.36.0)",
    comments = "Source: proto/secret/v1/secret.proto")
public final class SecretServiceGrpc {

  private SecretServiceGrpc() {}

  public static final String SERVICE_NAME = "nitric.secret.v1.SecretService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.nitric.proto.secret.v1.SecretPutRequest,
      io.nitric.proto.secret.v1.SecretPutResponse> getPutMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Put",
      requestType = io.nitric.proto.secret.v1.SecretPutRequest.class,
      responseType = io.nitric.proto.secret.v1.SecretPutResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.nitric.proto.secret.v1.SecretPutRequest,
      io.nitric.proto.secret.v1.SecretPutResponse> getPutMethod() {
    io.grpc.MethodDescriptor<io.nitric.proto.secret.v1.SecretPutRequest, io.nitric.proto.secret.v1.SecretPutResponse> getPutMethod;
    if ((getPutMethod = SecretServiceGrpc.getPutMethod) == null) {
      synchronized (SecretServiceGrpc.class) {
        if ((getPutMethod = SecretServiceGrpc.getPutMethod) == null) {
          SecretServiceGrpc.getPutMethod = getPutMethod =
              io.grpc.MethodDescriptor.<io.nitric.proto.secret.v1.SecretPutRequest, io.nitric.proto.secret.v1.SecretPutResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Put"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.nitric.proto.secret.v1.SecretPutRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.nitric.proto.secret.v1.SecretPutResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SecretServiceMethodDescriptorSupplier("Put"))
              .build();
        }
      }
    }
    return getPutMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.nitric.proto.secret.v1.SecretAccessRequest,
      io.nitric.proto.secret.v1.SecretAccessResponse> getAccessMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Access",
      requestType = io.nitric.proto.secret.v1.SecretAccessRequest.class,
      responseType = io.nitric.proto.secret.v1.SecretAccessResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.nitric.proto.secret.v1.SecretAccessRequest,
      io.nitric.proto.secret.v1.SecretAccessResponse> getAccessMethod() {
    io.grpc.MethodDescriptor<io.nitric.proto.secret.v1.SecretAccessRequest, io.nitric.proto.secret.v1.SecretAccessResponse> getAccessMethod;
    if ((getAccessMethod = SecretServiceGrpc.getAccessMethod) == null) {
      synchronized (SecretServiceGrpc.class) {
        if ((getAccessMethod = SecretServiceGrpc.getAccessMethod) == null) {
          SecretServiceGrpc.getAccessMethod = getAccessMethod =
              io.grpc.MethodDescriptor.<io.nitric.proto.secret.v1.SecretAccessRequest, io.nitric.proto.secret.v1.SecretAccessResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Access"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.nitric.proto.secret.v1.SecretAccessRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.nitric.proto.secret.v1.SecretAccessResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SecretServiceMethodDescriptorSupplier("Access"))
              .build();
        }
      }
    }
    return getAccessMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SecretServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SecretServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SecretServiceStub>() {
        @java.lang.Override
        public SecretServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SecretServiceStub(channel, callOptions);
        }
      };
    return SecretServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SecretServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SecretServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SecretServiceBlockingStub>() {
        @java.lang.Override
        public SecretServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SecretServiceBlockingStub(channel, callOptions);
        }
      };
    return SecretServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SecretServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SecretServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SecretServiceFutureStub>() {
        @java.lang.Override
        public SecretServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SecretServiceFutureStub(channel, callOptions);
        }
      };
    return SecretServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * The Nitric Secret Service contract
   * </pre>
   */
  public static abstract class SecretServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Updates a secret, creating a new one if it doesn't already exist
     * </pre>
     */
    public void put(io.nitric.proto.secret.v1.SecretPutRequest request,
        io.grpc.stub.StreamObserver<io.nitric.proto.secret.v1.SecretPutResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPutMethod(), responseObserver);
    }

    /**
     * <pre>
     * Gets a secret from a Secret Store
     * </pre>
     */
    public void access(io.nitric.proto.secret.v1.SecretAccessRequest request,
        io.grpc.stub.StreamObserver<io.nitric.proto.secret.v1.SecretAccessResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAccessMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getPutMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                io.nitric.proto.secret.v1.SecretPutRequest,
                io.nitric.proto.secret.v1.SecretPutResponse>(
                  this, METHODID_PUT)))
          .addMethod(
            getAccessMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                io.nitric.proto.secret.v1.SecretAccessRequest,
                io.nitric.proto.secret.v1.SecretAccessResponse>(
                  this, METHODID_ACCESS)))
          .build();
    }
  }

  /**
   * <pre>
   * The Nitric Secret Service contract
   * </pre>
   */
  public static final class SecretServiceStub extends io.grpc.stub.AbstractAsyncStub<SecretServiceStub> {
    private SecretServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SecretServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SecretServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Updates a secret, creating a new one if it doesn't already exist
     * </pre>
     */
    public void put(io.nitric.proto.secret.v1.SecretPutRequest request,
        io.grpc.stub.StreamObserver<io.nitric.proto.secret.v1.SecretPutResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPutMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gets a secret from a Secret Store
     * </pre>
     */
    public void access(io.nitric.proto.secret.v1.SecretAccessRequest request,
        io.grpc.stub.StreamObserver<io.nitric.proto.secret.v1.SecretAccessResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAccessMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * The Nitric Secret Service contract
   * </pre>
   */
  public static final class SecretServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<SecretServiceBlockingStub> {
    private SecretServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SecretServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SecretServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Updates a secret, creating a new one if it doesn't already exist
     * </pre>
     */
    public io.nitric.proto.secret.v1.SecretPutResponse put(io.nitric.proto.secret.v1.SecretPutRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPutMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets a secret from a Secret Store
     * </pre>
     */
    public io.nitric.proto.secret.v1.SecretAccessResponse access(io.nitric.proto.secret.v1.SecretAccessRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAccessMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * The Nitric Secret Service contract
   * </pre>
   */
  public static final class SecretServiceFutureStub extends io.grpc.stub.AbstractFutureStub<SecretServiceFutureStub> {
    private SecretServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SecretServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SecretServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Updates a secret, creating a new one if it doesn't already exist
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.nitric.proto.secret.v1.SecretPutResponse> put(
        io.nitric.proto.secret.v1.SecretPutRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPutMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Gets a secret from a Secret Store
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.nitric.proto.secret.v1.SecretAccessResponse> access(
        io.nitric.proto.secret.v1.SecretAccessRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAccessMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PUT = 0;
  private static final int METHODID_ACCESS = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SecretServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SecretServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_PUT:
          serviceImpl.put((io.nitric.proto.secret.v1.SecretPutRequest) request,
              (io.grpc.stub.StreamObserver<io.nitric.proto.secret.v1.SecretPutResponse>) responseObserver);
          break;
        case METHODID_ACCESS:
          serviceImpl.access((io.nitric.proto.secret.v1.SecretAccessRequest) request,
              (io.grpc.stub.StreamObserver<io.nitric.proto.secret.v1.SecretAccessResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class SecretServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SecretServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.nitric.proto.secret.v1.Secrets.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SecretService");
    }
  }

  private static final class SecretServiceFileDescriptorSupplier
      extends SecretServiceBaseDescriptorSupplier {
    SecretServiceFileDescriptorSupplier() {}
  }

  private static final class SecretServiceMethodDescriptorSupplier
      extends SecretServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SecretServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (SecretServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SecretServiceFileDescriptorSupplier())
              .addMethod(getPutMethod())
              .addMethod(getAccessMethod())
              .build();
        }
      }
    }
    return result;
  }
}
