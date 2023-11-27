// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Directories allow you to organize and manage your subaccounts according to your technical and business needs. The use of directories is optional.
 *
 * You can create up to five levels of directories in your account hierarchy. If you have directories, you can still create subaccounts directly under your global account.
 *
 * __Tips:__
 * * You must be assigned to the global account admin role, or the directory admin if the directory is configured to manage its authorizations.
 * * A directory path in the account hierarchy can have only one directory that is enabled with the `ENTITLEMENTS` or `AUTHORIZATIONS` features. If such a directory exists, other directories in that path can only be enabled with the `DEFAULT` features.
 *
 * __Further documentation:__
 * <https://help.sap.com/docs/btp/sap-business-technology-platform/account-model>
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as btp from "@lechnerc77/pulumi-btp";
 *
 * // Create a parent directory without features enabled
 * const parent = new btp.Directory("parent", {description: "This is a parent directory."});
 * // Create a child directory underneath a parent directory without features enabled
 * const child = new btp.Directory("child", {
 *     parentId: parent.id,
 *     description: "This is a child directory.",
 * });
 * // Create a directory with ENTITLEMENT and AUTHORIZATIONS features enabled
 * const dirWithFeatures = new btp.Directory("dirWithFeatures", {
 *     description: "This is a directory with features.",
 *     features: [
 *         "DEFAULT",
 *         "ENTITLEMENTS",
 *         "AUTHORIZATIONS",
 *     ],
 * });
 * ```
 *
 * ## Import
 *
 * terraform
 *
 * ```sh
 *  $ pulumi import btp:index/directory:Directory <resource_name> <directory_id>
 * ```
 *
 * ```sh
 *  $ pulumi import btp:index/directory:Directory parent dd005d8b-1fee-4e6b-b6ff-cb9a197b7fe0
 * ```
 */
export class Directory extends pulumi.CustomResource {
    /**
     * Get an existing Directory resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: DirectoryState, opts?: pulumi.CustomResourceOptions): Directory {
        return new Directory(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'btp:index/directory:Directory';

    /**
     * Returns true if the given object is an instance of Directory.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Directory {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Directory.__pulumiType;
    }

    /**
     * The details of the user that created the directory.
     */
    public /*out*/ readonly createdBy!: pulumi.Output<string>;
    /**
     * The date and time when the resource was created in [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) format.
     */
    public /*out*/ readonly createdDate!: pulumi.Output<string>;
    /**
     * A description of the directory.
     */
    public readonly description!: pulumi.Output<string>;
    /**
     * The features that are enabled for the directory. Possible values are:
     */
    public readonly features!: pulumi.Output<string[]>;
    /**
     * Contains information about the labels assigned to a specified global account. Labels are represented in a JSON array of
     * key-value pairs; each key has up to 10 corresponding values.
     */
    public readonly labels!: pulumi.Output<{[key: string]: string[]} | undefined>;
    /**
     * The date and time when the resource was last modified in [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) format.
     */
    public /*out*/ readonly lastModified!: pulumi.Output<string>;
    /**
     * The display name of the directory.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The ID of the directory's parent entity. Typically this is the global account.
     */
    public readonly parentId!: pulumi.Output<string>;
    /**
     * The current state of the directory. Possible values are: | value | description | | --- | --- | | `OK` | The CRUD
     * operation or series of operations completed successfully. | | `STARTED` | CRUD operation on an entity has started. | |
     * `CREATING` | Creating entity operation is in progress. | | `UPDATING` | Updating entity operation is in progress. | |
     * `MOVING` | Moving entity operation is in progress. | | `PROCESSING` | A series of operations related to the entity is in
     * progress. | | `DELETING` | Deleting entity operation is in progress. | | `PENDING REVIEW` | The processing operation has
     * been stopped for reviewing and can be restarted by the operator. | | `CANCELLED` | The operation or processing was
     * canceled by the operator. | | `CREATION_FAILED` | The creation operation failed, and the entity was not created or was
     * created but cannot be used. | | `UPDATE_FAILED` | The update operation failed, and the entity was not updated. | |
     * `PROCESSING_FAILED` | The processing operations failed. | | `DELETION_FAILED` | The delete operation failed, and the
     * entity was not deleted. | | `MOVE_FAILED` | Entity could not be moved to a different location. | | `MIGRATING` |
     * Migrating entity from Neo to Cloud Foundry. |
     */
    public /*out*/ readonly state!: pulumi.Output<string>;
    /**
     * Applies only to directories that have the user authorization management feature enabled. The subdomain becomes part of
     * the path used to access the authorization tenant of the directory. It has to be unique within the defined region.
     */
    public readonly subdomain!: pulumi.Output<string>;

    /**
     * Create a Directory resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: DirectoryArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: DirectoryArgs | DirectoryState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as DirectoryState | undefined;
            resourceInputs["createdBy"] = state ? state.createdBy : undefined;
            resourceInputs["createdDate"] = state ? state.createdDate : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["features"] = state ? state.features : undefined;
            resourceInputs["labels"] = state ? state.labels : undefined;
            resourceInputs["lastModified"] = state ? state.lastModified : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["parentId"] = state ? state.parentId : undefined;
            resourceInputs["state"] = state ? state.state : undefined;
            resourceInputs["subdomain"] = state ? state.subdomain : undefined;
        } else {
            const args = argsOrState as DirectoryArgs | undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["features"] = args ? args.features : undefined;
            resourceInputs["labels"] = args ? args.labels : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["parentId"] = args ? args.parentId : undefined;
            resourceInputs["subdomain"] = args ? args.subdomain : undefined;
            resourceInputs["createdBy"] = undefined /*out*/;
            resourceInputs["createdDate"] = undefined /*out*/;
            resourceInputs["lastModified"] = undefined /*out*/;
            resourceInputs["state"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Directory.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Directory resources.
 */
export interface DirectoryState {
    /**
     * The details of the user that created the directory.
     */
    createdBy?: pulumi.Input<string>;
    /**
     * The date and time when the resource was created in [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) format.
     */
    createdDate?: pulumi.Input<string>;
    /**
     * A description of the directory.
     */
    description?: pulumi.Input<string>;
    /**
     * The features that are enabled for the directory. Possible values are:
     */
    features?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Contains information about the labels assigned to a specified global account. Labels are represented in a JSON array of
     * key-value pairs; each key has up to 10 corresponding values.
     */
    labels?: pulumi.Input<{[key: string]: pulumi.Input<pulumi.Input<string>[]>}>;
    /**
     * The date and time when the resource was last modified in [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) format.
     */
    lastModified?: pulumi.Input<string>;
    /**
     * The display name of the directory.
     */
    name?: pulumi.Input<string>;
    /**
     * The ID of the directory's parent entity. Typically this is the global account.
     */
    parentId?: pulumi.Input<string>;
    /**
     * The current state of the directory. Possible values are: | value | description | | --- | --- | | `OK` | The CRUD
     * operation or series of operations completed successfully. | | `STARTED` | CRUD operation on an entity has started. | |
     * `CREATING` | Creating entity operation is in progress. | | `UPDATING` | Updating entity operation is in progress. | |
     * `MOVING` | Moving entity operation is in progress. | | `PROCESSING` | A series of operations related to the entity is in
     * progress. | | `DELETING` | Deleting entity operation is in progress. | | `PENDING REVIEW` | The processing operation has
     * been stopped for reviewing and can be restarted by the operator. | | `CANCELLED` | The operation or processing was
     * canceled by the operator. | | `CREATION_FAILED` | The creation operation failed, and the entity was not created or was
     * created but cannot be used. | | `UPDATE_FAILED` | The update operation failed, and the entity was not updated. | |
     * `PROCESSING_FAILED` | The processing operations failed. | | `DELETION_FAILED` | The delete operation failed, and the
     * entity was not deleted. | | `MOVE_FAILED` | Entity could not be moved to a different location. | | `MIGRATING` |
     * Migrating entity from Neo to Cloud Foundry. |
     */
    state?: pulumi.Input<string>;
    /**
     * Applies only to directories that have the user authorization management feature enabled. The subdomain becomes part of
     * the path used to access the authorization tenant of the directory. It has to be unique within the defined region.
     */
    subdomain?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Directory resource.
 */
export interface DirectoryArgs {
    /**
     * A description of the directory.
     */
    description?: pulumi.Input<string>;
    /**
     * The features that are enabled for the directory. Possible values are:
     */
    features?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Contains information about the labels assigned to a specified global account. Labels are represented in a JSON array of
     * key-value pairs; each key has up to 10 corresponding values.
     */
    labels?: pulumi.Input<{[key: string]: pulumi.Input<pulumi.Input<string>[]>}>;
    /**
     * The display name of the directory.
     */
    name?: pulumi.Input<string>;
    /**
     * The ID of the directory's parent entity. Typically this is the global account.
     */
    parentId?: pulumi.Input<string>;
    /**
     * Applies only to directories that have the user authorization management feature enabled. The subdomain becomes part of
     * the path used to access the authorization tenant of the directory. It has to be unique within the defined region.
     */
    subdomain?: pulumi.Input<string>;
}