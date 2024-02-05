# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['SubaccountTrustConfigurationArgs', 'SubaccountTrustConfiguration']

@pulumi.input_type
class SubaccountTrustConfigurationArgs:
    def __init__(__self__, *,
                 identity_provider: pulumi.Input[str],
                 subaccount_id: pulumi.Input[str],
                 auto_create_shadow_users: Optional[pulumi.Input[bool]] = None,
                 available_for_user_logon: Optional[pulumi.Input[bool]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 domain: Optional[pulumi.Input[str]] = None,
                 link_text: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 status: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a SubaccountTrustConfiguration resource.
        :param pulumi.Input[str] identity_provider: The name of the Identity Authentication tenant that you want to connect to the subaccount.
        :param pulumi.Input[str] subaccount_id: The ID of the subaccount.
        :param pulumi.Input[bool] auto_create_shadow_users: Determines that any user from the tenant can log in. If not set, only the ones who already have a shadow user can log in.
        :param pulumi.Input[bool] available_for_user_logon: Determines that end users can choose the trust configuration for login. If not set, the trust configuration can remain active, however only application users that explicitly specify the origin key can use if for login.
        :param pulumi.Input[str] description: Description of the trust configuration.
        :param pulumi.Input[str] domain: The tenant's domain which should be used for user logon.
        :param pulumi.Input[str] link_text: Short string that helps users to identify the link for login.
        :param pulumi.Input[str] name: The display name of the trust configuration.
        :param pulumi.Input[str] status: Determines whether the identity provider is currently 'active' or 'inactive'.
        """
        pulumi.set(__self__, "identity_provider", identity_provider)
        pulumi.set(__self__, "subaccount_id", subaccount_id)
        if auto_create_shadow_users is not None:
            pulumi.set(__self__, "auto_create_shadow_users", auto_create_shadow_users)
        if available_for_user_logon is not None:
            pulumi.set(__self__, "available_for_user_logon", available_for_user_logon)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if domain is not None:
            pulumi.set(__self__, "domain", domain)
        if link_text is not None:
            pulumi.set(__self__, "link_text", link_text)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if status is not None:
            pulumi.set(__self__, "status", status)

    @property
    @pulumi.getter(name="identityProvider")
    def identity_provider(self) -> pulumi.Input[str]:
        """
        The name of the Identity Authentication tenant that you want to connect to the subaccount.
        """
        return pulumi.get(self, "identity_provider")

    @identity_provider.setter
    def identity_provider(self, value: pulumi.Input[str]):
        pulumi.set(self, "identity_provider", value)

    @property
    @pulumi.getter(name="subaccountId")
    def subaccount_id(self) -> pulumi.Input[str]:
        """
        The ID of the subaccount.
        """
        return pulumi.get(self, "subaccount_id")

    @subaccount_id.setter
    def subaccount_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "subaccount_id", value)

    @property
    @pulumi.getter(name="autoCreateShadowUsers")
    def auto_create_shadow_users(self) -> Optional[pulumi.Input[bool]]:
        """
        Determines that any user from the tenant can log in. If not set, only the ones who already have a shadow user can log in.
        """
        return pulumi.get(self, "auto_create_shadow_users")

    @auto_create_shadow_users.setter
    def auto_create_shadow_users(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "auto_create_shadow_users", value)

    @property
    @pulumi.getter(name="availableForUserLogon")
    def available_for_user_logon(self) -> Optional[pulumi.Input[bool]]:
        """
        Determines that end users can choose the trust configuration for login. If not set, the trust configuration can remain active, however only application users that explicitly specify the origin key can use if for login.
        """
        return pulumi.get(self, "available_for_user_logon")

    @available_for_user_logon.setter
    def available_for_user_logon(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "available_for_user_logon", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        Description of the trust configuration.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter
    def domain(self) -> Optional[pulumi.Input[str]]:
        """
        The tenant's domain which should be used for user logon.
        """
        return pulumi.get(self, "domain")

    @domain.setter
    def domain(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "domain", value)

    @property
    @pulumi.getter(name="linkText")
    def link_text(self) -> Optional[pulumi.Input[str]]:
        """
        Short string that helps users to identify the link for login.
        """
        return pulumi.get(self, "link_text")

    @link_text.setter
    def link_text(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "link_text", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The display name of the trust configuration.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def status(self) -> Optional[pulumi.Input[str]]:
        """
        Determines whether the identity provider is currently 'active' or 'inactive'.
        """
        return pulumi.get(self, "status")

    @status.setter
    def status(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "status", value)


@pulumi.input_type
class _SubaccountTrustConfigurationState:
    def __init__(__self__, *,
                 auto_create_shadow_users: Optional[pulumi.Input[bool]] = None,
                 available_for_user_logon: Optional[pulumi.Input[bool]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 domain: Optional[pulumi.Input[str]] = None,
                 identity_provider: Optional[pulumi.Input[str]] = None,
                 link_text: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 origin: Optional[pulumi.Input[str]] = None,
                 protocol: Optional[pulumi.Input[str]] = None,
                 read_only: Optional[pulumi.Input[bool]] = None,
                 status: Optional[pulumi.Input[str]] = None,
                 subaccount_id: Optional[pulumi.Input[str]] = None,
                 type: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering SubaccountTrustConfiguration resources.
        :param pulumi.Input[bool] auto_create_shadow_users: Determines that any user from the tenant can log in. If not set, only the ones who already have a shadow user can log in.
        :param pulumi.Input[bool] available_for_user_logon: Determines that end users can choose the trust configuration for login. If not set, the trust configuration can remain active, however only application users that explicitly specify the origin key can use if for login.
        :param pulumi.Input[str] description: Description of the trust configuration.
        :param pulumi.Input[str] domain: The tenant's domain which should be used for user logon.
        :param pulumi.Input[str] identity_provider: The name of the Identity Authentication tenant that you want to connect to the subaccount.
        :param pulumi.Input[str] link_text: Short string that helps users to identify the link for login.
        :param pulumi.Input[str] name: The display name of the trust configuration.
        :param pulumi.Input[str] origin: The origin of the identity provider.
        :param pulumi.Input[str] protocol: The protocol used to establish trust with the identity provider.
        :param pulumi.Input[bool] read_only: Shows whether the trust configuration can be modified.
        :param pulumi.Input[str] status: Determines whether the identity provider is currently 'active' or 'inactive'.
        :param pulumi.Input[str] subaccount_id: The ID of the subaccount.
        :param pulumi.Input[str] type: The trust type.
        """
        if auto_create_shadow_users is not None:
            pulumi.set(__self__, "auto_create_shadow_users", auto_create_shadow_users)
        if available_for_user_logon is not None:
            pulumi.set(__self__, "available_for_user_logon", available_for_user_logon)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if domain is not None:
            pulumi.set(__self__, "domain", domain)
        if identity_provider is not None:
            pulumi.set(__self__, "identity_provider", identity_provider)
        if link_text is not None:
            pulumi.set(__self__, "link_text", link_text)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if origin is not None:
            pulumi.set(__self__, "origin", origin)
        if protocol is not None:
            pulumi.set(__self__, "protocol", protocol)
        if read_only is not None:
            pulumi.set(__self__, "read_only", read_only)
        if status is not None:
            pulumi.set(__self__, "status", status)
        if subaccount_id is not None:
            pulumi.set(__self__, "subaccount_id", subaccount_id)
        if type is not None:
            pulumi.set(__self__, "type", type)

    @property
    @pulumi.getter(name="autoCreateShadowUsers")
    def auto_create_shadow_users(self) -> Optional[pulumi.Input[bool]]:
        """
        Determines that any user from the tenant can log in. If not set, only the ones who already have a shadow user can log in.
        """
        return pulumi.get(self, "auto_create_shadow_users")

    @auto_create_shadow_users.setter
    def auto_create_shadow_users(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "auto_create_shadow_users", value)

    @property
    @pulumi.getter(name="availableForUserLogon")
    def available_for_user_logon(self) -> Optional[pulumi.Input[bool]]:
        """
        Determines that end users can choose the trust configuration for login. If not set, the trust configuration can remain active, however only application users that explicitly specify the origin key can use if for login.
        """
        return pulumi.get(self, "available_for_user_logon")

    @available_for_user_logon.setter
    def available_for_user_logon(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "available_for_user_logon", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        Description of the trust configuration.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter
    def domain(self) -> Optional[pulumi.Input[str]]:
        """
        The tenant's domain which should be used for user logon.
        """
        return pulumi.get(self, "domain")

    @domain.setter
    def domain(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "domain", value)

    @property
    @pulumi.getter(name="identityProvider")
    def identity_provider(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the Identity Authentication tenant that you want to connect to the subaccount.
        """
        return pulumi.get(self, "identity_provider")

    @identity_provider.setter
    def identity_provider(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "identity_provider", value)

    @property
    @pulumi.getter(name="linkText")
    def link_text(self) -> Optional[pulumi.Input[str]]:
        """
        Short string that helps users to identify the link for login.
        """
        return pulumi.get(self, "link_text")

    @link_text.setter
    def link_text(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "link_text", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The display name of the trust configuration.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def origin(self) -> Optional[pulumi.Input[str]]:
        """
        The origin of the identity provider.
        """
        return pulumi.get(self, "origin")

    @origin.setter
    def origin(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "origin", value)

    @property
    @pulumi.getter
    def protocol(self) -> Optional[pulumi.Input[str]]:
        """
        The protocol used to establish trust with the identity provider.
        """
        return pulumi.get(self, "protocol")

    @protocol.setter
    def protocol(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "protocol", value)

    @property
    @pulumi.getter(name="readOnly")
    def read_only(self) -> Optional[pulumi.Input[bool]]:
        """
        Shows whether the trust configuration can be modified.
        """
        return pulumi.get(self, "read_only")

    @read_only.setter
    def read_only(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "read_only", value)

    @property
    @pulumi.getter
    def status(self) -> Optional[pulumi.Input[str]]:
        """
        Determines whether the identity provider is currently 'active' or 'inactive'.
        """
        return pulumi.get(self, "status")

    @status.setter
    def status(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "status", value)

    @property
    @pulumi.getter(name="subaccountId")
    def subaccount_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the subaccount.
        """
        return pulumi.get(self, "subaccount_id")

    @subaccount_id.setter
    def subaccount_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "subaccount_id", value)

    @property
    @pulumi.getter
    def type(self) -> Optional[pulumi.Input[str]]:
        """
        The trust type.
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "type", value)


class SubaccountTrustConfiguration(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 auto_create_shadow_users: Optional[pulumi.Input[bool]] = None,
                 available_for_user_logon: Optional[pulumi.Input[bool]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 domain: Optional[pulumi.Input[str]] = None,
                 identity_provider: Optional[pulumi.Input[str]] = None,
                 link_text: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 status: Optional[pulumi.Input[str]] = None,
                 subaccount_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Establishes trust from a subaccount to an Identity Authentication tenant.

        __Further documentation:__
        <https://help.sap.com/docs/btp/sap-business-technology-platform/trust-and-federation-with-identity-providers>

        ## Example Usage

        ```python
        import pulumi
        import lechnerc77_pulumi_btp as btp

        # create a new simple trust configuration for a subaccount
        # for a Custom Identity Provider for Applications
        simple = btp.SubaccountTrustConfiguration("simple",
            identity_provider="terraformint.accounts400.ondemand.com",
            subaccount_id="6aa64c2f-38c1-49a9-b2e8-cf9fea769b7f")
        # create a new fully customized trust configuration for a subaccount 
        # for a Custom Identity Provider for Applications
        fully_customized = btp.SubaccountTrustConfiguration("fullyCustomized",
            description="my-description",
            identity_provider="terraformint.accounts400.ondemand.com",
            subaccount_id="6aa64c2f-38c1-49a9-b2e8-cf9fea769b7f")
        ```

        ## Import

        terraform

        ```sh
         $ pulumi import btp:index/subaccountTrustConfiguration:SubaccountTrustConfiguration terraform importbtp_subaccount_trust_configuration.<resource_name> <subaccount_id>,<origin>
        ```

        ```sh
         $ pulumi import btp:index/subaccountTrustConfiguration:SubaccountTrustConfiguration trust 6aa64c2f-38c1-49a9-b2e8-cf9fea769b7f,sap.custom
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] auto_create_shadow_users: Determines that any user from the tenant can log in. If not set, only the ones who already have a shadow user can log in.
        :param pulumi.Input[bool] available_for_user_logon: Determines that end users can choose the trust configuration for login. If not set, the trust configuration can remain active, however only application users that explicitly specify the origin key can use if for login.
        :param pulumi.Input[str] description: Description of the trust configuration.
        :param pulumi.Input[str] domain: The tenant's domain which should be used for user logon.
        :param pulumi.Input[str] identity_provider: The name of the Identity Authentication tenant that you want to connect to the subaccount.
        :param pulumi.Input[str] link_text: Short string that helps users to identify the link for login.
        :param pulumi.Input[str] name: The display name of the trust configuration.
        :param pulumi.Input[str] status: Determines whether the identity provider is currently 'active' or 'inactive'.
        :param pulumi.Input[str] subaccount_id: The ID of the subaccount.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: SubaccountTrustConfigurationArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Establishes trust from a subaccount to an Identity Authentication tenant.

        __Further documentation:__
        <https://help.sap.com/docs/btp/sap-business-technology-platform/trust-and-federation-with-identity-providers>

        ## Example Usage

        ```python
        import pulumi
        import lechnerc77_pulumi_btp as btp

        # create a new simple trust configuration for a subaccount
        # for a Custom Identity Provider for Applications
        simple = btp.SubaccountTrustConfiguration("simple",
            identity_provider="terraformint.accounts400.ondemand.com",
            subaccount_id="6aa64c2f-38c1-49a9-b2e8-cf9fea769b7f")
        # create a new fully customized trust configuration for a subaccount 
        # for a Custom Identity Provider for Applications
        fully_customized = btp.SubaccountTrustConfiguration("fullyCustomized",
            description="my-description",
            identity_provider="terraformint.accounts400.ondemand.com",
            subaccount_id="6aa64c2f-38c1-49a9-b2e8-cf9fea769b7f")
        ```

        ## Import

        terraform

        ```sh
         $ pulumi import btp:index/subaccountTrustConfiguration:SubaccountTrustConfiguration terraform importbtp_subaccount_trust_configuration.<resource_name> <subaccount_id>,<origin>
        ```

        ```sh
         $ pulumi import btp:index/subaccountTrustConfiguration:SubaccountTrustConfiguration trust 6aa64c2f-38c1-49a9-b2e8-cf9fea769b7f,sap.custom
        ```

        :param str resource_name: The name of the resource.
        :param SubaccountTrustConfigurationArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(SubaccountTrustConfigurationArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 auto_create_shadow_users: Optional[pulumi.Input[bool]] = None,
                 available_for_user_logon: Optional[pulumi.Input[bool]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 domain: Optional[pulumi.Input[str]] = None,
                 identity_provider: Optional[pulumi.Input[str]] = None,
                 link_text: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 status: Optional[pulumi.Input[str]] = None,
                 subaccount_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = SubaccountTrustConfigurationArgs.__new__(SubaccountTrustConfigurationArgs)

            __props__.__dict__["auto_create_shadow_users"] = auto_create_shadow_users
            __props__.__dict__["available_for_user_logon"] = available_for_user_logon
            __props__.__dict__["description"] = description
            __props__.__dict__["domain"] = domain
            if identity_provider is None and not opts.urn:
                raise TypeError("Missing required property 'identity_provider'")
            __props__.__dict__["identity_provider"] = identity_provider
            __props__.__dict__["link_text"] = link_text
            __props__.__dict__["name"] = name
            __props__.__dict__["status"] = status
            if subaccount_id is None and not opts.urn:
                raise TypeError("Missing required property 'subaccount_id'")
            __props__.__dict__["subaccount_id"] = subaccount_id
            __props__.__dict__["origin"] = None
            __props__.__dict__["protocol"] = None
            __props__.__dict__["read_only"] = None
            __props__.__dict__["type"] = None
        super(SubaccountTrustConfiguration, __self__).__init__(
            'btp:index/subaccountTrustConfiguration:SubaccountTrustConfiguration',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            auto_create_shadow_users: Optional[pulumi.Input[bool]] = None,
            available_for_user_logon: Optional[pulumi.Input[bool]] = None,
            description: Optional[pulumi.Input[str]] = None,
            domain: Optional[pulumi.Input[str]] = None,
            identity_provider: Optional[pulumi.Input[str]] = None,
            link_text: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            origin: Optional[pulumi.Input[str]] = None,
            protocol: Optional[pulumi.Input[str]] = None,
            read_only: Optional[pulumi.Input[bool]] = None,
            status: Optional[pulumi.Input[str]] = None,
            subaccount_id: Optional[pulumi.Input[str]] = None,
            type: Optional[pulumi.Input[str]] = None) -> 'SubaccountTrustConfiguration':
        """
        Get an existing SubaccountTrustConfiguration resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] auto_create_shadow_users: Determines that any user from the tenant can log in. If not set, only the ones who already have a shadow user can log in.
        :param pulumi.Input[bool] available_for_user_logon: Determines that end users can choose the trust configuration for login. If not set, the trust configuration can remain active, however only application users that explicitly specify the origin key can use if for login.
        :param pulumi.Input[str] description: Description of the trust configuration.
        :param pulumi.Input[str] domain: The tenant's domain which should be used for user logon.
        :param pulumi.Input[str] identity_provider: The name of the Identity Authentication tenant that you want to connect to the subaccount.
        :param pulumi.Input[str] link_text: Short string that helps users to identify the link for login.
        :param pulumi.Input[str] name: The display name of the trust configuration.
        :param pulumi.Input[str] origin: The origin of the identity provider.
        :param pulumi.Input[str] protocol: The protocol used to establish trust with the identity provider.
        :param pulumi.Input[bool] read_only: Shows whether the trust configuration can be modified.
        :param pulumi.Input[str] status: Determines whether the identity provider is currently 'active' or 'inactive'.
        :param pulumi.Input[str] subaccount_id: The ID of the subaccount.
        :param pulumi.Input[str] type: The trust type.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _SubaccountTrustConfigurationState.__new__(_SubaccountTrustConfigurationState)

        __props__.__dict__["auto_create_shadow_users"] = auto_create_shadow_users
        __props__.__dict__["available_for_user_logon"] = available_for_user_logon
        __props__.__dict__["description"] = description
        __props__.__dict__["domain"] = domain
        __props__.__dict__["identity_provider"] = identity_provider
        __props__.__dict__["link_text"] = link_text
        __props__.__dict__["name"] = name
        __props__.__dict__["origin"] = origin
        __props__.__dict__["protocol"] = protocol
        __props__.__dict__["read_only"] = read_only
        __props__.__dict__["status"] = status
        __props__.__dict__["subaccount_id"] = subaccount_id
        __props__.__dict__["type"] = type
        return SubaccountTrustConfiguration(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="autoCreateShadowUsers")
    def auto_create_shadow_users(self) -> pulumi.Output[bool]:
        """
        Determines that any user from the tenant can log in. If not set, only the ones who already have a shadow user can log in.
        """
        return pulumi.get(self, "auto_create_shadow_users")

    @property
    @pulumi.getter(name="availableForUserLogon")
    def available_for_user_logon(self) -> pulumi.Output[bool]:
        """
        Determines that end users can choose the trust configuration for login. If not set, the trust configuration can remain active, however only application users that explicitly specify the origin key can use if for login.
        """
        return pulumi.get(self, "available_for_user_logon")

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[str]:
        """
        Description of the trust configuration.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def domain(self) -> pulumi.Output[str]:
        """
        The tenant's domain which should be used for user logon.
        """
        return pulumi.get(self, "domain")

    @property
    @pulumi.getter(name="identityProvider")
    def identity_provider(self) -> pulumi.Output[str]:
        """
        The name of the Identity Authentication tenant that you want to connect to the subaccount.
        """
        return pulumi.get(self, "identity_provider")

    @property
    @pulumi.getter(name="linkText")
    def link_text(self) -> pulumi.Output[str]:
        """
        Short string that helps users to identify the link for login.
        """
        return pulumi.get(self, "link_text")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The display name of the trust configuration.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def origin(self) -> pulumi.Output[str]:
        """
        The origin of the identity provider.
        """
        return pulumi.get(self, "origin")

    @property
    @pulumi.getter
    def protocol(self) -> pulumi.Output[str]:
        """
        The protocol used to establish trust with the identity provider.
        """
        return pulumi.get(self, "protocol")

    @property
    @pulumi.getter(name="readOnly")
    def read_only(self) -> pulumi.Output[bool]:
        """
        Shows whether the trust configuration can be modified.
        """
        return pulumi.get(self, "read_only")

    @property
    @pulumi.getter
    def status(self) -> pulumi.Output[str]:
        """
        Determines whether the identity provider is currently 'active' or 'inactive'.
        """
        return pulumi.get(self, "status")

    @property
    @pulumi.getter(name="subaccountId")
    def subaccount_id(self) -> pulumi.Output[str]:
        """
        The ID of the subaccount.
        """
        return pulumi.get(self, "subaccount_id")

    @property
    @pulumi.getter
    def type(self) -> pulumi.Output[str]:
        """
        The trust type.
        """
        return pulumi.get(self, "type")

