// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Gets all the entitlements and quota assignments for a directory.
 *
 * To view all the resources that a directory and its subdirectories and subaccounts are entitled to use, the following condition must be met:
 * * The directory must be a directory that is configured to manage its own entitlements.
 * * You must be assigned to either the global account admin or global account viewers role.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as btp from "@pulumi/btp";
 *
 * const all = btp.getDirectoryEntitlements({
 *     directoryId: "dd005d8b-1fee-4e6b-b6ff-cb9a197b7fe0",
 * });
 * ```
 */
export function getDirectoryEntitlements(args: GetDirectoryEntitlementsArgs, opts?: pulumi.InvokeOptions): Promise<GetDirectoryEntitlementsResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("btp:index/getDirectoryEntitlements:getDirectoryEntitlements", {
        "directoryId": args.directoryId,
    }, opts);
}

/**
 * A collection of arguments for invoking getDirectoryEntitlements.
 */
export interface GetDirectoryEntitlementsArgs {
    /**
     * The ID of the directory.
     */
    directoryId: string;
}

/**
 * A collection of values returned by getDirectoryEntitlements.
 */
export interface GetDirectoryEntitlementsResult {
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
    readonly values: {[key: string]: outputs.GetDirectoryEntitlementsValues};
}
/**
 * Gets all the entitlements and quota assignments for a directory.
 *
 * To view all the resources that a directory and its subdirectories and subaccounts are entitled to use, the following condition must be met:
 * * The directory must be a directory that is configured to manage its own entitlements.
 * * You must be assigned to either the global account admin or global account viewers role.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as btp from "@pulumi/btp";
 *
 * const all = btp.getDirectoryEntitlements({
 *     directoryId: "dd005d8b-1fee-4e6b-b6ff-cb9a197b7fe0",
 * });
 * ```
 */
export function getDirectoryEntitlementsOutput(args: GetDirectoryEntitlementsOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetDirectoryEntitlementsResult> {
    return pulumi.output(args).apply((a: any) => getDirectoryEntitlements(a, opts))
}

/**
 * A collection of arguments for invoking getDirectoryEntitlements.
 */
export interface GetDirectoryEntitlementsOutputArgs {
    /**
     * The ID of the directory.
     */
    directoryId: pulumi.Input<string>;
}
