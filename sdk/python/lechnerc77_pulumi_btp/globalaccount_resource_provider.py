# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['GlobalaccountResourceProviderArgs', 'GlobalaccountResourceProvider']

@pulumi.input_type
class GlobalaccountResourceProviderArgs:
    def __init__(__self__, *,
                 configuration: pulumi.Input[str],
                 display_name: pulumi.Input[str],
                 provider_type: pulumi.Input[str],
                 technical_name: pulumi.Input[str],
                 description: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a GlobalaccountResourceProvider resource.
        :param pulumi.Input[str] configuration: The configuration properties for the resource provider as required by the vendor.
        :param pulumi.Input[str] display_name: The descriptive name of the resource provider.
        :param pulumi.Input[str] provider_type: The cloud vendor from which to consume services through your subscribed account. Possible values are:
        :param pulumi.Input[str] technical_name: The unique technical name of the resource provider.
        :param pulumi.Input[str] description: The description of the resource provider.
        """
        pulumi.set(__self__, "configuration", configuration)
        pulumi.set(__self__, "display_name", display_name)
        pulumi.set(__self__, "provider_type", provider_type)
        pulumi.set(__self__, "technical_name", technical_name)
        if description is not None:
            pulumi.set(__self__, "description", description)

    @property
    @pulumi.getter
    def configuration(self) -> pulumi.Input[str]:
        """
        The configuration properties for the resource provider as required by the vendor.
        """
        return pulumi.get(self, "configuration")

    @configuration.setter
    def configuration(self, value: pulumi.Input[str]):
        pulumi.set(self, "configuration", value)

    @property
    @pulumi.getter(name="displayName")
    def display_name(self) -> pulumi.Input[str]:
        """
        The descriptive name of the resource provider.
        """
        return pulumi.get(self, "display_name")

    @display_name.setter
    def display_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "display_name", value)

    @property
    @pulumi.getter(name="providerType")
    def provider_type(self) -> pulumi.Input[str]:
        """
        The cloud vendor from which to consume services through your subscribed account. Possible values are:
        """
        return pulumi.get(self, "provider_type")

    @provider_type.setter
    def provider_type(self, value: pulumi.Input[str]):
        pulumi.set(self, "provider_type", value)

    @property
    @pulumi.getter(name="technicalName")
    def technical_name(self) -> pulumi.Input[str]:
        """
        The unique technical name of the resource provider.
        """
        return pulumi.get(self, "technical_name")

    @technical_name.setter
    def technical_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "technical_name", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        The description of the resource provider.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)


@pulumi.input_type
class _GlobalaccountResourceProviderState:
    def __init__(__self__, *,
                 configuration: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 display_name: Optional[pulumi.Input[str]] = None,
                 provider_type: Optional[pulumi.Input[str]] = None,
                 technical_name: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering GlobalaccountResourceProvider resources.
        :param pulumi.Input[str] configuration: The configuration properties for the resource provider as required by the vendor.
        :param pulumi.Input[str] description: The description of the resource provider.
        :param pulumi.Input[str] display_name: The descriptive name of the resource provider.
        :param pulumi.Input[str] provider_type: The cloud vendor from which to consume services through your subscribed account. Possible values are:
        :param pulumi.Input[str] technical_name: The unique technical name of the resource provider.
        """
        if configuration is not None:
            pulumi.set(__self__, "configuration", configuration)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if display_name is not None:
            pulumi.set(__self__, "display_name", display_name)
        if provider_type is not None:
            pulumi.set(__self__, "provider_type", provider_type)
        if technical_name is not None:
            pulumi.set(__self__, "technical_name", technical_name)

    @property
    @pulumi.getter
    def configuration(self) -> Optional[pulumi.Input[str]]:
        """
        The configuration properties for the resource provider as required by the vendor.
        """
        return pulumi.get(self, "configuration")

    @configuration.setter
    def configuration(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "configuration", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        The description of the resource provider.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="displayName")
    def display_name(self) -> Optional[pulumi.Input[str]]:
        """
        The descriptive name of the resource provider.
        """
        return pulumi.get(self, "display_name")

    @display_name.setter
    def display_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "display_name", value)

    @property
    @pulumi.getter(name="providerType")
    def provider_type(self) -> Optional[pulumi.Input[str]]:
        """
        The cloud vendor from which to consume services through your subscribed account. Possible values are:
        """
        return pulumi.get(self, "provider_type")

    @provider_type.setter
    def provider_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "provider_type", value)

    @property
    @pulumi.getter(name="technicalName")
    def technical_name(self) -> Optional[pulumi.Input[str]]:
        """
        The unique technical name of the resource provider.
        """
        return pulumi.get(self, "technical_name")

    @technical_name.setter
    def technical_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "technical_name", value)


