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
    'GetSubaccountServiceBindingResult',
    'AwaitableGetSubaccountServiceBindingResult',
    'get_subaccount_service_binding',
    'get_subaccount_service_binding_output',
]

@pulumi.output_type
class GetSubaccountServiceBindingResult:
    """
    A collection of values returned by getSubaccountServiceBinding.
    """
    def __init__(__self__, bind_resource=None, context=None, created_date=None, credentials=None, id=None, labels=None, last_modified=None, name=None, parameters=None, ready=None, service_instance_id=None, state=None, subaccount_id=None):
        if bind_resource and not isinstance(bind_resource, dict):
            raise TypeError("Expected argument 'bind_resource' to be a dict")
        pulumi.set(__self__, "bind_resource", bind_resource)
        if context and not isinstance(context, str):
            raise TypeError("Expected argument 'context' to be a str")
        pulumi.set(__self__, "context", context)
        if created_date and not isinstance(created_date, str):
            raise TypeError("Expected argument 'created_date' to be a str")
        pulumi.set(__self__, "created_date", created_date)
        if credentials and not isinstance(credentials, str):
            raise TypeError("Expected argument 'credentials' to be a str")
        pulumi.set(__self__, "credentials", credentials)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if labels and not isinstance(labels, dict):
            raise TypeError("Expected argument 'labels' to be a dict")
        pulumi.set(__self__, "labels", labels)
        if last_modified and not isinstance(last_modified, str):
            raise TypeError("Expected argument 'last_modified' to be a str")
        pulumi.set(__self__, "last_modified", last_modified)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if parameters and not isinstance(parameters, str):
            raise TypeError("Expected argument 'parameters' to be a str")
        pulumi.set(__self__, "parameters", parameters)
        if ready and not isinstance(ready, bool):
            raise TypeError("Expected argument 'ready' to be a bool")
        pulumi.set(__self__, "ready", ready)
        if service_instance_id and not isinstance(service_instance_id, str):
            raise TypeError("Expected argument 'service_instance_id' to be a str")
        pulumi.set(__self__, "service_instance_id", service_instance_id)
        if state and not isinstance(state, str):
            raise TypeError("Expected argument 'state' to be a str")
        pulumi.set(__self__, "state", state)
        if subaccount_id and not isinstance(subaccount_id, str):
            raise TypeError("Expected argument 'subaccount_id' to be a str")
        pulumi.set(__self__, "subaccount_id", subaccount_id)

    @property
    @pulumi.getter(name="bindResource")
    def bind_resource(self) -> Mapping[str, str]:
        """
        Contains the resources associated with the binding.
        """
        return pulumi.get(self, "bind_resource")

    @property
    @pulumi.getter
    def context(self) -> str:
        """
        Contextual data for the resource.
        """
        return pulumi.get(self, "context")

    @property
    @pulumi.getter(name="createdDate")
    def created_date(self) -> str:
        """
        The date and time when the resource was created in [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) format.
        """
        return pulumi.get(self, "created_date")

    @property
    @pulumi.getter
    def credentials(self) -> str:
        """
        The credentials to access the binding.
        """
        return pulumi.get(self, "credentials")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The ID of the service binding.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def labels(self) -> Mapping[str, Sequence[str]]:
        """
        The set of words or phrases assigned to the binding.
        """
        return pulumi.get(self, "labels")

    @property
    @pulumi.getter(name="lastModified")
    def last_modified(self) -> str:
        """
        The date and time when the resource was last modified in [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) format.
        """
        return pulumi.get(self, "last_modified")

    @property
    @pulumi.getter
    def name(self) -> str:
        """
        The name of the service binding.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def parameters(self) -> str:
        """
        The parameters of the service binding as a valid JSON object.
        """
        return pulumi.get(self, "parameters")

    @property
    @pulumi.getter
    def ready(self) -> bool:
        """
        Shows whether the service binding is ready.
        """
        return pulumi.get(self, "ready")

    @property
    @pulumi.getter(name="serviceInstanceId")
    def service_instance_id(self) -> str:
        """
        The ID of the service instance associated with the binding.
        """
        return pulumi.get(self, "service_instance_id")

    @property
    @pulumi.getter
    def state(self) -> str:
        """
        The current state of the service binding. Possible values are:
        """
        return pulumi.get(self, "state")

    @property
    @pulumi.getter(name="subaccountId")
    def subaccount_id(self) -> str:
        """
        The ID of the subaccount.
        """
        return pulumi.get(self, "subaccount_id")


class AwaitableGetSubaccountServiceBindingResult(GetSubaccountServiceBindingResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetSubaccountServiceBindingResult(
            bind_resource=self.bind_resource,
            context=self.context,
            created_date=self.created_date,
            credentials=self.credentials,
            id=self.id,
            labels=self.labels,
            last_modified=self.last_modified,
            name=self.name,
            parameters=self.parameters,
            ready=self.ready,
            service_instance_id=self.service_instance_id,
            state=self.state,
            subaccount_id=self.subaccount_id)


def get_subaccount_service_binding(id: Optional[str] = None,
                                   name: Optional[str] = None,
                                   subaccount_id: Optional[str] = None,
                                   opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetSubaccountServiceBindingResult:
    """
    Gets details about a specific service binding, such as its access details. They are included in its 'credentials' property, and typically include access URLs and credentials.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_btp as btp

    by_id = btp.get_subaccount_service_binding(id="c2d02852-1678-4c1e-b546-74d5274f1522",
        subaccount_id="6aa64c2f-38c1-49a9-b2e8-cf9fea769b7f")
    by_name = btp.get_subaccount_service_binding(name="hyperspace-2022-10",
        subaccount_id="6aa64c2f-38c1-49a9-b2e8-cf9fea769b7f")
    ```


    :param str id: The ID of the service binding.
    :param str name: The name of the service binding.
    :param str subaccount_id: The ID of the subaccount.
    """
    __args__ = dict()
    __args__['id'] = id
    __args__['name'] = name
    __args__['subaccountId'] = subaccount_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('btp:index/getSubaccountServiceBinding:getSubaccountServiceBinding', __args__, opts=opts, typ=GetSubaccountServiceBindingResult).value

    return AwaitableGetSubaccountServiceBindingResult(
        bind_resource=pulumi.get(__ret__, 'bind_resource'),
        context=pulumi.get(__ret__, 'context'),
        created_date=pulumi.get(__ret__, 'created_date'),
        credentials=pulumi.get(__ret__, 'credentials'),
        id=pulumi.get(__ret__, 'id'),
        labels=pulumi.get(__ret__, 'labels'),
        last_modified=pulumi.get(__ret__, 'last_modified'),
        name=pulumi.get(__ret__, 'name'),
        parameters=pulumi.get(__ret__, 'parameters'),
        ready=pulumi.get(__ret__, 'ready'),
        service_instance_id=pulumi.get(__ret__, 'service_instance_id'),
        state=pulumi.get(__ret__, 'state'),
        subaccount_id=pulumi.get(__ret__, 'subaccount_id'))


@_utilities.lift_output_func(get_subaccount_service_binding)
def get_subaccount_service_binding_output(id: Optional[pulumi.Input[Optional[str]]] = None,
                                          name: Optional[pulumi.Input[Optional[str]]] = None,
                                          subaccount_id: Optional[pulumi.Input[str]] = None,
                                          opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetSubaccountServiceBindingResult]:
    """
    Gets details about a specific service binding, such as its access details. They are included in its 'credentials' property, and typically include access URLs and credentials.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_btp as btp

    by_id = btp.get_subaccount_service_binding(id="c2d02852-1678-4c1e-b546-74d5274f1522",
        subaccount_id="6aa64c2f-38c1-49a9-b2e8-cf9fea769b7f")
    by_name = btp.get_subaccount_service_binding(name="hyperspace-2022-10",
        subaccount_id="6aa64c2f-38c1-49a9-b2e8-cf9fea769b7f")
    ```


    :param str id: The ID of the service binding.
    :param str name: The name of the service binding.
    :param str subaccount_id: The ID of the subaccount.
    """
    ...
