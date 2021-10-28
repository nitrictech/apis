// package: nitric.email.v1
// file: proto/email/v1/email.proto

import * as jspb from "google-protobuf";
import * as validate_validate_pb from "../../../validate/validate_pb";

export class EmailBody extends jspb.Message {
  getText(): string;
  setText(value: string): void;

  getHtml(): string;
  setHtml(value: string): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): EmailBody.AsObject;
  static toObject(includeInstance: boolean, msg: EmailBody): EmailBody.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: EmailBody, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): EmailBody;
  static deserializeBinaryFromReader(message: EmailBody, reader: jspb.BinaryReader): EmailBody;
}

export namespace EmailBody {
  export type AsObject = {
    text: string,
    html: string,
  }
}

export class EmailSendRequest extends jspb.Message {
  getFrom(): string;
  setFrom(value: string): void;

  clearToList(): void;
  getToList(): Array<string>;
  setToList(value: Array<string>): void;
  addTo(value: string, index?: number): string;

  clearCcList(): void;
  getCcList(): Array<string>;
  setCcList(value: Array<string>): void;
  addCc(value: string, index?: number): string;

  clearBccList(): void;
  getBccList(): Array<string>;
  setBccList(value: Array<string>): void;
  addBcc(value: string, index?: number): string;

  getSubject(): string;
  setSubject(value: string): void;

  hasBody(): boolean;
  clearBody(): void;
  getBody(): EmailBody | undefined;
  setBody(value?: EmailBody): void;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): EmailSendRequest.AsObject;
  static toObject(includeInstance: boolean, msg: EmailSendRequest): EmailSendRequest.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: EmailSendRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): EmailSendRequest;
  static deserializeBinaryFromReader(message: EmailSendRequest, reader: jspb.BinaryReader): EmailSendRequest;
}

export namespace EmailSendRequest {
  export type AsObject = {
    from: string,
    toList: Array<string>,
    ccList: Array<string>,
    bccList: Array<string>,
    subject: string,
    body?: EmailBody.AsObject,
  }
}

export class EmailSendResponse extends jspb.Message {
  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): EmailSendResponse.AsObject;
  static toObject(includeInstance: boolean, msg: EmailSendResponse): EmailSendResponse.AsObject;
  static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
  static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
  static serializeBinaryToWriter(message: EmailSendResponse, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): EmailSendResponse;
  static deserializeBinaryFromReader(message: EmailSendResponse, reader: jspb.BinaryReader): EmailSendResponse;
}

export namespace EmailSendResponse {
  export type AsObject = {
  }
}

