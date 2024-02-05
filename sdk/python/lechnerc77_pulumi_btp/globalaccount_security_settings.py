# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['GlobalaccountSecuritySettingsArgs', 'GlobalaccountSecuritySettings']

@pulumi.input_type
class GlobalaccountSecuritySettingsArgs:
    def __init__(__self__, *,
                 access_token_validity: Optional[pulumi.Input[int]] = None,
                 custom_email_domains: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 default_identity_provider: Optional[pulumi.Input[str]] = None,
                 refresh_token_validity: Optional[pulumi.Input[int]] = None,
                 treat_users_with_same_email_as_same_user: Optional[pulumi.Input[bool]] = None):
        """
        The set of arguments for constructing a GlobalaccountSecuritySettings resource.
        :param pulumi.Input[int] access_token_validity: The validity of the access token.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] custom_email_domains: Set of domains that are allowed to be used for user authentication.
        :param pulumi.Input[str] default_identity_provider: The global account's default identity provider for platform users. Used to log on to platform tools such as SAP BTP cockpit or the btp CLI.
        :param pulumi.Input[int] refresh_token_validity: The validity of the refresh token.
        :param pulumi.Input[bool] treat_users_with_same_email_as_same_user: If set to true, users with the same email are treated as same users.
        """
        if access_token_validity is not None:
            pulumi.set(__self__, "access_token_validity", access_token_validity)
        if custom_email_domains is not None:
            pulumi.set(__self__, "custom_email_domains", custom_email_domains)
        if default_identity_provider is not None:
            pulumi.set(__self__, "default_identity_provider", default_identity_provider)
        if refresh_token_validity is not None:
            pulumi.set(__self__, "refresh_token_validity", refresh_token_validity)
        if treat_users_with_same_email_as_same_user is not None:
            pulumi.set(__self__, "treat_users_with_same_email_as_same_user", treat_users_with_same_email_as_same_user)

    @property
    @pulumi.getter(name="accessTokenValidity")
    def access_token_validity(self) -> Optional[pulumi.Input[int]]:
        """
        The validity of the access token.
        """
        return pulumi.get(self, "access_token_validity")

    @access_token_validity.setter
    def access_token_validity(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "access_token_validity", value)

    @property
    @pulumi.getter(name="customEmailDomains")
    def custom_email_domains(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        Set of domains that are allowed to be used for user authentication.
        """
        return pulumi.get(self, "custom_email_domains")

    @custom_email_domains.setter
    def custom_email_domains(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "custom_email_domains", value)

    @property
    @pulumi.getter(name="defaultIdentityProvider")
    def default_identity_provider(self) -> Optional[pulumi.Input[str]]:
        """
        The global account's default identity provider for platform users. Used to log on to platform tools such as SAP BTP cockpit or the btp CLI.
        """
        return pulumi.get(self, "default_identity_provider")

    @default_identity_provider.setter
    def default_identity_provider(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "default_identity_provider", value)

    @property
    @pulumi.getter(name="refreshTokenValidity")
    def refresh_token_validity(self) -> Optional[pulumi.Input[int]]:
        """
        The validity of the refresh token.
        """
        return pulumi.get(self, "refresh_token_validity")

    @refresh_token_validity.setter
    def refresh_token_validity(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "refresh_token_validity", value)

    @property
    @pulumi.getter(name="treatUsersWithSameEmailAsSameUser")
    def treat_users_with_same_email_as_same_user(self) -> Optional[pulumi.Input[bool]]:
        """
        If set to true, users with the same email are treated as same users.
        """
        return pulumi.get(self, "treat_users_with_same_email_as_same_user")

    @treat_users_with_same_email_as_same_user.setter
    def treat_users_with_same_email_as_same_user(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "treat_users_with_same_email_as_same_user", value)


@pulumi.input_type
class _GlobalaccountSecuritySettingsState:
    def __init__(__self__, *,
                 access_token_validity: Optional[pulumi.Input[int]] = None,
                 custom_email_domains: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 default_identity_provider: Optional[pulumi.Input[str]] = None,
                 refresh_token_validity: Optional[pulumi.Input[int]] = None,
                 treat_users_with_same_email_as_same_user: Optional[pulumi.Input[bool]] = None):
        """
        Input properties used for looking up and filtering GlobalaccountSecuritySettings resources.
        :param pulumi.Input[int] access_token_validity: The validity of the access token.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] custom_email_domains: Set of domains that are allowed to be used for user authentication.
        :param pulumi.Input[str] default_identity_provider: The global account's default identity provider for platform users. Used to log on to platform tools such as SAP BTP cockpit or the btp CLI.
        :param pulumi.Input[int] refresh_token_validity: The validity of the refresh token.
        :param pulumi.Input[bool] treat_users_with_same_email_as_same_user: If set to true, users with the same email are treated as same users.
        """
        if access_token_validity is not None:
            pulumi.set(__self__, "access_token_validity", access_token_validity)
        if custom_email_domains is not None:
            pulumi.set(__self__, "custom_email_domains", custom_email_domains)
        if default_identity_provider is not None:
            pulumi.set(__self__, "default_identity_provider", default_identity_provider)
        if refresh_token_validity is not None:
            pulumi.set(__self__, "refresh_token_validity", refresh_token_validity)
        if treat_users_with_same_email_as_same_user is not None:
            pulumi.set(__self__, "treat_users_with_same_email_as_same_user", treat_users_with_same_email_as_same_user)

    @property
    @pulumi.getter(name="accessTokenValidity")
    def access_token_validity(self) -> Optional[pulumi.Input[int]]:
        """
        The validity of the access token.
        """
        return pulumi.get(self, "access_token_validity")

    @access_token_validity.setter
    def access_token_validity(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "access_token_validity", value)

    @property
    @pulumi.getter(name="customEmailDomains")
    def custom_email_domains(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        Set of domains that are allowed to be used for user authentication.
        """
        return pulumi.get(self, "custom_email_domains")

    @custom_email_domains.setter
    def custom_email_domains(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "custom_email_domains", value)

    @property
    @pulumi.getter(name="defaultIdentityProvider")
    def default_identity_provider(self) -> Optional[pulumi.Input[str]]:
        """
        The global account's default identity provider for platform users. Used to log on to platform tools such as SAP BTP cockpit or the btp CLI.
        """
        return pulumi.get(self, "default_identity_provider")

    @default_identity_provider.setter
    def default_identity_provider(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "default_identity_provider", value)

    @property
    @pulumi.getter(name="refreshTokenValidity")
    def refresh_token_validity(self) -> Optional[pulumi.Input[int]]:
        """
        The validity of the refresh token.
        """
        return pulumi.get(self, "refresh_token_validity")

    @refresh_token_validity.setter
    def refresh_token_validity(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "refresh_token_validity", value)

    @property
    @pulumi.getter(name="treatUsersWithSameEmailAsSameUser")
    def treat_users_with_same_email_as_same_user(self) -> Optional[pulumi.Input[bool]]:
        """
        If set to true, users with the same email are treated as same users.
        """
        return pulumi.get(self, "treat_users_with_same_email_as_same_user")

    @treat_users_with_same_email_as_same_user.setter
    def treat_users_with_same_email_as_same_user(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "treat_users_with_same_email_as_same_user", value)


