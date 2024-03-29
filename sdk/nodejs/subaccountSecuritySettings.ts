// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Sets the security settings of a subaccount.
 *
 * __Tip:__
 * You must be administrator of the subaccount.
 *
 * __Further documentation:__
 * <https://help.sap.com/docs/btp/sap-business-technology-platform/configure-trusted-domains-for-sap-authorization-and-trust-management-service>
 * <https://help.sap.com/docs/btp/sap-business-technology-platform/configure-token-policy-for-sap-authorization-and-trust-management-service>
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as btp from "@lechnerc77/pulumi-btp";
 *
 * const subaccount = new btp.SubaccountSecuritySettings("subaccount", {
 *     accessTokenValidity: 3600,
 *     customEmailDomains: ["yourdomain.test"],
 *     defaultIdentityProvider: "sap.custom",
 *     refreshTokenValidity: 3600,
 *     subaccountId: "6aa64c2f-38c1-49a9-b2e8-cf9fea769b7f",
 *     treatUsersWithSameEmailAsSameUser: true,
 * });
 * ```
 */
export class SubaccountSecuritySettings extends pulumi.CustomResource {
    /**
     * Get an existing SubaccountSecuritySettings resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: SubaccountSecuritySettingsState, opts?: pulumi.CustomResourceOptions): SubaccountSecuritySettings {
        return new SubaccountSecuritySettings(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'btp:index/subaccountSecuritySettings:SubaccountSecuritySettings';

    /**
     * Returns true if the given object is an instance of SubaccountSecuritySettings.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is SubaccountSecuritySettings {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === SubaccountSecuritySettings.__pulumiType;
    }

    /**
     * The validity of the access token.
     */
    public readonly accessTokenValidity!: pulumi.Output<number>;
    /**
     * Set of domains that are allowed to be used for user authentication.
     */
    public readonly customEmailDomains!: pulumi.Output<string[]>;
    /**
     * The subaccount's default identity provider for business application users.
     */
    public readonly defaultIdentityProvider!: pulumi.Output<string>;
    /**
     * The validity of the refresh token.
     */
    public readonly refreshTokenValidity!: pulumi.Output<number>;
    /**
     * The ID of the subaccount.
     */
    public readonly subaccountId!: pulumi.Output<string>;
    /**
     * If set to true, users with the same email are treated as same users.
     */
    public readonly treatUsersWithSameEmailAsSameUser!: pulumi.Output<boolean>;

    /**
     * Create a SubaccountSecuritySettings resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: SubaccountSecuritySettingsArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: SubaccountSecuritySettingsArgs | SubaccountSecuritySettingsState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as SubaccountSecuritySettingsState | undefined;
            resourceInputs["accessTokenValidity"] = state ? state.accessTokenValidity : undefined;
            resourceInputs["customEmailDomains"] = state ? state.customEmailDomains : undefined;
            resourceInputs["defaultIdentityProvider"] = state ? state.defaultIdentityProvider : undefined;
            resourceInputs["refreshTokenValidity"] = state ? state.refreshTokenValidity : undefined;
            resourceInputs["subaccountId"] = state ? state.subaccountId : undefined;
            resourceInputs["treatUsersWithSameEmailAsSameUser"] = state ? state.treatUsersWithSameEmailAsSameUser : undefined;
        } else {
            const args = argsOrState as SubaccountSecuritySettingsArgs | undefined;
            if ((!args || args.subaccountId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'subaccountId'");
            }
            resourceInputs["accessTokenValidity"] = args ? args.accessTokenValidity : undefined;
            resourceInputs["customEmailDomains"] = args ? args.customEmailDomains : undefined;
            resourceInputs["defaultIdentityProvider"] = args ? args.defaultIdentityProvider : undefined;
            resourceInputs["refreshTokenValidity"] = args ? args.refreshTokenValidity : undefined;
            resourceInputs["subaccountId"] = args ? args.subaccountId : undefined;
            resourceInputs["treatUsersWithSameEmailAsSameUser"] = args ? args.treatUsersWithSameEmailAsSameUser : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(SubaccountSecuritySettings.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering SubaccountSecuritySettings resources.
 */
export interface SubaccountSecuritySettingsState {
    /**
     * The validity of the access token.
     */
    accessTokenValidity?: pulumi.Input<number>;
    /**
     * Set of domains that are allowed to be used for user authentication.
     */
    customEmailDomains?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The subaccount's default identity provider for business application users.
     */
    defaultIdentityProvider?: pulumi.Input<string>;
    /**
     * The validity of the refresh token.
     */
    refreshTokenValidity?: pulumi.Input<number>;
    /**
     * The ID of the subaccount.
     */
    subaccountId?: pulumi.Input<string>;
    /**
     * If set to true, users with the same email are treated as same users.
     */
    treatUsersWithSameEmailAsSameUser?: pulumi.Input<boolean>;
}

/**
 * The set of arguments for constructing a SubaccountSecuritySettings resource.
 */
export interface SubaccountSecuritySettingsArgs {
    /**
     * The validity of the access token.
     */
    accessTokenValidity?: pulumi.Input<number>;
    /**
     * Set of domains that are allowed to be used for user authentication.
     */
    customEmailDomains?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The subaccount's default identity provider for business application users.
     */
    defaultIdentityProvider?: pulumi.Input<string>;
    /**
     * The validity of the refresh token.
     */
    refreshTokenValidity?: pulumi.Input<number>;
    /**
     * The ID of the subaccount.
     */
    subaccountId: pulumi.Input<string>;
    /**
     * If set to true, users with the same email are treated as same users.
     */
    treatUsersWithSameEmailAsSameUser?: pulumi.Input<boolean>;
}
