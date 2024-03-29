// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Lists all users.
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
 * const defaultidp = btp.getGlobalaccountUsers({});
 * const mycustomidp = btp.getGlobalaccountUsers({
 *     origin: "my-custom-idp",
 * });
 * ```
 */
export function getGlobalaccountUsers(args?: GetGlobalaccountUsersArgs, opts?: pulumi.InvokeOptions): Promise<GetGlobalaccountUsersResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("btp:index/getGlobalaccountUsers:getGlobalaccountUsers", {
        "origin": args.origin,
    }, opts);
}

/**
 * A collection of arguments for invoking getGlobalaccountUsers.
 */
export interface GetGlobalaccountUsersArgs {
    /**
     * The identity provider that hosts the user. Only needed for custom identity provider.
     */
    origin?: string;
}

/**
 * A collection of values returned by getGlobalaccountUsers.
 */
export interface GetGlobalaccountUsersResult {
    /**
     * The ID of the global account.
     *
     * @deprecated Use the `btp_globalaccount` datasource instead
     */
    readonly id: string;
    /**
     * The identity provider that hosts the user. Only needed for custom identity provider.
     */
    readonly origin: string;
    /**
     * The list of users assigned to the global account.
     */
    readonly values: string[];
}
/**
 * Lists all users.
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
 * const defaultidp = btp.getGlobalaccountUsers({});
 * const mycustomidp = btp.getGlobalaccountUsers({
 *     origin: "my-custom-idp",
 * });
 * ```
 */
export function getGlobalaccountUsersOutput(args?: GetGlobalaccountUsersOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetGlobalaccountUsersResult> {
    return pulumi.output(args).apply((a: any) => getGlobalaccountUsers(a, opts))
}

/**
 * A collection of arguments for invoking getGlobalaccountUsers.
 */
export interface GetGlobalaccountUsersOutputArgs {
    /**
     * The identity provider that hosts the user. Only needed for custom identity provider.
     */
    origin?: pulumi.Input<string>;
}
