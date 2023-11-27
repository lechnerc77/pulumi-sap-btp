// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.lechnerc77.pulumi.btp.btp;

import com.lechnerc77.pulumi.btp.btp.SubaccountSubscriptionArgs;
import com.lechnerc77.pulumi.btp.btp.Utilities;
import com.lechnerc77.pulumi.btp.btp.inputs.SubaccountSubscriptionState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Subscribes a subaccount to a multitenant application.
 * Custom or partner-developed applications are currently not supported.
 * 
 * __Tip:__
 * You must be assigned to the subaccount admin role.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.btp.SubaccountSubscription;
 * import com.pulumi.btp.SubaccountSubscriptionArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var workzone = new SubaccountSubscription(&#34;workzone&#34;, SubaccountSubscriptionArgs.builder()        
 *             .appName(&#34;SAPLaunchpad&#34;)
 *             .planName(&#34;free&#34;)
 *             .subaccountId(&#34;6aa64c2f-38c1-49a9-b2e8-cf9fea769b7f&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * terraform
 * 
 * ```sh
 *  $ pulumi import btp:index/subaccountSubscription:SubaccountSubscription &lt;resource_name&gt; &lt;subaccount_id&gt;,&lt;app_name&gt;,&lt;plan_name&gt;
 * ```
 * 
 * ```sh
 *  $ pulumi import btp:index/subaccountSubscription:SubaccountSubscription workzone 6aa64c2f-38c1-49a9-b2e8-cf9fea769b7f,SAPLaunchpad,free
 * ```
 * 
 */
@ResourceType(type="btp:index/subaccountSubscription:SubaccountSubscription")
public class SubaccountSubscription extends com.pulumi.resources.CustomResource {
    /**
     * The list of features specific to this plan.
     * 
     */
    @Export(name="additionalPlanFeatures", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> additionalPlanFeatures;

    /**
     * @return The list of features specific to this plan.
     * 
     */
    public Output<List<String>> additionalPlanFeatures() {
        return this.additionalPlanFeatures;
    }
    /**
     * The ID returned by XSUAA after the app provider has performed a bind of the multitenant application to an XSUAA service instance.
     * 
     */
    @Export(name="appId", refs={String.class}, tree="[0]")
    private Output<String> appId;

    /**
     * @return The ID returned by XSUAA after the app provider has performed a bind of the multitenant application to an XSUAA service instance.
     * 
     */
    public Output<String> appId() {
        return this.appId;
    }
    /**
     * The unique registration name of the deployed multitenant application as defined by the app developer.
     * 
     */
    @Export(name="appName", refs={String.class}, tree="[0]")
    private Output<String> appName;

    /**
     * @return The unique registration name of the deployed multitenant application as defined by the app developer.
     * 
     */
    public Output<String> appName() {
        return this.appName;
    }
    /**
     * The authentication provider of the multitenant application. * XSUAA is the SAP Authorization and Trust Management service that defines scopes and permissions for users as tenants at the global account level. * IAS is Identity Authentication Service that defines scopes and permissions for users in zones (common data isolation systems across systems, SaaS tenants, and services).
     * 
     */
    @Export(name="authenticationProvider", refs={String.class}, tree="[0]")
    private Output<String> authenticationProvider;

    /**
     * @return The authentication provider of the multitenant application. * XSUAA is the SAP Authorization and Trust Management service that defines scopes and permissions for users as tenants at the global account level. * IAS is Identity Authentication Service that defines scopes and permissions for users in zones (common data isolation systems across systems, SaaS tenants, and services).
     * 
     */
    public Output<String> authenticationProvider() {
        return this.authenticationProvider;
    }
    /**
     * The technical name of the category defined by the app developer to which the multitenant application is grouped in customer-facing UIs.
     * 
     */
    @Export(name="category", refs={String.class}, tree="[0]")
    private Output<String> category;

    /**
     * @return The technical name of the category defined by the app developer to which the multitenant application is grouped in customer-facing UIs.
     * 
     */
    public Output<String> category() {
        return this.category;
    }
    /**
     * The commercial name of the deployed multitenant application as defined by the app developer.
     * 
     */
    @Export(name="commercialAppName", refs={String.class}, tree="[0]")
    private Output<String> commercialAppName;

    /**
     * @return The commercial name of the deployed multitenant application as defined by the app developer.
     * 
     */
    public Output<String> commercialAppName() {
        return this.commercialAppName;
    }
    /**
     * The date and time when the resource was created in [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) format.
     * 
     */
    @Export(name="createdDate", refs={String.class}, tree="[0]")
    private Output<String> createdDate;

    /**
     * @return The date and time when the resource was created in [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) format.
     * 
     */
    public Output<String> createdDate() {
        return this.createdDate;
    }
    /**
     * Shows whether the application was developed by a customer. If not, then the application is developed by the cloud operator, such as SAP.
     * 
     */
    @Export(name="customerDeveloped", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> customerDeveloped;

    /**
     * @return Shows whether the application was developed by a customer. If not, then the application is developed by the cloud operator, such as SAP.
     * 
     */
    public Output<Boolean> customerDeveloped() {
        return this.customerDeveloped;
    }
    /**
     * The description of the multitenant application for customer-facing UIs.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output<String> description;

    /**
     * @return The description of the multitenant application for customer-facing UIs.
     * 
     */
    public Output<String> description() {
        return this.description;
    }
    /**
     * The display name of the application for customer-facing UIs.
     * 
     */
    @Export(name="displayName", refs={String.class}, tree="[0]")
    private Output<String> displayName;

    /**
     * @return The display name of the application for customer-facing UIs.
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
    }
    /**
     * The name of the formations solution associated with the multitenant application.
     * 
     */
    @Export(name="formationSolutionName", refs={String.class}, tree="[0]")
    private Output<String> formationSolutionName;

    /**
     * @return The name of the formations solution associated with the multitenant application.
     * 
     */
    public Output<String> formationSolutionName() {
        return this.formationSolutionName;
    }
    /**
     * The ID of the associated global account.
     * 
     */
    @Export(name="globalaccountId", refs={String.class}, tree="[0]")
    private Output<String> globalaccountId;

    /**
     * @return The ID of the associated global account.
     * 
     */
    public Output<String> globalaccountId() {
        return this.globalaccountId;
    }
    /**
     * The set of words or phrases assigned to the multitenant application subscription.
     * 
     */
    @Export(name="labels", refs={Map.class,String.class,List.class}, tree="[0,1,[2,1]]")
    private Output<Map<String,List<String>>> labels;

    /**
     * @return The set of words or phrases assigned to the multitenant application subscription.
     * 
     */
    public Output<Map<String,List<String>>> labels() {
        return this.labels;
    }
    /**
     * The date and time when the resource was last modified in [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) format.
     * 
     */
    @Export(name="lastModified", refs={String.class}, tree="[0]")
    private Output<String> lastModified;

    /**
     * @return The date and time when the resource was last modified in [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) format.
     * 
     */
    public Output<String> lastModified() {
        return this.lastModified;
    }
    /**
     * The parameters of the subscription as a valid JSON object.
     * 
     */
    @Export(name="parameters", refs={String.class}, tree="[0]")
    private Output<String> parameters;

    /**
     * @return The parameters of the subscription as a valid JSON object.
     * 
     */
    public Output<String> parameters() {
        return this.parameters;
    }
    /**
     * The plan name of the application to which the consumer has subscribed.
     * 
     */
    @Export(name="planName", refs={String.class}, tree="[0]")
    private Output<String> planName;

    /**
     * @return The plan name of the application to which the consumer has subscribed.
     * 
     */
    public Output<String> planName() {
        return this.planName;
    }
    /**
     * The ID of the landscape-specific environment.
     * 
     */
    @Export(name="platformEntityId", refs={String.class}, tree="[0]")
    private Output<String> platformEntityId;

    /**
     * @return The ID of the landscape-specific environment.
     * 
     */
    public Output<String> platformEntityId() {
        return this.platformEntityId;
    }
    /**
     * The total amount the subscribed subaccount is entitled to consume.
     * 
     */
    @Export(name="quota", refs={Integer.class}, tree="[0]")
    private Output<Integer> quota;

    /**
     * @return The total amount the subscribed subaccount is entitled to consume.
     * 
     */
    public Output<Integer> quota() {
        return this.quota;
    }
    /**
     * The subscription state of the subaccount regarding the multitenant application.
     * 
     */
    @Export(name="state", refs={String.class}, tree="[0]")
    private Output<String> state;

    /**
     * @return The subscription state of the subaccount regarding the multitenant application.
     * 
     */
    public Output<String> state() {
        return this.state;
    }
    /**
     * The ID of the subaccount.
     * 
     */
    @Export(name="subaccountId", refs={String.class}, tree="[0]")
    private Output<String> subaccountId;

    /**
     * @return The ID of the subaccount.
     * 
     */
    public Output<String> subaccountId() {
        return this.subaccountId;
    }
    /**
     * The ID of the subaccount, which is subscribed to the multitenant application.
     * 
     */
    @Export(name="subscribedSubaccountId", refs={String.class}, tree="[0]")
    private Output<String> subscribedSubaccountId;

    /**
     * @return The ID of the subaccount, which is subscribed to the multitenant application.
     * 
     */
    public Output<String> subscribedSubaccountId() {
        return this.subscribedSubaccountId;
    }
    /**
     * The ID of the tenant, which is subscribed to a multitenant application.
     * 
     */
    @Export(name="subscribedTenantId", refs={String.class}, tree="[0]")
    private Output<String> subscribedTenantId;

    /**
     * @return The ID of the tenant, which is subscribed to a multitenant application.
     * 
     */
    public Output<String> subscribedTenantId() {
        return this.subscribedTenantId;
    }
    /**
     * The URL for app users to launch the subscribed application.
     * 
     */
    @Export(name="subscriptionUrl", refs={String.class}, tree="[0]")
    private Output<String> subscriptionUrl;

    /**
     * @return The URL for app users to launch the subscribed application.
     * 
     */
    public Output<String> subscriptionUrl() {
        return this.subscriptionUrl;
    }
    /**
     * Specifies whether a consumer, whose subaccount is subscribed to the application, can change its subscriptions parameters.
     * 
     */
    @Export(name="supportsParametersUpdates", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> supportsParametersUpdates;

    /**
     * @return Specifies whether a consumer, whose subaccount is subscribed to the application, can change its subscriptions parameters.
     * 
     */
    public Output<Boolean> supportsParametersUpdates() {
        return this.supportsParametersUpdates;
    }
    /**
     * Specifies whether a consumer, whose subaccount is subscribed to the application, can change the subscription to a different plan that is available for this application and subaccount.
     * 
     */
    @Export(name="supportsPlanUpdates", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> supportsPlanUpdates;

    /**
     * @return Specifies whether a consumer, whose subaccount is subscribed to the application, can change the subscription to a different plan that is available for this application and subaccount.
     * 
     */
    public Output<Boolean> supportsPlanUpdates() {
        return this.supportsPlanUpdates;
    }
    /**
     * The tenant ID of the application provider.
     * 
     */
    @Export(name="tenantId", refs={String.class}, tree="[0]")
    private Output<String> tenantId;

    /**
     * @return The tenant ID of the application provider.
     * 
     */
    public Output<String> tenantId() {
        return this.tenantId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SubaccountSubscription(String name) {
        this(name, SubaccountSubscriptionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SubaccountSubscription(String name, SubaccountSubscriptionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SubaccountSubscription(String name, SubaccountSubscriptionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("btp:index/subaccountSubscription:SubaccountSubscription", name, args == null ? SubaccountSubscriptionArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private SubaccountSubscription(String name, Output<String> id, @Nullable SubaccountSubscriptionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("btp:index/subaccountSubscription:SubaccountSubscription", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static SubaccountSubscription get(String name, Output<String> id, @Nullable SubaccountSubscriptionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new SubaccountSubscription(name, id, state, options);
    }
}
