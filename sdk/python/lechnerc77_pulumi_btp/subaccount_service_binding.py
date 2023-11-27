# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['SubaccountServiceBindingArgs', 'SubaccountServiceBinding']

@pulumi.input_type
class SubaccountServiceBindingArgs:
    def __init__(__self__, *,
                 service_instance_id: pulumi.Input[str],
                 subaccount_id: pulumi.Input[str],
                 labels: Optional[pulumi.Input[Mapping[str, pulumi.Input[Sequence[pulumi.Input[str]]]]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 parameters: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a SubaccountServiceBinding resource.
        :param pulumi.Input[str] service_instance_id: The ID of the service instance associated with the binding.
        :param pulumi.Input[str] subaccount_id: The ID of the subaccount.
        :param pulumi.Input[Mapping[str, pulumi.Input[Sequence[pulumi.Input[str]]]]] labels: The set of words or phrases assigned to the service binding.
        :param pulumi.Input[str] name: The name of the service binding.
        :param pulumi.Input[str] parameters: The parameters of the service binding as a valid JSON object.
        """
        pulumi.set(__self__, "service_instance_id", service_instance_id)
        pulumi.set(__self__, "subaccount_id", subaccount_id)
        if labels is not None:
            pulumi.set(__self__, "labels", labels)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if parameters is not None:
            pulumi.set(__self__, "parameters", parameters)

    @property
    @pulumi.getter(name="serviceInstanceId")
    def service_instance_id(self) -> pulumi.Input[str]:
        """
        The ID of the service instance associated with the binding.
        """
        return pulumi.get(self, "service_instance_id")

    @service_instance_id.setter
    def service_instance_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "service_instance_id", value)

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
    def labels(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[Sequence[pulumi.Input[str]]]]]]:
        """
        The set of words or phrases assigned to the service binding.
        """
        return pulumi.get(self, "labels")

    @labels.setter
    def labels(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[Sequence[pulumi.Input[str]]]]]]):
        pulumi.set(self, "labels", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the service binding.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def parameters(self) -> Optional[pulumi.Input[str]]:
        """
        The parameters of the service binding as a valid JSON object.
        """
        return pulumi.get(self, "parameters")

    @parameters.setter
    def parameters(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "parameters", value)


@pulumi.input_type
class _SubaccountServiceBindingState:
    def __init__(__self__, *,
                 bind_resource: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 context: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 created_date: Optional[pulumi.Input[str]] = None,
                 credentials: Optional[pulumi.Input[str]] = None,
                 labels: Optional[pulumi.Input[Mapping[str, pulumi.Input[Sequence[pulumi.Input[str]]]]]] = None,
                 last_modified: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 parameters: Optional[pulumi.Input[str]] = None,
                 ready: Optional[pulumi.Input[bool]] = None,
                 service_instance_id: Optional[pulumi.Input[str]] = None,
                 state: Optional[pulumi.Input[str]] = None,
                 subaccount_id: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering SubaccountServiceBinding resources.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] bind_resource: Contains the resources associated with the binding.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] context: The contextual data for the resource.
        :param pulumi.Input[str] created_date: The date and time when the resource was created in [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) format.
        :param pulumi.Input[str] credentials: The credentials to access the binding.
        :param pulumi.Input[Mapping[str, pulumi.Input[Sequence[pulumi.Input[str]]]]] labels: The set of words or phrases assigned to the service binding.
        :param pulumi.Input[str] last_modified: The date and time when the resource was last modified in [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) format.
        :param pulumi.Input[str] name: The name of the service binding.
        :param pulumi.Input[str] parameters: The parameters of the service binding as a valid JSON object.
        :param pulumi.Input[bool] ready: Shows whether the service binding is ready.
        :param pulumi.Input[str] service_instance_id: The ID of the service instance associated with the binding.
        :param pulumi.Input[str] state: The current state of the service binding. Possible values are:
        :param pulumi.Input[str] subaccount_id: The ID of the subaccount.
        """
        if bind_resource is not None:
            pulumi.set(__self__, "bind_resource", bind_resource)
        if context is not None:
            pulumi.set(__self__, "context", context)
        if created_date is not None:
            pulumi.set(__self__, "created_date", created_date)
        if credentials is not None:
            pulumi.set(__self__, "credentials", credentials)
        if labels is not None:
            pulumi.set(__self__, "labels", labels)
        if last_modified is not None:
            pulumi.set(__self__, "last_modified", last_modified)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if parameters is not None:
            pulumi.set(__self__, "parameters", parameters)
        if ready is not None:
            pulumi.set(__self__, "ready", ready)
        if service_instance_id is not None:
            pulumi.set(__self__, "service_instance_id", service_instance_id)
        if state is not None:
            pulumi.set(__self__, "state", state)
        if subaccount_id is not None:
            pulumi.set(__self__, "subaccount_id", subaccount_id)

    @property
    @pulumi.getter(name="bindResource")
    def bind_resource(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        Contains the resources associated with the binding.
        """
        return pulumi.get(self, "bind_resource")

    @bind_resource.setter
    def bind_resource(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "bind_resource", value)

    @property
    @pulumi.getter
    def context(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        The contextual data for the resource.
        """
        return pulumi.get(self, "context")

    @context.setter
    def context(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "context", value)

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
    @pulumi.getter
    def credentials(self) -> Optional[pulumi.Input[str]]:
        """
        The credentials to access the binding.
        """
        return pulumi.get(self, "credentials")

    @credentials.setter
    def credentials(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "credentials", value)

    @property
    @pulumi.getter
    def labels(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[Sequence[pulumi.Input[str]]]]]]:
        """
        The set of words or phrases assigned to the service binding.
        """
        return pulumi.get(self, "labels")

    @labels.setter
    def labels(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[Sequence[pulumi.Input[str]]]]]]):
        pulumi.set(self, "labels", value)

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
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the service binding.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def parameters(self) -> Optional[pulumi.Input[str]]:
        """
        The parameters of the service binding as a valid JSON object.
        """
        return pulumi.get(self, "parameters")

    @parameters.setter
    def parameters(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "parameters", value)

    @property
    @pulumi.getter
    def ready(self) -> Optional[pulumi.Input[bool]]:
        """
        Shows whether the service binding is ready.
        """
        return pulumi.get(self, "ready")

    @ready.setter
    def ready(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "ready", value)

    @property
    @pulumi.getter(name="serviceInstanceId")
    def service_instance_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the service instance associated with the binding.
        """
        return pulumi.get(self, "service_instance_id")

    @service_instance_id.setter
    def service_instance_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "service_instance_id", value)

    @property
    @pulumi.getter
    def state(self) -> Optional[pulumi.Input[str]]:
        """
        The current state of the service binding. Possible values are:
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


