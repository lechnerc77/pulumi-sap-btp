// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Gets all users.
 *
 * __Further documentation:__
 * <https://help.sap.com/docs/btp/sap-business-technology-platform/user-and-member-management>
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as btp from "@pulumi/btp";
 *
 * const defaultidp = btp.getSubaccountUsers({
 *     subaccountId: "6aa64c2f-38c1-49a9-b2e8-cf9fea769b7f",
 * });
 * const mycustomidp = btp.getSubaccountUsers({
 *     origin: "my-custom-idp",
 *     subaccountId: "6aa64c2f-38c1-49a9-b2e8-cf9fea769b7f",
 * });
 * ```
 */
export function getSubaccountUsers(args: GetSubaccountUsersArgs, opts?: pulumi.InvokeOptions): Promise<GetSubaccountUsersResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("btp:index/getSubaccountUsers:getSubaccountUsers", {
        "origin": args.origin,
        "subaccountId": args.subaccountId,
    }, opts);
}

/**
 * A collection of arguments for invoking getSubaccountUsers.
 */
export interface GetSubaccountUsersArgs {
    /**
     * The identity provider that hosts the user. Only needed for custom identity provider.
     */
    origin?: string;
    /**
     * The ID of the subaccount.
     */
    subaccountId: string;
}

/**
 * A collection of values returned by getSubaccountUsers.
 */
export interface GetSubaccountUsersResult {
    /**
     * The ID of the subaccount.
     *
     * @deprecated Use the `subaccount_id` attribute instead
     */
    readonly id: string;
    /**
     * The identity provider that hosts the user. Only needed for custom identity provider.
     */
    readonly origin: string;
    /**
     * The ID of the subaccount.
     */
    readonly subaccountId: string;
    /**
     * The list of users assigned to the subaccount.
     */
    readonly values: string[];
}
/**
 * Gets all users.
 *
 * __Further documentation:__
 * <https://help.sap.com/docs/btp/sap-business-technology-platform/user-and-member-management>
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as btp from "@pulumi/btp";
 *
 * const defaultidp = btp.getSubaccountUsers({
 *     subaccountId: "6aa64c2f-38c1-49a9-b2e8-cf9fea769b7f",
 * });
 * const mycustomidp = btp.getSubaccountUsers({
 *     origin: "my-custom-idp",
 *     subaccountId: "6aa64c2f-38c1-49a9-b2e8-cf9fea769b7f",
 * });
 * ```
 */
export function getSubaccountUsersOutput(args: GetSubaccountUsersOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetSubaccountUsersResult> {
    return pulumi.output(args).apply((a: any) => getSubaccountUsers(a, opts))
}

/**
 * A collection of arguments for invoking getSubaccountUsers.
 */
export interface GetSubaccountUsersOutputArgs {
    /**
     * The identity provider that hosts the user. Only needed for custom identity provider.
     */
    origin?: pulumi.Input<string>;
    /**
     * The ID of the subaccount.
     */
    subaccountId: pulumi.Input<string>;
}
