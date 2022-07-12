// package: nitric.event.v1
// file: proto/event/v1/event.proto

import * as jspb from "google-protobuf";
import * as google_protobuf_struct_pb from "google-protobuf/google/protobuf/struct_pb";
import * as validate_validate_pb from "../../../validate/validate_pb";

export class EventPublishRequest extends jspb.Message {
  getTopic(): string;
  setTopic(value: string): void;

  hasEvent(): boolean;
  clearEvent(): void;
  getEvent(): NitricEvent | undefined;
  setEvent(value?: NitricEvent): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): EventPublishRequest.AsObject;
  static toObject(includeInstance: boolean, msg: EventPublishRequest): EventPublishRequest.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: EventPublishRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): EventPublishRequest;
  static deserializeBinaryFromReader(message: EventPublishRequest, reader: jspb.BinaryReader): EventPublishRequest;
}

export namespace EventPublishRequest {
  export type AsObject = {
    topic: string,
    event?: NitricEvent.AsObject,
  }
}

export class EventPublishResponse extends jspb.Message {
  getId(): string;
  setId(value: string): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): EventPublishResponse.AsObject;
  static toObject(includeInstance: boolean, msg: EventPublishResponse): EventPublishResponse.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: EventPublishResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): EventPublishResponse;
  static deserializeBinaryFromReader(message: EventPublishResponse, reader: jspb.BinaryReader): EventPublishResponse;
}

export namespace EventPublishResponse {
  export type AsObject = {
    id: string,
  }
}

export class TopicListRequest extends jspb.Message {
  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): TopicListRequest.AsObject;
  static toObject(includeInstance: boolean, msg: TopicListRequest): TopicListRequest.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: TopicListRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): TopicListRequest;
  static deserializeBinaryFromReader(message: TopicListRequest, reader: jspb.BinaryReader): TopicListRequest;
}

export namespace TopicListRequest {
  export type AsObject = {
  }
}

export class TopicListResponse extends jspb.Message {
  clearTopicsList(): void;
  getTopicsList(): Array<NitricTopic>;
  setTopicsList(value: Array<NitricTopic>): void;
  addTopics(value?: NitricTopic, index?: number): NitricTopic;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): TopicListResponse.AsObject;
  static toObject(includeInstance: boolean, msg: TopicListResponse): TopicListResponse.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: TopicListResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): TopicListResponse;
  static deserializeBinaryFromReader(message: TopicListResponse, reader: jspb.BinaryReader): TopicListResponse;
}

export namespace TopicListResponse {
  export type AsObject = {
    topicsList: Array<NitricTopic.AsObject>,
  }
}

export class NitricTopic extends jspb.Message {
  getName(): string;
  setName(value: string): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): NitricTopic.AsObject;
  static toObject(includeInstance: boolean, msg: NitricTopic): NitricTopic.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: NitricTopic, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): NitricTopic;
  static deserializeBinaryFromReader(message: NitricTopic, reader: jspb.BinaryReader): NitricTopic;
}

export namespace NitricTopic {
  export type AsObject = {
    name: string,
  }
}

export class NitricEvent extends jspb.Message {
  getId(): string;
  setId(value: string): void;

  getPayloadType(): string;
  setPayloadType(value: string): void;

  hasPayload(): boolean;
  clearPayload(): void;
  getPayload(): google_protobuf_struct_pb.Struct | undefined;
  setPayload(value?: google_protobuf_struct_pb.Struct): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): NitricEvent.AsObject;
  static toObject(includeInstance: boolean, msg: NitricEvent): NitricEvent.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: NitricEvent, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): NitricEvent;
  static deserializeBinaryFromReader(message: NitricEvent, reader: jspb.BinaryReader): NitricEvent;
}

export namespace NitricEvent {
  export type AsObject = {
    id: string,
    payloadType: string,
    payload?: google_protobuf_struct_pb.Struct.AsObject,
  }
}

export class DeadLetterReceiveRequest extends jspb.Message {
  getName(): string;
  setName(value: string): void;

  getDepth(): number;
  setDepth(value: number): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): DeadLetterReceiveRequest.AsObject;
  static toObject(includeInstance: boolean, msg: DeadLetterReceiveRequest): DeadLetterReceiveRequest.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: DeadLetterReceiveRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): DeadLetterReceiveRequest;
  static deserializeBinaryFromReader(message: DeadLetterReceiveRequest, reader: jspb.BinaryReader): DeadLetterReceiveRequest;
}

export namespace DeadLetterReceiveRequest {
  export type AsObject = {
    name: string,
    depth: number,
  }
}

export class DeadLetterReceiveResponse extends jspb.Message {
  clearEventsList(): void;
  getEventsList(): Array<NitricEvent>;
  setEventsList(value: Array<NitricEvent>): void;
  addEvents(value?: NitricEvent, index?: number): NitricEvent;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): DeadLetterReceiveResponse.AsObject;
  static toObject(includeInstance: boolean, msg: DeadLetterReceiveResponse): DeadLetterReceiveResponse.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: DeadLetterReceiveResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): DeadLetterReceiveResponse;
  static deserializeBinaryFromReader(message: DeadLetterReceiveResponse, reader: jspb.BinaryReader): DeadLetterReceiveResponse;
}

export namespace DeadLetterReceiveResponse {
  export type AsObject = {
    eventsList: Array<NitricEvent.AsObject>,
  }
}

export class DeadLetterCompleteRequest extends jspb.Message {
  getName(): string;
  setName(value: string): void;

  getId(): string;
  setId(value: string): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): DeadLetterCompleteRequest.AsObject;
  static toObject(includeInstance: boolean, msg: DeadLetterCompleteRequest): DeadLetterCompleteRequest.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: DeadLetterCompleteRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): DeadLetterCompleteRequest;
  static deserializeBinaryFromReader(message: DeadLetterCompleteRequest, reader: jspb.BinaryReader): DeadLetterCompleteRequest;
}

export namespace DeadLetterCompleteRequest {
  export type AsObject = {
    name: string,
    id: string,
  }
}

export class DeadLetterCompleteResponse extends jspb.Message {
  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): DeadLetterCompleteResponse.AsObject;
  static toObject(includeInstance: boolean, msg: DeadLetterCompleteResponse): DeadLetterCompleteResponse.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: DeadLetterCompleteResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): DeadLetterCompleteResponse;
  static deserializeBinaryFromReader(message: DeadLetterCompleteResponse, reader: jspb.BinaryReader): DeadLetterCompleteResponse;
}

export namespace DeadLetterCompleteResponse {
  export type AsObject = {
  }
}

