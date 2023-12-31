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
    'GetSubaccountTrustConfigurationResult',
    'AwaitableGetSubaccountTrustConfigurationResult',
    'get_subaccount_trust_configuration',
    'get_subaccount_trust_configuration_output',
]

@pulumi.output_type
class GetSubaccountTrustConfigurationResult:
    """
    A collection of values returned by getSubaccountTrustConfiguration.
    """
    def __init__(__self__, auto_create_shadow_users=None, available_for_user_logon=None, description=None, domain=None, id=None, identity_provider=None, link_text=None, name=None, origin=None, protocol=None, read_only=None, status=None, subaccount_id=None, type=None):
        if auto_create_shadow_users and not isinstance(auto_create_shadow_users, bool):
            raise TypeError("Expected argument 'auto_create_shadow_users' to be a bool")
        pulumi.set(__self__, "auto_create_shadow_users", auto_create_shadow_users)
        if available_for_user_logon and not isinstance(available_for_user_logon, bool):
            raise TypeError("Expected argument 'available_for_user_logon' to be a bool")
        pulumi.set(__self__, "available_for_user_logon", available_for_user_logon)
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
        if link_text and not isinstance(link_text, str):
            raise TypeError("Expected argument 'link_text' to be a str")
        pulumi.set(__self__, "link_text", link_text)
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
        if subaccount_id and not isinstance(subaccount_id, str):
            raise TypeError("Expected argument 'subaccount_id' to be a str")
        pulumi.set(__self__, "subaccount_id", subaccount_id)
        if type and not isinstance(type, str):
            raise TypeError("Expected argument 'type' to be a str")
        pulumi.set(__self__, "type", type)

    @property
    @pulumi.getter(name="autoCreateShadowUsers")
    def auto_create_shadow_users(self) -> bool:
        """
        Shows whether any user from the tenant can log in. If not set, only the ones who already have a shadow user can log in.
        """
        return pulumi.get(self, "auto_create_shadow_users")

    @property
    @pulumi.getter(name="availableForUserLogon")
    def available_for_user_logon(self) -> bool:
        """
        Shows whether end users can choose the trust configuration for login. If not set, the trust configuration can remain active, however only application users that explicitly specify the origin key can use if for login.
        """
        return pulumi.get(self, "available_for_user_logon")

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
        The name of the Identity Authentication tenant the subaccount is connected to.
        """
        return pulumi.get(self, "identity_provider")

    @property
    @pulumi.getter(name="linkText")
    def link_text(self) -> str:
        """
        Short string that helps users to identify the link for login.
        """
        return pulumi.get(self, "link_text")

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
    @pulumi.getter(name="subaccountId")
    def subaccount_id(self) -> str:
        """
        The ID of the subaccount.
        """
        return pulumi.get(self, "subaccount_id")

    @property
    @pulumi.getter
    def type(self) -> str:
        """
        The trust type.
        """
        return pulumi.get(self, "type")


class AwaitableGetSubaccountTrustConfigurationResult(GetSubaccountTrustConfigurationResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetSubaccountTrustConfigurationResult(
            auto_create_shadow_users=self.auto_create_shadow_users,
            available_for_user_logon=self.available_for_user_logon,
            description=self.description,
            domain=self.domain,
            id=self.id,
            identity_provider=self.identity_provider,
            link_text=self.link_text,
            name=self.name,
            origin=self.origin,
            protocol=self.protocol,
            read_only=self.read_only,
            status=self.status,
            subaccount_id=self.subaccount_id,
            type=self.type)


def get_subaccount_trust_configuration(origin: Optional[str] = None,
                                       subaccount_id: Optional[str] = None,
                                       opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetSubaccountTrustConfigurationResult:
    """
    Gets details about a trust configuration.

    __Tip:__
    You must be viewer or administrator of the subaccount.

    __Further documentation:__
    <https://help.sap.com/docs/btp/sap-btp-neo-environment/platform-identity-provider>

    ## Example Usage

    ```python
    import pulumi
    import pulumi_btp as btp

    default = btp.get_subaccount_trust_configuration(origin="sap.default",
        subaccount_id="6aa64c2f-38c1-49a9-b2e8-cf9fea769b7f")
    custom = btp.get_subaccount_trust_configuration(origin="terraformint-platform",
        subaccount_id="6aa64c2f-38c1-49a9-b2e8-cf9fea769b7f")
    ```


    :param str origin: The origin of the identity provider.
    :param str subaccount_id: The ID of the subaccount.
    """
    __args__ = dict()
    __args__['origin'] = origin
    __args__['subaccountId'] = subaccount_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('btp:index/getSubaccountTrustConfiguration:getSubaccountTrustConfiguration', __args__, opts=opts, typ=GetSubaccountTrustConfigurationResult).value

    return AwaitableGetSubaccountTrustConfigurationResult(
        auto_create_shadow_users=pulumi.get(__ret__, 'auto_create_shadow_users'),
        available_for_user_logon=pulumi.get(__ret__, 'available_for_user_logon'),
        description=pulumi.get(__ret__, 'description'),
        domain=pulumi.get(__ret__, 'domain'),
        id=pulumi.get(__ret__, 'id'),
        identity_provider=pulumi.get(__ret__, 'identity_provider'),
        link_text=pulumi.get(__ret__, 'link_text'),
        name=pulumi.get(__ret__, 'name'),
        origin=pulumi.get(__ret__, 'origin'),
        protocol=pulumi.get(__ret__, 'protocol'),
        read_only=pulumi.get(__ret__, 'read_only'),
        status=pulumi.get(__ret__, 'status'),
        subaccount_id=pulumi.get(__ret__, 'subaccount_id'),
        type=pulumi.get(__ret__, 'type'))


@_utilities.lift_output_func(get_subaccount_trust_configuration)
def get_subaccount_trust_configuration_output(origin: Optional[pulumi.Input[str]] = None,
                                              subaccount_id: Optional[pulumi.Input[str]] = None,
                                              opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetSubaccountTrustConfigurationResult]:
    """
    Gets details about a trust configuration.

    __Tip:__
    You must be viewer or administrator of the subaccount.

    __Further documentation:__
    <https://help.sap.com/docs/btp/sap-btp-neo-environment/platform-identity-provider>

    ## Example Usage

    ```python
    import pulumi
    import pulumi_btp as btp

    default = btp.get_subaccount_trust_configuration(origin="sap.default",
        subaccount_id="6aa64c2f-38c1-49a9-b2e8-cf9fea769b7f")
    custom = btp.get_subaccount_trust_configuration(origin="terraformint-platform",
        subaccount_id="6aa64c2f-38c1-49a9-b2e8-cf9fea769b7f")
    ```


    :param str origin: The origin of the identity provider.
    :param str subaccount_id: The ID of the subaccount.
    """
    ...
