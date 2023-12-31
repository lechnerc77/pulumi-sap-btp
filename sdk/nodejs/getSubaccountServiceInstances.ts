// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Lists all service instances in a subaccount.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as btp from "@pulumi/btp";
 *
 * const all = btp.getSubaccountServiceInstances({
 *     subaccountId: "6aa64c2f-38c1-49a9-b2e8-cf9fea769b7f",
 * });
 * const ready = btp.getSubaccountServiceInstances({
 *     fieldsFilter: "ready eq 'true'",
 *     subaccountId: "6aa64c2f-38c1-49a9-b2e8-cf9fea769b7f",
 * });
 * const byLabel = btp.getSubaccountServiceInstances({
 *     labelsFilter: "labelname eq 'labelvalue'",
 *     subaccountId: "6aa64c2f-38c1-49a9-b2e8-cf9fea769b7f",
 * });
 * ```
 */
export function getSubaccountServiceInstances(args: GetSubaccountServiceInstancesArgs, opts?: pulumi.InvokeOptions): Promise<GetSubaccountServiceInstancesResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("btp:index/getSubaccountServiceInstances:getSubaccountServiceInstances", {
        "fieldsFilter": args.fieldsFilter,
        "labelsFilter": args.labelsFilter,
        "subaccountId": args.subaccountId,
    }, opts);
}

/**
 * A collection of arguments for invoking getSubaccountServiceInstances.
 */
export interface GetSubaccountServiceInstancesArgs {
    /**
     * Filters the instances based on their fields. For example, to list all instances that are usable, use "usable eq 'true'".
     */
    fieldsFilter?: string;
    /**
     * Filters the instances based on the label query.  For example, to list all instances that are available in a production landscape, use "landscape eq 'production'".
     */
    labelsFilter?: string;
    /**
     * The ID of the subaccount.
     */
    subaccountId: string;
}

/**
 * A collection of values returned by getSubaccountServiceInstances.
 */
export interface GetSubaccountServiceInstancesResult {
    /**
     * Filters the instances based on their fields. For example, to list all instances that are usable, use "usable eq 'true'".
     */
    readonly fieldsFilter?: string;
    /**
     * The ID of the subaccount.
     *
     * @deprecated Use the `subaccount_id` attribute instead
     */
    readonly id: string;
    /**
     * Filters the instances based on the label query.  For example, to list all instances that are available in a production landscape, use "landscape eq 'production'".
     */
    readonly labelsFilter?: string;
    /**
     * The ID of the subaccount.
     */
    readonly subaccountId: string;
    readonly values: outputs.GetSubaccountServiceInstancesValue[];
}
/**
 * Lists all service instances in a subaccount.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as btp from "@pulumi/btp";
 *
 * const all = btp.getSubaccountServiceInstances({
 *     subaccountId: "6aa64c2f-38c1-49a9-b2e8-cf9fea769b7f",
 * });
 * const ready = btp.getSubaccountServiceInstances({
 *     fieldsFilter: "ready eq 'true'",
 *     subaccountId: "6aa64c2f-38c1-49a9-b2e8-cf9fea769b7f",
 * });
 * const byLabel = btp.getSubaccountServiceInstances({
 *     labelsFilter: "labelname eq 'labelvalue'",
 *     subaccountId: "6aa64c2f-38c1-49a9-b2e8-cf9fea769b7f",
 * });
 * ```
 */
export function getSubaccountServiceInstancesOutput(args: GetSubaccountServiceInstancesOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetSubaccountServiceInstancesResult> {
    return pulumi.output(args).apply((a: any) => getSubaccountServiceInstances(a, opts))
}

/**
 * A collection of arguments for invoking getSubaccountServiceInstances.
 */
export interface GetSubaccountServiceInstancesOutputArgs {
    /**
     * Filters the instances based on their fields. For example, to list all instances that are usable, use "usable eq 'true'".
     */
    fieldsFilter?: pulumi.Input<string>;
    /**
     * Filters the instances based on the label query.  For example, to list all instances that are available in a production landscape, use "landscape eq 'production'".
     */
    labelsFilter?: pulumi.Input<string>;
    /**
     * The ID of the subaccount.
     */
    subaccountId: pulumi.Input<string>;
}
