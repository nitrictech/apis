package io.nitric.proto.event.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.36.0)",
    comments = "Source: proto/event/v1/event.proto")
public final class DeadLetterServiceGrpc {

  private DeadLetterServiceGrpc() {}

  public static final String SERVICE_NAME = "nitric.event.v1.DeadLetterService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.nitric.proto.event.v1.DeadLetterReceiveRequest,
      io.nitric.proto.event.v1.DeadLetterReceiveResponse> getReceiveMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Receive",
      requestType = io.nitric.proto.event.v1.DeadLetterReceiveRequest.class,
      responseType = io.nitric.proto.event.v1.DeadLetterReceiveResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.nitric.proto.event.v1.DeadLetterReceiveRequest,
      io.nitric.proto.event.v1.DeadLetterReceiveResponse> getReceiveMethod() {
    io.grpc.MethodDescriptor<io.nitric.proto.event.v1.DeadLetterReceiveRequest, io.nitric.proto.event.v1.DeadLetterReceiveResponse> getReceiveMethod;
    if ((getReceiveMethod = DeadLetterServiceGrpc.getReceiveMethod) == null) {
      synchronized (DeadLetterServiceGrpc.class) {
        if ((getReceiveMethod = DeadLetterServiceGrpc.getReceiveMethod) == null) {
          DeadLetterServiceGrpc.getReceiveMethod = getReceiveMethod =
              io.grpc.MethodDescriptor.<io.nitric.proto.event.v1.DeadLetterReceiveRequest, io.nitric.proto.event.v1.DeadLetterReceiveResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Receive"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.nitric.proto.event.v1.DeadLetterReceiveRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.nitric.proto.event.v1.DeadLetterReceiveResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DeadLetterServiceMethodDescriptorSupplier("Receive"))
              .build();
        }
      }
    }
    return getReceiveMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.nitric.proto.event.v1.DeadLetterCompleteRequest,
      io.nitric.proto.event.v1.DeadLetterCompleteResponse> getCompleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Complete",
      requestType = io.nitric.proto.event.v1.DeadLetterCompleteRequest.class,
      responseType = io.nitric.proto.event.v1.DeadLetterCompleteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.nitric.proto.event.v1.DeadLetterCompleteRequest,
      io.nitric.proto.event.v1.DeadLetterCompleteResponse> getCompleteMethod() {
    io.grpc.MethodDescriptor<io.nitric.proto.event.v1.DeadLetterCompleteRequest, io.nitric.proto.event.v1.DeadLetterCompleteResponse> getCompleteMethod;
    if ((getCompleteMethod = DeadLetterServiceGrpc.getCompleteMethod) == null) {
      synchronized (DeadLetterServiceGrpc.class) {
        if ((getCompleteMethod = DeadLetterServiceGrpc.getCompleteMethod) == null) {
          DeadLetterServiceGrpc.getCompleteMethod = getCompleteMethod =
              io.grpc.MethodDescriptor.<io.nitric.proto.event.v1.DeadLetterCompleteRequest, io.nitric.proto.event.v1.DeadLetterCompleteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Complete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.nitric.proto.event.v1.DeadLetterCompleteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.nitric.proto.event.v1.DeadLetterCompleteResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DeadLetterServiceMethodDescriptorSupplier("Complete"))
              .build();
        }
      }
    }
    return getCompleteMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DeadLetterServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DeadLetterServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DeadLetterServiceStub>() {
        @java.lang.Override
        public DeadLetterServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DeadLetterServiceStub(channel, callOptions);
        }
      };
    return DeadLetterServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DeadLetterServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DeadLetterServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DeadLetterServiceBlockingStub>() {
        @java.lang.Override
        public DeadLetterServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DeadLetterServiceBlockingStub(channel, callOptions);
        }
      };
    return DeadLetterServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DeadLetterServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DeadLetterServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DeadLetterServiceFutureStub>() {
        @java.lang.Override
        public DeadLetterServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DeadLetterServiceFutureStub(channel, callOptions);
        }
      };
    return DeadLetterServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class DeadLetterServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Receive dead-letter messages(s)
     * </pre>
     */
    public void receive(io.nitric.proto.event.v1.DeadLetterReceiveRequest request,
        io.grpc.stub.StreamObserver<io.nitric.proto.event.v1.DeadLetterReceiveResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getReceiveMethod(), responseObserver);
    }

    /**
     * <pre>
     * Complete an event previously popped from a queue
     * </pre>
     */
    public void complete(io.nitric.proto.event.v1.DeadLetterCompleteRequest request,
        io.grpc.stub.StreamObserver<io.nitric.proto.event.v1.DeadLetterCompleteResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCompleteMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getReceiveMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                io.nitric.proto.event.v1.DeadLetterReceiveRequest,
                io.nitric.proto.event.v1.DeadLetterReceiveResponse>(
                  this, METHODID_RECEIVE)))
          .addMethod(
            getCompleteMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                io.nitric.proto.event.v1.DeadLetterCompleteRequest,
                io.nitric.proto.event.v1.DeadLetterCompleteResponse>(
                  this, METHODID_COMPLETE)))
          .build();
    }
  }

  /**
   */
  public static final class DeadLetterServiceStub extends io.grpc.stub.AbstractAsyncStub<DeadLetterServiceStub> {
    private DeadLetterServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DeadLetterServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DeadLetterServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Receive dead-letter messages(s)
     * </pre>
     */
    public void receive(io.nitric.proto.event.v1.DeadLetterReceiveRequest request,
        io.grpc.stub.StreamObserver<io.nitric.proto.event.v1.DeadLetterReceiveResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getReceiveMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Complete an event previously popped from a queue
     * </pre>
     */
    public void complete(io.nitric.proto.event.v1.DeadLetterCompleteRequest request,
        io.grpc.stub.StreamObserver<io.nitric.proto.event.v1.DeadLetterCompleteResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCompleteMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class DeadLetterServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<DeadLetterServiceBlockingStub> {
    private DeadLetterServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DeadLetterServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DeadLetterServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Receive dead-letter messages(s)
     * </pre>
     */
    public io.nitric.proto.event.v1.DeadLetterReceiveResponse receive(io.nitric.proto.event.v1.DeadLetterReceiveRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getReceiveMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Complete an event previously popped from a queue
     * </pre>
     */
    public io.nitric.proto.event.v1.DeadLetterCompleteResponse complete(io.nitric.proto.event.v1.DeadLetterCompleteRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCompleteMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class DeadLetterServiceFutureStub extends io.grpc.stub.AbstractFutureStub<DeadLetterServiceFutureStub> {
    private DeadLetterServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DeadLetterServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DeadLetterServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Receive dead-letter messages(s)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.nitric.proto.event.v1.DeadLetterReceiveResponse> receive(
        io.nitric.proto.event.v1.DeadLetterReceiveRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getReceiveMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Complete an event previously popped from a queue
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.nitric.proto.event.v1.DeadLetterCompleteResponse> complete(
        io.nitric.proto.event.v1.DeadLetterCompleteRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCompleteMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_RECEIVE = 0;
  private static final int METHODID_COMPLETE = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final DeadLetterServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(DeadLetterServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_RECEIVE:
          serviceImpl.receive((io.nitric.proto.event.v1.DeadLetterReceiveRequest) request,
              (io.grpc.stub.StreamObserver<io.nitric.proto.event.v1.DeadLetterReceiveResponse>) responseObserver);
          break;
        case METHODID_COMPLETE:
          serviceImpl.complete((io.nitric.proto.event.v1.DeadLetterCompleteRequest) request,
              (io.grpc.stub.StreamObserver<io.nitric.proto.event.v1.DeadLetterCompleteResponse>) responseObserver);
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

  private static abstract class DeadLetterServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DeadLetterServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.nitric.proto.event.v1.Events.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("DeadLetterService");
    }
  }

  private static final class DeadLetterServiceFileDescriptorSupplier
      extends DeadLetterServiceBaseDescriptorSupplier {
    DeadLetterServiceFileDescriptorSupplier() {}
  }

  private static final class DeadLetterServiceMethodDescriptorSupplier
      extends DeadLetterServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    DeadLetterServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (DeadLetterServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DeadLetterServiceFileDescriptorSupplier())
              .addMethod(getReceiveMethod())
              .addMethod(getCompleteMethod())
              .build();
        }
      }
    }
    return result;
  }
}
