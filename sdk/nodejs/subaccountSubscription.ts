// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Subscribes a subaccount to a multitenant application.
 * Custom or partner-developed applications are currently not supported.
 *
 * __Tip:__
 * You must be assigned to the subaccount admin role.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as btp from "@lechnerc77/pulumi-btp";
 *
 * const workzone = new btp.SubaccountSubscription("workzone", {
 *     appName: "SAPLaunchpad",
 *     planName: "free",
 *     subaccountId: "6aa64c2f-38c1-49a9-b2e8-cf9fea769b7f",
 * });
 * ```
 *
 * ## Import
 *
 * terraform
 *
 * ```sh
 *  $ pulumi import btp:index/subaccountSubscription:SubaccountSubscription <resource_name> <subaccount_id>,<app_name>,<plan_name>
 * ```
 *
 * ```sh
 *  $ pulumi import btp:index/subaccountSubscription:SubaccountSubscription workzone 6aa64c2f-38c1-49a9-b2e8-cf9fea769b7f,SAPLaunchpad,free
 * ```
 */
export class SubaccountSubscription extends pulumi.CustomResource {
    /**
     * Get an existing SubaccountSubscription resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: SubaccountSubscriptionState, opts?: pulumi.CustomResourceOptions): SubaccountSubscription {
        return new SubaccountSubscription(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'btp:index/subaccountSubscription:SubaccountSubscription';

    /**
     * Returns true if the given object is an instance of SubaccountSubscription.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is SubaccountSubscription {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === SubaccountSubscription.__pulumiType;
    }

    /**
     * The list of features specific to this plan.
     */
    public /*out*/ readonly additionalPlanFeatures!: pulumi.Output<string[]>;
    /**
     * The ID returned by XSUAA after the app provider has performed a bind of the multitenant application to an XSUAA service instance.
     */
    public /*out*/ readonly appId!: pulumi.Output<string>;
    /**
     * The unique registration name of the deployed multitenant application as defined by the app developer.
     */
    public readonly appName!: pulumi.Output<string>;
    /**
     * The authentication provider of the multitenant application. * XSUAA is the SAP Authorization and Trust Management service that defines scopes and permissions for users as tenants at the global account level. * IAS is Identity Authentication Service that defines scopes and permissions for users in zones (common data isolation systems across systems, SaaS tenants, and services).
     */
    public /*out*/ readonly authenticationProvider!: pulumi.Output<string>;
    /**
     * The technical name of the category defined by the app developer to which the multitenant application is grouped in customer-facing UIs.
     */
    public /*out*/ readonly category!: pulumi.Output<string>;
    /**
     * The commercial name of the deployed multitenant application as defined by the app developer.
     */
    public /*out*/ readonly commercialAppName!: pulumi.Output<string>;
    /**
     * The date and time when the resource was created in [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) format.
     */
    public /*out*/ readonly createdDate!: pulumi.Output<string>;
    /**
     * Shows whether the application was developed by a customer. If not, then the application is developed by the cloud operator, such as SAP.
     */
    public /*out*/ readonly customerDeveloped!: pulumi.Output<boolean>;
    /**
     * The description of the multitenant application for customer-facing UIs.
     */
    public /*out*/ readonly description!: pulumi.Output<string>;
    /**
     * The display name of the application for customer-facing UIs.
     */
    public /*out*/ readonly displayName!: pulumi.Output<string>;
    /**
     * The name of the formations solution associated with the multitenant application.
     */
    public /*out*/ readonly formationSolutionName!: pulumi.Output<string>;
    /**
     * The ID of the associated global account.
     */
    public /*out*/ readonly globalaccountId!: pulumi.Output<string>;
    /**
     * The set of words or phrases assigned to the multitenant application subscription.
     */
    public /*out*/ readonly labels!: pulumi.Output<{[key: string]: string[]}>;
    /**
     * The date and time when the resource was last modified in [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) format.
     */
    public /*out*/ readonly lastModified!: pulumi.Output<string>;
    /**
     * The parameters of the subscription as a valid JSON object.
     */
    public readonly parameters!: pulumi.Output<string>;
    /**
     * The plan name of the application to which the consumer has subscribed.
     */
    public readonly planName!: pulumi.Output<string>;
    /**
     * The ID of the landscape-specific environment.
     */
    public /*out*/ readonly platformEntityId!: pulumi.Output<string>;
    /**
     * The total amount the subscribed subaccount is entitled to consume.
     */
    public /*out*/ readonly quota!: pulumi.Output<number>;
    /**
     * The subscription state of the subaccount regarding the multitenant application.
     */
    public /*out*/ readonly state!: pulumi.Output<string>;
    /**
     * The ID of the subaccount.
     */
    public readonly subaccountId!: pulumi.Output<string>;
    /**
     * The ID of the subaccount, which is subscribed to the multitenant application.
     */
    public /*out*/ readonly subscribedSubaccountId!: pulumi.Output<string>;
    /**
     * The ID of the tenant, which is subscribed to a multitenant application.
     */
    public /*out*/ readonly subscribedTenantId!: pulumi.Output<string>;
    /**
     * The URL for app users to launch the subscribed application.
     */
    public /*out*/ readonly subscriptionUrl!: pulumi.Output<string>;
    /**
     * Specifies whether a consumer, whose subaccount is subscribed to the application, can change its subscriptions parameters.
     */
    public /*out*/ readonly supportsParametersUpdates!: pulumi.Output<boolean>;
    /**
     * Specifies whether a consumer, whose subaccount is subscribed to the application, can change the subscription to a different plan that is available for this application and subaccount.
     */
    public /*out*/ readonly supportsPlanUpdates!: pulumi.Output<boolean>;
    /**
     * The tenant ID of the application provider.
     */
    public /*out*/ readonly tenantId!: pulumi.Output<string>;

    /**
     * Create a SubaccountSubscription resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: SubaccountSubscriptionArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: SubaccountSubscriptionArgs | SubaccountSubscriptionState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as SubaccountSubscriptionState | undefined;
            resourceInputs["additionalPlanFeatures"] = state ? state.additionalPlanFeatures : undefined;
            resourceInputs["appId"] = state ? state.appId : undefined;
            resourceInputs["appName"] = state ? state.appName : undefined;
            resourceInputs["authenticationProvider"] = state ? state.authenticationProvider : undefined;
            resourceInputs["category"] = state ? state.category : undefined;
            resourceInputs["commercialAppName"] = state ? state.commercialAppName : undefined;
            resourceInputs["createdDate"] = state ? state.createdDate : undefined;
            resourceInputs["customerDeveloped"] = state ? state.customerDeveloped : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["displayName"] = state ? state.displayName : undefined;
            resourceInputs["formationSolutionName"] = state ? state.formationSolutionName : undefined;
            resourceInputs["globalaccountId"] = state ? state.globalaccountId : undefined;
            resourceInputs["labels"] = state ? state.labels : undefined;
            resourceInputs["lastModified"] = state ? state.lastModified : undefined;
            resourceInputs["parameters"] = state ? state.parameters : undefined;
            resourceInputs["planName"] = state ? state.planName : undefined;
            resourceInputs["platformEntityId"] = state ? state.platformEntityId : undefined;
            resourceInputs["quota"] = state ? state.quota : undefined;
            resourceInputs["state"] = state ? state.state : undefined;
            resourceInputs["subaccountId"] = state ? state.subaccountId : undefined;
            resourceInputs["subscribedSubaccountId"] = state ? state.subscribedSubaccountId : undefined;
            resourceInputs["subscribedTenantId"] = state ? state.subscribedTenantId : undefined;
            resourceInputs["subscriptionUrl"] = state ? state.subscriptionUrl : undefined;
            resourceInputs["supportsParametersUpdates"] = state ? state.supportsParametersUpdates : undefined;
            resourceInputs["supportsPlanUpdates"] = state ? state.supportsPlanUpdates : undefined;
            resourceInputs["tenantId"] = state ? state.tenantId : undefined;
        } else {
            const args = argsOrState as SubaccountSubscriptionArgs | undefined;
            if ((!args || args.appName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'appName'");
            }
            if ((!args || args.planName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'planName'");
            }
            if ((!args || args.subaccountId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'subaccountId'");
            }
            resourceInputs["appName"] = args ? args.appName : undefined;
            resourceInputs["parameters"] = args ? args.parameters : undefined;
            resourceInputs["planName"] = args ? args.planName : undefined;
            resourceInputs["subaccountId"] = args ? args.subaccountId : undefined;
            resourceInputs["additionalPlanFeatures"] = undefined /*out*/;
            resourceInputs["appId"] = undefined /*out*/;
            resourceInputs["authenticationProvider"] = undefined /*out*/;
            resourceInputs["category"] = undefined /*out*/;
            resourceInputs["commercialAppName"] = undefined /*out*/;
            resourceInputs["createdDate"] = undefined /*out*/;
            resourceInputs["customerDeveloped"] = undefined /*out*/;
            resourceInputs["description"] = undefined /*out*/;
            resourceInputs["displayName"] = undefined /*out*/;
            resourceInputs["formationSolutionName"] = undefined /*out*/;
            resourceInputs["globalaccountId"] = undefined /*out*/;
            resourceInputs["labels"] = undefined /*out*/;
            resourceInputs["lastModified"] = undefined /*out*/;
            resourceInputs["platformEntityId"] = undefined /*out*/;
            resourceInputs["quota"] = undefined /*out*/;
            resourceInputs["state"] = undefined /*out*/;
            resourceInputs["subscribedSubaccountId"] = undefined /*out*/;
            resourceInputs["subscribedTenantId"] = undefined /*out*/;
            resourceInputs["subscriptionUrl"] = undefined /*out*/;
            resourceInputs["supportsParametersUpdates"] = undefined /*out*/;
            resourceInputs["supportsPlanUpdates"] = undefined /*out*/;
            resourceInputs["tenantId"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(SubaccountSubscription.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering SubaccountSubscription resources.
 */
export interface SubaccountSubscriptionState {
    /**
     * The list of features specific to this plan.
     */
    additionalPlanFeatures?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The ID returned by XSUAA after the app provider has performed a bind of the multitenant application to an XSUAA service instance.
     */
    appId?: pulumi.Input<string>;
    /**
     * The unique registration name of the deployed multitenant application as defined by the app developer.
     */
    appName?: pulumi.Input<string>;
    /**
     * The authentication provider of the multitenant application. * XSUAA is the SAP Authorization and Trust Management service that defines scopes and permissions for users as tenants at the global account level. * IAS is Identity Authentication Service that defines scopes and permissions for users in zones (common data isolation systems across systems, SaaS tenants, and services).
     */
    authenticationProvider?: pulumi.Input<string>;
    /**
     * The technical name of the category defined by the app developer to which the multitenant application is grouped in customer-facing UIs.
     */
    category?: pulumi.Input<string>;
    /**
     * The commercial name of the deployed multitenant application as defined by the app developer.
     */
    commercialAppName?: pulumi.Input<string>;
    /**
     * The date and time when the resource was created in [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) format.
     */
    createdDate?: pulumi.Input<string>;
    /**
     * Shows whether the application was developed by a customer. If not, then the application is developed by the cloud operator, such as SAP.
     */
    customerDeveloped?: pulumi.Input<boolean>;
    /**
     * The description of the multitenant application for customer-facing UIs.
     */
    description?: pulumi.Input<string>;
    /**
     * The display name of the application for customer-facing UIs.
     */
    displayName?: pulumi.Input<string>;
    /**
     * The name of the formations solution associated with the multitenant application.
     */
    formationSolutionName?: pulumi.Input<string>;
    /**
     * The ID of the associated global account.
     */
    globalaccountId?: pulumi.Input<string>;
    /**
     * The set of words or phrases assigned to the multitenant application subscription.
     */
    labels?: pulumi.Input<{[key: string]: pulumi.Input<pulumi.Input<string>[]>}>;
    /**
     * The date and time when the resource was last modified in [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) format.
     */
    lastModified?: pulumi.Input<string>;
    /**
     * The parameters of the subscription as a valid JSON object.
     */
    parameters?: pulumi.Input<string>;
    /**
     * The plan name of the application to which the consumer has subscribed.
     */
    planName?: pulumi.Input<string>;
    /**
     * The ID of the landscape-specific environment.
     */
    platformEntityId?: pulumi.Input<string>;
    /**
     * The total amount the subscribed subaccount is entitled to consume.
     */
    quota?: pulumi.Input<number>;
    /**
     * The subscription state of the subaccount regarding the multitenant application.
     */
    state?: pulumi.Input<string>;
    /**
     * The ID of the subaccount.
     */
    subaccountId?: pulumi.Input<string>;
    /**
     * The ID of the subaccount, which is subscribed to the multitenant application.
     */
    subscribedSubaccountId?: pulumi.Input<string>;
    /**
     * The ID of the tenant, which is subscribed to a multitenant application.
     */
    subscribedTenantId?: pulumi.Input<string>;
    /**
     * The URL for app users to launch the subscribed application.
     */
    subscriptionUrl?: pulumi.Input<string>;
    /**
     * Specifies whether a consumer, whose subaccount is subscribed to the application, can change its subscriptions parameters.
     */
    supportsParametersUpdates?: pulumi.Input<boolean>;
    /**
     * Specifies whether a consumer, whose subaccount is subscribed to the application, can change the subscription to a different plan that is available for this application and subaccount.
     */
    supportsPlanUpdates?: pulumi.Input<boolean>;
    /**
     * The tenant ID of the application provider.
     */
    tenantId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a SubaccountSubscription resource.
 */
export interface SubaccountSubscriptionArgs {
    /**
     * The unique registration name of the deployed multitenant application as defined by the app developer.
     */
    appName: pulumi.Input<string>;
    /**
     * The parameters of the subscription as a valid JSON object.
     */
    parameters?: pulumi.Input<string>;
    /**
     * The plan name of the application to which the consumer has subscribed.
     */
    planName: pulumi.Input<string>;
    /**
     * The ID of the subaccount.
     */
    subaccountId: pulumi.Input<string>;
}