class GlobalaccountResourceProvider(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 configuration: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 display_name: Optional[pulumi.Input[str]] = None,
                 provider_type: Optional[pulumi.Input[str]] = None,
                 technical_name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Creates a resource provider instance to allow your global account to connect to your provider account on a non-SAP cloud vendor. Through this channel, you can consume remote service resources that you already own and are supported by SAP BTP.
        For example, if you are subscribed to Amazon Web Services (AWS) and have already purchased services, such as PostgreSQL, you can register the vendor as a resource provider in SAP BTP and consume this service across your subaccounts together with other services offered by SAP.

        The use of this functionality is subject to the availability of the supported non-SAP cloud vendors in your country/region.

        __Tips:__
        * You must be assigned to the global account admin role.
        * You can create more than one instance of a given resource provider, each with its unique configuration properties. In such cases, the display name and technical name should be descriptive enough so that you and developers can easily differentiate between each instance.
        * After you configure a new resource provider instance, its supported services are added as entitlements in your global account.

        __Further documentation:__
        <https://help.sap.com/docs/btp/sap-business-technology-platform/managing-resource-providers>

        ## Import

        terraform

        ```sh
         $ pulumi import btp:index/globalaccountResourceProvider:GlobalaccountResourceProvider <resource_name> <resource_provider>,<unique_technical_name>
        ```

        ```sh
         $ pulumi import btp:index/globalaccountResourceProvider:GlobalaccountResourceProvider azure AZURE,my_azure_provider
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] configuration: The configuration properties for the resource provider as required by the vendor.
        :param pulumi.Input[str] description: The description of the resource provider.
        :param pulumi.Input[str] display_name: The descriptive name of the resource provider.
        :param pulumi.Input[str] provider_type: The cloud vendor from which to consume services through your subscribed account. Possible values are:
        :param pulumi.Input[str] technical_name: The unique technical name of the resource provider.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: GlobalaccountResourceProviderArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Creates a resource provider instance to allow your global account to connect to your provider account on a non-SAP cloud vendor. Through this channel, you can consume remote service resources that you already own and are supported by SAP BTP.
        For example, if you are subscribed to Amazon Web Services (AWS) and have already purchased services, such as PostgreSQL, you can register the vendor as a resource provider in SAP BTP and consume this service across your subaccounts together with other services offered by SAP.

        The use of this functionality is subject to the availability of the supported non-SAP cloud vendors in your country/region.

        __Tips:__
        * You must be assigned to the global account admin role.
        * You can create more than one instance of a given resource provider, each with its unique configuration properties. In such cases, the display name and technical name should be descriptive enough so that you and developers can easily differentiate between each instance.
        * After you configure a new resource provider instance, its supported services are added as entitlements in your global account.

        __Further documentation:__
        <https://help.sap.com/docs/btp/sap-business-technology-platform/managing-resource-providers>

        ## Import

        terraform

        ```sh
         $ pulumi import btp:index/globalaccountResourceProvider:GlobalaccountResourceProvider <resource_name> <resource_provider>,<unique_technical_name>
        ```

        ```sh
         $ pulumi import btp:index/globalaccountResourceProvider:GlobalaccountResourceProvider azure AZURE,my_azure_provider
        ```

        :param str resource_name: The name of the resource.
        :param GlobalaccountResourceProviderArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(GlobalaccountResourceProviderArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 configuration: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 display_name: Optional[pulumi.Input[str]] = None,
                 provider_type: Optional[pulumi.Input[str]] = None,
                 technical_name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = GlobalaccountResourceProviderArgs.__new__(GlobalaccountResourceProviderArgs)

            if configuration is None and not opts.urn:
                raise TypeError("Missing required property 'configuration'")
            __props__.__dict__["configuration"] = None if configuration is None else pulumi.Output.secret(configuration)
            __props__.__dict__["description"] = description
            if display_name is None and not opts.urn:
                raise TypeError("Missing required property 'display_name'")
            __props__.__dict__["display_name"] = display_name
            if provider_type is None and not opts.urn:
                raise TypeError("Missing required property 'provider_type'")
            __props__.__dict__["provider_type"] = provider_type
            if technical_name is None and not opts.urn:
                raise TypeError("Missing required property 'technical_name'")
            __props__.__dict__["technical_name"] = technical_name
        secret_opts = pulumi.ResourceOptions(additional_secret_outputs=["configuration"])
        opts = pulumi.ResourceOptions.merge(opts, secret_opts)
        super(GlobalaccountResourceProvider, __self__).__init__(
            'btp:index/globalaccountResourceProvider:GlobalaccountResourceProvider',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            configuration: Optional[pulumi.Input[str]] = None,
            description: Optional[pulumi.Input[str]] = None,
            display_name: Optional[pulumi.Input[str]] = None,
            provider_type: Optional[pulumi.Input[str]] = None,
            technical_name: Optional[pulumi.Input[str]] = None) -> 'GlobalaccountResourceProvider':
        """
        Get an existing GlobalaccountResourceProvider resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] configuration: The configuration properties for the resource provider as required by the vendor.
        :param pulumi.Input[str] description: The description of the resource provider.
        :param pulumi.Input[str] display_name: The descriptive name of the resource provider.
        :param pulumi.Input[str] provider_type: The cloud vendor from which to consume services through your subscribed account. Possible values are:
        :param pulumi.Input[str] technical_name: The unique technical name of the resource provider.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _GlobalaccountResourceProviderState.__new__(_GlobalaccountResourceProviderState)

        __props__.__dict__["configuration"] = configuration
        __props__.__dict__["description"] = description
        __props__.__dict__["display_name"] = display_name
        __props__.__dict__["provider_type"] = provider_type
        __props__.__dict__["technical_name"] = technical_name
        return GlobalaccountResourceProvider(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def configuration(self) -> pulumi.Output[str]:
        """
        The configuration properties for the resource provider as required by the vendor.
        """
        return pulumi.get(self, "configuration")

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[str]:
        """
        The description of the resource provider.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="displayName")
    def display_name(self) -> pulumi.Output[str]:
        """
        The descriptive name of the resource provider.
        """
        return pulumi.get(self, "display_name")

    @property
    @pulumi.getter(name="providerType")
    def provider_type(self) -> pulumi.Output[str]:
        """
        The cloud vendor from which to consume services through your subscribed account. Possible values are:
        """
        return pulumi.get(self, "provider_type")

    @property
    @pulumi.getter(name="technicalName")
    def technical_name(self) -> pulumi.Output[str]:
        """
        The unique technical name of the resource provider.
        """
        return pulumi.get(self, "technical_name")
