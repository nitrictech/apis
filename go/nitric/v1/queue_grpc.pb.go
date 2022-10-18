// Code generated by protoc-gen-go-grpc. DO NOT EDIT.
// versions:
// - protoc-gen-go-grpc v1.2.0
// - protoc             v3.20.3
// source: proto/queue/v1/queue.proto

package v1

import (
	context "context"
	grpc "google.golang.org/grpc"
	codes "google.golang.org/grpc/codes"
	status "google.golang.org/grpc/status"
)

// This is a compile-time assertion to ensure that this generated file
// is compatible with the grpc package it is being compiled against.
// Requires gRPC-Go v1.32.0 or later.
const _ = grpc.SupportPackageIsVersion7

// QueueServiceClient is the client API for QueueService service.
//
// For semantics around ctx use and closing/ending streaming RPCs, please refer to https://pkg.go.dev/google.golang.org/grpc/?tab=doc#ClientConn.NewStream.
type QueueServiceClient interface {
	// Send a single event to a queue
	Send(ctx context.Context, in *QueueSendRequest, opts ...grpc.CallOption) (*QueueSendResponse, error)
	// Send multiple events to a queue
	SendBatch(ctx context.Context, in *QueueSendBatchRequest, opts ...grpc.CallOption) (*QueueSendBatchResponse, error)
	// Receive event(s) off a queue
	Receive(ctx context.Context, in *QueueReceiveRequest, opts ...grpc.CallOption) (*QueueReceiveResponse, error)
	// Complete an event previously popped from a queue
	Complete(ctx context.Context, in *QueueCompleteRequest, opts ...grpc.CallOption) (*QueueCompleteResponse, error)
}

type queueServiceClient struct {
	cc grpc.ClientConnInterface
}

func NewQueueServiceClient(cc grpc.ClientConnInterface) QueueServiceClient {
	return &queueServiceClient{cc}
}

func (c *queueServiceClient) Send(ctx context.Context, in *QueueSendRequest, opts ...grpc.CallOption) (*QueueSendResponse, error) {
	out := new(QueueSendResponse)
	err := c.cc.Invoke(ctx, "/nitric.queue.v1.QueueService/Send", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *queueServiceClient) SendBatch(ctx context.Context, in *QueueSendBatchRequest, opts ...grpc.CallOption) (*QueueSendBatchResponse, error) {
	out := new(QueueSendBatchResponse)
	err := c.cc.Invoke(ctx, "/nitric.queue.v1.QueueService/SendBatch", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *queueServiceClient) Receive(ctx context.Context, in *QueueReceiveRequest, opts ...grpc.CallOption) (*QueueReceiveResponse, error) {
	out := new(QueueReceiveResponse)
	err := c.cc.Invoke(ctx, "/nitric.queue.v1.QueueService/Receive", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *queueServiceClient) Complete(ctx context.Context, in *QueueCompleteRequest, opts ...grpc.CallOption) (*QueueCompleteResponse, error) {
	out := new(QueueCompleteResponse)
	err := c.cc.Invoke(ctx, "/nitric.queue.v1.QueueService/Complete", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

// QueueServiceServer is the server API for QueueService service.
// All implementations should embed UnimplementedQueueServiceServer
// for forward compatibility
type QueueServiceServer interface {
	// Send a single event to a queue
	Send(context.Context, *QueueSendRequest) (*QueueSendResponse, error)
	// Send multiple events to a queue
	SendBatch(context.Context, *QueueSendBatchRequest) (*QueueSendBatchResponse, error)
	// Receive event(s) off a queue
	Receive(context.Context, *QueueReceiveRequest) (*QueueReceiveResponse, error)
	// Complete an event previously popped from a queue
	Complete(context.Context, *QueueCompleteRequest) (*QueueCompleteResponse, error)
}

// UnimplementedQueueServiceServer should be embedded to have forward compatible implementations.
type UnimplementedQueueServiceServer struct {
}

func (UnimplementedQueueServiceServer) Send(context.Context, *QueueSendRequest) (*QueueSendResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method Send not implemented")
}
func (UnimplementedQueueServiceServer) SendBatch(context.Context, *QueueSendBatchRequest) (*QueueSendBatchResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method SendBatch not implemented")
}
func (UnimplementedQueueServiceServer) Receive(context.Context, *QueueReceiveRequest) (*QueueReceiveResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method Receive not implemented")
}
func (UnimplementedQueueServiceServer) Complete(context.Context, *QueueCompleteRequest) (*QueueCompleteResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method Complete not implemented")
}

// UnsafeQueueServiceServer may be embedded to opt out of forward compatibility for this service.
// Use of this interface is not recommended, as added methods to QueueServiceServer will
// result in compilation errors.
type UnsafeQueueServiceServer interface {
	mustEmbedUnimplementedQueueServiceServer()
}

func RegisterQueueServiceServer(s grpc.ServiceRegistrar, srv QueueServiceServer) {
	s.RegisterService(&QueueService_ServiceDesc, srv)
}

func _QueueService_Send_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(QueueSendRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(QueueServiceServer).Send(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/nitric.queue.v1.QueueService/Send",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(QueueServiceServer).Send(ctx, req.(*QueueSendRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _QueueService_SendBatch_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(QueueSendBatchRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(QueueServiceServer).SendBatch(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/nitric.queue.v1.QueueService/SendBatch",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(QueueServiceServer).SendBatch(ctx, req.(*QueueSendBatchRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _QueueService_Receive_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(QueueReceiveRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(QueueServiceServer).Receive(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/nitric.queue.v1.QueueService/Receive",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(QueueServiceServer).Receive(ctx, req.(*QueueReceiveRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _QueueService_Complete_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(QueueCompleteRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(QueueServiceServer).Complete(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/nitric.queue.v1.QueueService/Complete",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(QueueServiceServer).Complete(ctx, req.(*QueueCompleteRequest))
	}
	return interceptor(ctx, in, info, handler)
}

// QueueService_ServiceDesc is the grpc.ServiceDesc for QueueService service.
// It's only intended for direct use with grpc.RegisterService,
// and not to be introspected or modified (even as a copy)
var QueueService_ServiceDesc = grpc.ServiceDesc{
	ServiceName: "nitric.queue.v1.QueueService",
	HandlerType: (*QueueServiceServer)(nil),
	Methods: []grpc.MethodDesc{
		{
			MethodName: "Send",
			Handler:    _QueueService_Send_Handler,
		},
		{
			MethodName: "SendBatch",
			Handler:    _QueueService_SendBatch_Handler,
		},
		{
			MethodName: "Receive",
			Handler:    _QueueService_Receive_Handler,
		},
		{
			MethodName: "Complete",
			Handler:    _QueueService_Complete_Handler,
		},
	},
	Streams:  []grpc.StreamDesc{},
	Metadata: "proto/queue/v1/queue.proto",
}
