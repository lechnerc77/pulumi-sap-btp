// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Creates a service instance in a subaccount.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as btp from "@lechnerc77/pulumi-btp";
 *
 * // create an instance of the alert-notification service (no configuration necessary)
 * const alertNotificationFreeSubaccountServiceInstance = new btp.SubaccountServiceInstance("alertNotificationFreeSubaccountServiceInstance", {
 *     subaccountId: "6aa64c2f-38c1-49a9-b2e8-cf9fea769b7f",
 *     serviceplanId: "b50d1b0b-2059-4f21-a014-2ea87752eb48",
 * });
 * // create an xsuaa service instance with additional configurations
 * const xsuaaApplication = new btp.SubaccountServiceInstance("xsuaaApplication", {
 *     subaccountId: "6aa64c2f-38c1-49a9-b2e8-cf9fea769b7f",
 *     serviceplanId: "bd5e893f-81dd-4d10-8343-e02975e8ecd8",
 *     parameters: JSON.stringify({
 *         xsappname: "my-application",
 *         "tenant-mode": "dedicated",
 *     }),
 * });
 * // create an instance of the alert-notification service (no configuration necessary)
 * // in additon add a custom timeout for the create and update operation
 * const alertNotificationFreeIndex_subaccountServiceInstanceSubaccountServiceInstance = new btp.SubaccountServiceInstance("alertNotificationFreeIndex/subaccountServiceInstanceSubaccountServiceInstance", {
 *     subaccountId: "6aa64c2f-38c1-49a9-b2e8-cf9fea769b7f",
 *     serviceplanId: "b50d1b0b-2059-4f21-a014-2ea87752eb48",
 *     timeouts: {
 *         create: "25m",
 *         update: "15m",
 *         "delete": "15m",
 *     },
 * });
 * ```
 *
 * ## Import
 *
 * ### Restriction The import of service instances that can be configured via parameters only works if the corresponding service offering supports the retrieval of these parameters, which means that the `instances_retrievable` parameter of the service offering must be set to `true`. You can check this setting via the following data sourceterraform data "btp_subaccount_service_offering" "by_name" {
 *
 *  subaccount_id = <ID of your subaccount>
 *
 *  name
 *
 * = <name of the service offering> }
 */
export class SubaccountServiceInstance extends pulumi.CustomResource {
    /**
     * Get an existing SubaccountServiceInstance resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: SubaccountServiceInstanceState, opts?: pulumi.CustomResourceOptions): SubaccountServiceInstance {
        return new SubaccountServiceInstance(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'btp:index/subaccountServiceInstance:SubaccountServiceInstance';

    /**
     * Returns true if the given object is an instance of SubaccountServiceInstance.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is SubaccountServiceInstance {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === SubaccountServiceInstance.__pulumiType;
    }

    /**
     * Contextual data for the resource.
     */
    public /*out*/ readonly context!: pulumi.Output<string>;
    /**
     * The date and time when the resource was created in [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) format.
     */
    public /*out*/ readonly createdDate!: pulumi.Output<string>;
    /**
     * The set of words or phrases assigned to the service instance.
     */
    public readonly labels!: pulumi.Output<{[key: string]: string[]}>;
    /**
     * The date and time when the resource was last modified in [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) format.
     */
    public /*out*/ readonly lastModified!: pulumi.Output<string>;
    /**
     * The name of the service instance.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The configuration parameters for the service instance.
     */
    public readonly parameters!: pulumi.Output<string | undefined>;
    /**
     * The platform ID.
     */
    public /*out*/ readonly platformId!: pulumi.Output<string>;
    public /*out*/ readonly ready!: pulumi.Output<boolean>;
    /**
     * The ID of the instance to which the service instance refers.
     */
    public /*out*/ readonly referencedInstanceId!: pulumi.Output<string>;
    /**
     * The ID of the service plan.
     */
    public readonly serviceplanId!: pulumi.Output<string>;
    /**
     * Shows whether the service instance is shared.
     */
    public /*out*/ readonly shared!: pulumi.Output<boolean>;
    /**
     * The current state of the service instance.
     */
    public /*out*/ readonly state!: pulumi.Output<string>;
    /**
     * The ID of the subaccount.
     */
    public readonly subaccountId!: pulumi.Output<string>;
    public readonly timeouts!: pulumi.Output<outputs.SubaccountServiceInstanceTimeouts | undefined>;
    /**
     * Shows whether the resource can be used.
     */
    public /*out*/ readonly usable!: pulumi.Output<boolean>;

    /**
     * Create a SubaccountServiceInstance resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: SubaccountServiceInstanceArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: SubaccountServiceInstanceArgs | SubaccountServiceInstanceState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as SubaccountServiceInstanceState | undefined;
            resourceInputs["context"] = state ? state.context : undefined;
            resourceInputs["createdDate"] = state ? state.createdDate : undefined;
            resourceInputs["labels"] = state ? state.labels : undefined;
            resourceInputs["lastModified"] = state ? state.lastModified : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["parameters"] = state ? state.parameters : undefined;
            resourceInputs["platformId"] = state ? state.platformId : undefined;
            resourceInputs["ready"] = state ? state.ready : undefined;
            resourceInputs["referencedInstanceId"] = state ? state.referencedInstanceId : undefined;
            resourceInputs["serviceplanId"] = state ? state.serviceplanId : undefined;
            resourceInputs["shared"] = state ? state.shared : undefined;
            resourceInputs["state"] = state ? state.state : undefined;
            resourceInputs["subaccountId"] = state ? state.subaccountId : undefined;
            resourceInputs["timeouts"] = state ? state.timeouts : undefined;
            resourceInputs["usable"] = state ? state.usable : undefined;
        } else {
            const args = argsOrState as SubaccountServiceInstanceArgs | undefined;
            if ((!args || args.serviceplanId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'serviceplanId'");
            }
            if ((!args || args.subaccountId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'subaccountId'");
            }
            resourceInputs["labels"] = args ? args.labels : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["parameters"] = args?.parameters ? pulumi.secret(args.parameters) : undefined;
            resourceInputs["serviceplanId"] = args ? args.serviceplanId : undefined;
            resourceInputs["subaccountId"] = args ? args.subaccountId : undefined;
            resourceInputs["timeouts"] = args ? args.timeouts : undefined;
            resourceInputs["context"] = undefined /*out*/;
            resourceInputs["createdDate"] = undefined /*out*/;
            resourceInputs["lastModified"] = undefined /*out*/;
            resourceInputs["platformId"] = undefined /*out*/;
            resourceInputs["ready"] = undefined /*out*/;
            resourceInputs["referencedInstanceId"] = undefined /*out*/;
            resourceInputs["shared"] = undefined /*out*/;
            resourceInputs["state"] = undefined /*out*/;
            resourceInputs["usable"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        const secretOpts = { additionalSecretOutputs: ["parameters"] };
        opts = pulumi.mergeOptions(opts, secretOpts);
        super(SubaccountServiceInstance.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering SubaccountServiceInstance resources.
 */
export interface SubaccountServiceInstanceState {
    /**
     * Contextual data for the resource.
     */
    context?: pulumi.Input<string>;
    /**
     * The date and time when the resource was created in [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) format.
     */
    createdDate?: pulumi.Input<string>;
    /**
     * The set of words or phrases assigned to the service instance.
     */
    labels?: pulumi.Input<{[key: string]: pulumi.Input<pulumi.Input<string>[]>}>;
    /**
     * The date and time when the resource was last modified in [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) format.
     */
    lastModified?: pulumi.Input<string>;
    /**
     * The name of the service instance.
     */
    name?: pulumi.Input<string>;
    /**
     * The configuration parameters for the service instance.
     */
    parameters?: pulumi.Input<string>;
    /**
     * The platform ID.
     */
    platformId?: pulumi.Input<string>;
    ready?: pulumi.Input<boolean>;
    /**
     * The ID of the instance to which the service instance refers.
     */
    referencedInstanceId?: pulumi.Input<string>;
    /**
     * The ID of the service plan.
     */
    serviceplanId?: pulumi.Input<string>;
    /**
     * Shows whether the service instance is shared.
     */
    shared?: pulumi.Input<boolean>;
    /**
     * The current state of the service instance.
     */
    state?: pulumi.Input<string>;
    /**
     * The ID of the subaccount.
     */
    subaccountId?: pulumi.Input<string>;
    timeouts?: pulumi.Input<inputs.SubaccountServiceInstanceTimeouts>;
    /**
     * Shows whether the resource can be used.
     */
    usable?: pulumi.Input<boolean>;
}

/**
 * The set of arguments for constructing a SubaccountServiceInstance resource.
 */
export interface SubaccountServiceInstanceArgs {
    /**
     * The set of words or phrases assigned to the service instance.
     */
    labels?: pulumi.Input<{[key: string]: pulumi.Input<pulumi.Input<string>[]>}>;
    /**
     * The name of the service instance.
     */
    name?: pulumi.Input<string>;
    /**
     * The configuration parameters for the service instance.
     */
    parameters?: pulumi.Input<string>;
    /**
     * The ID of the service plan.
     */
    serviceplanId: pulumi.Input<string>;
    /**
     * The ID of the subaccount.
     */
    subaccountId: pulumi.Input<string>;
    timeouts?: pulumi.Input<inputs.SubaccountServiceInstanceTimeouts>;
}
