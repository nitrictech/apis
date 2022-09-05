# Generated by the protocol buffer compiler.  DO NOT EDIT!
# sources: proto/error/v1/error.proto
# plugin: python-betterproto
from dataclasses import dataclass
from typing import Dict

import betterproto


@dataclass(eq=False, repr=False)
class ErrorScope(betterproto.Message):
    service: str = betterproto.string_field(1)
    """The API service invoked, e.g. 'Service.Method'."""

    plugin: str = betterproto.string_field(2)
    """The plugin method invoked, e.g. 'PluginService.Method'."""

    args: Dict[str, str] = betterproto.map_field(
        3, betterproto.TYPE_STRING, betterproto.TYPE_STRING
    )
    """
    The plugin method arguments, ensure only non-sensitive data is specified.
    """


@dataclass(eq=False, repr=False)
class ErrorDetails(betterproto.Message):
    message: str = betterproto.string_field(1)
    """
    The developer error message, explaining the error and ideally solution.
    """

    cause: str = betterproto.string_field(2)
    """The error root cause."""

    scope: "ErrorScope" = betterproto.message_field(3)
    """The scope of the error."""
