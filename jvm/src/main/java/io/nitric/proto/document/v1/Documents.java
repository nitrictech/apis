// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/document/v1/document.proto

package io.nitric.proto.document.v1;

public final class Documents {
  private Documents() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_nitric_document_v1_Collection_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_nitric_document_v1_Collection_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_nitric_document_v1_Key_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_nitric_document_v1_Key_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_nitric_document_v1_Document_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_nitric_document_v1_Document_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_nitric_document_v1_ExpressionValue_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_nitric_document_v1_ExpressionValue_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_nitric_document_v1_Expression_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_nitric_document_v1_Expression_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_nitric_document_v1_DocumentGetRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_nitric_document_v1_DocumentGetRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_nitric_document_v1_DocumentGetResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_nitric_document_v1_DocumentGetResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_nitric_document_v1_DocumentSetRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_nitric_document_v1_DocumentSetRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_nitric_document_v1_DocumentSetResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_nitric_document_v1_DocumentSetResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_nitric_document_v1_DocumentDeleteRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_nitric_document_v1_DocumentDeleteRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_nitric_document_v1_DocumentDeleteResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_nitric_document_v1_DocumentDeleteResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_nitric_document_v1_DocumentQueryRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_nitric_document_v1_DocumentQueryRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_nitric_document_v1_DocumentQueryRequest_PagingTokenEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_nitric_document_v1_DocumentQueryRequest_PagingTokenEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_nitric_document_v1_DocumentQueryResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_nitric_document_v1_DocumentQueryResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_nitric_document_v1_DocumentQueryResponse_PagingTokenEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_nitric_document_v1_DocumentQueryResponse_PagingTokenEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_nitric_document_v1_DocumentQueryStreamRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_nitric_document_v1_DocumentQueryStreamRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_nitric_document_v1_DocumentQueryStreamResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_nitric_document_v1_DocumentQueryStreamResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n proto/document/v1/document.proto\022\022nitr" +
      "ic.document.v1\032\034google/protobuf/struct.p" +
      "roto\032\027validate/validate.proto\"_\n\nCollect" +
      "ion\022(\n\004name\030\001 \001(\tB\032\372B\027r\025(\200\0022\020^\\w+([.\\-]\\" +
      "w+)*$\022\'\n\006parent\030\002 \001(\0132\027.nitric.document." +
      "v1.Key\"[\n\003Key\022<\n\ncollection\030\001 \001(\0132\036.nitr" +
      "ic.document.v1.CollectionB\010\372B\005\212\001\002\020\001\022\026\n\002i" +
      "d\030\002 \001(\tB\n\372B\007r\005 \001(\200\002\"n\n\010Document\0222\n\007conte" +
      "nt\030\001 \001(\0132\027.google.protobuf.StructB\010\372B\005\212\001" +
      "\002\020\001\022.\n\003key\030\002 \001(\0132\027.nitric.document.v1.Ke" +
      "yB\010\372B\005\212\001\002\020\001\"t\n\017ExpressionValue\022\023\n\tint_va" +
      "lue\030\001 \001(\003H\000\022\026\n\014double_value\030\002 \001(\001H\000\022\026\n\014s" +
      "tring_value\030\003 \001(\tH\000\022\024\n\nbool_value\030\004 \001(\010H" +
      "\000B\006\n\004kind\"\222\001\n\nExpression\022\017\n\007operand\030\001 \001(" +
      "\t\0225\n\010operator\030\002 \001(\tB#\372B r\036R\002==R\001<R\002<=R\001>" +
      "R\002>=R\nstartsWith\022<\n\005value\030\003 \001(\0132#.nitric" +
      ".document.v1.ExpressionValueB\010\372B\005\212\001\002\020\001\"D" +
      "\n\022DocumentGetRequest\022.\n\003key\030\001 \001(\0132\027.nitr" +
      "ic.document.v1.KeyB\010\372B\005\212\001\002\020\001\"E\n\023Document" +
      "GetResponse\022.\n\010document\030\001 \001(\0132\034.nitric.d" +
      "ocument.v1.Document\"x\n\022DocumentSetReques" +
      "t\022.\n\003key\030\001 \001(\0132\027.nitric.document.v1.KeyB" +
      "\010\372B\005\212\001\002\020\001\0222\n\007content\030\003 \001(\0132\027.google.prot" +
      "obuf.StructB\010\372B\005\212\001\002\020\001\"\025\n\023DocumentSetResp" +
      "onse\"G\n\025DocumentDeleteRequest\022.\n\003key\030\001 \001" +
      "(\0132\027.nitric.document.v1.KeyB\010\372B\005\212\001\002\020\001\"\030\n" +
      "\026DocumentDeleteResponse\"\235\002\n\024DocumentQuer" +
      "yRequest\022<\n\ncollection\030\001 \001(\0132\036.nitric.do" +
      "cument.v1.CollectionB\010\372B\005\212\001\002\020\001\0223\n\013expres" +
      "sions\030\003 \003(\0132\036.nitric.document.v1.Express" +
      "ion\022\r\n\005limit\030\004 \001(\005\022O\n\014paging_token\030\005 \003(\013" +
      "29.nitric.document.v1.DocumentQueryReque" +
      "st.PagingTokenEntry\0322\n\020PagingTokenEntry\022" +
      "\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001\"\316\001\n\025Docu" +
      "mentQueryResponse\022/\n\tdocuments\030\001 \003(\0132\034.n" +
      "itric.document.v1.Document\022P\n\014paging_tok" +
      "en\030\002 \003(\0132:.nitric.document.v1.DocumentQu" +
      "eryResponse.PagingTokenEntry\0322\n\020PagingTo" +
      "kenEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001" +
      "\"\236\001\n\032DocumentQueryStreamRequest\022<\n\ncolle" +
      "ction\030\001 \001(\0132\036.nitric.document.v1.Collect" +
      "ionB\010\372B\005\212\001\002\020\001\0223\n\013expressions\030\003 \003(\0132\036.nit" +
      "ric.document.v1.Expression\022\r\n\005limit\030\004 \001(" +
      "\005\"M\n\033DocumentQueryStreamResponse\022.\n\010docu" +
      "ment\030\001 \001(\0132\034.nitric.document.v1.Document" +
      "2\362\003\n\017DocumentService\022V\n\003Get\022&.nitric.doc" +
      "ument.v1.DocumentGetRequest\032\'.nitric.doc" +
      "ument.v1.DocumentGetResponse\022V\n\003Set\022&.ni" +
      "tric.document.v1.DocumentSetRequest\032\'.ni" +
      "tric.document.v1.DocumentSetResponse\022_\n\006" +
      "Delete\022).nitric.document.v1.DocumentDele" +
      "teRequest\032*.nitric.document.v1.DocumentD" +
      "eleteResponse\022\\\n\005Query\022(.nitric.document" +
      ".v1.DocumentQueryRequest\032).nitric.docume" +
      "nt.v1.DocumentQueryResponse\022p\n\013QueryStre" +
      "am\022..nitric.document.v1.DocumentQueryStr" +
      "eamRequest\032/.nitric.document.v1.Document" +
      "QueryStreamResponse0\001Bn\n\033io.nitric.proto" +
      ".document.v1B\tDocumentsP\001Z\014nitric/v1;v1\252" +
      "\002\030Nitric.Proto.Document.v1\312\002\030Nitric\\Prot" +
      "o\\Document\\V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.StructProto.getDescriptor(),
          io.envoyproxy.pgv.validate.Validate.getDescriptor(),
        });
    internal_static_nitric_document_v1_Collection_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_nitric_document_v1_Collection_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_nitric_document_v1_Collection_descriptor,
        new java.lang.String[] { "Name", "Parent", });
    internal_static_nitric_document_v1_Key_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_nitric_document_v1_Key_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_nitric_document_v1_Key_descriptor,
        new java.lang.String[] { "Collection", "Id", });
    internal_static_nitric_document_v1_Document_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_nitric_document_v1_Document_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_nitric_document_v1_Document_descriptor,
        new java.lang.String[] { "Content", "Key", });
    internal_static_nitric_document_v1_ExpressionValue_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_nitric_document_v1_ExpressionValue_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_nitric_document_v1_ExpressionValue_descriptor,
        new java.lang.String[] { "IntValue", "DoubleValue", "StringValue", "BoolValue", "Kind", });
    internal_static_nitric_document_v1_Expression_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_nitric_document_v1_Expression_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_nitric_document_v1_Expression_descriptor,
        new java.lang.String[] { "Operand", "Operator", "Value", });
    internal_static_nitric_document_v1_DocumentGetRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_nitric_document_v1_DocumentGetRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_nitric_document_v1_DocumentGetRequest_descriptor,
        new java.lang.String[] { "Key", });
    internal_static_nitric_document_v1_DocumentGetResponse_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_nitric_document_v1_DocumentGetResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_nitric_document_v1_DocumentGetResponse_descriptor,
        new java.lang.String[] { "Document", });
    internal_static_nitric_document_v1_DocumentSetRequest_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_nitric_document_v1_DocumentSetRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_nitric_document_v1_DocumentSetRequest_descriptor,
        new java.lang.String[] { "Key", "Content", });
    internal_static_nitric_document_v1_DocumentSetResponse_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_nitric_document_v1_DocumentSetResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_nitric_document_v1_DocumentSetResponse_descriptor,
        new java.lang.String[] { });
    internal_static_nitric_document_v1_DocumentDeleteRequest_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_nitric_document_v1_DocumentDeleteRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_nitric_document_v1_DocumentDeleteRequest_descriptor,
        new java.lang.String[] { "Key", });
    internal_static_nitric_document_v1_DocumentDeleteResponse_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_nitric_document_v1_DocumentDeleteResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_nitric_document_v1_DocumentDeleteResponse_descriptor,
        new java.lang.String[] { });
    internal_static_nitric_document_v1_DocumentQueryRequest_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_nitric_document_v1_DocumentQueryRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_nitric_document_v1_DocumentQueryRequest_descriptor,
        new java.lang.String[] { "Collection", "Expressions", "Limit", "PagingToken", });
    internal_static_nitric_document_v1_DocumentQueryRequest_PagingTokenEntry_descriptor =
      internal_static_nitric_document_v1_DocumentQueryRequest_descriptor.getNestedTypes().get(0);
    internal_static_nitric_document_v1_DocumentQueryRequest_PagingTokenEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_nitric_document_v1_DocumentQueryRequest_PagingTokenEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_nitric_document_v1_DocumentQueryResponse_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_nitric_document_v1_DocumentQueryResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_nitric_document_v1_DocumentQueryResponse_descriptor,
        new java.lang.String[] { "Documents", "PagingToken", });
    internal_static_nitric_document_v1_DocumentQueryResponse_PagingTokenEntry_descriptor =
      internal_static_nitric_document_v1_DocumentQueryResponse_descriptor.getNestedTypes().get(0);
    internal_static_nitric_document_v1_DocumentQueryResponse_PagingTokenEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_nitric_document_v1_DocumentQueryResponse_PagingTokenEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_nitric_document_v1_DocumentQueryStreamRequest_descriptor =
      getDescriptor().getMessageTypes().get(13);
    internal_static_nitric_document_v1_DocumentQueryStreamRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_nitric_document_v1_DocumentQueryStreamRequest_descriptor,
        new java.lang.String[] { "Collection", "Expressions", "Limit", });
    internal_static_nitric_document_v1_DocumentQueryStreamResponse_descriptor =
      getDescriptor().getMessageTypes().get(14);
    internal_static_nitric_document_v1_DocumentQueryStreamResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_nitric_document_v1_DocumentQueryStreamResponse_descriptor,
        new java.lang.String[] { "Document", });
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
