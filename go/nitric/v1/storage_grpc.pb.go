// Code generated by protoc-gen-go-grpc. DO NOT EDIT.
// versions:
// - protoc-gen-go-grpc v1.2.0
// - protoc             v3.20.0
// source: proto/storage/v1/storage.proto

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

// StorageServiceClient is the client API for StorageService service.
//
// For semantics around ctx use and closing/ending streaming RPCs, please refer to https://pkg.go.dev/google.golang.org/grpc/?tab=doc#ClientConn.NewStream.
type StorageServiceClient interface {
	// Retrieve an item from a bucket
	Read(ctx context.Context, in *StorageReadRequest, opts ...grpc.CallOption) (*StorageReadResponse, error)
	// Store an item to a bucket
	Write(ctx context.Context, in *StorageWriteRequest, opts ...grpc.CallOption) (*StorageWriteResponse, error)
	// Delete an item from a bucket
	Delete(ctx context.Context, in *StorageDeleteRequest, opts ...grpc.CallOption) (*StorageDeleteResponse, error)
	// Generate a pre-signed URL for direct operations on an item
	PreSignUrl(ctx context.Context, in *StoragePreSignUrlRequest, opts ...grpc.CallOption) (*StoragePreSignUrlResponse, error)
}

type storageServiceClient struct {
	cc grpc.ClientConnInterface
}

func NewStorageServiceClient(cc grpc.ClientConnInterface) StorageServiceClient {
	return &storageServiceClient{cc}
}

func (c *storageServiceClient) Read(ctx context.Context, in *StorageReadRequest, opts ...grpc.CallOption) (*StorageReadResponse, error) {
	out := new(StorageReadResponse)
	err := c.cc.Invoke(ctx, "/nitric.storage.v1.StorageService/Read", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *storageServiceClient) Write(ctx context.Context, in *StorageWriteRequest, opts ...grpc.CallOption) (*StorageWriteResponse, error) {
	out := new(StorageWriteResponse)
	err := c.cc.Invoke(ctx, "/nitric.storage.v1.StorageService/Write", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *storageServiceClient) Delete(ctx context.Context, in *StorageDeleteRequest, opts ...grpc.CallOption) (*StorageDeleteResponse, error) {
	out := new(StorageDeleteResponse)
	err := c.cc.Invoke(ctx, "/nitric.storage.v1.StorageService/Delete", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *storageServiceClient) PreSignUrl(ctx context.Context, in *StoragePreSignUrlRequest, opts ...grpc.CallOption) (*StoragePreSignUrlResponse, error) {
	out := new(StoragePreSignUrlResponse)
	err := c.cc.Invoke(ctx, "/nitric.storage.v1.StorageService/PreSignUrl", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

// StorageServiceServer is the server API for StorageService service.
// All implementations should embed UnimplementedStorageServiceServer
// for forward compatibility
type StorageServiceServer interface {
	// Retrieve an item from a bucket
	Read(context.Context, *StorageReadRequest) (*StorageReadResponse, error)
	// Store an item to a bucket
	Write(context.Context, *StorageWriteRequest) (*StorageWriteResponse, error)
	// Delete an item from a bucket
	Delete(context.Context, *StorageDeleteRequest) (*StorageDeleteResponse, error)
	// Generate a pre-signed URL for direct operations on an item
	PreSignUrl(context.Context, *StoragePreSignUrlRequest) (*StoragePreSignUrlResponse, error)
}

// UnimplementedStorageServiceServer should be embedded to have forward compatible implementations.
type UnimplementedStorageServiceServer struct {
}

func (UnimplementedStorageServiceServer) Read(context.Context, *StorageReadRequest) (*StorageReadResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method Read not implemented")
}
func (UnimplementedStorageServiceServer) Write(context.Context, *StorageWriteRequest) (*StorageWriteResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method Write not implemented")
}
func (UnimplementedStorageServiceServer) Delete(context.Context, *StorageDeleteRequest) (*StorageDeleteResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method Delete not implemented")
}
func (UnimplementedStorageServiceServer) PreSignUrl(context.Context, *StoragePreSignUrlRequest) (*StoragePreSignUrlResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method PreSignUrl not implemented")
}

// UnsafeStorageServiceServer may be embedded to opt out of forward compatibility for this service.
// Use of this interface is not recommended, as added methods to StorageServiceServer will
// result in compilation errors.
type UnsafeStorageServiceServer interface {
	mustEmbedUnimplementedStorageServiceServer()
}

func RegisterStorageServiceServer(s grpc.ServiceRegistrar, srv StorageServiceServer) {
	s.RegisterService(&StorageService_ServiceDesc, srv)
}

func _StorageService_Read_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(StorageReadRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(StorageServiceServer).Read(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/nitric.storage.v1.StorageService/Read",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(StorageServiceServer).Read(ctx, req.(*StorageReadRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _StorageService_Write_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(StorageWriteRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(StorageServiceServer).Write(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/nitric.storage.v1.StorageService/Write",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(StorageServiceServer).Write(ctx, req.(*StorageWriteRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _StorageService_Delete_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(StorageDeleteRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(StorageServiceServer).Delete(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/nitric.storage.v1.StorageService/Delete",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(StorageServiceServer).Delete(ctx, req.(*StorageDeleteRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _StorageService_PreSignUrl_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(StoragePreSignUrlRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(StorageServiceServer).PreSignUrl(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/nitric.storage.v1.StorageService/PreSignUrl",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(StorageServiceServer).PreSignUrl(ctx, req.(*StoragePreSignUrlRequest))
	}
	return interceptor(ctx, in, info, handler)
}

// StorageService_ServiceDesc is the grpc.ServiceDesc for StorageService service.
// It's only intended for direct use with grpc.RegisterService,
// and not to be introspected or modified (even as a copy)
var StorageService_ServiceDesc = grpc.ServiceDesc{
	ServiceName: "nitric.storage.v1.StorageService",
	HandlerType: (*StorageServiceServer)(nil),
	Methods: []grpc.MethodDesc{
		{
			MethodName: "Read",
			Handler:    _StorageService_Read_Handler,
		},
		{
			MethodName: "Write",
			Handler:    _StorageService_Write_Handler,
		},
		{
			MethodName: "Delete",
			Handler:    _StorageService_Delete_Handler,
		},
		{
			MethodName: "PreSignUrl",
			Handler:    _StorageService_PreSignUrl_Handler,
		},
	},
	Streams:  []grpc.StreamDesc{},
	Metadata: "proto/storage/v1/storage.proto",
}
