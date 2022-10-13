// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/event/v1/event.proto

package io.nitric.proto.event.v1;

public final class Events {
  private Events() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_nitric_event_v1_EventPublishRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_nitric_event_v1_EventPublishRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_nitric_event_v1_EventPublishResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_nitric_event_v1_EventPublishResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_nitric_event_v1_TopicListRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_nitric_event_v1_TopicListRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_nitric_event_v1_TopicListResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_nitric_event_v1_TopicListResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_nitric_event_v1_NitricTopic_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_nitric_event_v1_NitricTopic_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_nitric_event_v1_NitricEvent_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_nitric_event_v1_NitricEvent_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\032proto/event/v1/event.proto\022\017nitric.eve" +
      "nt.v1\032\034google/protobuf/struct.proto\032\027val" +
      "idate/validate.proto\"\226\001\n\023EventPublishReq" +
      "uest\022)\n\005topic\030\001 \001(\tB\032\372B\027r\025(\200\0022\020^\\w+([.\\-" +
      "]\\w+)*$\0225\n\005event\030\002 \001(\0132\034.nitric.event.v1" +
      ".NitricEventB\010\372B\005\212\001\002\020\001\022\035\n\005delay\030\003 \001(\rB\016\372" +
      "B\013*\t\030\200\232\236\001(\n@\001\"\"\n\024EventPublishResponse\022\n\n" +
      "\002id\030\001 \001(\t\"\022\n\020TopicListRequest\"A\n\021TopicLi" +
      "stResponse\022,\n\006topics\030\001 \003(\0132\034.nitric.even" +
      "t.v1.NitricTopic\"\033\n\013NitricTopic\022\014\n\004name\030" +
      "\001 \001(\t\"Y\n\013NitricEvent\022\n\n\002id\030\001 \001(\t\022\024\n\014payl" +
      "oad_type\030\002 \001(\t\022(\n\007payload\030\003 \001(\0132\027.google" +
      ".protobuf.Struct2f\n\014EventService\022V\n\007Publ" +
      "ish\022$.nitric.event.v1.EventPublishReques" +
      "t\032%.nitric.event.v1.EventPublishResponse" +
      "2]\n\014TopicService\022M\n\004List\022!.nitric.event." +
      "v1.TopicListRequest\032\".nitric.event.v1.To" +
      "picListResponseBb\n\030io.nitric.proto.event" +
      ".v1B\006EventsP\001Z\014nitric/v1;v1\252\002\025Nitric.Pro" +
      "to.Event.v1\312\002\025Nitric\\Proto\\Event\\V1b\006pro" +
      "to3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.StructProto.getDescriptor(),
          io.envoyproxy.pgv.validate.Validate.getDescriptor(),
        });
    internal_static_nitric_event_v1_EventPublishRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_nitric_event_v1_EventPublishRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_nitric_event_v1_EventPublishRequest_descriptor,
        new java.lang.String[] { "Topic", "Event", "Delay", });
    internal_static_nitric_event_v1_EventPublishResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_nitric_event_v1_EventPublishResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_nitric_event_v1_EventPublishResponse_descriptor,
        new java.lang.String[] { "Id", });
    internal_static_nitric_event_v1_TopicListRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_nitric_event_v1_TopicListRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_nitric_event_v1_TopicListRequest_descriptor,
        new java.lang.String[] { });
    internal_static_nitric_event_v1_TopicListResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_nitric_event_v1_TopicListResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_nitric_event_v1_TopicListResponse_descriptor,
        new java.lang.String[] { "Topics", });
    internal_static_nitric_event_v1_NitricTopic_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_nitric_event_v1_NitricTopic_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_nitric_event_v1_NitricTopic_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_nitric_event_v1_NitricEvent_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_nitric_event_v1_NitricEvent_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_nitric_event_v1_NitricEvent_descriptor,
        new java.lang.String[] { "Id", "PayloadType", "Payload", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(io.envoyproxy.pgv.validate.Validate.rules);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.protobuf.StructProto.getDescriptor();
    io.envoyproxy.pgv.validate.Validate.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