class GlobalaccountSecuritySettings(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 access_token_validity: Optional[pulumi.Input[int]] = None,
                 custom_email_domains: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 default_identity_provider: Optional[pulumi.Input[str]] = None,
                 refresh_token_validity: Optional[pulumi.Input[int]] = None,
                 treat_users_with_same_email_as_same_user: Optional[pulumi.Input[bool]] = None,
                 __props__=None):
        """
        Sets the security settings of a global account.

        __Tip:__
        You must be administrator of the global account.

        __Further documentation:__
        <https://help.sap.com/docs/btp/sap-business-technology-platform/configure-trusted-domains-for-sap-authorization-and-trust-management-service>
        <https://help.sap.com/docs/btp/sap-business-technology-platform/configure-token-policy-for-sap-authorization-and-trust-management-service>

        ## Example Usage

        ```python
        import pulumi
        import lechnerc77_pulumi_btp as btp

        this = btp.GlobalaccountSecuritySettings("this",
            access_token_validity=3600,
            custom_email_domains=["yourdomain.test"],
            default_identity_provider="sap.custom",
            refresh_token_validity=3600,
            treat_users_with_same_email_as_same_user=True)
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[int] access_token_validity: The validity of the access token.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] custom_email_domains: Set of domains that are allowed to be used for user authentication.
        :param pulumi.Input[str] default_identity_provider: The global account's default identity provider for platform users. Used to log on to platform tools such as SAP BTP cockpit or the btp CLI.
        :param pulumi.Input[int] refresh_token_validity: The validity of the refresh token.
        :param pulumi.Input[bool] treat_users_with_same_email_as_same_user: If set to true, users with the same email are treated as same users.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: Optional[GlobalaccountSecuritySettingsArgs] = None,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Sets the security settings of a global account.

        __Tip:__
        You must be administrator of the global account.

        __Further documentation:__
        <https://help.sap.com/docs/btp/sap-business-technology-platform/configure-trusted-domains-for-sap-authorization-and-trust-management-service>
        <https://help.sap.com/docs/btp/sap-business-technology-platform/configure-token-policy-for-sap-authorization-and-trust-management-service>

        ## Example Usage

        ```python
        import pulumi
        import lechnerc77_pulumi_btp as btp

        this = btp.GlobalaccountSecuritySettings("this",
            access_token_validity=3600,
            custom_email_domains=["yourdomain.test"],
            default_identity_provider="sap.custom",
            refresh_token_validity=3600,
            treat_users_with_same_email_as_same_user=True)
        ```

        :param str resource_name: The name of the resource.
        :param GlobalaccountSecuritySettingsArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(GlobalaccountSecuritySettingsArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 access_token_validity: Optional[pulumi.Input[int]] = None,
                 custom_email_domains: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 default_identity_provider: Optional[pulumi.Input[str]] = None,
                 refresh_token_validity: Optional[pulumi.Input[int]] = None,
                 treat_users_with_same_email_as_same_user: Optional[pulumi.Input[bool]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = GlobalaccountSecuritySettingsArgs.__new__(GlobalaccountSecuritySettingsArgs)

            __props__.__dict__["access_token_validity"] = access_token_validity
            __props__.__dict__["custom_email_domains"] = custom_email_domains
            __props__.__dict__["default_identity_provider"] = default_identity_provider
            __props__.__dict__["refresh_token_validity"] = refresh_token_validity
            __props__.__dict__["treat_users_with_same_email_as_same_user"] = treat_users_with_same_email_as_same_user
        super(GlobalaccountSecuritySettings, __self__).__init__(
            'btp:index/globalaccountSecuritySettings:GlobalaccountSecuritySettings',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            access_token_validity: Optional[pulumi.Input[int]] = None,
            custom_email_domains: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            default_identity_provider: Optional[pulumi.Input[str]] = None,
            refresh_token_validity: Optional[pulumi.Input[int]] = None,
            treat_users_with_same_email_as_same_user: Optional[pulumi.Input[bool]] = None) -> 'GlobalaccountSecuritySettings':
        """
        Get an existing GlobalaccountSecuritySettings resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[int] access_token_validity: The validity of the access token.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] custom_email_domains: Set of domains that are allowed to be used for user authentication.
        :param pulumi.Input[str] default_identity_provider: The global account's default identity provider for platform users. Used to log on to platform tools such as SAP BTP cockpit or the btp CLI.
        :param pulumi.Input[int] refresh_token_validity: The validity of the refresh token.
        :param pulumi.Input[bool] treat_users_with_same_email_as_same_user: If set to true, users with the same email are treated as same users.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _GlobalaccountSecuritySettingsState.__new__(_GlobalaccountSecuritySettingsState)

        __props__.__dict__["access_token_validity"] = access_token_validity
        __props__.__dict__["custom_email_domains"] = custom_email_domains
        __props__.__dict__["default_identity_provider"] = default_identity_provider
        __props__.__dict__["refresh_token_validity"] = refresh_token_validity
        __props__.__dict__["treat_users_with_same_email_as_same_user"] = treat_users_with_same_email_as_same_user
        return GlobalaccountSecuritySettings(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="accessTokenValidity")
    def access_token_validity(self) -> pulumi.Output[int]:
        """
        The validity of the access token.
        """
        return pulumi.get(self, "access_token_validity")

    @property
    @pulumi.getter(name="customEmailDomains")
    def custom_email_domains(self) -> pulumi.Output[Sequence[str]]:
        """
        Set of domains that are allowed to be used for user authentication.
        """
        return pulumi.get(self, "custom_email_domains")

    @property
    @pulumi.getter(name="defaultIdentityProvider")
    def default_identity_provider(self) -> pulumi.Output[str]:
        """
        The global account's default identity provider for platform users. Used to log on to platform tools such as SAP BTP cockpit or the btp CLI.
        """
        return pulumi.get(self, "default_identity_provider")

    @property
    @pulumi.getter(name="refreshTokenValidity")
    def refresh_token_validity(self) -> pulumi.Output[int]:
        """
        The validity of the refresh token.
        """
        return pulumi.get(self, "refresh_token_validity")

    @property
    @pulumi.getter(name="treatUsersWithSameEmailAsSameUser")
    def treat_users_with_same_email_as_same_user(self) -> pulumi.Output[bool]:
        """
        If set to true, users with the same email are treated as same users.
        """
        return pulumi.get(self, "treat_users_with_same_email_as_same_user")

