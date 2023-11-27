// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Establishes trust from a subaccount to an Identity Authentication tenant.
 *
 * __Further documentation:__
 * <https://help.sap.com/docs/btp/sap-business-technology-platform/trust-and-federation-with-identity-providers>
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as btp from "@lechnerc77/pulumi-btp";
 *
 * // create a new simple trust configuration for a subaccount
 * // for a Custom Identity Provider for Applications
 * const simple = new btp.SubaccountTrustConfiguration("simple", {
 *     identityProvider: "terraformint.accounts400.ondemand.com",
 *     subaccountId: "6aa64c2f-38c1-49a9-b2e8-cf9fea769b7f",
 * });
 * // create a new fully customized trust configuration for a subaccount 
 * // for a Custom Identity Provider for Applications
 * const fullyCustomized = new btp.SubaccountTrustConfiguration("fullyCustomized", {
 *     description: "my-description",
 *     identityProvider: "terraformint.accounts400.ondemand.com",
 *     subaccountId: "6aa64c2f-38c1-49a9-b2e8-cf9fea769b7f",
 * });
 * ```
 *
 * ## Import
 *
 * terraform
 *
 * ```sh
 *  $ pulumi import btp:index/subaccountTrustConfiguration:SubaccountTrustConfiguration terraform importbtp_subaccount_trust_configuration.<resource_name> <subaccount_id>,<origin>
 * ```
 *
 * ```sh
 *  $ pulumi import btp:index/subaccountTrustConfiguration:SubaccountTrustConfiguration trust 6aa64c2f-38c1-49a9-b2e8-cf9fea769b7f,sap.custom
 * ```
 */
export class SubaccountTrustConfiguration extends pulumi.CustomResource {
    /**
     * Get an existing SubaccountTrustConfiguration resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: SubaccountTrustConfigurationState, opts?: pulumi.CustomResourceOptions): SubaccountTrustConfiguration {
        return new SubaccountTrustConfiguration(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'btp:index/subaccountTrustConfiguration:SubaccountTrustConfiguration';

    /**
     * Returns true if the given object is an instance of SubaccountTrustConfiguration.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is SubaccountTrustConfiguration {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === SubaccountTrustConfiguration.__pulumiType;
    }

    /**
     * Determines that any user from the tenant can log in. If not set, only the ones who already have a shadow user can log in.
     */
    public readonly autoCreateShadowUsers!: pulumi.Output<boolean>;
    /**
     * Determines that end users can choose the trust configuration for login. If not set, the trust configuration can remain active, however only application users that explicitly specify the origin key can use if for login.
     */
    public readonly availableForUserLogon!: pulumi.Output<boolean>;
    /**
     * Description of the trust configuration.
     */
    public readonly description!: pulumi.Output<string>;
    /**
     * The tenant's domain which should be used for user logon.
     */
    public readonly domain!: pulumi.Output<string | undefined>;
    /**
     * The name of the Identity Authentication tenant that you want to connect to the subaccount.
     */
    public readonly identityProvider!: pulumi.Output<string>;
    /**
     * Short string that helps users to identify the link for login.
     */
    public readonly linkText!: pulumi.Output<string>;
    /**
     * The display name of the trust configuration.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The origin of the identity provider.
     */
    public /*out*/ readonly origin!: pulumi.Output<string>;
    /**
     * The protocol used to establish trust with the identity provider.
     */
    public /*out*/ readonly protocol!: pulumi.Output<string>;
    /**
     * Shows whether the trust configuration can be modified.
     */
    public /*out*/ readonly readOnly!: pulumi.Output<boolean>;
    /**
     * Determines whether the identity provider is currently 'active' or 'inactive'.
     */
    public readonly status!: pulumi.Output<string>;
    /**
     * The ID of the subaccount.
     */
    public readonly subaccountId!: pulumi.Output<string>;
    /**
     * The trust type.
     */
    public /*out*/ readonly type!: pulumi.Output<string>;

    /**
     * Create a SubaccountTrustConfiguration resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: SubaccountTrustConfigurationArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: SubaccountTrustConfigurationArgs | SubaccountTrustConfigurationState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as SubaccountTrustConfigurationState | undefined;
            resourceInputs["autoCreateShadowUsers"] = state ? state.autoCreateShadowUsers : undefined;
            resourceInputs["availableForUserLogon"] = state ? state.availableForUserLogon : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["domain"] = state ? state.domain : undefined;
            resourceInputs["identityProvider"] = state ? state.identityProvider : undefined;
            resourceInputs["linkText"] = state ? state.linkText : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["origin"] = state ? state.origin : undefined;
            resourceInputs["protocol"] = state ? state.protocol : undefined;
            resourceInputs["readOnly"] = state ? state.readOnly : undefined;
            resourceInputs["status"] = state ? state.status : undefined;
            resourceInputs["subaccountId"] = state ? state.subaccountId : undefined;
            resourceInputs["type"] = state ? state.type : undefined;
        } else {
            const args = argsOrState as SubaccountTrustConfigurationArgs | undefined;
            if ((!args || args.identityProvider === undefined) && !opts.urn) {
                throw new Error("Missing required property 'identityProvider'");
            }
            if ((!args || args.subaccountId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'subaccountId'");
            }
            resourceInputs["autoCreateShadowUsers"] = args ? args.autoCreateShadowUsers : undefined;
            resourceInputs["availableForUserLogon"] = args ? args.availableForUserLogon : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["domain"] = args ? args.domain : undefined;
            resourceInputs["identityProvider"] = args ? args.identityProvider : undefined;
            resourceInputs["linkText"] = args ? args.linkText : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["status"] = args ? args.status : undefined;
            resourceInputs["subaccountId"] = args ? args.subaccountId : undefined;
            resourceInputs["origin"] = undefined /*out*/;
            resourceInputs["protocol"] = undefined /*out*/;
            resourceInputs["readOnly"] = undefined /*out*/;
            resourceInputs["type"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(SubaccountTrustConfiguration.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering SubaccountTrustConfiguration resources.
 */
export interface SubaccountTrustConfigurationState {
    /**
     * Determines that any user from the tenant can log in. If not set, only the ones who already have a shadow user can log in.
     */
    autoCreateShadowUsers?: pulumi.Input<boolean>;
    /**
     * Determines that end users can choose the trust configuration for login. If not set, the trust configuration can remain active, however only application users that explicitly specify the origin key can use if for login.
     */
    availableForUserLogon?: pulumi.Input<boolean>;
    /**
     * Description of the trust configuration.
     */
    description?: pulumi.Input<string>;
    /**
     * The tenant's domain which should be used for user logon.
     */
    domain?: pulumi.Input<string>;
    /**
     * The name of the Identity Authentication tenant that you want to connect to the subaccount.
     */
    identityProvider?: pulumi.Input<string>;
    /**
     * Short string that helps users to identify the link for login.
     */
    linkText?: pulumi.Input<string>;
    /**
     * The display name of the trust configuration.
     */
    name?: pulumi.Input<string>;
    /**
     * The origin of the identity provider.
     */
    origin?: pulumi.Input<string>;
    /**
     * The protocol used to establish trust with the identity provider.
     */
    protocol?: pulumi.Input<string>;
    /**
     * Shows whether the trust configuration can be modified.
     */
    readOnly?: pulumi.Input<boolean>;
    /**
     * Determines whether the identity provider is currently 'active' or 'inactive'.
     */
    status?: pulumi.Input<string>;
    /**
     * The ID of the subaccount.
     */
    subaccountId?: pulumi.Input<string>;
    /**
     * The trust type.
     */
    type?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a SubaccountTrustConfiguration resource.
 */
export interface SubaccountTrustConfigurationArgs {
    /**
     * Determines that any user from the tenant can log in. If not set, only the ones who already have a shadow user can log in.
     */
    autoCreateShadowUsers?: pulumi.Input<boolean>;
    /**
     * Determines that end users can choose the trust configuration for login. If not set, the trust configuration can remain active, however only application users that explicitly specify the origin key can use if for login.
     */
    availableForUserLogon?: pulumi.Input<boolean>;
    /**
     * Description of the trust configuration.
     */
    description?: pulumi.Input<string>;
    /**
     * The tenant's domain which should be used for user logon.
     */
    domain?: pulumi.Input<string>;
    /**
     * The name of the Identity Authentication tenant that you want to connect to the subaccount.
     */
    identityProvider: pulumi.Input<string>;
    /**
     * Short string that helps users to identify the link for login.
     */
    linkText?: pulumi.Input<string>;
    /**
     * The display name of the trust configuration.
     */
    name?: pulumi.Input<string>;
    /**
     * Determines whether the identity provider is currently 'active' or 'inactive'.
     */
    status?: pulumi.Input<string>;
    /**
     * The ID of the subaccount.
     */
    subaccountId: pulumi.Input<string>;
}