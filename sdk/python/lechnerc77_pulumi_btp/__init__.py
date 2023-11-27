# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

from . import _utilities
import typing
# Export this package's modules as members:
from .directory import *
from .directory_entitlement import *
from .directory_role_collection import *
from .directory_role_collection_assignment import *
from .get_directory import *
from .get_directory_entitlements import *
from .get_directory_labels import *
from .get_directory_role import *
from .get_directory_role_collection import *
from .get_directory_role_collections import *
from .get_directory_roles import *
from .get_directory_user import *
from .get_directory_users import *
from .get_globalaccount import *
from .get_globalaccount_entitlements import *
from .get_globalaccount_role import *
from .get_globalaccount_role_collection import *
from .get_globalaccount_role_collections import *
from .get_globalaccount_roles import *
from .get_globalaccount_trust_configuration import *
from .get_globalaccount_trust_configurations import *
from .get_globalaccount_user import *
from .get_globalaccount_users import *
from .get_regions import *
from .get_subaccount import *
from .get_subaccount_app import *
from .get_subaccount_apps import *
from .get_subaccount_entitlements import *
from .get_subaccount_environment_instance import *
from .get_subaccount_environment_instances import *
from .get_subaccount_environments import *
from .get_subaccount_labels import *
from .get_subaccount_role import *
from .get_subaccount_role_collection import *
from .get_subaccount_role_collections import *
from .get_subaccount_roles import *
from .get_subaccount_service_binding import *
from .get_subaccount_service_bindings import *
from .get_subaccount_service_instance import *
from .get_subaccount_service_instances import *
from .get_subaccount_service_offering import *
from .get_subaccount_service_offerings import *
from .get_subaccount_service_plan import *
from .get_subaccount_service_plans import *
from .get_subaccount_subscription import *
from .get_subaccount_subscriptions import *
from .get_subaccount_trust_configuration import *
from .get_subaccount_trust_configurations import *
from .get_subaccount_user import *
from .get_subaccount_users import *
from .get_subaccounts import *
from .get_whoami import *
from .globalaccount_resource_provider import *
from .globalaccount_role_collection import *
from .globalaccount_role_collection_assignment import *
from .globalaccount_trust_configuration import *
from .provider import *
from .subaccount import *
from .subaccount_entitlement import *
from .subaccount_environment_instance import *
from .subaccount_role_collection import *
from .subaccount_role_collection_assignment import *
from .subaccount_service_binding import *
from .subaccount_service_instance import *
from .subaccount_subscription import *
from .subaccount_trust_configuration import *
from ._inputs import *
from . import outputs

# Make subpackages available:
if typing.TYPE_CHECKING:
    import lechnerc77_pulumi_btp.config as __config
    config = __config
else:
    config = _utilities.lazy_import('lechnerc77_pulumi_btp.config')

