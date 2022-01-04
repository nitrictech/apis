// package: nitric.resource.v1
// file: proto/resource/v1/resource.proto

import * as jspb from "google-protobuf";
import * as validate_validate_pb from "../../../validate/validate_pb";

export class PolicyResource extends jspb.Message {
  clearPrincipalsList(): void;
  getPrincipalsList(): Array<Resource>;
  setPrincipalsList(value: Array<Resource>): void;
  addPrincipals(value?: Resource, index?: number): Resource;

  clearActionsList(): void;
  getActionsList(): Array<ActionMap[keyof ActionMap]>;
  setActionsList(value: Array<ActionMap[keyof ActionMap]>): void;
  addActions(value: ActionMap[keyof ActionMap], index?: number): ActionMap[keyof ActionMap];

  clearResourcesList(): void;
  getResourcesList(): Array<Resource>;
  setResourcesList(value: Array<Resource>): void;
  addResources(value?: Resource, index?: number): Resource;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): PolicyResource.AsObject;
  static toObject(includeInstance: boolean, msg: PolicyResource): PolicyResource.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: PolicyResource, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): PolicyResource;
  static deserializeBinaryFromReader(message: PolicyResource, reader: jspb.BinaryReader): PolicyResource;
}

export namespace PolicyResource {
  export type AsObject = {
    principalsList: Array<Resource.AsObject>,
    actionsList: Array<ActionMap[keyof ActionMap]>,
    resourcesList: Array<Resource.AsObject>,
  }
}

export class Resource extends jspb.Message {
  getType(): ResourceTypeMap[keyof ResourceTypeMap];
  setType(value: ResourceTypeMap[keyof ResourceTypeMap]): void;

  getName(): string;
  setName(value: string): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): Resource.AsObject;
  static toObject(includeInstance: boolean, msg: Resource): Resource.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: Resource, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): Resource;
  static deserializeBinaryFromReader(message: Resource, reader: jspb.BinaryReader): Resource;
}

export namespace Resource {
  export type AsObject = {
    type: ResourceTypeMap[keyof ResourceTypeMap],
    name: string,
  }
}

export class ResourceDeclareRequest extends jspb.Message {
  hasResource(): boolean;
  clearResource(): void;
  getResource(): Resource | undefined;
  setResource(value?: Resource): void;

  hasPolicy(): boolean;
  clearPolicy(): void;
  getPolicy(): PolicyResource | undefined;
  setPolicy(value?: PolicyResource): void;

  hasBucket(): boolean;
  clearBucket(): void;
  getBucket(): BucketResource | undefined;
  setBucket(value?: BucketResource): void;

  hasQueue(): boolean;
  clearQueue(): void;
  getQueue(): QueueResource | undefined;
  setQueue(value?: QueueResource): void;

  hasTopic(): boolean;
  clearTopic(): void;
  getTopic(): TopicResource | undefined;
  setTopic(value?: TopicResource): void;

  hasCollection(): boolean;
  clearCollection(): void;
  getCollection(): CollectionResource | undefined;
  setCollection(value?: CollectionResource): void;

  getConfigCase(): ResourceDeclareRequest.ConfigCase;
  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): ResourceDeclareRequest.AsObject;
  static toObject(includeInstance: boolean, msg: ResourceDeclareRequest): ResourceDeclareRequest.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: ResourceDeclareRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): ResourceDeclareRequest;
  static deserializeBinaryFromReader(message: ResourceDeclareRequest, reader: jspb.BinaryReader): ResourceDeclareRequest;
}

export namespace ResourceDeclareRequest {
  export type AsObject = {
    resource?: Resource.AsObject,
    policy?: PolicyResource.AsObject,
    bucket?: BucketResource.AsObject,
    queue?: QueueResource.AsObject,
    topic?: TopicResource.AsObject,
    collection?: CollectionResource.AsObject,
  }

  export enum ConfigCase {
    CONFIG_NOT_SET = 0,
    POLICY = 10,
    BUCKET = 11,
    QUEUE = 12,
    TOPIC = 13,
    COLLECTION = 14,
  }
}

export class BucketResource extends jspb.Message {
  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): BucketResource.AsObject;
  static toObject(includeInstance: boolean, msg: BucketResource): BucketResource.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: BucketResource, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): BucketResource;
  static deserializeBinaryFromReader(message: BucketResource, reader: jspb.BinaryReader): BucketResource;
}

export namespace BucketResource {
  export type AsObject = {
  }
}

export class QueueResource extends jspb.Message {
  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): QueueResource.AsObject;
  static toObject(includeInstance: boolean, msg: QueueResource): QueueResource.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: QueueResource, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): QueueResource;
  static deserializeBinaryFromReader(message: QueueResource, reader: jspb.BinaryReader): QueueResource;
}

export namespace QueueResource {
  export type AsObject = {
  }
}

export class TopicResource extends jspb.Message {
  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): TopicResource.AsObject;
  static toObject(includeInstance: boolean, msg: TopicResource): TopicResource.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: TopicResource, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): TopicResource;
  static deserializeBinaryFromReader(message: TopicResource, reader: jspb.BinaryReader): TopicResource;
}

export namespace TopicResource {
  export type AsObject = {
  }
}

export class CollectionResource extends jspb.Message {
  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): CollectionResource.AsObject;
  static toObject(includeInstance: boolean, msg: CollectionResource): CollectionResource.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: CollectionResource, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): CollectionResource;
  static deserializeBinaryFromReader(message: CollectionResource, reader: jspb.BinaryReader): CollectionResource;
}

export namespace CollectionResource {
  export type AsObject = {
  }
}

export class ResourceDeclareResponse extends jspb.Message {
  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): ResourceDeclareResponse.AsObject;
  static toObject(includeInstance: boolean, msg: ResourceDeclareResponse): ResourceDeclareResponse.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: ResourceDeclareResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): ResourceDeclareResponse;
  static deserializeBinaryFromReader(message: ResourceDeclareResponse, reader: jspb.BinaryReader): ResourceDeclareResponse;
}

export namespace ResourceDeclareResponse {
  export type AsObject = {
  }
}

export interface ResourceTypeMap {
  API: 0;
  FUNCTION: 1;
  BUCKET: 2;
  QUEUE: 3;
  TOPIC: 4;
  SCHEDULE: 5;
  SUBSCRIPTION: 6;
  COLLECTION: 7;
  POLICY: 8;
}

export const ResourceType: ResourceTypeMap;

export interface ActionMap {
  BUCKETFILELIST: 0;
  BUCKETFILEGET: 1;
  BUCKETFILEPUT: 2;
  BUCKETFILEDELETE: 3;
  TOPICLIST: 200;
  TOPICDETAIL: 201;
  TOPICEVENTPUBLISH: 202;
  QUEUESEND: 300;
  QUEUERECEIVE: 301;
  QUEUELIST: 302;
  QUEUEDETAIL: 303;
  COLLECTIONDOCUMENTREAD: 400;
  COLLECTIONDOCUMENTWRITE: 401;
  COLLECTIONDOCUMENTDELETE: 402;
  COLLECTIONQUERY: 403;
  COLLECTIONLIST: 404;
}

export const Action: ActionMap;

