// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Shows registered users in a directory. Users belong to one of the identity providers (IdPs) of the global account.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as btp from "@pulumi/btp";
 *
 * const someone = btp.getDirectoryUser({
 *     directoryId: "dd005d8b-1fee-4e6b-b6ff-cb9a197b7fe0",
 *     userName: "john.doe@mycompany.com",
 * });
 * const someoneElse = btp.getDirectoryUser({
 *     directoryId: "dd005d8b-1fee-4e6b-b6ff-cb9a197b7fe0",
 *     origin: "my-custom-idp",
 *     userName: "jane.doe@mycompany.com",
 * });
 * ```
 */
export function getDirectoryUser(args: GetDirectoryUserArgs, opts?: pulumi.InvokeOptions): Promise<GetDirectoryUserResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("btp:index/getDirectoryUser:getDirectoryUser", {
        "directoryId": args.directoryId,
        "origin": args.origin,
        "userName": args.userName,
    }, opts);
}

/**
 * A collection of arguments for invoking getDirectoryUser.
 */
export interface GetDirectoryUserArgs {
    /**
     * The ID of the directory.
     */
    directoryId: string;
    /**
     * The identity provider that hosts the user. Only needed for custom identity provider.
     */
    origin?: string;
    /**
     * The username of the user.
     */
    userName: string;
}

/**
 * A collection of values returned by getDirectoryUser.
 */
export interface GetDirectoryUserResult {
    /**
     * Shows if the account is still in use.
     */
    readonly active: boolean;
    /**
     * The ID of the directory.
     */
    readonly directoryId: string;
    /**
     * The e-mail address of the user.
     */
    readonly email: string;
    /**
     * The last name of the user.
     */
    readonly familyName: string;
    /**
     * The given name of the user.
     */
    readonly givenName: string;
    /**
     * The ID of the user.
     */
    readonly id: string;
    /**
     * The identity provider that hosts the user. Only needed for custom identity provider.
     */
    readonly origin: string;
    /**
     * The set of role collections, which are assigned to the user.
     */
    readonly roleCollections: string[];
    /**
     * The username of the user.
     */
    readonly userName: string;
    /**
     * The verification status of the user.
     */
    readonly verified: boolean;
}
/**
 * Shows registered users in a directory. Users belong to one of the identity providers (IdPs) of the global account.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as btp from "@pulumi/btp";
 *
 * const someone = btp.getDirectoryUser({
 *     directoryId: "dd005d8b-1fee-4e6b-b6ff-cb9a197b7fe0",
 *     userName: "john.doe@mycompany.com",
 * });
 * const someoneElse = btp.getDirectoryUser({
 *     directoryId: "dd005d8b-1fee-4e6b-b6ff-cb9a197b7fe0",
 *     origin: "my-custom-idp",
 *     userName: "jane.doe@mycompany.com",
 * });
 * ```
 */
export function getDirectoryUserOutput(args: GetDirectoryUserOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetDirectoryUserResult> {
    return pulumi.output(args).apply((a: any) => getDirectoryUser(a, opts))
}

/**
 * A collection of arguments for invoking getDirectoryUser.
 */
export interface GetDirectoryUserOutputArgs {
    /**
     * The ID of the directory.
     */
    directoryId: pulumi.Input<string>;
    /**
     * The identity provider that hosts the user. Only needed for custom identity provider.
     */
    origin?: pulumi.Input<string>;
    /**
     * The username of the user.
     */
    userName: pulumi.Input<string>;
}
