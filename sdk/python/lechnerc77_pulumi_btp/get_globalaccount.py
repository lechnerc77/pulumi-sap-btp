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
    'GetGlobalaccountResult',
    'AwaitableGetGlobalaccountResult',
    'get_globalaccount',
]

@pulumi.output_type
class GetGlobalaccountResult:
    """
    A collection of values returned by getGlobalaccount.
    """
    def __init__(__self__, commercial_model=None, consumption_based=None, contract_status=None, costobject_id=None, costobject_type=None, created_date=None, crm_customer_id=None, crm_tenant_id=None, description=None, expiry_date=None, geo_access=None, id=None, last_modified=None, license_type=None, name=None, origin=None, renewal_date=None, service_id=None, state=None, subdomain=None, usage=None):
        if commercial_model and not isinstance(commercial_model, str):
            raise TypeError("Expected argument 'commercial_model' to be a str")
        pulumi.set(__self__, "commercial_model", commercial_model)
        if consumption_based and not isinstance(consumption_based, bool):
            raise TypeError("Expected argument 'consumption_based' to be a bool")
        pulumi.set(__self__, "consumption_based", consumption_based)
        if contract_status and not isinstance(contract_status, str):
            raise TypeError("Expected argument 'contract_status' to be a str")
        pulumi.set(__self__, "contract_status", contract_status)
        if costobject_id and not isinstance(costobject_id, str):
            raise TypeError("Expected argument 'costobject_id' to be a str")
        pulumi.set(__self__, "costobject_id", costobject_id)
        if costobject_type and not isinstance(costobject_type, str):
            raise TypeError("Expected argument 'costobject_type' to be a str")
        pulumi.set(__self__, "costobject_type", costobject_type)
        if created_date and not isinstance(created_date, str):
            raise TypeError("Expected argument 'created_date' to be a str")
        pulumi.set(__self__, "created_date", created_date)
        if crm_customer_id and not isinstance(crm_customer_id, str):
            raise TypeError("Expected argument 'crm_customer_id' to be a str")
        pulumi.set(__self__, "crm_customer_id", crm_customer_id)
        if crm_tenant_id and not isinstance(crm_tenant_id, str):
            raise TypeError("Expected argument 'crm_tenant_id' to be a str")
        pulumi.set(__self__, "crm_tenant_id", crm_tenant_id)
        if description and not isinstance(description, str):
            raise TypeError("Expected argument 'description' to be a str")
        pulumi.set(__self__, "description", description)
        if expiry_date and not isinstance(expiry_date, str):
            raise TypeError("Expected argument 'expiry_date' to be a str")
        pulumi.set(__self__, "expiry_date", expiry_date)
        if geo_access and not isinstance(geo_access, str):
            raise TypeError("Expected argument 'geo_access' to be a str")
        pulumi.set(__self__, "geo_access", geo_access)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if last_modified and not isinstance(last_modified, str):
            raise TypeError("Expected argument 'last_modified' to be a str")
        pulumi.set(__self__, "last_modified", last_modified)
        if license_type and not isinstance(license_type, str):
            raise TypeError("Expected argument 'license_type' to be a str")
        pulumi.set(__self__, "license_type", license_type)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if origin and not isinstance(origin, str):
            raise TypeError("Expected argument 'origin' to be a str")
        pulumi.set(__self__, "origin", origin)
        if renewal_date and not isinstance(renewal_date, str):
            raise TypeError("Expected argument 'renewal_date' to be a str")
        pulumi.set(__self__, "renewal_date", renewal_date)
        if service_id and not isinstance(service_id, str):
            raise TypeError("Expected argument 'service_id' to be a str")
        pulumi.set(__self__, "service_id", service_id)
        if state and not isinstance(state, str):
            raise TypeError("Expected argument 'state' to be a str")
        pulumi.set(__self__, "state", state)
        if subdomain and not isinstance(subdomain, str):
            raise TypeError("Expected argument 'subdomain' to be a str")
        pulumi.set(__self__, "subdomain", subdomain)
        if usage and not isinstance(usage, str):
            raise TypeError("Expected argument 'usage' to be a str")
        pulumi.set(__self__, "usage", usage)

    @property
    @pulumi.getter(name="commercialModel")
    def commercial_model(self) -> str:
        """
        The type of the commercial contract that was signed.
        """
        return pulumi.get(self, "commercial_model")

    @property
    @pulumi.getter(name="consumptionBased")
    def consumption_based(self) -> bool:
        """
        Shows whether the customer of the global account pays only for services that they actually use (consumption-based) or pays for subscribed services at a fixed cost irrespective of consumption (subscription-based).
        """
        return pulumi.get(self, "consumption_based")

    @property
    @pulumi.getter(name="contractStatus")
    def contract_status(self) -> str:
        """
        The status of the customer contract and its associated root global account. Possible values are:
        """
        return pulumi.get(self, "contract_status")

    @property
    @pulumi.getter(name="costobjectId")
    def costobject_id(self) -> str:
        return pulumi.get(self, "costobject_id")

    @property
    @pulumi.getter(name="costobjectType")
    def costobject_type(self) -> str:
        return pulumi.get(self, "costobject_type")

    @property
    @pulumi.getter(name="createdDate")
    def created_date(self) -> str:
        return pulumi.get(self, "created_date")

    @property
    @pulumi.getter(name="crmCustomerId")
    def crm_customer_id(self) -> str:
        return pulumi.get(self, "crm_customer_id")

    @property
    @pulumi.getter(name="crmTenantId")
    def crm_tenant_id(self) -> str:
        return pulumi.get(self, "crm_tenant_id")

    @property
    @pulumi.getter
    def description(self) -> str:
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="expiryDate")
    def expiry_date(self) -> str:
        return pulumi.get(self, "expiry_date")

    @property
    @pulumi.getter(name="geoAccess")
    def geo_access(self) -> str:
        return pulumi.get(self, "geo_access")

    @property
    @pulumi.getter
    def id(self) -> str:
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="lastModified")
    def last_modified(self) -> str:
        return pulumi.get(self, "last_modified")

    @property
    @pulumi.getter(name="licenseType")
    def license_type(self) -> str:
        return pulumi.get(self, "license_type")

    @property
    @pulumi.getter
    def name(self) -> str:
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def origin(self) -> str:
        return pulumi.get(self, "origin")

    @property
    @pulumi.getter(name="renewalDate")
    def renewal_date(self) -> str:
        return pulumi.get(self, "renewal_date")

    @property
    @pulumi.getter(name="serviceId")
    def service_id(self) -> str:
        return pulumi.get(self, "service_id")

    @property
    @pulumi.getter
    def state(self) -> str:
        return pulumi.get(self, "state")

    @property
    @pulumi.getter
    def subdomain(self) -> str:
        return pulumi.get(self, "subdomain")

    @property
    @pulumi.getter
    def usage(self) -> str:
        return pulumi.get(self, "usage")


