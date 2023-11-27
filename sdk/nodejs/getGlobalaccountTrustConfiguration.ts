// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Gets details about a trust configuration.
 *
 * __Tip:__
 * You must be viewer or administrator of the global account.
 *
 * __Further documentation:__
 * <https://help.sap.com/docs/btp/sap-btp-neo-environment/platform-identity-provider>
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as btp from "@pulumi/btp";
 *
 * const default = btp.getGlobalaccountTrustConfiguration({
 *     origin: "sap.default",
 * });
 * const custom = btp.getGlobalaccountTrustConfiguration({
 *     origin: "terraformint-platform",
 * });
 * ```
 */
export function getGlobalaccountTrustConfiguration(args: GetGlobalaccountTrustConfigurationArgs, opts?: pulumi.InvokeOptions): Promise<GetGlobalaccountTrustConfigurationResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("btp:index/getGlobalaccountTrustConfiguration:getGlobalaccountTrustConfiguration", {
        "origin": args.origin,
    }, opts);
}

/**
 * A collection of arguments for invoking getGlobalaccountTrustConfiguration.
 */
export interface GetGlobalaccountTrustConfigurationArgs {
    /**
     * The origin of the identity provider.
     */
    origin: string;
}

/**
 * A collection of values returned by getGlobalaccountTrustConfiguration.
 */
export interface GetGlobalaccountTrustConfigurationResult {
    /**
     * The description of the trust configuration.
     */
    readonly description: string;
    /**
     * The tenant's domain which should be used for user logon.
     */
    readonly domain: string;
    /**
     * The origin of the identity provider.
     *
     * @deprecated Use the `origin` attribute instead
     */
    readonly id: string;
    /**
     * The name of the Identity Authentication tenant the global account is connected to.
     */
    readonly identityProvider: string;
    /**
     * The display name of the trust configuration.
     */
    readonly name: string;
    /**
     * The origin of the identity provider.
     */
    readonly origin: string;
    /**
     * The protocol used to establish trust with the identity provider.
     */
    readonly protocol: string;
    /**
     * Shows whether the trust configuration can be modified.
     */
    readonly readOnly: boolean;
    /**
     * Shows whether the identity provider is currently 'active' or 'inactive'.
     */
    readonly status: string;
    /**
     * The trust type.
     */
    readonly type: string;
}
/**
 * Gets details about a trust configuration.
 *
 * __Tip:__
 * You must be viewer or administrator of the global account.
 *
 * __Further documentation:__
 * <https://help.sap.com/docs/btp/sap-btp-neo-environment/platform-identity-provider>
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as btp from "@pulumi/btp";
 *
 * const default = btp.getGlobalaccountTrustConfiguration({
 *     origin: "sap.default",
 * });
 * const custom = btp.getGlobalaccountTrustConfiguration({
 *     origin: "terraformint-platform",
 * });
 * ```
 */
export function getGlobalaccountTrustConfigurationOutput(args: GetGlobalaccountTrustConfigurationOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetGlobalaccountTrustConfigurationResult> {
    return pulumi.output(args).apply((a: any) => getGlobalaccountTrustConfiguration(a, opts))
}

/**
 * A collection of arguments for invoking getGlobalaccountTrustConfiguration.
 */
export interface GetGlobalaccountTrustConfigurationOutputArgs {
    /**
     * The origin of the identity provider.
     */
    origin: pulumi.Input<string>;
}