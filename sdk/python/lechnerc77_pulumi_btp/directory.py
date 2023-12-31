# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['DirectoryArgs', 'Directory']

@pulumi.input_type
class DirectoryArgs:
    def __init__(__self__, *,
                 description: Optional[pulumi.Input[str]] = None,
                 features: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 labels: Optional[pulumi.Input[Mapping[str, pulumi.Input[Sequence[pulumi.Input[str]]]]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 parent_id: Optional[pulumi.Input[str]] = None,
                 subdomain: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a Directory resource.
        :param pulumi.Input[str] description: A description of the directory.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] features: The features that are enabled for the directory. Possible values are:
        :param pulumi.Input[Mapping[str, pulumi.Input[Sequence[pulumi.Input[str]]]]] labels: Contains information about the labels assigned to a specified global account. Labels are represented in a JSON array of
               key-value pairs; each key has up to 10 corresponding values.
        :param pulumi.Input[str] name: The display name of the directory.
        :param pulumi.Input[str] parent_id: The ID of the directory's parent entity. Typically this is the global account.
        :param pulumi.Input[str] subdomain: Applies only to directories that have the user authorization management feature enabled. The subdomain becomes part of
               the path used to access the authorization tenant of the directory. It has to be unique within the defined region.
        """
        if description is not None:
            pulumi.set(__self__, "description", description)
        if features is not None:
            pulumi.set(__self__, "features", features)
        if labels is not None:
            pulumi.set(__self__, "labels", labels)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if parent_id is not None:
            pulumi.set(__self__, "parent_id", parent_id)
        if subdomain is not None:
            pulumi.set(__self__, "subdomain", subdomain)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        A description of the directory.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter
    def features(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        The features that are enabled for the directory. Possible values are:
        """
        return pulumi.get(self, "features")

    @features.setter
    def features(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "features", value)

    @property
    @pulumi.getter
    def labels(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[Sequence[pulumi.Input[str]]]]]]:
        """
        Contains information about the labels assigned to a specified global account. Labels are represented in a JSON array of
        key-value pairs; each key has up to 10 corresponding values.
        """
        return pulumi.get(self, "labels")

    @labels.setter
    def labels(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[Sequence[pulumi.Input[str]]]]]]):
        pulumi.set(self, "labels", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The display name of the directory.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="parentId")
    def parent_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the directory's parent entity. Typically this is the global account.
        """
        return pulumi.get(self, "parent_id")

    @parent_id.setter
    def parent_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "parent_id", value)

    @property
    @pulumi.getter
    def subdomain(self) -> Optional[pulumi.Input[str]]:
        """
        Applies only to directories that have the user authorization management feature enabled. The subdomain becomes part of
        the path used to access the authorization tenant of the directory. It has to be unique within the defined region.
        """
        return pulumi.get(self, "subdomain")

    @subdomain.setter
    def subdomain(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "subdomain", value)


@pulumi.input_type
class _DirectoryState:
    def __init__(__self__, *,
                 created_by: Optional[pulumi.Input[str]] = None,
                 created_date: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 features: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 labels: Optional[pulumi.Input[Mapping[str, pulumi.Input[Sequence[pulumi.Input[str]]]]]] = None,
                 last_modified: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 parent_id: Optional[pulumi.Input[str]] = None,
                 state: Optional[pulumi.Input[str]] = None,
                 subdomain: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering Directory resources.
        :param pulumi.Input[str] created_by: The details of the user that created the directory.
        :param pulumi.Input[str] created_date: The date and time when the resource was created in [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) format.
        :param pulumi.Input[str] description: A description of the directory.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] features: The features that are enabled for the directory. Possible values are:
        :param pulumi.Input[Mapping[str, pulumi.Input[Sequence[pulumi.Input[str]]]]] labels: Contains information about the labels assigned to a specified global account. Labels are represented in a JSON array of
               key-value pairs; each key has up to 10 corresponding values.
        :param pulumi.Input[str] last_modified: The date and time when the resource was last modified in [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) format.
        :param pulumi.Input[str] name: The display name of the directory.
        :param pulumi.Input[str] parent_id: The ID of the directory's parent entity. Typically this is the global account.
        :param pulumi.Input[str] state: The current state of the directory. Possible values are: | value | description | | --- | --- | | `OK` | The CRUD
               operation or series of operations completed successfully. | | `STARTED` | CRUD operation on an entity has started. | |
               `CREATING` | Creating entity operation is in progress. | | `UPDATING` | Updating entity operation is in progress. | |
               `MOVING` | Moving entity operation is in progress. | | `PROCESSING` | A series of operations related to the entity is in
               progress. | | `DELETING` | Deleting entity operation is in progress. | | `PENDING REVIEW` | The processing operation has
               been stopped for reviewing and can be restarted by the operator. | | `CANCELLED` | The operation or processing was
               canceled by the operator. | | `CREATION_FAILED` | The creation operation failed, and the entity was not created or was
               created but cannot be used. | | `UPDATE_FAILED` | The update operation failed, and the entity was not updated. | |
               `PROCESSING_FAILED` | The processing operations failed. | | `DELETION_FAILED` | The delete operation failed, and the
               entity was not deleted. | | `MOVE_FAILED` | Entity could not be moved to a different location. | | `MIGRATING` |
               Migrating entity from Neo to Cloud Foundry. |
        :param pulumi.Input[str] subdomain: Applies only to directories that have the user authorization management feature enabled. The subdomain becomes part of
               the path used to access the authorization tenant of the directory. It has to be unique within the defined region.
        """
        if created_by is not None:
            pulumi.set(__self__, "created_by", created_by)
        if created_date is not None:
            pulumi.set(__self__, "created_date", created_date)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if features is not None:
            pulumi.set(__self__, "features", features)
        if labels is not None:
            pulumi.set(__self__, "labels", labels)
        if last_modified is not None:
            pulumi.set(__self__, "last_modified", last_modified)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if parent_id is not None:
            pulumi.set(__self__, "parent_id", parent_id)
        if state is not None:
            pulumi.set(__self__, "state", state)
        if subdomain is not None:
            pulumi.set(__self__, "subdomain", subdomain)

    @property
    @pulumi.getter(name="createdBy")
    def created_by(self) -> Optional[pulumi.Input[str]]:
        """
        The details of the user that created the directory.
        """
        return pulumi.get(self, "created_by")

    @created_by.setter
    def created_by(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "created_by", value)

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
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        A description of the directory.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter
    def features(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        The features that are enabled for the directory. Possible values are:
        """
        return pulumi.get(self, "features")

    @features.setter
    def features(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "features", value)

    @property
    @pulumi.getter
    def labels(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[Sequence[pulumi.Input[str]]]]]]:
        """
        Contains information about the labels assigned to a specified global account. Labels are represented in a JSON array of
        key-value pairs; each key has up to 10 corresponding values.
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
        The display name of the directory.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="parentId")
    def parent_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the directory's parent entity. Typically this is the global account.
        """
        return pulumi.get(self, "parent_id")

    @parent_id.setter
    def parent_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "parent_id", value)

    @property
    @pulumi.getter
    def state(self) -> Optional[pulumi.Input[str]]:
        """
        The current state of the directory. Possible values are: | value | description | | --- | --- | | `OK` | The CRUD
        operation or series of operations completed successfully. | | `STARTED` | CRUD operation on an entity has started. | |
        `CREATING` | Creating entity operation is in progress. | | `UPDATING` | Updating entity operation is in progress. | |
        `MOVING` | Moving entity operation is in progress. | | `PROCESSING` | A series of operations related to the entity is in
        progress. | | `DELETING` | Deleting entity operation is in progress. | | `PENDING REVIEW` | The processing operation has
        been stopped for reviewing and can be restarted by the operator. | | `CANCELLED` | The operation or processing was
        canceled by the operator. | | `CREATION_FAILED` | The creation operation failed, and the entity was not created or was
        created but cannot be used. | | `UPDATE_FAILED` | The update operation failed, and the entity was not updated. | |
        `PROCESSING_FAILED` | The processing operations failed. | | `DELETION_FAILED` | The delete operation failed, and the
        entity was not deleted. | | `MOVE_FAILED` | Entity could not be moved to a different location. | | `MIGRATING` |
        Migrating entity from Neo to Cloud Foundry. |
        """
        return pulumi.get(self, "state")

    @state.setter
    def state(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "state", value)

    @property
    @pulumi.getter
    def subdomain(self) -> Optional[pulumi.Input[str]]:
        """
        Applies only to directories that have the user authorization management feature enabled. The subdomain becomes part of
        the path used to access the authorization tenant of the directory. It has to be unique within the defined region.
        """
        return pulumi.get(self, "subdomain")

    @subdomain.setter
    def subdomain(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "subdomain", value)


class Directory(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 features: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 labels: Optional[pulumi.Input[Mapping[str, pulumi.Input[Sequence[pulumi.Input[str]]]]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 parent_id: Optional[pulumi.Input[str]] = None,
                 subdomain: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Directories allow you to organize and manage your subaccounts according to your technical and business needs. The use of directories is optional.

        You can create up to five levels of directories in your account hierarchy. If you have directories, you can still create subaccounts directly under your global account.

        __Tips:__
        * You must be assigned to the global account admin role, or the directory admin if the directory is configured to manage its authorizations.
        * A directory path in the account hierarchy can have only one directory that is enabled with the `ENTITLEMENTS` or `AUTHORIZATIONS` features. If such a directory exists, other directories in that path can only be enabled with the `DEFAULT` features.

        __Further documentation:__
        <https://help.sap.com/docs/btp/sap-business-technology-platform/account-model>

        ## Example Usage

        ```python
        import pulumi
        import lechnerc77_pulumi_btp as btp

        # Create a parent directory without features enabled
        parent = btp.Directory("parent", description="This is a parent directory.")
        # Create a child directory underneath a parent directory without features enabled
        child = btp.Directory("child",
            parent_id=parent.id,
            description="This is a child directory.")
        # Create a directory with ENTITLEMENT and AUTHORIZATIONS features enabled
        dir_with_features = btp.Directory("dirWithFeatures",
            description="This is a directory with features.",
            features=[
                "DEFAULT",
                "ENTITLEMENTS",
                "AUTHORIZATIONS",
            ])
        ```

        ## Import

        terraform

        ```sh
         $ pulumi import btp:index/directory:Directory <resource_name> <directory_id>
        ```

        ```sh
         $ pulumi import btp:index/directory:Directory parent dd005d8b-1fee-4e6b-b6ff-cb9a197b7fe0
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] description: A description of the directory.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] features: The features that are enabled for the directory. Possible values are:
        :param pulumi.Input[Mapping[str, pulumi.Input[Sequence[pulumi.Input[str]]]]] labels: Contains information about the labels assigned to a specified global account. Labels are represented in a JSON array of
               key-value pairs; each key has up to 10 corresponding values.
        :param pulumi.Input[str] name: The display name of the directory.
        :param pulumi.Input[str] parent_id: The ID of the directory's parent entity. Typically this is the global account.
        :param pulumi.Input[str] subdomain: Applies only to directories that have the user authorization management feature enabled. The subdomain becomes part of
               the path used to access the authorization tenant of the directory. It has to be unique within the defined region.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: Optional[DirectoryArgs] = None,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Directories allow you to organize and manage your subaccounts according to your technical and business needs. The use of directories is optional.

        You can create up to five levels of directories in your account hierarchy. If you have directories, you can still create subaccounts directly under your global account.

        __Tips:__
        * You must be assigned to the global account admin role, or the directory admin if the directory is configured to manage its authorizations.
        * A directory path in the account hierarchy can have only one directory that is enabled with the `ENTITLEMENTS` or `AUTHORIZATIONS` features. If such a directory exists, other directories in that path can only be enabled with the `DEFAULT` features.

        __Further documentation:__
        <https://help.sap.com/docs/btp/sap-business-technology-platform/account-model>

        ## Example Usage

        ```python
        import pulumi
        import lechnerc77_pulumi_btp as btp

        # Create a parent directory without features enabled
        parent = btp.Directory("parent", description="This is a parent directory.")
        # Create a child directory underneath a parent directory without features enabled
        child = btp.Directory("child",
            parent_id=parent.id,
            description="This is a child directory.")
        # Create a directory with ENTITLEMENT and AUTHORIZATIONS features enabled
        dir_with_features = btp.Directory("dirWithFeatures",
            description="This is a directory with features.",
            features=[
                "DEFAULT",
                "ENTITLEMENTS",
                "AUTHORIZATIONS",
            ])
        ```

        ## Import

        terraform

        ```sh
         $ pulumi import btp:index/directory:Directory <resource_name> <directory_id>
        ```

        ```sh
         $ pulumi import btp:index/directory:Directory parent dd005d8b-1fee-4e6b-b6ff-cb9a197b7fe0
        ```

        :param str resource_name: The name of the resource.
        :param DirectoryArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(DirectoryArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 features: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 labels: Optional[pulumi.Input[Mapping[str, pulumi.Input[Sequence[pulumi.Input[str]]]]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 parent_id: Optional[pulumi.Input[str]] = None,
                 subdomain: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = DirectoryArgs.__new__(DirectoryArgs)

            __props__.__dict__["description"] = description
            __props__.__dict__["features"] = features
            __props__.__dict__["labels"] = labels
            __props__.__dict__["name"] = name
            __props__.__dict__["parent_id"] = parent_id
            __props__.__dict__["subdomain"] = subdomain
            __props__.__dict__["created_by"] = None
            __props__.__dict__["created_date"] = None
            __props__.__dict__["last_modified"] = None
            __props__.__dict__["state"] = None
        super(Directory, __self__).__init__(
            'btp:index/directory:Directory',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            created_by: Optional[pulumi.Input[str]] = None,
            created_date: Optional[pulumi.Input[str]] = None,
            description: Optional[pulumi.Input[str]] = None,
            features: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            labels: Optional[pulumi.Input[Mapping[str, pulumi.Input[Sequence[pulumi.Input[str]]]]]] = None,
            last_modified: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            parent_id: Optional[pulumi.Input[str]] = None,
            state: Optional[pulumi.Input[str]] = None,
            subdomain: Optional[pulumi.Input[str]] = None) -> 'Directory':
        """
        Get an existing Directory resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] created_by: The details of the user that created the directory.
        :param pulumi.Input[str] created_date: The date and time when the resource was created in [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) format.
        :param pulumi.Input[str] description: A description of the directory.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] features: The features that are enabled for the directory. Possible values are:
        :param pulumi.Input[Mapping[str, pulumi.Input[Sequence[pulumi.Input[str]]]]] labels: Contains information about the labels assigned to a specified global account. Labels are represented in a JSON array of
               key-value pairs; each key has up to 10 corresponding values.
        :param pulumi.Input[str] last_modified: The date and time when the resource was last modified in [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) format.
        :param pulumi.Input[str] name: The display name of the directory.
        :param pulumi.Input[str] parent_id: The ID of the directory's parent entity. Typically this is the global account.
        :param pulumi.Input[str] state: The current state of the directory. Possible values are: | value | description | | --- | --- | | `OK` | The CRUD
               operation or series of operations completed successfully. | | `STARTED` | CRUD operation on an entity has started. | |
               `CREATING` | Creating entity operation is in progress. | | `UPDATING` | Updating entity operation is in progress. | |
               `MOVING` | Moving entity operation is in progress. | | `PROCESSING` | A series of operations related to the entity is in
               progress. | | `DELETING` | Deleting entity operation is in progress. | | `PENDING REVIEW` | The processing operation has
               been stopped for reviewing and can be restarted by the operator. | | `CANCELLED` | The operation or processing was
               canceled by the operator. | | `CREATION_FAILED` | The creation operation failed, and the entity was not created or was
               created but cannot be used. | | `UPDATE_FAILED` | The update operation failed, and the entity was not updated. | |
               `PROCESSING_FAILED` | The processing operations failed. | | `DELETION_FAILED` | The delete operation failed, and the
               entity was not deleted. | | `MOVE_FAILED` | Entity could not be moved to a different location. | | `MIGRATING` |
               Migrating entity from Neo to Cloud Foundry. |
        :param pulumi.Input[str] subdomain: Applies only to directories that have the user authorization management feature enabled. The subdomain becomes part of
               the path used to access the authorization tenant of the directory. It has to be unique within the defined region.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _DirectoryState.__new__(_DirectoryState)

        __props__.__dict__["created_by"] = created_by
        __props__.__dict__["created_date"] = created_date
        __props__.__dict__["description"] = description
        __props__.__dict__["features"] = features
        __props__.__dict__["labels"] = labels
        __props__.__dict__["last_modified"] = last_modified
        __props__.__dict__["name"] = name
        __props__.__dict__["parent_id"] = parent_id
        __props__.__dict__["state"] = state
        __props__.__dict__["subdomain"] = subdomain
        return Directory(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="createdBy")
    def created_by(self) -> pulumi.Output[str]:
        """
        The details of the user that created the directory.
        """
        return pulumi.get(self, "created_by")

    @property
    @pulumi.getter(name="createdDate")
    def created_date(self) -> pulumi.Output[str]:
        """
        The date and time when the resource was created in [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) format.
        """
        return pulumi.get(self, "created_date")

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[str]:
        """
        A description of the directory.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def features(self) -> pulumi.Output[Sequence[str]]:
        """
        The features that are enabled for the directory. Possible values are:
        """
        return pulumi.get(self, "features")

    @property
    @pulumi.getter
    def labels(self) -> pulumi.Output[Optional[Mapping[str, Sequence[str]]]]:
        """
        Contains information about the labels assigned to a specified global account. Labels are represented in a JSON array of
        key-value pairs; each key has up to 10 corresponding values.
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
        The display name of the directory.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="parentId")
    def parent_id(self) -> pulumi.Output[str]:
        """
        The ID of the directory's parent entity. Typically this is the global account.
        """
        return pulumi.get(self, "parent_id")

    @property
    @pulumi.getter
    def state(self) -> pulumi.Output[str]:
        """
        The current state of the directory. Possible values are: | value | description | | --- | --- | | `OK` | The CRUD
        operation or series of operations completed successfully. | | `STARTED` | CRUD operation on an entity has started. | |
        `CREATING` | Creating entity operation is in progress. | | `UPDATING` | Updating entity operation is in progress. | |
        `MOVING` | Moving entity operation is in progress. | | `PROCESSING` | A series of operations related to the entity is in
        progress. | | `DELETING` | Deleting entity operation is in progress. | | `PENDING REVIEW` | The processing operation has
        been stopped for reviewing and can be restarted by the operator. | | `CANCELLED` | The operation or processing was
        canceled by the operator. | | `CREATION_FAILED` | The creation operation failed, and the entity was not created or was
        created but cannot be used. | | `UPDATE_FAILED` | The update operation failed, and the entity was not updated. | |
        `PROCESSING_FAILED` | The processing operations failed. | | `DELETION_FAILED` | The delete operation failed, and the
        entity was not deleted. | | `MOVE_FAILED` | Entity could not be moved to a different location. | | `MIGRATING` |
        Migrating entity from Neo to Cloud Foundry. |
        """
        return pulumi.get(self, "state")

    @property
    @pulumi.getter
    def subdomain(self) -> pulumi.Output[str]:
        """
        Applies only to directories that have the user authorization management feature enabled. The subdomain becomes part of
        the path used to access the authorization tenant of the directory. It has to be unique within the defined region.
        """
        return pulumi.get(self, "subdomain")