class AwaitableGetGlobalaccountResult(GetGlobalaccountResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetGlobalaccountResult(
            commercial_model=self.commercial_model,
            consumption_based=self.consumption_based,
            contract_status=self.contract_status,
            costobject_id=self.costobject_id,
            costobject_type=self.costobject_type,
            created_date=self.created_date,
            crm_customer_id=self.crm_customer_id,
            crm_tenant_id=self.crm_tenant_id,
            description=self.description,
            expiry_date=self.expiry_date,
            geo_access=self.geo_access,
            id=self.id,
            last_modified=self.last_modified,
            license_type=self.license_type,
            name=self.name,
            origin=self.origin,
            renewal_date=self.renewal_date,
            service_id=self.service_id,
            state=self.state,
            subdomain=self.subdomain,
            usage=self.usage)


def get_globalaccount(opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetGlobalaccountResult:
    """
    Gets details about a global account.

    __Tip:__
    You must be assigned to the global account admin or viewer role.

    __Further documentation:__
    <https://help.sap.com/docs/btp/sap-business-technology-platform/account-model>

    ## Example Usage

    ```python
    import pulumi
    import pulumi_btp as btp

    this = btp.get_globalaccount()
    ```
    """
    __args__ = dict()
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('btp:index/getGlobalaccount:getGlobalaccount', __args__, opts=opts, typ=GetGlobalaccountResult).value

    return AwaitableGetGlobalaccountResult(
        commercial_model=pulumi.get(__ret__, 'commercial_model'),
        consumption_based=pulumi.get(__ret__, 'consumption_based'),
        contract_status=pulumi.get(__ret__, 'contract_status'),
        costobject_id=pulumi.get(__ret__, 'costobject_id'),
        costobject_type=pulumi.get(__ret__, 'costobject_type'),
        created_date=pulumi.get(__ret__, 'created_date'),
        crm_customer_id=pulumi.get(__ret__, 'crm_customer_id'),
        crm_tenant_id=pulumi.get(__ret__, 'crm_tenant_id'),
        description=pulumi.get(__ret__, 'description'),
        expiry_date=pulumi.get(__ret__, 'expiry_date'),
        geo_access=pulumi.get(__ret__, 'geo_access'),
        id=pulumi.get(__ret__, 'id'),
        last_modified=pulumi.get(__ret__, 'last_modified'),
        license_type=pulumi.get(__ret__, 'license_type'),
        name=pulumi.get(__ret__, 'name'),
        origin=pulumi.get(__ret__, 'origin'),
        renewal_date=pulumi.get(__ret__, 'renewal_date'),
        service_id=pulumi.get(__ret__, 'service_id'),
        state=pulumi.get(__ret__, 'state'),
        subdomain=pulumi.get(__ret__, 'subdomain'),
        usage=pulumi.get(__ret__, 'usage'))