class SubaccountServiceBinding(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 labels: Optional[pulumi.Input[Mapping[str, pulumi.Input[Sequence[pulumi.Input[str]]]]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 parameters: Optional[pulumi.Input[str]] = None,
                 service_instance_id: Optional[pulumi.Input[str]] = None,
                 subaccount_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Creates a service binding, i.e. generates access details to consume a service.

        ## Example Usage

        ```python
        import pulumi
        import json
        import lechnerc77_pulumi_btp as btp

        # create a service binding in a subaccount
        my_binding = btp.SubaccountServiceBinding("myBinding",
            subaccount_id="6aa64c2f-38c1-49a9-b2e8-cf9fea769b7f",
            service_instance_id="8911491d-0e1d-425d-a233-785512602d6f")
        # create a parameterized service binding in a subaccount
        my_parameterized_binding = btp.SubaccountServiceBinding("myParameterizedBinding",
            subaccount_id="6aa64c2f-38c1-49a9-b2e8-cf9fea769b7f",
            service_instance_id="8911491d-0e1d-425d-a233-785512602d6f",
            parameters=json.dumps({
                "param_a": "",
                "param_b": "",
            }))
        ```

        ## Import

        terraform

        ```sh
         $ pulumi import btp:index/subaccountServiceBinding:SubaccountServiceBinding <resource_name> <subaccount_id>,<service_binding_id>
        ```

        ```sh
         $ pulumi import btp:index/subaccountServiceBinding:SubaccountServiceBinding my_binding 6aa64c2f-38c1-49a9-b2e8-cf9fea769b7f,910e9a7d-0fb4-4428-a813-56550e683579
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Mapping[str, pulumi.Input[Sequence[pulumi.Input[str]]]]] labels: The set of words or phrases assigned to the service binding.
        :param pulumi.Input[str] name: The name of the service binding.
        :param pulumi.Input[str] parameters: The parameters of the service binding as a valid JSON object.
        :param pulumi.Input[str] service_instance_id: The ID of the service instance associated with the binding.
        :param pulumi.Input[str] subaccount_id: The ID of the subaccount.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: SubaccountServiceBindingArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Creates a service binding, i.e. generates access details to consume a service.

        ## Example Usage

        ```python
        import pulumi
        import json
        import lechnerc77_pulumi_btp as btp

        # create a service binding in a subaccount
        my_binding = btp.SubaccountServiceBinding("myBinding",
            subaccount_id="6aa64c2f-38c1-49a9-b2e8-cf9fea769b7f",
            service_instance_id="8911491d-0e1d-425d-a233-785512602d6f")
        # create a parameterized service binding in a subaccount
        my_parameterized_binding = btp.SubaccountServiceBinding("myParameterizedBinding",
            subaccount_id="6aa64c2f-38c1-49a9-b2e8-cf9fea769b7f",
            service_instance_id="8911491d-0e1d-425d-a233-785512602d6f",
            parameters=json.dumps({
                "param_a": "",
                "param_b": "",
            }))
        ```

        ## Import

        terraform

        ```sh
         $ pulumi import btp:index/subaccountServiceBinding:SubaccountServiceBinding <resource_name> <subaccount_id>,<service_binding_id>
        ```

        ```sh
         $ pulumi import btp:index/subaccountServiceBinding:SubaccountServiceBinding my_binding 6aa64c2f-38c1-49a9-b2e8-cf9fea769b7f,910e9a7d-0fb4-4428-a813-56550e683579
        ```

        :param str resource_name: The name of the resource.
        :param SubaccountServiceBindingArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(SubaccountServiceBindingArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 labels: Optional[pulumi.Input[Mapping[str, pulumi.Input[Sequence[pulumi.Input[str]]]]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 parameters: Optional[pulumi.Input[str]] = None,
                 service_instance_id: Optional[pulumi.Input[str]] = None,
                 subaccount_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = SubaccountServiceBindingArgs.__new__(SubaccountServiceBindingArgs)

            __props__.__dict__["labels"] = labels
            __props__.__dict__["name"] = name
            __props__.__dict__["parameters"] = parameters
            if service_instance_id is None and not opts.urn:
                raise TypeError("Missing required property 'service_instance_id'")
            __props__.__dict__["service_instance_id"] = service_instance_id
            if subaccount_id is None and not opts.urn:
                raise TypeError("Missing required property 'subaccount_id'")
            __props__.__dict__["subaccount_id"] = subaccount_id
            __props__.__dict__["bind_resource"] = None
            __props__.__dict__["context"] = None
            __props__.__dict__["created_date"] = None
            __props__.__dict__["credentials"] = None
            __props__.__dict__["last_modified"] = None
            __props__.__dict__["ready"] = None
            __props__.__dict__["state"] = None
        secret_opts = pulumi.ResourceOptions(additional_secret_outputs=["credentials"])
        opts = pulumi.ResourceOptions.merge(opts, secret_opts)
        super(SubaccountServiceBinding, __self__).__init__(
            'btp:index/subaccountServiceBinding:SubaccountServiceBinding',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            bind_resource: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            context: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            created_date: Optional[pulumi.Input[str]] = None,
            credentials: Optional[pulumi.Input[str]] = None,
            labels: Optional[pulumi.Input[Mapping[str, pulumi.Input[Sequence[pulumi.Input[str]]]]]] = None,
            last_modified: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            parameters: Optional[pulumi.Input[str]] = None,
            ready: Optional[pulumi.Input[bool]] = None,
            service_instance_id: Optional[pulumi.Input[str]] = None,
            state: Optional[pulumi.Input[str]] = None,
            subaccount_id: Optional[pulumi.Input[str]] = None) -> 'SubaccountServiceBinding':
        """
        Get an existing SubaccountServiceBinding resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] bind_resource: Contains the resources associated with the binding.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] context: The contextual data for the resource.
        :param pulumi.Input[str] created_date: The date and time when the resource was created in [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) format.
        :param pulumi.Input[str] credentials: The credentials to access the binding.
        :param pulumi.Input[Mapping[str, pulumi.Input[Sequence[pulumi.Input[str]]]]] labels: The set of words or phrases assigned to the service binding.
        :param pulumi.Input[str] last_modified: The date and time when the resource was last modified in [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) format.
        :param pulumi.Input[str] name: The name of the service binding.
        :param pulumi.Input[str] parameters: The parameters of the service binding as a valid JSON object.
        :param pulumi.Input[bool] ready: Shows whether the service binding is ready.
        :param pulumi.Input[str] service_instance_id: The ID of the service instance associated with the binding.
        :param pulumi.Input[str] state: The current state of the service binding. Possible values are:
        :param pulumi.Input[str] subaccount_id: The ID of the subaccount.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _SubaccountServiceBindingState.__new__(_SubaccountServiceBindingState)

        __props__.__dict__["bind_resource"] = bind_resource
        __props__.__dict__["context"] = context
        __props__.__dict__["created_date"] = created_date
        __props__.__dict__["credentials"] = credentials
        __props__.__dict__["labels"] = labels
        __props__.__dict__["last_modified"] = last_modified
        __props__.__dict__["name"] = name
        __props__.__dict__["parameters"] = parameters
        __props__.__dict__["ready"] = ready
        __props__.__dict__["service_instance_id"] = service_instance_id
        __props__.__dict__["state"] = state
        __props__.__dict__["subaccount_id"] = subaccount_id
        return SubaccountServiceBinding(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="bindResource")
    def bind_resource(self) -> pulumi.Output[Mapping[str, str]]:
        """
        Contains the resources associated with the binding.
        """
        return pulumi.get(self, "bind_resource")

    @property
    @pulumi.getter
    def context(self) -> pulumi.Output[Mapping[str, str]]:
        """
        The contextual data for the resource.
        """
        return pulumi.get(self, "context")

    @property
    @pulumi.getter(name="createdDate")
    def created_date(self) -> pulumi.Output[str]:
        """
        The date and time when the resource was created in [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) format.
        """
        return pulumi.get(self, "created_date")

    @property
    @pulumi.getter
    def credentials(self) -> pulumi.Output[str]:
        """
        The credentials to access the binding.
        """
        return pulumi.get(self, "credentials")

    @property
    @pulumi.getter
    def labels(self) -> pulumi.Output[Mapping[str, Sequence[str]]]:
        """
        The set of words or phrases assigned to the service binding.
        """
        return pulumi.get(self, "labels")

    @property
    @pulumi.getter(name="lastModified")
    def last_modified(self) -> pulumi.Output[str]:
        """
        The date and time when the resource was last modified in [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) format.
        """
        return pulumi.get(self, "last_modified")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The name of the service binding.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def parameters(self) -> pulumi.Output[str]:
        """
        The parameters of the service binding as a valid JSON object.
        """
        return pulumi.get(self, "parameters")

    @property
    @pulumi.getter
    def ready(self) -> pulumi.Output[bool]:
        """
        Shows whether the service binding is ready.
        """
        return pulumi.get(self, "ready")

    @property
    @pulumi.getter(name="serviceInstanceId")
    def service_instance_id(self) -> pulumi.Output[str]:
        """
        The ID of the service instance associated with the binding.
        """
        return pulumi.get(self, "service_instance_id")

    @property
    @pulumi.getter
    def state(self) -> pulumi.Output[str]:
        """
        The current state of the service binding. Possible values are:
        """
        return pulumi.get(self, "state")

    @property
    @pulumi.getter(name="subaccountId")
    def subaccount_id(self) -> pulumi.Output[str]:
        """
        The ID of the subaccount.
        """
        return pulumi.get(self, "subaccount_id")

