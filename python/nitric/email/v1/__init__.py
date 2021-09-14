# Generated by the protocol buffer compiler.  DO NOT EDIT!
# sources: proto/email/v1/email.proto
# plugin: python-betterproto
from dataclasses import dataclass
from typing import Dict, List, Optional

import betterproto
from betterproto.grpc.grpclib_server import ServiceBase
import grpclib


@dataclass(eq=False, repr=False)
class EmailBody(betterproto.Message):
    """Content of an email message"""

    # Plain text content for non-HTML supporting email clients
    text: str = betterproto.string_field(1)
    # Optional HTML email content
    html: str = betterproto.string_field(2)


@dataclass(eq=False, repr=False)
class EmailSendRequest(betterproto.Message):
    """Request to queue an email message"""

    from_: str = betterproto.string_field(1)
    to: List[str] = betterproto.string_field(2)
    cc: List[str] = betterproto.string_field(3)
    bcc: List[str] = betterproto.string_field(4)
    subject: str = betterproto.string_field(5)
    body: "EmailBody" = betterproto.message_field(6)


@dataclass(eq=False, repr=False)
class EmailSendResponse(betterproto.Message):
    """Result of sending an email message"""

    pass


class EmailServiceStub(betterproto.ServiceStub):
    async def send(
        self,
        *,
        from_: str = "",
        to: Optional[List[str]] = None,
        cc: Optional[List[str]] = None,
        bcc: Optional[List[str]] = None,
        subject: str = "",
        body: "EmailBody" = None,
    ) -> "EmailSendResponse":
        to = to or []
        cc = cc or []
        bcc = bcc or []

        request = EmailSendRequest()
        request.from_ = from_
        request.to = to
        request.cc = cc
        request.bcc = bcc
        request.subject = subject
        if body is not None:
            request.body = body

        return await self._unary_unary(
            "/nitric.email.v1.EmailService/Send", request, EmailSendResponse
        )


class EmailServiceBase(ServiceBase):
    async def send(
        self,
        from_: str,
        to: Optional[List[str]],
        cc: Optional[List[str]],
        bcc: Optional[List[str]],
        subject: str,
        body: "EmailBody",
    ) -> "EmailSendResponse":
        raise grpclib.GRPCError(grpclib.const.Status.UNIMPLEMENTED)

    async def __rpc_send(self, stream: grpclib.server.Stream) -> None:
        request = await stream.recv_message()

        request_kwargs = {
            "from_": request.from_,
            "to": request.to,
            "cc": request.cc,
            "bcc": request.bcc,
            "subject": request.subject,
            "body": request.body,
        }

        response = await self.send(**request_kwargs)
        await stream.send_message(response)

    def __mapping__(self) -> Dict[str, grpclib.const.Handler]:
        return {
            "/nitric.email.v1.EmailService/Send": grpclib.const.Handler(
                self.__rpc_send,
                grpclib.const.Cardinality.UNARY_UNARY,
                EmailSendRequest,
                EmailSendResponse,
            ),
        }