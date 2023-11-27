// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Gets details of a specific multitenant application to which a subaccount is entitled to subscribe. If this application is in a different global account than the current one, you need to specify its plan with '--plan'.
 *
 * __Tip:__
 * You must be assigned to the subaccount admin or viewer role.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as btp from "@pulumi/btp";
 *
 * const contentAgentUiFree = btp.getSubaccountSubscription({
 *     appName: "content-agent-ui",
 *     planName: "free",
 *     subaccountId: "6aa64c2f-38c1-49a9-b2e8-cf9fea769b7f",
 * });
 * ```
 */
export function getSubaccountSubscription(args: GetSubaccountSubscriptionArgs, opts?: pulumi.InvokeOptions): Promise<GetSubaccountSubscriptionResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("btp:index/getSubaccountSubscription:getSubaccountSubscription", {
        "appName": args.appName,
        "planName": args.planName,
        "subaccountId": args.subaccountId,
    }, opts);
}

/**
 * A collection of arguments for invoking getSubaccountSubscription.
 */
export interface GetSubaccountSubscriptionArgs {
    /**
     * The unique registration name of the deployed multitenant application as defined by the app developer.
     */
    appName: string;
    /**
     * The plan name of the application to which the consumer has subscribed.
     */
    planName: string;
    /**
     * The ID of the subaccount.
     */
    subaccountId: string;
}

/**
 * A collection of values returned by getSubaccountSubscription.
 */
export interface GetSubaccountSubscriptionResult {
    /**
     * The list of features specific to this plan.
     */
    readonly additionalPlanFeatures: string[];
    /**
     * The ID returned by XSUAA after the app provider has performed a bind of the multitenant application to a XSUAA service instance.
     */
    readonly appId: string;
    /**
     * The unique registration name of the deployed multitenant application as defined by the app developer.
     */
    readonly appName: string;
    /**
     * The authentication provider of the multitenant application. * XSUAA is the SAP Authorization and Trust Management service that defines scopes and permissions for users as tenants at the global account level. * IAS is Identity Authentication Service that defines scopes and permissions for users in zones (common data isolation systems across systems, SaaS tenants, and services).
     */
    readonly authenticationProvider: string;
    /**
     * The technical name of the category defined by the app developer to which the multitenant application is grouped in customer-facing UIs.
     */
    readonly category: string;
    /**
     * The commercial name of the deployed multitenant application as defined by the app developer.
     */
    readonly commercialAppName: string;
    /**
     * The date and time when the resource was created in [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) format.
     */
    readonly createdDate: string;
    /**
     * Shows whether the application was developed by a customer. If not, then the application is developed by the cloud operator, such as SAP.
     */
    readonly customerDeveloped: boolean;
    /**
     * The description of the multitenant application.
     */
    readonly description: string;
    /**
     * The display name of the application for customer-facing UIs.
     */
    readonly displayName: string;
    /**
     * The name of the formations solution associated with the multitenant application.
     */
    readonly formationSolutionName: string;
    /**
     * The ID of the associated global account.
     */
    readonly globalaccountId: string;
    /**
     * The technical ID generated by XSUAA for a multitenant application when a consumer subscribes to the application.
     */
    readonly id: string;
    /**
     * The set of words or phrases assigned to the multitenant application subscription.
     */
    readonly labels: {[key: string]: string[]};
    /**
     * The date and time when the resource was last modified in [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) format.
     */
    readonly lastModified: string;
    /**
     * The parameters of the subscription as a valid JSON object.
     */
    readonly parameters: string;
    /**
     * The plan name of the application to which the consumer has subscribed.
     */
    readonly planName: string;
    /**
     * The ID of the landscape-specific environment.
     */
    readonly platformEntityId: string;
    /**
     * The total amount the subscribed subaccount is entitled to consume.
     */
    readonly quota: number;
    /**
     * The subscription state of the subaccount regarding the multitenant application.
     */
    readonly state: string;
    /**
     * The ID of the subaccount.
     */
    readonly subaccountId: string;
    /**
     * The ID of the subaccount which is subscribed to the multitenant application.
     */
    readonly subscribedSubaccountId: string;
    /**
     * The ID of the tenant which is subscribed to a multitenant application.
     */
    readonly subscribedTenantId: string;
    /**
     * The URL for app users to launch the subscribed application.
     */
    readonly subscriptionUrl: string;
    /**
     * Specifies whether a consumer, whose subaccount is subscribed to the application, can change its subscriptions parameters.
     */
    readonly supportsParametersUpdates: boolean;
    /**
     * Specifies whether a consumer, whose subaccount is subscribed to the application, can change the subscription to a different plan that is available for this application and subaccount.
     */
    readonly supportsPlanUpdates: boolean;
    /**
     * The tenant ID of the application provider.
     */
    readonly tenantId: string;
}
/**
 * Gets details of a specific multitenant application to which a subaccount is entitled to subscribe. If this application is in a different global account than the current one, you need to specify its plan with '--plan'.
 *
 * __Tip:__
 * You must be assigned to the subaccount admin or viewer role.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as btp from "@pulumi/btp";
 *
 * const contentAgentUiFree = btp.getSubaccountSubscription({
 *     appName: "content-agent-ui",
 *     planName: "free",
 *     subaccountId: "6aa64c2f-38c1-49a9-b2e8-cf9fea769b7f",
 * });
 * ```
 */
export function getSubaccountSubscriptionOutput(args: GetSubaccountSubscriptionOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetSubaccountSubscriptionResult> {
    return pulumi.output(args).apply((a: any) => getSubaccountSubscription(a, opts))
}

/**
 * A collection of arguments for invoking getSubaccountSubscription.
 */
export interface GetSubaccountSubscriptionOutputArgs {
    /**
     * The unique registration name of the deployed multitenant application as defined by the app developer.
     */
    appName: pulumi.Input<string>;
    /**
     * The plan name of the application to which the consumer has subscribed.
     */
    planName: pulumi.Input<string>;
    /**
     * The ID of the subaccount.
     */
    subaccountId: pulumi.Input<string>;
}
