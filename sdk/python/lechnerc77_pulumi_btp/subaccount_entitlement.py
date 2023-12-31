# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['SubaccountEntitlementArgs', 'SubaccountEntitlement']

@pulumi.input_type
class SubaccountEntitlementArgs:
    def __init__(__self__, *,
                 plan_name: pulumi.Input[str],
                 service_name: pulumi.Input[str],
                 subaccount_id: pulumi.Input[str],
                 amount: Optional[pulumi.Input[int]] = None):
        """
        The set of arguments for constructing a SubaccountEntitlement resource.
        :param pulumi.Input[str] plan_name: The name of the entitled service plan.
        :param pulumi.Input[str] service_name: The name of the entitled service.
        :param pulumi.Input[str] subaccount_id: The ID of the subaccount.
        :param pulumi.Input[int] amount: The quota assigned to the subaccount.
        """
        pulumi.set(__self__, "plan_name", plan_name)
        pulumi.set(__self__, "service_name", service_name)
        pulumi.set(__self__, "subaccount_id", subaccount_id)
        if amount is not None:
            pulumi.set(__self__, "amount", amount)

    @property
    @pulumi.getter(name="planName")
    def plan_name(self) -> pulumi.Input[str]:
        """
        The name of the entitled service plan.
        """
        return pulumi.get(self, "plan_name")

    @plan_name.setter
    def plan_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "plan_name", value)

    @property
    @pulumi.getter(name="serviceName")
    def service_name(self) -> pulumi.Input[str]:
        """
        The name of the entitled service.
        """
        return pulumi.get(self, "service_name")

    @service_name.setter
    def service_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "service_name", value)

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
    @pulumi.getter
    def amount(self) -> Optional[pulumi.Input[int]]:
        """
        The quota assigned to the subaccount.
        """
        return pulumi.get(self, "amount")

    @amount.setter
    def amount(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "amount", value)


@pulumi.input_type
class _SubaccountEntitlementState:
    def __init__(__self__, *,
                 amount: Optional[pulumi.Input[int]] = None,
                 category: Optional[pulumi.Input[str]] = None,
                 created_date: Optional[pulumi.Input[str]] = None,
                 last_modified: Optional[pulumi.Input[str]] = None,
                 plan_id: Optional[pulumi.Input[str]] = None,
                 plan_name: Optional[pulumi.Input[str]] = None,
                 service_name: Optional[pulumi.Input[str]] = None,
                 state: Optional[pulumi.Input[str]] = None,
                 subaccount_id: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering SubaccountEntitlement resources.
        :param pulumi.Input[int] amount: The quota assigned to the subaccount.
        :param pulumi.Input[str] category: The current state of the entitlement. Possible values are:
        :param pulumi.Input[str] created_date: The date and time when the resource was created in [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) format.
        :param pulumi.Input[str] last_modified: The date and time when the resource was last modified in [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) format.
        :param pulumi.Input[str] plan_id: The ID of the entitled service plan.
        :param pulumi.Input[str] plan_name: The name of the entitled service plan.
        :param pulumi.Input[str] service_name: The name of the entitled service.
        :param pulumi.Input[str] state: The current state of the entitlement. Possible values are: | state | description | | --- | --- | | `OK` | The CRUD
               operation or series of operations completed successfully. | | `STARTED` | The processing operation started | |
               `PROCESSING` | The processing operation is in progress | | `PROCESSING_FAILED` | The processing operation failed |
        :param pulumi.Input[str] subaccount_id: The ID of the subaccount.
        """
        if amount is not None:
            pulumi.set(__self__, "amount", amount)
        if category is not None:
            pulumi.set(__self__, "category", category)
        if created_date is not None:
            pulumi.set(__self__, "created_date", created_date)
        if last_modified is not None:
            pulumi.set(__self__, "last_modified", last_modified)
        if plan_id is not None:
            pulumi.set(__self__, "plan_id", plan_id)
        if plan_name is not None:
            pulumi.set(__self__, "plan_name", plan_name)
        if service_name is not None:
            pulumi.set(__self__, "service_name", service_name)
        if state is not None:
            pulumi.set(__self__, "state", state)
        if subaccount_id is not None:
            pulumi.set(__self__, "subaccount_id", subaccount_id)

    @property
    @pulumi.getter
    def amount(self) -> Optional[pulumi.Input[int]]:
        """
        The quota assigned to the subaccount.
        """
        return pulumi.get(self, "amount")

    @amount.setter
    def amount(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "amount", value)

    @property
    @pulumi.getter
    def category(self) -> Optional[pulumi.Input[str]]:
        """
        The current state of the entitlement. Possible values are:
        """
        return pulumi.get(self, "category")

    @category.setter
    def category(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "category", value)

    @property
    @pulumi.getter(name="createdDate")
    def created_date(self) -> Optional[pulumi.Input[str]]:
        """
        The date and time when the resource was created in [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) format.
        """
        return pulumi.get(self, "created_date")

    @created_date.setter
    def created_date(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "created_date", value)

    @property
    @pulumi.getter(name="lastModified")
    def last_modified(self) -> Optional[pulumi.Input[str]]:
        """
        The date and time when the resource was last modified in [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) format.
        """
        return pulumi.get(self, "last_modified")

    @last_modified.setter
    def last_modified(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "last_modified", value)

    @property
    @pulumi.getter(name="planId")
    def plan_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the entitled service plan.
        """
        return pulumi.get(self, "plan_id")

    @plan_id.setter
    def plan_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "plan_id", value)

    @property
    @pulumi.getter(name="planName")
    def plan_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the entitled service plan.
        """
        return pulumi.get(self, "plan_name")

    @plan_name.setter
    def plan_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "plan_name", value)

    @property
    @pulumi.getter(name="serviceName")
    def service_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the entitled service.
        """
        return pulumi.get(self, "service_name")

    @service_name.setter
    def service_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "service_name", value)

    @property
    @pulumi.getter
    def state(self) -> Optional[pulumi.Input[str]]:
        """
        The current state of the entitlement. Possible values are: | state | description | | --- | --- | | `OK` | The CRUD
        operation or series of operations completed successfully. | | `STARTED` | The processing operation started | |
        `PROCESSING` | The processing operation is in progress | | `PROCESSING_FAILED` | The processing operation failed |
        """
        return pulumi.get(self, "state")

    @state.setter
    def state(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "state", value)

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


