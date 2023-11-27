// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Gets details about a specific provisioned service instance, such as its name, id,  platform to which it belongs, and the last operation performed.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as btp from "@pulumi/btp";
 *
 * const byId = btp.getSubaccountServiceInstance({
 *     id: "bc8a216f-1184-49dc-b4b4-17cfe2828965",
 *     subaccountId: "6aa64c2f-38c1-49a9-b2e8-cf9fea769b7f",
 * });
 * const byName = btp.getSubaccountServiceInstance({
 *     name: "my-xsuaa-application",
 *     subaccountId: "6aa64c2f-38c1-49a9-b2e8-cf9fea769b7f",
 * });
 * ```
 */
export function getSubaccountServiceInstance(args: GetSubaccountServiceInstanceArgs, opts?: pulumi.InvokeOptions): Promise<GetSubaccountServiceInstanceResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("btp:index/getSubaccountServiceInstance:getSubaccountServiceInstance", {
        "id": args.id,
        "name": args.name,
        "subaccountId": args.subaccountId,
    }, opts);
}

/**
 * A collection of arguments for invoking getSubaccountServiceInstance.
 */
export interface GetSubaccountServiceInstanceArgs {
    /**
     * The ID of the service instance.
     */
    id?: string;
    /**
     * The name of the service instance.
     */
    name?: string;
    /**
     * The ID of the subaccount.
     */
    subaccountId: string;
}

/**
 * A collection of values returned by getSubaccountServiceInstance.
 */
export interface GetSubaccountServiceInstanceResult {
    /**
     * Contextual data for the resource.
     */
    readonly context: {[key: string]: string};
    /**
     * The date and time when the resource was created in [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) format.
     */
    readonly createdDate: string;
    /**
     * The ID of the service instance.
     */
    readonly id: string;
    /**
     * The set of words or phrases assigned to the service instance.
     */
    readonly labels: {[key: string]: string[]};
    /**
     * The date and time when the resource was last modified in [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) format.
     */
    readonly lastModified: string;
    /**
     * The name of the service instance.
     */
    readonly name: string;
    /**
     * The configuration parameters for the service instance.
     */
    readonly parameters: string;
    /**
     * The platform ID.
     */
    readonly platformId: string;
    readonly ready: boolean;
    /**
     * The ID of the instance to which the service instance refers.
     */
    readonly referencedInstanceId: string;
    /**
     * The ID of the service plan.
     */
    readonly serviceplanId: string;
    /**
     * Shows whether the service instance is shared.
     */
    readonly shared: boolean;
    /**
     * The current state of the service instance.
     */
    readonly state: string;
    /**
     * The ID of the subaccount.
     */
    readonly subaccountId: string;
    /**
     * Shows whether the resource can be used.
     */
    readonly usable: boolean;
}
/**
 * Gets details about a specific provisioned service instance, such as its name, id,  platform to which it belongs, and the last operation performed.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as btp from "@pulumi/btp";
 *
 * const byId = btp.getSubaccountServiceInstance({
 *     id: "bc8a216f-1184-49dc-b4b4-17cfe2828965",
 *     subaccountId: "6aa64c2f-38c1-49a9-b2e8-cf9fea769b7f",
 * });
 * const byName = btp.getSubaccountServiceInstance({
 *     name: "my-xsuaa-application",
 *     subaccountId: "6aa64c2f-38c1-49a9-b2e8-cf9fea769b7f",
 * });
 * ```
 */
export function getSubaccountServiceInstanceOutput(args: GetSubaccountServiceInstanceOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetSubaccountServiceInstanceResult> {
    return pulumi.output(args).apply((a: any) => getSubaccountServiceInstance(a, opts))
}

/**
 * A collection of arguments for invoking getSubaccountServiceInstance.
 */
export interface GetSubaccountServiceInstanceOutputArgs {
    /**
     * The ID of the service instance.
     */
    id?: pulumi.Input<string>;
    /**
     * The name of the service instance.
     */
    name?: pulumi.Input<string>;
    /**
     * The ID of the subaccount.
     */
    subaccountId: pulumi.Input<string>;
}