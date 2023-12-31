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
    'GetGlobalaccountRolesResult',
    'AwaitableGetGlobalaccountRolesResult',
    'get_globalaccount_roles',
]

@pulumi.output_type
class GetGlobalaccountRolesResult:
    """
    A collection of values returned by getGlobalaccountRoles.
    """
    def __init__(__self__, id=None, values=None):
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if values and not isinstance(values, list):
            raise TypeError("Expected argument 'values' to be a list")
        pulumi.set(__self__, "values", values)

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The ID of the global account.
        """
        warnings.warn("""Use the `btp_globalaccount` datasource instead""", DeprecationWarning)
        pulumi.log.warn("""id is deprecated: Use the `btp_globalaccount` datasource instead""")

        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def values(self) -> Sequence['outputs.GetGlobalaccountRolesValueResult']:
        return pulumi.get(self, "values")


class AwaitableGetGlobalaccountRolesResult(GetGlobalaccountRolesResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetGlobalaccountRolesResult(
            id=self.id,
            values=self.values)


def get_globalaccount_roles(opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetGlobalaccountRolesResult:
    """
    Lists all roles.

    __Further documentation:__
    <https://help.sap.com/docs/btp/sap-business-technology-platform/role-collections-and-roles-in-global-accounts-directories-and-subaccounts>

    ## Example Usage

    ```python
    import pulumi
    import pulumi_btp as btp

    all = btp.get_globalaccount_roles()
    ```
    """
    __args__ = dict()
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('btp:index/getGlobalaccountRoles:getGlobalaccountRoles', __args__, opts=opts, typ=GetGlobalaccountRolesResult).value

    return AwaitableGetGlobalaccountRolesResult(
        id=pulumi.get(__ret__, 'id'),
        values=pulumi.get(__ret__, 'values'))
