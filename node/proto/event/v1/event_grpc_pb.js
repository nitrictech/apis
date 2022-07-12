// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('@grpc/grpc-js');
var proto_event_v1_event_pb = require('../../../proto/event/v1/event_pb.js');
var google_protobuf_struct_pb = require('google-protobuf/google/protobuf/struct_pb.js');
var validate_validate_pb = require('../../../validate/validate_pb.js');

function serialize_nitric_event_v1_DeadLetterCompleteRequest(arg) {
  if (!(arg instanceof proto_event_v1_event_pb.DeadLetterCompleteRequest)) {
    throw new Error('Expected argument of type nitric.event.v1.DeadLetterCompleteRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_nitric_event_v1_DeadLetterCompleteRequest(buffer_arg) {
  return proto_event_v1_event_pb.DeadLetterCompleteRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_nitric_event_v1_DeadLetterCompleteResponse(arg) {
  if (!(arg instanceof proto_event_v1_event_pb.DeadLetterCompleteResponse)) {
    throw new Error('Expected argument of type nitric.event.v1.DeadLetterCompleteResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_nitric_event_v1_DeadLetterCompleteResponse(buffer_arg) {
  return proto_event_v1_event_pb.DeadLetterCompleteResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_nitric_event_v1_DeadLetterReceiveRequest(arg) {
  if (!(arg instanceof proto_event_v1_event_pb.DeadLetterReceiveRequest)) {
    throw new Error('Expected argument of type nitric.event.v1.DeadLetterReceiveRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_nitric_event_v1_DeadLetterReceiveRequest(buffer_arg) {
  return proto_event_v1_event_pb.DeadLetterReceiveRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_nitric_event_v1_DeadLetterReceiveResponse(arg) {
  if (!(arg instanceof proto_event_v1_event_pb.DeadLetterReceiveResponse)) {
    throw new Error('Expected argument of type nitric.event.v1.DeadLetterReceiveResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_nitric_event_v1_DeadLetterReceiveResponse(buffer_arg) {
  return proto_event_v1_event_pb.DeadLetterReceiveResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_nitric_event_v1_EventPublishRequest(arg) {
  if (!(arg instanceof proto_event_v1_event_pb.EventPublishRequest)) {
    throw new Error('Expected argument of type nitric.event.v1.EventPublishRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_nitric_event_v1_EventPublishRequest(buffer_arg) {
  return proto_event_v1_event_pb.EventPublishRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_nitric_event_v1_EventPublishResponse(arg) {
  if (!(arg instanceof proto_event_v1_event_pb.EventPublishResponse)) {
    throw new Error('Expected argument of type nitric.event.v1.EventPublishResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_nitric_event_v1_EventPublishResponse(buffer_arg) {
  return proto_event_v1_event_pb.EventPublishResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_nitric_event_v1_TopicListRequest(arg) {
  if (!(arg instanceof proto_event_v1_event_pb.TopicListRequest)) {
    throw new Error('Expected argument of type nitric.event.v1.TopicListRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_nitric_event_v1_TopicListRequest(buffer_arg) {
  return proto_event_v1_event_pb.TopicListRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_nitric_event_v1_TopicListResponse(arg) {
  if (!(arg instanceof proto_event_v1_event_pb.TopicListResponse)) {
    throw new Error('Expected argument of type nitric.event.v1.TopicListResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_nitric_event_v1_TopicListResponse(buffer_arg) {
  return proto_event_v1_event_pb.TopicListResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Service for publishing asynchronous event
var EventServiceService = exports.EventServiceService = {
  // Publishes an message to a given topic
publish: {
    path: '/nitric.event.v1.EventService/Publish',
    requestStream: false,
    responseStream: false,
    requestType: proto_event_v1_event_pb.EventPublishRequest,
    responseType: proto_event_v1_event_pb.EventPublishResponse,
    requestSerialize: serialize_nitric_event_v1_EventPublishRequest,
    requestDeserialize: deserialize_nitric_event_v1_EventPublishRequest,
    responseSerialize: serialize_nitric_event_v1_EventPublishResponse,
    responseDeserialize: deserialize_nitric_event_v1_EventPublishResponse,
  },
};

exports.EventServiceClient = grpc.makeGenericClientConstructor(EventServiceService);
// Service for management of event topics
var TopicServiceService = exports.TopicServiceService = {
  // Return a list of existing topics in the provider environment
list: {
    path: '/nitric.event.v1.TopicService/List',
    requestStream: false,
    responseStream: false,
    requestType: proto_event_v1_event_pb.TopicListRequest,
    responseType: proto_event_v1_event_pb.TopicListResponse,
    requestSerialize: serialize_nitric_event_v1_TopicListRequest,
    requestDeserialize: deserialize_nitric_event_v1_TopicListRequest,
    responseSerialize: serialize_nitric_event_v1_TopicListResponse,
    responseDeserialize: deserialize_nitric_event_v1_TopicListResponse,
  },
};

exports.TopicServiceClient = grpc.makeGenericClientConstructor(TopicServiceService);
var DeadLetterServiceService = exports.DeadLetterServiceService = {
  // Receive dead-letter messages(s)
receive: {
    path: '/nitric.event.v1.DeadLetterService/Receive',
    requestStream: false,
    responseStream: false,
    requestType: proto_event_v1_event_pb.DeadLetterReceiveRequest,
    responseType: proto_event_v1_event_pb.DeadLetterReceiveResponse,
    requestSerialize: serialize_nitric_event_v1_DeadLetterReceiveRequest,
    requestDeserialize: deserialize_nitric_event_v1_DeadLetterReceiveRequest,
    responseSerialize: serialize_nitric_event_v1_DeadLetterReceiveResponse,
    responseDeserialize: deserialize_nitric_event_v1_DeadLetterReceiveResponse,
  },
  // Complete an event previously popped from a queue
complete: {
    path: '/nitric.event.v1.DeadLetterService/Complete',
    requestStream: false,
    responseStream: false,
    requestType: proto_event_v1_event_pb.DeadLetterCompleteRequest,
    responseType: proto_event_v1_event_pb.DeadLetterCompleteResponse,
    requestSerialize: serialize_nitric_event_v1_DeadLetterCompleteRequest,
    requestDeserialize: deserialize_nitric_event_v1_DeadLetterCompleteRequest,
    responseSerialize: serialize_nitric_event_v1_DeadLetterCompleteResponse,
    responseDeserialize: deserialize_nitric_event_v1_DeadLetterCompleteResponse,
  },
};

exports.DeadLetterServiceClient = grpc.makeGenericClientConstructor(DeadLetterServiceService);
