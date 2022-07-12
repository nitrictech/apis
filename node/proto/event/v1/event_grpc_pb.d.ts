// GENERATED CODE -- DO NOT EDIT!

// package: nitric.event.v1
// file: proto/event/v1/event.proto

import * as proto_event_v1_event_pb from "../../../proto/event/v1/event_pb";
import * as grpc from "@grpc/grpc-js";

interface IEventServiceService extends grpc.ServiceDefinition<grpc.UntypedServiceImplementation> {
  publish: grpc.MethodDefinition<proto_event_v1_event_pb.EventPublishRequest, proto_event_v1_event_pb.EventPublishResponse>;
}

export const EventServiceService: IEventServiceService;

export interface IEventServiceServer extends grpc.UntypedServiceImplementation {
  publish: grpc.handleUnaryCall<proto_event_v1_event_pb.EventPublishRequest, proto_event_v1_event_pb.EventPublishResponse>;
}

export class EventServiceClient extends grpc.Client {
  constructor(address: string, credentials: grpc.ChannelCredentials, options?: object);
  publish(argument: proto_event_v1_event_pb.EventPublishRequest, callback: grpc.requestCallback<proto_event_v1_event_pb.EventPublishResponse>): grpc.ClientUnaryCall;
  publish(argument: proto_event_v1_event_pb.EventPublishRequest, metadataOrOptions: grpc.Metadata | grpc.CallOptions | null, callback: grpc.requestCallback<proto_event_v1_event_pb.EventPublishResponse>): grpc.ClientUnaryCall;
  publish(argument: proto_event_v1_event_pb.EventPublishRequest, metadata: grpc.Metadata | null, options: grpc.CallOptions | null, callback: grpc.requestCallback<proto_event_v1_event_pb.EventPublishResponse>): grpc.ClientUnaryCall;
}

interface ITopicServiceService extends grpc.ServiceDefinition<grpc.UntypedServiceImplementation> {
  list: grpc.MethodDefinition<proto_event_v1_event_pb.TopicListRequest, proto_event_v1_event_pb.TopicListResponse>;
}

export const TopicServiceService: ITopicServiceService;

export interface ITopicServiceServer extends grpc.UntypedServiceImplementation {
  list: grpc.handleUnaryCall<proto_event_v1_event_pb.TopicListRequest, proto_event_v1_event_pb.TopicListResponse>;
}

export class TopicServiceClient extends grpc.Client {
  constructor(address: string, credentials: grpc.ChannelCredentials, options?: object);
  list(argument: proto_event_v1_event_pb.TopicListRequest, callback: grpc.requestCallback<proto_event_v1_event_pb.TopicListResponse>): grpc.ClientUnaryCall;
  list(argument: proto_event_v1_event_pb.TopicListRequest, metadataOrOptions: grpc.Metadata | grpc.CallOptions | null, callback: grpc.requestCallback<proto_event_v1_event_pb.TopicListResponse>): grpc.ClientUnaryCall;
  list(argument: proto_event_v1_event_pb.TopicListRequest, metadata: grpc.Metadata | null, options: grpc.CallOptions | null, callback: grpc.requestCallback<proto_event_v1_event_pb.TopicListResponse>): grpc.ClientUnaryCall;
}

interface IDeadLetterServiceService extends grpc.ServiceDefinition<grpc.UntypedServiceImplementation> {
  receive: grpc.MethodDefinition<proto_event_v1_event_pb.DeadLetterReceiveRequest, proto_event_v1_event_pb.DeadLetterReceiveResponse>;
  complete: grpc.MethodDefinition<proto_event_v1_event_pb.DeadLetterCompleteRequest, proto_event_v1_event_pb.DeadLetterCompleteResponse>;
}

export const DeadLetterServiceService: IDeadLetterServiceService;

export interface IDeadLetterServiceServer extends grpc.UntypedServiceImplementation {
  receive: grpc.handleUnaryCall<proto_event_v1_event_pb.DeadLetterReceiveRequest, proto_event_v1_event_pb.DeadLetterReceiveResponse>;
  complete: grpc.handleUnaryCall<proto_event_v1_event_pb.DeadLetterCompleteRequest, proto_event_v1_event_pb.DeadLetterCompleteResponse>;
}

export class DeadLetterServiceClient extends grpc.Client {
  constructor(address: string, credentials: grpc.ChannelCredentials, options?: object);
  receive(argument: proto_event_v1_event_pb.DeadLetterReceiveRequest, callback: grpc.requestCallback<proto_event_v1_event_pb.DeadLetterReceiveResponse>): grpc.ClientUnaryCall;
  receive(argument: proto_event_v1_event_pb.DeadLetterReceiveRequest, metadataOrOptions: grpc.Metadata | grpc.CallOptions | null, callback: grpc.requestCallback<proto_event_v1_event_pb.DeadLetterReceiveResponse>): grpc.ClientUnaryCall;
  receive(argument: proto_event_v1_event_pb.DeadLetterReceiveRequest, metadata: grpc.Metadata | null, options: grpc.CallOptions | null, callback: grpc.requestCallback<proto_event_v1_event_pb.DeadLetterReceiveResponse>): grpc.ClientUnaryCall;
  complete(argument: proto_event_v1_event_pb.DeadLetterCompleteRequest, callback: grpc.requestCallback<proto_event_v1_event_pb.DeadLetterCompleteResponse>): grpc.ClientUnaryCall;
  complete(argument: proto_event_v1_event_pb.DeadLetterCompleteRequest, metadataOrOptions: grpc.Metadata | grpc.CallOptions | null, callback: grpc.requestCallback<proto_event_v1_event_pb.DeadLetterCompleteResponse>): grpc.ClientUnaryCall;
  complete(argument: proto_event_v1_event_pb.DeadLetterCompleteRequest, metadata: grpc.Metadata | null, options: grpc.CallOptions | null, callback: grpc.requestCallback<proto_event_v1_event_pb.DeadLetterCompleteResponse>): grpc.ClientUnaryCall;
}
