package io.nitric.proto.resource.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Nitric Resource Service
 * The service definition exists to allow a nitric application to declare peripheral dependencies
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.36.0)",
    comments = "Source: proto/resource/v1/resource.proto")
public final class ResourceServiceGrpc {

  private ResourceServiceGrpc() {}

  public static final String SERVICE_NAME = "nitric.resource.v1.ResourceService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.nitric.proto.resource.v1.ResourceDeclareRequest,
      io.nitric.proto.resource.v1.ResourceDeclareResponse> getDeclareMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Declare",
      requestType = io.nitric.proto.resource.v1.ResourceDeclareRequest.class,
      responseType = io.nitric.proto.resource.v1.ResourceDeclareResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.nitric.proto.resource.v1.ResourceDeclareRequest,
      io.nitric.proto.resource.v1.ResourceDeclareResponse> getDeclareMethod() {
    io.grpc.MethodDescriptor<io.nitric.proto.resource.v1.ResourceDeclareRequest, io.nitric.proto.resource.v1.ResourceDeclareResponse> getDeclareMethod;
    if ((getDeclareMethod = ResourceServiceGrpc.getDeclareMethod) == null) {
      synchronized (ResourceServiceGrpc.class) {
        if ((getDeclareMethod = ResourceServiceGrpc.getDeclareMethod) == null) {
          ResourceServiceGrpc.getDeclareMethod = getDeclareMethod =
              io.grpc.MethodDescriptor.<io.nitric.proto.resource.v1.ResourceDeclareRequest, io.nitric.proto.resource.v1.ResourceDeclareResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Declare"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.nitric.proto.resource.v1.ResourceDeclareRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.nitric.proto.resource.v1.ResourceDeclareResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ResourceServiceMethodDescriptorSupplier("Declare"))
              .build();
        }
      }
    }
    return getDeclareMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ResourceServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ResourceServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ResourceServiceStub>() {
        @java.lang.Override
        public ResourceServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ResourceServiceStub(channel, callOptions);
        }
      };
    return ResourceServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ResourceServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ResourceServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ResourceServiceBlockingStub>() {
        @java.lang.Override
        public ResourceServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ResourceServiceBlockingStub(channel, callOptions);
        }
      };
    return ResourceServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ResourceServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ResourceServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ResourceServiceFutureStub>() {
        @java.lang.Override
        public ResourceServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ResourceServiceFutureStub(channel, callOptions);
        }
      };
    return ResourceServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Nitric Resource Service
   * The service definition exists to allow a nitric application to declare peripheral dependencies
   * </pre>
   */
  public static abstract class ResourceServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Declare a resource for the nitric application
     * At Deploy time this will create resources as part of the nitric stacks dependency graph
     * At runtime
     * </pre>
     */
    public void declare(io.nitric.proto.resource.v1.ResourceDeclareRequest request,
        io.grpc.stub.StreamObserver<io.nitric.proto.resource.v1.ResourceDeclareResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeclareMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getDeclareMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                io.nitric.proto.resource.v1.ResourceDeclareRequest,
                io.nitric.proto.resource.v1.ResourceDeclareResponse>(
                  this, METHODID_DECLARE)))
          .build();
    }
  }

  /**
   * <pre>
   * Nitric Resource Service
   * The service definition exists to allow a nitric application to declare peripheral dependencies
   * </pre>
   */
  public static final class ResourceServiceStub extends io.grpc.stub.AbstractAsyncStub<ResourceServiceStub> {
    private ResourceServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ResourceServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ResourceServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Declare a resource for the nitric application
     * At Deploy time this will create resources as part of the nitric stacks dependency graph
     * At runtime
     * </pre>
     */
    public void declare(io.nitric.proto.resource.v1.ResourceDeclareRequest request,
        io.grpc.stub.StreamObserver<io.nitric.proto.resource.v1.ResourceDeclareResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeclareMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Nitric Resource Service
   * The service definition exists to allow a nitric application to declare peripheral dependencies
   * </pre>
   */
  public static final class ResourceServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<ResourceServiceBlockingStub> {
    private ResourceServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ResourceServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ResourceServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Declare a resource for the nitric application
     * At Deploy time this will create resources as part of the nitric stacks dependency graph
     * At runtime
     * </pre>
     */
    public io.nitric.proto.resource.v1.ResourceDeclareResponse declare(io.nitric.proto.resource.v1.ResourceDeclareRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeclareMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Nitric Resource Service
   * The service definition exists to allow a nitric application to declare peripheral dependencies
   * </pre>
   */
  public static final class ResourceServiceFutureStub extends io.grpc.stub.AbstractFutureStub<ResourceServiceFutureStub> {
    private ResourceServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ResourceServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ResourceServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Declare a resource for the nitric application
     * At Deploy time this will create resources as part of the nitric stacks dependency graph
     * At runtime
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.nitric.proto.resource.v1.ResourceDeclareResponse> declare(
        io.nitric.proto.resource.v1.ResourceDeclareRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeclareMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_DECLARE = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ResourceServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ResourceServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_DECLARE:
          serviceImpl.declare((io.nitric.proto.resource.v1.ResourceDeclareRequest) request,
              (io.grpc.stub.StreamObserver<io.nitric.proto.resource.v1.ResourceDeclareResponse>) responseObserver);
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

  private static abstract class ResourceServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ResourceServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.nitric.proto.resource.v1.Resources.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ResourceService");
    }
  }

  private static final class ResourceServiceFileDescriptorSupplier
      extends ResourceServiceBaseDescriptorSupplier {
    ResourceServiceFileDescriptorSupplier() {}
  }

  private static final class ResourceServiceMethodDescriptorSupplier
      extends ResourceServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ResourceServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ResourceServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ResourceServiceFileDescriptorSupplier())
              .addMethod(getDeclareMethod())
              .build();
        }
      }
    }
    return result;
  }
}
