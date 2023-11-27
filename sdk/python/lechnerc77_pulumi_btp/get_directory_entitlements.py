# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities
from . import outputs

__all__ = [
    'GetDirectoryEntitlementsResult',
    'AwaitableGetDirectoryEntitlementsResult',
    'get_directory_entitlements',
    'get_directory_entitlements_output',
]

@pulumi.output_type
class GetDirectoryEntitlementsResult:
    """
    A collection of values returned by getDirectoryEntitlements.
    """
    def __init__(__self__, directory_id=None, id=None, values=None):
        if directory_id and not isinstance(directory_id, str):
            raise TypeError("Expected argument 'directory_id' to be a str")
        pulumi.set(__self__, "directory_id", directory_id)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if values and not isinstance(values, dict):
            raise TypeError("Expected argument 'values' to be a dict")
        pulumi.set(__self__, "values", values)

    @property
    @pulumi.getter(name="directoryId")
    def directory_id(self) -> str:
        """
        The ID of the directory.
        """
        return pulumi.get(self, "directory_id")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The ID of the directory.
        """
        warnings.warn("""Use the `directory_id` attribute instead""", DeprecationWarning)
        pulumi.log.warn("""id is deprecated: Use the `directory_id` attribute instead""")

        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def values(self) -> Mapping[str, 'outputs.GetDirectoryEntitlementsValuesResult']:
        return pulumi.get(self, "values")


class AwaitableGetDirectoryEntitlementsResult(GetDirectoryEntitlementsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetDirectoryEntitlementsResult(
            directory_id=self.directory_id,
            id=self.id,
            values=self.values)


def get_directory_entitlements(directory_id: Optional[str] = None,
                               opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetDirectoryEntitlementsResult:
    """
    Gets all the entitlements and quota assignments for a directory.

    To view all the resources that a directory and its subdirectories and subaccounts are entitled to use, the following condition must be met:
    * The directory must be a directory that is configured to manage its own entitlements.
    * You must be assigned to either the global account admin or global account viewers role.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_btp as btp

    all = btp.get_directory_entitlements(directory_id="dd005d8b-1fee-4e6b-b6ff-cb9a197b7fe0")
    ```


    :param str directory_id: The ID of the directory.
    """
    __args__ = dict()
    __args__['directoryId'] = directory_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('btp:index/getDirectoryEntitlements:getDirectoryEntitlements', __args__, opts=opts, typ=GetDirectoryEntitlementsResult).value

    return AwaitableGetDirectoryEntitlementsResult(
        directory_id=pulumi.get(__ret__, 'directory_id'),
        id=pulumi.get(__ret__, 'id'),
        values=pulumi.get(__ret__, 'values'))


@_utilities.lift_output_func(get_directory_entitlements)
def get_directory_entitlements_output(directory_id: Optional[pulumi.Input[str]] = None,
                                      opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetDirectoryEntitlementsResult]:
    """
    Gets all the entitlements and quota assignments for a directory.

    To view all the resources that a directory and its subdirectories and subaccounts are entitled to use, the following condition must be met:
    * The directory must be a directory that is configured to manage its own entitlements.
    * You must be assigned to either the global account admin or global account viewers role.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_btp as btp

    all = btp.get_directory_entitlements(directory_id="dd005d8b-1fee-4e6b-b6ff-cb9a197b7fe0")
    ```


    :param str directory_id: The ID of the directory.
    """
    ...
