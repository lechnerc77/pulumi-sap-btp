// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Gets the details about a directory.
 *
 * __Tip:__
 * You must be assigned to the global account admin role, or the directory admin if the directory is configured to manage its authorizations.
 *
 * __Further documentation:__
 * <https://help.sap.com/docs/btp/sap-business-technology-platform/account-model>
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as btp from "@pulumi/btp";
 *
 * const byId = btp.getDirectory({
 *     id: "dd005d8b-1fee-4e6b-b6ff-cb9a197b7fe0",
 * });
 * ```
 */
export function getDirectory(args: GetDirectoryArgs, opts?: pulumi.InvokeOptions): Promise<GetDirectoryResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("btp:index/getDirectory:getDirectory", {
        "id": args.id,
    }, opts);
}

/**
 * A collection of arguments for invoking getDirectory.
 */
export interface GetDirectoryArgs {
    /**
     * The ID of the directory.
     */
    id: string;
}

/**
 * A collection of values returned by getDirectory.
 */
export interface GetDirectoryResult {
    /**
     * The details of the user that created the directory.
     */
    readonly createdBy: string;
    /**
     * The date and time when the resource was created in [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) format.
     */
    readonly createdDate: string;
    /**
     * The description of the directory.
     */
    readonly description: string;
    /**
     * The features that are enabled for the directory. Possible values are:
     */
    readonly features: string[];
    /**
     * The ID of the directory.
     */
    readonly id: string;
    readonly labels: {[key: string]: string[]};
    readonly lastModified: string;
    readonly name: string;
    readonly parentId: string;
    readonly state: string;
    readonly subdomain: string;
}
/**
 * Gets the details about a directory.
 *
 * __Tip:__
 * You must be assigned to the global account admin role, or the directory admin if the directory is configured to manage its authorizations.
 *
 * __Further documentation:__
 * <https://help.sap.com/docs/btp/sap-business-technology-platform/account-model>
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as btp from "@pulumi/btp";
 *
 * const byId = btp.getDirectory({
 *     id: "dd005d8b-1fee-4e6b-b6ff-cb9a197b7fe0",
 * });
 * ```
 */
export function getDirectoryOutput(args: GetDirectoryOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetDirectoryResult> {
    return pulumi.output(args).apply((a: any) => getDirectory(a, opts))
}

/**
 * A collection of arguments for invoking getDirectory.
 */
export interface GetDirectoryOutputArgs {
    /**
     * The ID of the directory.
     */
    id: pulumi.Input<string>;
}
