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
    'GetDirectoryRolesResult',
    'AwaitableGetDirectoryRolesResult',
    'get_directory_roles',
    'get_directory_roles_output',
]

@pulumi.output_type
class GetDirectoryRolesResult:
    """
    A collection of values returned by getDirectoryRoles.
    """
    def __init__(__self__, directory_id=None, id=None, values=None):
        if directory_id and not isinstance(directory_id, str):
            raise TypeError("Expected argument 'directory_id' to be a str")
        pulumi.set(__self__, "directory_id", directory_id)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if values and not isinstance(values, list):
            raise TypeError("Expected argument 'values' to be a list")
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
    def values(self) -> Sequence['outputs.GetDirectoryRolesValueResult']:
        return pulumi.get(self, "values")


class AwaitableGetDirectoryRolesResult(GetDirectoryRolesResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetDirectoryRolesResult(
            directory_id=self.directory_id,
            id=self.id,
            values=self.values)


def get_directory_roles(directory_id: Optional[str] = None,
                        opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetDirectoryRolesResult:
    """
    Gets all roles.

    __Further documentation:__
    <https://help.sap.com/docs/btp/sap-business-technology-platform/role-collections-and-roles-in-global-accounts-directories-and-subaccounts>

    ## Example Usage

    ```python
    import pulumi
    import pulumi_btp as btp

    all = btp.get_directory_roles(directory_id="dd005d8b-1fee-4e6b-b6ff-cb9a197b7fe0")
    ```


    :param str directory_id: The ID of the directory.
    """
    __args__ = dict()
    __args__['directoryId'] = directory_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('btp:index/getDirectoryRoles:getDirectoryRoles', __args__, opts=opts, typ=GetDirectoryRolesResult).value

    return AwaitableGetDirectoryRolesResult(
        directory_id=pulumi.get(__ret__, 'directory_id'),
        id=pulumi.get(__ret__, 'id'),
        values=pulumi.get(__ret__, 'values'))


@_utilities.lift_output_func(get_directory_roles)
def get_directory_roles_output(directory_id: Optional[pulumi.Input[str]] = None,
                               opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetDirectoryRolesResult]:
    """
    Gets all roles.

    __Further documentation:__
    <https://help.sap.com/docs/btp/sap-business-technology-platform/role-collections-and-roles-in-global-accounts-directories-and-subaccounts>

    ## Example Usage

    ```python
    import pulumi
    import pulumi_btp as btp

    all = btp.get_directory_roles(directory_id="dd005d8b-1fee-4e6b-b6ff-cb9a197b7fe0")
    ```


    :param str directory_id: The ID of the directory.
    """
    ...
