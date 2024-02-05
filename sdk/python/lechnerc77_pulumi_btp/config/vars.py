# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

import types

__config__ = pulumi.Config('btp')


class _ExportableConfig(types.ModuleType):
    @property
    def cli_server_url(self) -> Optional[str]:
        """
        The URL of the BTP CLI server (e.g. `https://cli.btp.cloud.sap`).
        """
        return __config__.get('cliServerUrl')

    @property
    def globalaccount(self) -> Optional[str]:
        """
        The subdomain of the global account in which you want to manage resources. To be found in the cockpit, in the global
        account view.
        """
        return __config__.get('globalaccount')

    @property
    def idp(self) -> Optional[str]:
        """
        The identity provider to be used for authentication (only required for custom idp).
        """
        return __config__.get('idp')

    @property
    def idtoken(self) -> Optional[str]:
        """
        A valid id token. To be provided instead of 'username' and 'password'. This can also be sourced from the `BTP_IDTOKEN`
        environment variable. (SAP-internal usage only)
        """
        return __config__.get('idtoken')

    @property
    def password(self) -> Optional[str]:
        """
        Your password. Note that two-factor authentication is not supported. This can also be sourced from the `BTP_PASSWORD`
        environment variable.
        """
        return __config__.get('password')

    @property
    def tls_client_certificate(self) -> Optional[str]:
        """
        PEM encoded certificate (only required for x509 auth).
        """
        return __config__.get('tlsClientCertificate')

    @property
    def tls_client_key(self) -> Optional[str]:
        """
        PEM encoded private key (only required for x509 auth).
        """
        return __config__.get('tlsClientKey')

    @property
    def tls_idp_url(self) -> Optional[str]:
        """
        The URL of the identity provider to be used for authentication (only required for x509 auth).
        """
        return __config__.get('tlsIdpUrl')

    @property
    def username(self) -> Optional[str]:
        """
        Your user name, usually an e-mail address. This can also be sourced from the `BTP_USERNAME` environment variable.
        """
        return __config__.get('username')

