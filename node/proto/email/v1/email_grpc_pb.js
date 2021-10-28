// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('@grpc/grpc-js');
var proto_email_v1_email_pb = require('../../../proto/email/v1/email_pb.js');
var validate_validate_pb = require('../../../validate/validate_pb.js');

function serialize_nitric_email_v1_EmailSendRequest(arg) {
  if (!(arg instanceof proto_email_v1_email_pb.EmailSendRequest)) {
    throw new Error('Expected argument of type nitric.email.v1.EmailSendRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_nitric_email_v1_EmailSendRequest(buffer_arg) {
  return proto_email_v1_email_pb.EmailSendRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_nitric_email_v1_EmailSendResponse(arg) {
  if (!(arg instanceof proto_email_v1_email_pb.EmailSendResponse)) {
    throw new Error('Expected argument of type nitric.email.v1.EmailSendResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_nitric_email_v1_EmailSendResponse(buffer_arg) {
  return proto_email_v1_email_pb.EmailSendResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Service for sending email messages
var EmailServiceService = exports.EmailServiceService = {
  send: {
    path: '/nitric.email.v1.EmailService/Send',
    requestStream: false,
    responseStream: false,
    requestType: proto_email_v1_email_pb.EmailSendRequest,
    responseType: proto_email_v1_email_pb.EmailSendResponse,
    requestSerialize: serialize_nitric_email_v1_EmailSendRequest,
    requestDeserialize: deserialize_nitric_email_v1_EmailSendRequest,
    responseSerialize: serialize_nitric_email_v1_EmailSendResponse,
    responseDeserialize: deserialize_nitric_email_v1_EmailSendResponse,
  },
};

exports.EmailServiceClient = grpc.makeGenericClientConstructor(EmailServiceService);
