// GENERATED CODE -- DO NOT EDIT!

// package: nitric.email.v1
// file: proto/email/v1/email.proto

import * as proto_email_v1_email_pb from "../../../proto/email/v1/email_pb";
import * as grpc from "@grpc/grpc-js";

interface IEmailServiceService extends grpc.ServiceDefinition<grpc.UntypedServiceImplementation> {
  send: grpc.MethodDefinition<proto_email_v1_email_pb.EmailSendRequest, proto_email_v1_email_pb.EmailSendResponse>;
}

export const EmailServiceService: IEmailServiceService;

export interface IEmailServiceServer extends grpc.UntypedServiceImplementation {
  send: grpc.handleUnaryCall<proto_email_v1_email_pb.EmailSendRequest, proto_email_v1_email_pb.EmailSendResponse>;
}

export class EmailServiceClient extends grpc.Client {
  constructor(address: string, credentials: grpc.ChannelCredentials, options?: object);
  send(argument: proto_email_v1_email_pb.EmailSendRequest, callback: grpc.requestCallback<proto_email_v1_email_pb.EmailSendResponse>): grpc.ClientUnaryCall;
  send(argument: proto_email_v1_email_pb.EmailSendRequest, metadataOrOptions: grpc.Metadata | grpc.CallOptions | null, callback: grpc.requestCallback<proto_email_v1_email_pb.EmailSendResponse>): grpc.ClientUnaryCall;
  send(argument: proto_email_v1_email_pb.EmailSendRequest, metadata: grpc.Metadata | null, options: grpc.CallOptions | null, callback: grpc.requestCallback<proto_email_v1_email_pb.EmailSendResponse>): grpc.ClientUnaryCall;
}
