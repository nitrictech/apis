# Generated by the protocol buffer compiler.  DO NOT EDIT!
# sources: proto/event/v1/event.proto
# plugin: python-betterproto
from dataclasses import dataclass
from typing import Dict, List

import betterproto
from betterproto.grpc.grpclib_server import ServiceBase
import grpclib


@dataclass(eq=False, repr=False)
class EventPublishRequest(betterproto.Message):
    """Request to publish an event to a topic"""

    # The name of the topic to publish the event to
    topic: str = betterproto.string_field(1)
    # The event to be published
    event: "NitricEvent" = betterproto.message_field(2)


@dataclass(eq=False, repr=False)
class EventPublishResponse(betterproto.Message):
    """Result of publishing an event"""

    # The id of the published message When an id was not supplied one should be
    # automatically generated
    id: str = betterproto.string_field(1)


@dataclass(eq=False, repr=False)
class TopicListRequest(betterproto.Message):
    """Request for the Topic List method"""

    pass


@dataclass(eq=False, repr=False)
class TopicListResponse(betterproto.Message):
    """Topic List Response"""

    # The list of found topics
    topics: List["NitricTopic"] = betterproto.message_field(1)


@dataclass(eq=False, repr=False)
class NitricTopic(betterproto.Message):
    """Represents an event topic"""

    # The Nitric name for the topic
    name: str = betterproto.string_field(1)


@dataclass(eq=False, repr=False)
class NitricEvent(betterproto.Message):
    """Nitric Event Model"""

    # A Unique ID for the Nitric Event
    id: str = betterproto.string_field(1)
    # A content hint for the events payload
    payload_type: str = betterproto.string_field(2)
    # The payload of the event
    payload: "betterproto_lib_google_protobuf.Struct" = betterproto.message_field(3)


@dataclass(eq=False, repr=False)
class DeadLetterReceiveRequest(betterproto.Message):
    # The nitric name for the dead-letter target this will automatically be
    # resolved to the provider specific identifier.
    name: str = betterproto.string_field(1)
    # The max number of items to pop off the queue, may be capped by provider
    # specific limitations
    depth: int = betterproto.int32_field(2)


@dataclass(eq=False, repr=False)
class DeadLetterReceiveResponse(betterproto.Message):
    # Array of dead-letter events
    events: List["NitricEvent"] = betterproto.message_field(1)


@dataclass(eq=False, repr=False)
class DeadLetterCompleteRequest(betterproto.Message):
    # The nitric name for the dead-letter target  this will automatically be
    # resolved to the provider specific queue identifier.
    name: str = betterproto.string_field(1)
    # ID of the event to be completed
    id: str = betterproto.string_field(2)


@dataclass(eq=False, repr=False)
class DeadLetterCompleteResponse(betterproto.Message):
    pass


class EventServiceStub(betterproto.ServiceStub):
    async def publish(
        self, *, topic: str = "", event: "NitricEvent" = None
    ) -> "EventPublishResponse":

        request = EventPublishRequest()
        request.topic = topic
        if event is not None:
            request.event = event

        return await self._unary_unary(
            "/nitric.event.v1.EventService/Publish", request, EventPublishResponse
        )


class TopicServiceStub(betterproto.ServiceStub):
    async def list(self) -> "TopicListResponse":

        request = TopicListRequest()

        return await self._unary_unary(
            "/nitric.event.v1.TopicService/List", request, TopicListResponse
        )


class DeadLetterServiceStub(betterproto.ServiceStub):
    async def receive(
        self, *, name: str = "", depth: int = 0
    ) -> "DeadLetterReceiveResponse":

        request = DeadLetterReceiveRequest()
        request.name = name
        request.depth = depth

        return await self._unary_unary(
            "/nitric.event.v1.DeadLetterService/Receive",
            request,
            DeadLetterReceiveResponse,
        )

    async def complete(
        self, *, name: str = "", id: str = ""
    ) -> "DeadLetterCompleteResponse":

        request = DeadLetterCompleteRequest()
        request.name = name
        request.id = id

        return await self._unary_unary(
            "/nitric.event.v1.DeadLetterService/Complete",
            request,
            DeadLetterCompleteResponse,
        )


class EventServiceBase(ServiceBase):
    async def publish(self, topic: str, event: "NitricEvent") -> "EventPublishResponse":
        raise grpclib.GRPCError(grpclib.const.Status.UNIMPLEMENTED)

    async def __rpc_publish(self, stream: grpclib.server.Stream) -> None:
        request = await stream.recv_message()

        request_kwargs = {
            "topic": request.topic,
            "event": request.event,
        }

        response = await self.publish(**request_kwargs)
        await stream.send_message(response)

    def __mapping__(self) -> Dict[str, grpclib.const.Handler]:
        return {
            "/nitric.event.v1.EventService/Publish": grpclib.const.Handler(
                self.__rpc_publish,
                grpclib.const.Cardinality.UNARY_UNARY,
                EventPublishRequest,
                EventPublishResponse,
            ),
        }


class TopicServiceBase(ServiceBase):
    async def list(self) -> "TopicListResponse":
        raise grpclib.GRPCError(grpclib.const.Status.UNIMPLEMENTED)

    async def __rpc_list(self, stream: grpclib.server.Stream) -> None:
        request = await stream.recv_message()

        request_kwargs = {}

        response = await self.list(**request_kwargs)
        await stream.send_message(response)

    def __mapping__(self) -> Dict[str, grpclib.const.Handler]:
        return {
            "/nitric.event.v1.TopicService/List": grpclib.const.Handler(
                self.__rpc_list,
                grpclib.const.Cardinality.UNARY_UNARY,
                TopicListRequest,
                TopicListResponse,
            ),
        }


class DeadLetterServiceBase(ServiceBase):
    async def receive(self, name: str, depth: int) -> "DeadLetterReceiveResponse":
        raise grpclib.GRPCError(grpclib.const.Status.UNIMPLEMENTED)

    async def complete(self, name: str, id: str) -> "DeadLetterCompleteResponse":
        raise grpclib.GRPCError(grpclib.const.Status.UNIMPLEMENTED)

    async def __rpc_receive(self, stream: grpclib.server.Stream) -> None:
        request = await stream.recv_message()

        request_kwargs = {
            "name": request.name,
            "depth": request.depth,
        }

        response = await self.receive(**request_kwargs)
        await stream.send_message(response)

    async def __rpc_complete(self, stream: grpclib.server.Stream) -> None:
        request = await stream.recv_message()

        request_kwargs = {
            "name": request.name,
            "id": request.id,
        }

        response = await self.complete(**request_kwargs)
        await stream.send_message(response)

    def __mapping__(self) -> Dict[str, grpclib.const.Handler]:
        return {
            "/nitric.event.v1.DeadLetterService/Receive": grpclib.const.Handler(
                self.__rpc_receive,
                grpclib.const.Cardinality.UNARY_UNARY,
                DeadLetterReceiveRequest,
                DeadLetterReceiveResponse,
            ),
            "/nitric.event.v1.DeadLetterService/Complete": grpclib.const.Handler(
                self.__rpc_complete,
                grpclib.const.Cardinality.UNARY_UNARY,
                DeadLetterCompleteRequest,
                DeadLetterCompleteResponse,
            ),
        }


import betterproto.lib.google.protobuf as betterproto_lib_google_protobuf
