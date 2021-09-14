// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('@grpc/grpc-js');
var proto_storage_v1_storage_pb = require('../../../proto/storage/v1/storage_pb.js');
var validate_validate_pb = require('../../../validate/validate_pb.js');

function serialize_nitric_storage_v1_StorageDeleteRequest(arg) {
  if (!(arg instanceof proto_storage_v1_storage_pb.StorageDeleteRequest)) {
    throw new Error('Expected argument of type nitric.storage.v1.StorageDeleteRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_nitric_storage_v1_StorageDeleteRequest(buffer_arg) {
  return proto_storage_v1_storage_pb.StorageDeleteRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_nitric_storage_v1_StorageDeleteResponse(arg) {
  if (!(arg instanceof proto_storage_v1_storage_pb.StorageDeleteResponse)) {
    throw new Error('Expected argument of type nitric.storage.v1.StorageDeleteResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_nitric_storage_v1_StorageDeleteResponse(buffer_arg) {
  return proto_storage_v1_storage_pb.StorageDeleteResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_nitric_storage_v1_StorageReadRequest(arg) {
  if (!(arg instanceof proto_storage_v1_storage_pb.StorageReadRequest)) {
    throw new Error('Expected argument of type nitric.storage.v1.StorageReadRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_nitric_storage_v1_StorageReadRequest(buffer_arg) {
  return proto_storage_v1_storage_pb.StorageReadRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_nitric_storage_v1_StorageReadResponse(arg) {
  if (!(arg instanceof proto_storage_v1_storage_pb.StorageReadResponse)) {
    throw new Error('Expected argument of type nitric.storage.v1.StorageReadResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_nitric_storage_v1_StorageReadResponse(buffer_arg) {
  return proto_storage_v1_storage_pb.StorageReadResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_nitric_storage_v1_StorageWriteRequest(arg) {
  if (!(arg instanceof proto_storage_v1_storage_pb.StorageWriteRequest)) {
    throw new Error('Expected argument of type nitric.storage.v1.StorageWriteRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_nitric_storage_v1_StorageWriteRequest(buffer_arg) {
  return proto_storage_v1_storage_pb.StorageWriteRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_nitric_storage_v1_StorageWriteResponse(arg) {
  if (!(arg instanceof proto_storage_v1_storage_pb.StorageWriteResponse)) {
    throw new Error('Expected argument of type nitric.storage.v1.StorageWriteResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_nitric_storage_v1_StorageWriteResponse(buffer_arg) {
  return proto_storage_v1_storage_pb.StorageWriteResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Services for storage and retrieval of files in the form of byte arrays, such as text and binary files.
var StorageServiceService = exports.StorageServiceService = {
  // Retrieve an item from a bucket
read: {
    path: '/nitric.storage.v1.StorageService/Read',
    requestStream: false,
    responseStream: false,
    requestType: proto_storage_v1_storage_pb.StorageReadRequest,
    responseType: proto_storage_v1_storage_pb.StorageReadResponse,
    requestSerialize: serialize_nitric_storage_v1_StorageReadRequest,
    requestDeserialize: deserialize_nitric_storage_v1_StorageReadRequest,
    responseSerialize: serialize_nitric_storage_v1_StorageReadResponse,
    responseDeserialize: deserialize_nitric_storage_v1_StorageReadResponse,
  },
  // Store an item to a bucket
write: {
    path: '/nitric.storage.v1.StorageService/Write',
    requestStream: false,
    responseStream: false,
    requestType: proto_storage_v1_storage_pb.StorageWriteRequest,
    responseType: proto_storage_v1_storage_pb.StorageWriteResponse,
    requestSerialize: serialize_nitric_storage_v1_StorageWriteRequest,
    requestDeserialize: deserialize_nitric_storage_v1_StorageWriteRequest,
    responseSerialize: serialize_nitric_storage_v1_StorageWriteResponse,
    responseDeserialize: deserialize_nitric_storage_v1_StorageWriteResponse,
  },
  // Delete an item from a bucket
delete: {
    path: '/nitric.storage.v1.StorageService/Delete',
    requestStream: false,
    responseStream: false,
    requestType: proto_storage_v1_storage_pb.StorageDeleteRequest,
    responseType: proto_storage_v1_storage_pb.StorageDeleteResponse,
    requestSerialize: serialize_nitric_storage_v1_StorageDeleteRequest,
    requestDeserialize: deserialize_nitric_storage_v1_StorageDeleteRequest,
    responseSerialize: serialize_nitric_storage_v1_StorageDeleteResponse,
    responseDeserialize: deserialize_nitric_storage_v1_StorageDeleteResponse,
  },
};

exports.StorageServiceClient = grpc.makeGenericClientConstructor(StorageServiceService);
