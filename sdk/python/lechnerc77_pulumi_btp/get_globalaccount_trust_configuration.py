# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = [
    'GetGlobalaccountTrustConfigurationResult',
    'AwaitableGetGlobalaccountTrustConfigurationResult',
    'get_globalaccount_trust_configuration',
    'get_globalaccount_trust_configuration_output',
]

@pulumi.output_type
class GetGlobalaccountTrustConfigurationResult:
    """
    A collection of values returned by getGlobalaccountTrustConfiguration.
    """
    def __init__(__self__, description=None, domain=None, id=None, identity_provider=None, name=None, origin=None, protocol=None, read_only=None, status=None, type=None):
        if description and not isinstance(description, str):
            raise TypeError("Expected argument 'description' to be a str")
        pulumi.set(__self__, "description", description)
        if domain and not isinstance(domain, str):
            raise TypeError("Expected argument 'domain' to be a str")
        pulumi.set(__self__, "domain", domain)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if identity_provider and not isinstance(identity_provider, str):
            raise TypeError("Expected argument 'identity_provider' to be a str")
        pulumi.set(__self__, "identity_provider", identity_provider)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if origin and not isinstance(origin, str):
            raise TypeError("Expected argument 'origin' to be a str")
        pulumi.set(__self__, "origin", origin)
        if protocol and not isinstance(protocol, str):
            raise TypeError("Expected argument 'protocol' to be a str")
        pulumi.set(__self__, "protocol", protocol)
        if read_only and not isinstance(read_only, bool):
            raise TypeError("Expected argument 'read_only' to be a bool")
        pulumi.set(__self__, "read_only", read_only)
        if status and not isinstance(status, str):
            raise TypeError("Expected argument 'status' to be a str")
        pulumi.set(__self__, "status", status)
        if type and not isinstance(type, str):
            raise TypeError("Expected argument 'type' to be a str")
        pulumi.set(__self__, "type", type)

    @property
    @pulumi.getter
    def description(self) -> str:
        """
        The description of the trust configuration.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def domain(self) -> str:
        """
        The tenant's domain which should be used for user logon.
        """
        return pulumi.get(self, "domain")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The origin of the identity provider.
        """
        warnings.warn("""Use the `origin` attribute instead""", DeprecationWarning)
        pulumi.log.warn("""id is deprecated: Use the `origin` attribute instead""")

        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="identityProvider")
    def identity_provider(self) -> str:
        """
        The name of the Identity Authentication tenant the global account is connected to.
        """
        return pulumi.get(self, "identity_provider")

    @property
    @pulumi.getter
    def name(self) -> str:
        """
        The display name of the trust configuration.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def origin(self) -> str:
        """
        The origin of the identity provider.
        """
        return pulumi.get(self, "origin")

    @property
    @pulumi.getter
    def protocol(self) -> str:
        """
        The protocol used to establish trust with the identity provider.
        """
        return pulumi.get(self, "protocol")

    @property
    @pulumi.getter(name="readOnly")
    def read_only(self) -> bool:
        """
        Shows whether the trust configuration can be modified.
        """
        return pulumi.get(self, "read_only")

    @property
    @pulumi.getter
    def status(self) -> str:
        """
        Shows whether the identity provider is currently 'active' or 'inactive'.
        """
        return pulumi.get(self, "status")

    @property
    @pulumi.getter
    def type(self) -> str:
        """
        The trust type.
        """
        return pulumi.get(self, "type")


class AwaitableGetGlobalaccountTrustConfigurationResult(GetGlobalaccountTrustConfigurationResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetGlobalaccountTrustConfigurationResult(
            description=self.description,
            domain=self.domain,
            id=self.id,
            identity_provider=self.identity_provider,
            name=self.name,
            origin=self.origin,
            protocol=self.protocol,
            read_only=self.read_only,
            status=self.status,
            type=self.type)


def get_globalaccount_trust_configuration(origin: Optional[str] = None,
                                          opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetGlobalaccountTrustConfigurationResult:
    """
    Gets details about a trust configuration.

    __Tip:__
    You must be viewer or administrator of the global account.

    __Further documentation:__
    <https://help.sap.com/docs/btp/sap-btp-neo-environment/platform-identity-provider>

    ## Example Usage

    ```python
    import pulumi
    import pulumi_btp as btp

    default = btp.get_globalaccount_trust_configuration(origin="sap.default")
    custom = btp.get_globalaccount_trust_configuration(origin="terraformint-platform")
    ```


    :param str origin: The origin of the identity provider.
    """
    __args__ = dict()
    __args__['origin'] = origin
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('btp:index/getGlobalaccountTrustConfiguration:getGlobalaccountTrustConfiguration', __args__, opts=opts, typ=GetGlobalaccountTrustConfigurationResult).value

    return AwaitableGetGlobalaccountTrustConfigurationResult(
        description=pulumi.get(__ret__, 'description'),
        domain=pulumi.get(__ret__, 'domain'),
        id=pulumi.get(__ret__, 'id'),
        identity_provider=pulumi.get(__ret__, 'identity_provider'),
        name=pulumi.get(__ret__, 'name'),
        origin=pulumi.get(__ret__, 'origin'),
        protocol=pulumi.get(__ret__, 'protocol'),
        read_only=pulumi.get(__ret__, 'read_only'),
        status=pulumi.get(__ret__, 'status'),
        type=pulumi.get(__ret__, 'type'))


@_utilities.lift_output_func(get_globalaccount_trust_configuration)
def get_globalaccount_trust_configuration_output(origin: Optional[pulumi.Input[str]] = None,
                                                 opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetGlobalaccountTrustConfigurationResult]:
    """
    Gets details about a trust configuration.

    __Tip:__
    You must be viewer or administrator of the global account.

    __Further documentation:__
    <https://help.sap.com/docs/btp/sap-btp-neo-environment/platform-identity-provider>

    ## Example Usage

    ```python
    import pulumi
    import pulumi_btp as btp

    default = btp.get_globalaccount_trust_configuration(origin="sap.default")
    custom = btp.get_globalaccount_trust_configuration(origin="terraformint-platform")
    ```


    :param str origin: The origin of the identity provider.
    """
    ...
