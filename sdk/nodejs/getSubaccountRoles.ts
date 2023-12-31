// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Gets all roles.
 *
 * __Further documentation:__
 * <https://help.sap.com/docs/btp/sap-business-technology-platform/role-collections-and-roles-in-global-accounts-directories-and-subaccounts>
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as btp from "@pulumi/btp";
 *
 * const all = btp.getSubaccountRoles({
 *     subaccountId: "6aa64c2f-38c1-49a9-b2e8-cf9fea769b7f",
 * });
 * ```
 */
export function getSubaccountRoles(args: GetSubaccountRolesArgs, opts?: pulumi.InvokeOptions): Promise<GetSubaccountRolesResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("btp:index/getSubaccountRoles:getSubaccountRoles", {
        "subaccountId": args.subaccountId,
    }, opts);
}

/**
 * A collection of arguments for invoking getSubaccountRoles.
 */
export interface GetSubaccountRolesArgs {
    /**
     * The ID of the subaccount.
     */
    subaccountId: string;
}

/**
 * A collection of values returned by getSubaccountRoles.
 */
export interface GetSubaccountRolesResult {
    /**
     * The ID of the subaccount.
     *
     * @deprecated Use the `subaccount_id` attribute instead
     */
    readonly id: string;
    /**
     * The ID of the subaccount.
     */
    readonly subaccountId: string;
    readonly values: outputs.GetSubaccountRolesValue[];
}
/**
 * Gets all roles.
 *
 * __Further documentation:__
 * <https://help.sap.com/docs/btp/sap-business-technology-platform/role-collections-and-roles-in-global-accounts-directories-and-subaccounts>
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as btp from "@pulumi/btp";
 *
 * const all = btp.getSubaccountRoles({
 *     subaccountId: "6aa64c2f-38c1-49a9-b2e8-cf9fea769b7f",
 * });
 * ```
 */
export function getSubaccountRolesOutput(args: GetSubaccountRolesOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetSubaccountRolesResult> {
    return pulumi.output(args).apply((a: any) => getSubaccountRoles(a, opts))
}

/**
 * A collection of arguments for invoking getSubaccountRoles.
 */
export interface GetSubaccountRolesOutputArgs {
    /**
     * The ID of the subaccount.
     */
    subaccountId: pulumi.Input<string>;
}
