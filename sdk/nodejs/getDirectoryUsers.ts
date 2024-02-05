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
 * const defaultidp = btp.getDirectoryUsers({
 *     directoryId: "dd005d8b-1fee-4e6b-b6ff-cb9a197b7fe0",
 * });
 * const mycustomidp = btp.getDirectoryUsers({
 *     directoryId: "dd005d8b-1fee-4e6b-b6ff-cb9a197b7fe0",
 *     origin: "my-custom-idp",
 * });
 * ```
 */
export function getDirectoryUsers(args: GetDirectoryUsersArgs, opts?: pulumi.InvokeOptions): Promise<GetDirectoryUsersResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("btp:index/getDirectoryUsers:getDirectoryUsers", {
        "directoryId": args.directoryId,
        "origin": args.origin,
    }, opts);
}

/**
 * A collection of arguments for invoking getDirectoryUsers.
 */
export interface GetDirectoryUsersArgs {
    /**
     * The ID of the directory.
     */
    directoryId: string;
    /**
     * The identity provider that hosts the user. Only needed for custom identity provider.
     */
    origin?: string;
}

/**
 * A collection of values returned by getDirectoryUsers.
 */
export interface GetDirectoryUsersResult {
    /**
     * The ID of the directory.
     */
    readonly directoryId: string;
    /**
     * The ID of the directory.
     *
     * @deprecated Use the `directory_id` attribute instead
     */
    readonly id: string;
    /**
     * The identity provider that hosts the user. Only needed for custom identity provider.
     */
    readonly origin: string;
    /**
     * The list of users assigned to the directory.
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
 * const defaultidp = btp.getDirectoryUsers({
 *     directoryId: "dd005d8b-1fee-4e6b-b6ff-cb9a197b7fe0",
 * });
 * const mycustomidp = btp.getDirectoryUsers({
 *     directoryId: "dd005d8b-1fee-4e6b-b6ff-cb9a197b7fe0",
 *     origin: "my-custom-idp",
 * });
 * ```
 */
export function getDirectoryUsersOutput(args: GetDirectoryUsersOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetDirectoryUsersResult> {
    return pulumi.output(args).apply((a: any) => getDirectoryUsers(a, opts))
}

/**
 * A collection of arguments for invoking getDirectoryUsers.
 */
export interface GetDirectoryUsersOutputArgs {
    /**
     * The ID of the directory.
     */
    directoryId: pulumi.Input<string>;
    /**
     * The identity provider that hosts the user. Only needed for custom identity provider.
     */
    origin?: pulumi.Input<string>;
}