class SubaccountEntitlement(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 amount: Optional[pulumi.Input[int]] = None,
                 plan_name: Optional[pulumi.Input[str]] = None,
                 service_name: Optional[pulumi.Input[str]] = None,
                 subaccount_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Assigns the entitlement plan of a service, multitenant application, or environment, to a subaccount. Note that some environments, such as Cloud Foundry, are available by default to all global accounts and their subaccounts, and therefore are not made available as entitlements.

        __Tip:__
        You must be assigned to the global account admin or viewer role.

        __Further documentation:__
        <https://help.sap.com/docs/btp/sap-business-technology-platform/entitlements-and-quotas>

        ## Example Usage

        ```python
        import pulumi
        import lechnerc77_pulumi_btp as btp

        # entitle service plan without quota in a subaccount
        alert_notification_service = btp.SubaccountEntitlement("alertNotificationService",
            plan_name="free",
            service_name="alert-notification",
            subaccount_id="6aa64c2f-38c1-49a9-b2e8-cf9fea769b7f")
        # entitle service plan with quota in a subaccount
        uas_reporting = btp.SubaccountEntitlement("uasReporting",
            amount=1,
            plan_name="reporting-directory",
            service_name="uas",
            subaccount_id="6aa64c2f-38c1-49a9-b2e8-cf9fea769b7f")
        ```

        ## Import

        terraform

        ```sh
         $ pulumi import btp:index/subaccountEntitlement:SubaccountEntitlement <resource_name> <subaccount_id>,<service_name>,<plan_name>
        ```

        ```sh
         $ pulumi import btp:index/subaccountEntitlement:SubaccountEntitlement alert_notification_service 6aa64c2f-38c1-49a9-b2e8-cf9fea769b7f,alert-notification,free
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[int] amount: The quota assigned to the subaccount.
        :param pulumi.Input[str] plan_name: The name of the entitled service plan.
        :param pulumi.Input[str] service_name: The name of the entitled service.
        :param pulumi.Input[str] subaccount_id: The ID of the subaccount.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: SubaccountEntitlementArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Assigns the entitlement plan of a service, multitenant application, or environment, to a subaccount. Note that some environments, such as Cloud Foundry, are available by default to all global accounts and their subaccounts, and therefore are not made available as entitlements.

        __Tip:__
        You must be assigned to the global account admin or viewer role.

        __Further documentation:__
        <https://help.sap.com/docs/btp/sap-business-technology-platform/entitlements-and-quotas>

        ## Example Usage

        ```python
        import pulumi
        import lechnerc77_pulumi_btp as btp

        # entitle service plan without quota in a subaccount
        alert_notification_service = btp.SubaccountEntitlement("alertNotificationService",
            plan_name="free",
            service_name="alert-notification",
            subaccount_id="6aa64c2f-38c1-49a9-b2e8-cf9fea769b7f")
        # entitle service plan with quota in a subaccount
        uas_reporting = btp.SubaccountEntitlement("uasReporting",
            amount=1,
            plan_name="reporting-directory",
            service_name="uas",
            subaccount_id="6aa64c2f-38c1-49a9-b2e8-cf9fea769b7f")
        ```

        ## Import

        terraform

        ```sh
         $ pulumi import btp:index/subaccountEntitlement:SubaccountEntitlement <resource_name> <subaccount_id>,<service_name>,<plan_name>
        ```

        ```sh
         $ pulumi import btp:index/subaccountEntitlement:SubaccountEntitlement alert_notification_service 6aa64c2f-38c1-49a9-b2e8-cf9fea769b7f,alert-notification,free
        ```

        :param str resource_name: The name of the resource.
        :param SubaccountEntitlementArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(SubaccountEntitlementArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 amount: Optional[pulumi.Input[int]] = None,
                 plan_name: Optional[pulumi.Input[str]] = None,
                 service_name: Optional[pulumi.Input[str]] = None,
                 subaccount_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = SubaccountEntitlementArgs.__new__(SubaccountEntitlementArgs)

            __props__.__dict__["amount"] = amount
            if plan_name is None and not opts.urn:
                raise TypeError("Missing required property 'plan_name'")
            __props__.__dict__["plan_name"] = plan_name
            if service_name is None and not opts.urn:
                raise TypeError("Missing required property 'service_name'")
            __props__.__dict__["service_name"] = service_name
            if subaccount_id is None and not opts.urn:
                raise TypeError("Missing required property 'subaccount_id'")
            __props__.__dict__["subaccount_id"] = subaccount_id
            __props__.__dict__["category"] = None
            __props__.__dict__["created_date"] = None
            __props__.__dict__["last_modified"] = None
            __props__.__dict__["plan_id"] = None
            __props__.__dict__["state"] = None
        super(SubaccountEntitlement, __self__).__init__(
            'btp:index/subaccountEntitlement:SubaccountEntitlement',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            amount: Optional[pulumi.Input[int]] = None,
            category: Optional[pulumi.Input[str]] = None,
            created_date: Optional[pulumi.Input[str]] = None,
            last_modified: Optional[pulumi.Input[str]] = None,
            plan_id: Optional[pulumi.Input[str]] = None,
            plan_name: Optional[pulumi.Input[str]] = None,
            service_name: Optional[pulumi.Input[str]] = None,
            state: Optional[pulumi.Input[str]] = None,
            subaccount_id: Optional[pulumi.Input[str]] = None) -> 'SubaccountEntitlement':
        """
        Get an existing SubaccountEntitlement resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[int] amount: The quota assigned to the subaccount.
        :param pulumi.Input[str] category: The current state of the entitlement. Possible values are:
        :param pulumi.Input[str] created_date: The date and time when the resource was created in [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) format.
        :param pulumi.Input[str] last_modified: The date and time when the resource was last modified in [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) format.
        :param pulumi.Input[str] plan_id: The ID of the entitled service plan.
        :param pulumi.Input[str] plan_name: The name of the entitled service plan.
        :param pulumi.Input[str] service_name: The name of the entitled service.
        :param pulumi.Input[str] state: The current state of the entitlement. Possible values are: | state | description | | --- | --- | | `OK` | The CRUD
               operation or series of operations completed successfully. | | `STARTED` | The processing operation started | |
               `PROCESSING` | The processing operation is in progress | | `PROCESSING_FAILED` | The processing operation failed |
        :param pulumi.Input[str] subaccount_id: The ID of the subaccount.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _SubaccountEntitlementState.__new__(_SubaccountEntitlementState)

        __props__.__dict__["amount"] = amount
        __props__.__dict__["category"] = category
        __props__.__dict__["created_date"] = created_date
        __props__.__dict__["last_modified"] = last_modified
        __props__.__dict__["plan_id"] = plan_id
        __props__.__dict__["plan_name"] = plan_name
        __props__.__dict__["service_name"] = service_name
        __props__.__dict__["state"] = state
        __props__.__dict__["subaccount_id"] = subaccount_id
        return SubaccountEntitlement(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def amount(self) -> pulumi.Output[int]:
        """
        The quota assigned to the subaccount.
        """
        return pulumi.get(self, "amount")

    @property
    @pulumi.getter
    def category(self) -> pulumi.Output[str]:
        """
        The current state of the entitlement. Possible values are:
        """
        return pulumi.get(self, "category")

    @property
    @pulumi.getter(name="createdDate")
    def created_date(self) -> pulumi.Output[str]:
        """
        The date and time when the resource was created in [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) format.
        """
        return pulumi.get(self, "created_date")

    @property
    @pulumi.getter(name="lastModified")
    def last_modified(self) -> pulumi.Output[str]:
        """
        The date and time when the resource was last modified in [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) format.
        """
        return pulumi.get(self, "last_modified")

    @property
    @pulumi.getter(name="planId")
    def plan_id(self) -> pulumi.Output[str]:
        """
        The ID of the entitled service plan.
        """
        return pulumi.get(self, "plan_id")

    @property
    @pulumi.getter(name="planName")
    def plan_name(self) -> pulumi.Output[str]:
        """
        The name of the entitled service plan.
        """
        return pulumi.get(self, "plan_name")

    @property
    @pulumi.getter(name="serviceName")
    def service_name(self) -> pulumi.Output[str]:
        """
        The name of the entitled service.
        """
        return pulumi.get(self, "service_name")

    @property
    @pulumi.getter
    def state(self) -> pulumi.Output[str]:
        """
        The current state of the entitlement. Possible values are: | state | description | | --- | --- | | `OK` | The CRUD
        operation or series of operations completed successfully. | | `STARTED` | The processing operation started | |
        `PROCESSING` | The processing operation is in progress | | `PROCESSING_FAILED` | The processing operation failed |
        """
        return pulumi.get(self, "state")

    @property
    @pulumi.getter(name="subaccountId")
    def subaccount_id(self) -> pulumi.Output[str]:
        """
        The ID of the subaccount.
        """
        return pulumi.get(self, "subaccount_id")