_utilities.register(
    resource_modules="""
[
 {
  "pkg": "btp",
  "mod": "index/directory",
  "fqn": "lechnerc77_pulumi_btp",
  "classes": {
   "btp:index/directory:Directory": "Directory"
  }
 },
 {
  "pkg": "btp",
  "mod": "index/directoryEntitlement",
  "fqn": "lechnerc77_pulumi_btp",
  "classes": {
   "btp:index/directoryEntitlement:DirectoryEntitlement": "DirectoryEntitlement"
  }
 },
 {
  "pkg": "btp",
  "mod": "index/directoryRoleCollection",
  "fqn": "lechnerc77_pulumi_btp",
  "classes": {
   "btp:index/directoryRoleCollection:DirectoryRoleCollection": "DirectoryRoleCollection"
  }
 },
 {
  "pkg": "btp",
  "mod": "index/directoryRoleCollectionAssignment",
  "fqn": "lechnerc77_pulumi_btp",
  "classes": {
   "btp:index/directoryRoleCollectionAssignment:DirectoryRoleCollectionAssignment": "DirectoryRoleCollectionAssignment"
  }
 },
 {
  "pkg": "btp",
  "mod": "index/globalaccountResourceProvider",
  "fqn": "lechnerc77_pulumi_btp",
  "classes": {
   "btp:index/globalaccountResourceProvider:GlobalaccountResourceProvider": "GlobalaccountResourceProvider"
  }
 },
 {
  "pkg": "btp",
  "mod": "index/globalaccountRoleCollection",
  "fqn": "lechnerc77_pulumi_btp",
  "classes": {
   "btp:index/globalaccountRoleCollection:GlobalaccountRoleCollection": "GlobalaccountRoleCollection"
  }
 },
 {
  "pkg": "btp",
  "mod": "index/globalaccountRoleCollectionAssignment",
  "fqn": "lechnerc77_pulumi_btp",
  "classes": {
   "btp:index/globalaccountRoleCollectionAssignment:GlobalaccountRoleCollectionAssignment": "GlobalaccountRoleCollectionAssignment"
  }
 },
 {
  "pkg": "btp",
  "mod": "index/globalaccountTrustConfiguration",
  "fqn": "lechnerc77_pulumi_btp",
  "classes": {
   "btp:index/globalaccountTrustConfiguration:GlobalaccountTrustConfiguration": "GlobalaccountTrustConfiguration"
  }
 },
 {
  "pkg": "btp",
  "mod": "index/subaccount",
  "fqn": "lechnerc77_pulumi_btp",
  "classes": {
   "btp:index/subaccount:Subaccount": "Subaccount"
  }
 },
 {
  "pkg": "btp",
  "mod": "index/subaccountEntitlement",
  "fqn": "lechnerc77_pulumi_btp",
  "classes": {
   "btp:index/subaccountEntitlement:SubaccountEntitlement": "SubaccountEntitlement"
  }
 },
 {
  "pkg": "btp",
  "mod": "index/subaccountEnvironmentInstance",
  "fqn": "lechnerc77_pulumi_btp",
  "classes": {
   "btp:index/subaccountEnvironmentInstance:SubaccountEnvironmentInstance": "SubaccountEnvironmentInstance"
  }
 },
 {
  "pkg": "btp",
  "mod": "index/subaccountRoleCollection",
  "fqn": "lechnerc77_pulumi_btp",
  "classes": {
   "btp:index/subaccountRoleCollection:SubaccountRoleCollection": "SubaccountRoleCollection"
  }
 },
 {
  "pkg": "btp",
  "mod": "index/subaccountRoleCollectionAssignment",
  "fqn": "lechnerc77_pulumi_btp",
  "classes": {
   "btp:index/subaccountRoleCollectionAssignment:SubaccountRoleCollectionAssignment": "SubaccountRoleCollectionAssignment"
  }
 },
 {
  "pkg": "btp",
  "mod": "index/subaccountServiceBinding",
  "fqn": "lechnerc77_pulumi_btp",
  "classes": {
   "btp:index/subaccountServiceBinding:SubaccountServiceBinding": "SubaccountServiceBinding"
  }
 },
 {
  "pkg": "btp",
  "mod": "index/subaccountServiceInstance",
  "fqn": "lechnerc77_pulumi_btp",
  "classes": {
   "btp:index/subaccountServiceInstance:SubaccountServiceInstance": "SubaccountServiceInstance"
  }
 },
 {
  "pkg": "btp",
  "mod": "index/subaccountSubscription",
  "fqn": "lechnerc77_pulumi_btp",
  "classes": {
   "btp:index/subaccountSubscription:SubaccountSubscription": "SubaccountSubscription"
  }
 },
 {
  "pkg": "btp",
  "mod": "index/subaccountTrustConfiguration",
  "fqn": "lechnerc77_pulumi_btp",
  "classes": {
   "btp:index/subaccountTrustConfiguration:SubaccountTrustConfiguration": "SubaccountTrustConfiguration"
  }
 }
]
""",
    resource_packages="""
[
 {
  "pkg": "btp",
  "token": "pulumi:providers:btp",
  "fqn": "lechnerc77_pulumi_btp",
  "class": "Provider"
 }
]
"""
)
