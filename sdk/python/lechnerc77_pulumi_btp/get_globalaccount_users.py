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
    'GetGlobalaccountUsersResult',
    'AwaitableGetGlobalaccountUsersResult',
    'get_globalaccount_users',
    'get_globalaccount_users_output',
]

@pulumi.output_type
class GetGlobalaccountUsersResult:
    """
    A collection of values returned by getGlobalaccountUsers.
    """
    def __init__(__self__, id=None, origin=None, values=None):
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if origin and not isinstance(origin, str):
            raise TypeError("Expected argument 'origin' to be a str")
        pulumi.set(__self__, "origin", origin)
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
    def origin(self) -> str:
        """
        The identity provider that hosts the user. The default value is 'ldap'.
        """
        return pulumi.get(self, "origin")

    @property
    @pulumi.getter
    def values(self) -> Sequence[str]:
        """
        The list of users assigned to the global account.
        """
        return pulumi.get(self, "values")


class AwaitableGetGlobalaccountUsersResult(GetGlobalaccountUsersResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetGlobalaccountUsersResult(
            id=self.id,
            origin=self.origin,
            values=self.values)


def get_globalaccount_users(origin: Optional[str] = None,
                            opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetGlobalaccountUsersResult:
    """
    Lists all users.

    __Further documentation:__
    <https://help.sap.com/docs/btp/sap-business-technology-platform/user-and-member-management>

    ## Example Usage

    ```python
    import pulumi
    import pulumi_btp as btp

    defaultidp = btp.get_globalaccount_users()
    mycustomidp = btp.get_globalaccount_users(origin="my-custom-idp")
    ```


    :param str origin: The identity provider that hosts the user. The default value is 'ldap'.
    """
    __args__ = dict()
    __args__['origin'] = origin
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('btp:index/getGlobalaccountUsers:getGlobalaccountUsers', __args__, opts=opts, typ=GetGlobalaccountUsersResult).value

    return AwaitableGetGlobalaccountUsersResult(
        id=pulumi.get(__ret__, 'id'),
        origin=pulumi.get(__ret__, 'origin'),
        values=pulumi.get(__ret__, 'values'))


@_utilities.lift_output_func(get_globalaccount_users)
def get_globalaccount_users_output(origin: Optional[pulumi.Input[Optional[str]]] = None,
                                   opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetGlobalaccountUsersResult]:
    """
    Lists all users.

    __Further documentation:__
    <https://help.sap.com/docs/btp/sap-business-technology-platform/user-and-member-management>

    ## Example Usage

    ```python
    import pulumi
    import pulumi_btp as btp

    defaultidp = btp.get_globalaccount_users()
    mycustomidp = btp.get_globalaccount_users(origin="my-custom-idp")
    ```


    :param str origin: The identity provider that hosts the user. The default value is 'ldap'.
    """
    ...