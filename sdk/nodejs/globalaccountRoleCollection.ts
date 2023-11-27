// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Creates a role collection in a global account.
 *
 * __Further documentation:__
 * <https://help.sap.com/docs/btp/sap-business-technology-platform/role-collections-and-roles-in-global-accounts-directories-and-subaccounts>
 *
 * ## Import
 *
 * terraform
 *
 * ```sh
 *  $ pulumi import btp:index/globalaccountRoleCollection:GlobalaccountRoleCollection <resource_name> '<name>'
 * ```
 *
 * ```sh
 *  $ pulumi import btp:index/globalaccountRoleCollection:GlobalaccountRoleCollection globalaccount_viewer 'Global Account Viewer'
 * ```
 */
export class GlobalaccountRoleCollection extends pulumi.CustomResource {
    /**
     * Get an existing GlobalaccountRoleCollection resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: GlobalaccountRoleCollectionState, opts?: pulumi.CustomResourceOptions): GlobalaccountRoleCollection {
        return new GlobalaccountRoleCollection(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'btp:index/globalaccountRoleCollection:GlobalaccountRoleCollection';

    /**
     * Returns true if the given object is an instance of GlobalaccountRoleCollection.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is GlobalaccountRoleCollection {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === GlobalaccountRoleCollection.__pulumiType;
    }

    /**
     * The description of the role collection.
     */
    public readonly description!: pulumi.Output<string>;
    /**
     * The name of the role collection.
     */
    public readonly name!: pulumi.Output<string>;
    public readonly roles!: pulumi.Output<outputs.GlobalaccountRoleCollectionRole[]>;

    /**
     * Create a GlobalaccountRoleCollection resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: GlobalaccountRoleCollectionArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: GlobalaccountRoleCollectionArgs | GlobalaccountRoleCollectionState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as GlobalaccountRoleCollectionState | undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["roles"] = state ? state.roles : undefined;
        } else {
            const args = argsOrState as GlobalaccountRoleCollectionArgs | undefined;
            if ((!args || args.roles === undefined) && !opts.urn) {
                throw new Error("Missing required property 'roles'");
            }
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["roles"] = args ? args.roles : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(GlobalaccountRoleCollection.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering GlobalaccountRoleCollection resources.
 */
export interface GlobalaccountRoleCollectionState {
    /**
     * The description of the role collection.
     */
    description?: pulumi.Input<string>;
    /**
     * The name of the role collection.
     */
    name?: pulumi.Input<string>;
    roles?: pulumi.Input<pulumi.Input<inputs.GlobalaccountRoleCollectionRole>[]>;
}

/**
 * The set of arguments for constructing a GlobalaccountRoleCollection resource.
 */
export interface GlobalaccountRoleCollectionArgs {
    /**
     * The description of the role collection.
     */
    description?: pulumi.Input<string>;
    /**
     * The name of the role collection.
     */
    name?: pulumi.Input<string>;
    roles: pulumi.Input<pulumi.Input<inputs.GlobalaccountRoleCollectionRole>[]>;
}