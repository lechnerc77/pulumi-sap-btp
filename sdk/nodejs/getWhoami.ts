// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Returns information about the logged-in user.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as btp from "@pulumi/btp";
 *
 * const me = btp.getWhoami({});
 * ```
 */
export function getWhoami(opts?: pulumi.InvokeOptions): Promise<GetWhoamiResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("btp:index/getWhoami:getWhoami", {
    }, opts);
}

/**
 * A collection of values returned by getWhoami.
 */
export interface GetWhoamiResult {
    /**
     * The e-mail address of the logged-in user.
     */
    readonly email: string;
    /**
     * The ID of the logged-in user.
     */
    readonly id: string;
    /**
     * The name of the token issuer.
     */
    readonly issuer: string;
}
/**
 * Returns information about the logged-in user.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as btp from "@pulumi/btp";
 *
 * const me = btp.getWhoami({});
 * ```
 */
export function getWhoamiOutput(opts?: pulumi.InvokeOptions): pulumi.Output<GetWhoamiResult> {
    return pulumi.output(getWhoami(opts))
}
