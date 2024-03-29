// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Creates a service binding, i.e. generates access details to consume a service.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as btp from "@lechnerc77/pulumi-btp";
 *
 * // create a service binding in a subaccount
 * const myBinding = new btp.SubaccountServiceBinding("myBinding", {
 *     subaccountId: "6aa64c2f-38c1-49a9-b2e8-cf9fea769b7f",
 *     serviceInstanceId: "8911491d-0e1d-425d-a233-785512602d6f",
 * });
 * // create a parameterized service binding in a subaccount
 * const myParameterizedBinding = new btp.SubaccountServiceBinding("myParameterizedBinding", {
 *     subaccountId: "6aa64c2f-38c1-49a9-b2e8-cf9fea769b7f",
 *     serviceInstanceId: "8911491d-0e1d-425d-a233-785512602d6f",
 *     parameters: JSON.stringify({
 *         param_a: "",
 *         param_b: "",
 *     }),
 * });
 * ```
 *
 * ## Import
 *
 * terraform
 *
 * ```sh
 *  $ pulumi import btp:index/subaccountServiceBinding:SubaccountServiceBinding <resource_name> <subaccount_id>,<service_binding_id>
 * ```
 *
 * ```sh
 *  $ pulumi import btp:index/subaccountServiceBinding:SubaccountServiceBinding my_binding 6aa64c2f-38c1-49a9-b2e8-cf9fea769b7f,910e9a7d-0fb4-4428-a813-56550e683579
 * ```
 */
export class SubaccountServiceBinding extends pulumi.CustomResource {
    /**
     * Get an existing SubaccountServiceBinding resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: SubaccountServiceBindingState, opts?: pulumi.CustomResourceOptions): SubaccountServiceBinding {
        return new SubaccountServiceBinding(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'btp:index/subaccountServiceBinding:SubaccountServiceBinding';

    /**
     * Returns true if the given object is an instance of SubaccountServiceBinding.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is SubaccountServiceBinding {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === SubaccountServiceBinding.__pulumiType;
    }

    /**
     * Contains the resources associated with the binding.
     */
    public /*out*/ readonly bindResource!: pulumi.Output<{[key: string]: string}>;
    /**
     * The contextual data for the resource.
     */
    public /*out*/ readonly context!: pulumi.Output<string>;
    /**
     * The date and time when the resource was created in [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) format.
     */
    public /*out*/ readonly createdDate!: pulumi.Output<string>;
    /**
     * The credentials to access the binding.
     */
    public /*out*/ readonly credentials!: pulumi.Output<string>;
    /**
     * The set of words or phrases assigned to the service binding.
     */
    public readonly labels!: pulumi.Output<{[key: string]: string[]}>;
    /**
     * The date and time when the resource was last modified in [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) format.
     */
    public /*out*/ readonly lastModified!: pulumi.Output<string>;
    /**
     * The name of the service binding.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The parameters of the service binding as a valid JSON object.
     */
    public readonly parameters!: pulumi.Output<string>;
    /**
     * Shows whether the service binding is ready.
     */
    public /*out*/ readonly ready!: pulumi.Output<boolean>;
    /**
     * The ID of the service instance associated with the binding.
     */
    public readonly serviceInstanceId!: pulumi.Output<string>;
    /**
     * The current state of the service binding. Possible values are:
     */
    public /*out*/ readonly state!: pulumi.Output<string>;
    /**
     * The ID of the subaccount.
     */
    public readonly subaccountId!: pulumi.Output<string>;

    /**
     * Create a SubaccountServiceBinding resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: SubaccountServiceBindingArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: SubaccountServiceBindingArgs | SubaccountServiceBindingState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as SubaccountServiceBindingState | undefined;
            resourceInputs["bindResource"] = state ? state.bindResource : undefined;
            resourceInputs["context"] = state ? state.context : undefined;
            resourceInputs["createdDate"] = state ? state.createdDate : undefined;
            resourceInputs["credentials"] = state ? state.credentials : undefined;
            resourceInputs["labels"] = state ? state.labels : undefined;
            resourceInputs["lastModified"] = state ? state.lastModified : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["parameters"] = state ? state.parameters : undefined;
            resourceInputs["ready"] = state ? state.ready : undefined;
            resourceInputs["serviceInstanceId"] = state ? state.serviceInstanceId : undefined;
            resourceInputs["state"] = state ? state.state : undefined;
            resourceInputs["subaccountId"] = state ? state.subaccountId : undefined;
        } else {
            const args = argsOrState as SubaccountServiceBindingArgs | undefined;
            if ((!args || args.serviceInstanceId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'serviceInstanceId'");
            }
            if ((!args || args.subaccountId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'subaccountId'");
            }
            resourceInputs["labels"] = args ? args.labels : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["parameters"] = args ? args.parameters : undefined;
            resourceInputs["serviceInstanceId"] = args ? args.serviceInstanceId : undefined;
            resourceInputs["subaccountId"] = args ? args.subaccountId : undefined;
            resourceInputs["bindResource"] = undefined /*out*/;
            resourceInputs["context"] = undefined /*out*/;
            resourceInputs["createdDate"] = undefined /*out*/;
            resourceInputs["credentials"] = undefined /*out*/;
            resourceInputs["lastModified"] = undefined /*out*/;
            resourceInputs["ready"] = undefined /*out*/;
            resourceInputs["state"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        const secretOpts = { additionalSecretOutputs: ["credentials"] };
        opts = pulumi.mergeOptions(opts, secretOpts);
        super(SubaccountServiceBinding.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering SubaccountServiceBinding resources.
 */
export interface SubaccountServiceBindingState {
    /**
     * Contains the resources associated with the binding.
     */
    bindResource?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The contextual data for the resource.
     */
    context?: pulumi.Input<string>;
    /**
     * The date and time when the resource was created in [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) format.
     */
    createdDate?: pulumi.Input<string>;
    /**
     * The credentials to access the binding.
     */
    credentials?: pulumi.Input<string>;
    /**
     * The set of words or phrases assigned to the service binding.
     */
    labels?: pulumi.Input<{[key: string]: pulumi.Input<pulumi.Input<string>[]>}>;
    /**
     * The date and time when the resource was last modified in [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) format.
     */
    lastModified?: pulumi.Input<string>;
    /**
     * The name of the service binding.
     */
    name?: pulumi.Input<string>;
    /**
     * The parameters of the service binding as a valid JSON object.
     */
    parameters?: pulumi.Input<string>;
    /**
     * Shows whether the service binding is ready.
     */
    ready?: pulumi.Input<boolean>;
    /**
     * The ID of the service instance associated with the binding.
     */
    serviceInstanceId?: pulumi.Input<string>;
    /**
     * The current state of the service binding. Possible values are:
     */
    state?: pulumi.Input<string>;
    /**
     * The ID of the subaccount.
     */
    subaccountId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a SubaccountServiceBinding resource.
 */
export interface SubaccountServiceBindingArgs {
    /**
     * The set of words or phrases assigned to the service binding.
     */
    labels?: pulumi.Input<{[key: string]: pulumi.Input<pulumi.Input<string>[]>}>;
    /**
     * The name of the service binding.
     */
    name?: pulumi.Input<string>;
    /**
     * The parameters of the service binding as a valid JSON object.
     */
    parameters?: pulumi.Input<string>;
    /**
     * The ID of the service instance associated with the binding.
     */
    serviceInstanceId: pulumi.Input<string>;
    /**
     * The ID of the subaccount.
     */
    subaccountId: pulumi.Input<string>;
}
