// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.lechnerc77.pulumi.btp.btp.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetSubaccountSubscriptionsValue {
    /**
     * @return The list of features specific to this plan.
     * 
     */
    private List<String> additionalPlanFeatures;
    /**
     * @return The ID returned by XSUAA after the app provider has performed a bind of the multitenant application to a XSUAA service instance.
     * 
     */
    private String appId;
    /**
     * @return The unique registration name of the deployed multitenant application as defined by the app developer.
     * 
     */
    private String appName;
    /**
     * @return The authentication provider of the multitenant application. * XSUAA is the SAP Authorization and Trust Management service that defines scopes and permissions for users as tenants at the global account level. * IAS is Identity Authentication Service that defines scopes and permissions for users in zones (common data isolation systems across systems, SaaS tenants, and services).
     * 
     */
    private String authenticationProvider;
    /**
     * @return The state of the automation solution.
     * 
     */
    private String automationState;
    /**
     * @return The message that describes the automation solution state.
     * 
     */
    private String automationStateMessage;
    /**
     * @return The technical name of the category defined by the app developer to which the multitenant application is grouped in customer-facing UIs.
     * 
     */
    private String category;
    /**
     * @return The display name of the category for customer-facing UIs.
     * 
     */
    private String categoryDisplayName;
    /**
     * @return The commercial name of the deployed multitenant application as defined by the app developer.
     * 
     */
    private String commercialAppName;
    /**
     * @return The date and time when the resource was created in [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) format.
     * 
     */
    private String createdDate;
    /**
     * @return Shows whether the application was developed by a customer. If not, then the application is developed by the cloud operator, such as SAP.
     * 
     */
    private Boolean customerDeveloped;
    /**
     * @return The description of the multitenant application.
     * 
     */
    private String description;
    /**
     * @return The display name of the application for customer-facing UIs.
     * 
     */
    private String displayName;
    /**
     * @return The name of the formations solution associated with the multitenant application.
     * 
     */
    private String formationSolutionName;
    /**
     * @return The ID of the associated global account.
     * 
     */
    private String globalaccountId;
    /**
     * @return The technical ID generated by XSUAA for a multitenant application when a consumer subscribes to the application.
     * 
     */
    private String id;
    /**
     * @return The application&#39;s incident-tracking component provided in metadata for customer-facing UIs.
     * 
     */
    private String incidentTrackingComponent;
    /**
     * @return The set of words or phrases assigned to the multitenant application subscription.
     * 
     */
    private Map<String,List<String>> labels;
    /**
     * @return The date and time when the resource was last modified in [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) format.
     * 
     */
    private String lastModified;
    /**
     * @return The description of the plan for customer-facing UIs.
     * 
     */
    private String planDescription;
    /**
     * @return The plan name of the application to which the consumer has subscribed.
     * 
     */
    private String planName;
    /**
     * @return The ID of the landscape-specific environment.
     * 
     */
    private String platformEntityId;
    /**
     * @return The total amount the subscribed subaccount is entitled to consume.
     * 
     */
    private Integer quota;
    /**
     * @return The short description of the multitenant application for customer-facing UIs.
     * 
     */
    private String shortDescription;
    /**
     * @return The subscription state of the subaccount regarding the multitenant application.
     * 
     */
    private String state;
    /**
     * @return The ID of the subaccount which is subscribed to the multitenant application.
     * 
     */
    private String subscribedSubaccountId;
    /**
     * @return The ID of the tenant which is subscribed to a multitenant application.
     * 
     */
    private String subscribedTenantId;
    /**
     * @return The URL for app users to launch the subscribed application.
     * 
     */
    private String subscriptionUrl;
    /**
     * @return Specifies whether a consumer, whose subaccount is subscribed to the application, can change its subscriptions parameters.
     * 
     */
    private Boolean supportsParametersUpdates;
    /**
     * @return Specifies whether a consumer, whose subaccount is subscribed to the application, can change the subscription to a different plan that is available for this application and subaccount.
     * 
     */
    private Boolean supportsPlanUpdates;
    /**
     * @return The tenant ID of the application provider.
     * 
     */
    private String tenantId;

    private GetSubaccountSubscriptionsValue() {}
    /**
     * @return The list of features specific to this plan.
     * 
     */
    public List<String> additionalPlanFeatures() {
        return this.additionalPlanFeatures;
    }
    /**
     * @return The ID returned by XSUAA after the app provider has performed a bind of the multitenant application to a XSUAA service instance.
     * 
     */
    public String appId() {
        return this.appId;
    }
    /**
     * @return The unique registration name of the deployed multitenant application as defined by the app developer.
     * 
     */
    public String appName() {
        return this.appName;
    }
    /**
     * @return The authentication provider of the multitenant application. * XSUAA is the SAP Authorization and Trust Management service that defines scopes and permissions for users as tenants at the global account level. * IAS is Identity Authentication Service that defines scopes and permissions for users in zones (common data isolation systems across systems, SaaS tenants, and services).
     * 
     */
    public String authenticationProvider() {
        return this.authenticationProvider;
    }
    /**
     * @return The state of the automation solution.
     * 
     */
    public String automationState() {
        return this.automationState;
    }
    /**
     * @return The message that describes the automation solution state.
     * 
     */
    public String automationStateMessage() {
        return this.automationStateMessage;
    }
    /**
     * @return The technical name of the category defined by the app developer to which the multitenant application is grouped in customer-facing UIs.
     * 
     */
    public String category() {
        return this.category;
    }
    /**
     * @return The display name of the category for customer-facing UIs.
     * 
     */
    public String categoryDisplayName() {
        return this.categoryDisplayName;
    }
    /**
     * @return The commercial name of the deployed multitenant application as defined by the app developer.
     * 
     */
    public String commercialAppName() {
        return this.commercialAppName;
    }
    /**
     * @return The date and time when the resource was created in [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) format.
     * 
     */
    public String createdDate() {
        return this.createdDate;
    }
    /**
     * @return Shows whether the application was developed by a customer. If not, then the application is developed by the cloud operator, such as SAP.
     * 
     */
    public Boolean customerDeveloped() {
        return this.customerDeveloped;
    }
    /**
     * @return The description of the multitenant application.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return The display name of the application for customer-facing UIs.
     * 
     */
    public String displayName() {
        return this.displayName;
    }
    /**
     * @return The name of the formations solution associated with the multitenant application.
     * 
     */
    public String formationSolutionName() {
        return this.formationSolutionName;
    }
    /**
     * @return The ID of the associated global account.
     * 
     */
    public String globalaccountId() {
        return this.globalaccountId;
    }
    /**
     * @return The technical ID generated by XSUAA for a multitenant application when a consumer subscribes to the application.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The application&#39;s incident-tracking component provided in metadata for customer-facing UIs.
     * 
     */
    public String incidentTrackingComponent() {
        return this.incidentTrackingComponent;
    }
    /**
     * @return The set of words or phrases assigned to the multitenant application subscription.
     * 
     */
    public Map<String,List<String>> labels() {
        return this.labels;
    }
    /**
     * @return The date and time when the resource was last modified in [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) format.
     * 
     */
    public String lastModified() {
        return this.lastModified;
    }
    /**
     * @return The description of the plan for customer-facing UIs.
     * 
     */
    public String planDescription() {
        return this.planDescription;
    }
    /**
     * @return The plan name of the application to which the consumer has subscribed.
     * 
     */
    public String planName() {
        return this.planName;
    }
    /**
     * @return The ID of the landscape-specific environment.
     * 
     */
    public String platformEntityId() {
        return this.platformEntityId;
    }
    /**
     * @return The total amount the subscribed subaccount is entitled to consume.
     * 
     */
    public Integer quota() {
        return this.quota;
    }
    /**
     * @return The short description of the multitenant application for customer-facing UIs.
     * 
     */
    public String shortDescription() {
        return this.shortDescription;
    }
    /**
     * @return The subscription state of the subaccount regarding the multitenant application.
     * 
     */
    public String state() {
        return this.state;
    }
    /**
     * @return The ID of the subaccount which is subscribed to the multitenant application.
     * 
     */
    public String subscribedSubaccountId() {
        return this.subscribedSubaccountId;
    }
    /**
     * @return The ID of the tenant which is subscribed to a multitenant application.
     * 
     */
    public String subscribedTenantId() {
        return this.subscribedTenantId;
    }
    /**
     * @return The URL for app users to launch the subscribed application.
     * 
     */
    public String subscriptionUrl() {
        return this.subscriptionUrl;
    }
    /**
     * @return Specifies whether a consumer, whose subaccount is subscribed to the application, can change its subscriptions parameters.
     * 
     */
    public Boolean supportsParametersUpdates() {
        return this.supportsParametersUpdates;
    }
    /**
     * @return Specifies whether a consumer, whose subaccount is subscribed to the application, can change the subscription to a different plan that is available for this application and subaccount.
     * 
     */
    public Boolean supportsPlanUpdates() {
        return this.supportsPlanUpdates;
    }
    /**
     * @return The tenant ID of the application provider.
     * 
     */
    public String tenantId() {
        return this.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSubaccountSubscriptionsValue defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<String> additionalPlanFeatures;
        private String appId;
        private String appName;
        private String authenticationProvider;
        private String automationState;
        private String automationStateMessage;
        private String category;
        private String categoryDisplayName;
        private String commercialAppName;
        private String createdDate;
        private Boolean customerDeveloped;
        private String description;
        private String displayName;
        private String formationSolutionName;
        private String globalaccountId;
        private String id;
        private String incidentTrackingComponent;
        private Map<String,List<String>> labels;
        private String lastModified;
        private String planDescription;
        private String planName;
        private String platformEntityId;
        private Integer quota;
        private String shortDescription;
        private String state;
        private String subscribedSubaccountId;
        private String subscribedTenantId;
        private String subscriptionUrl;
        private Boolean supportsParametersUpdates;
        private Boolean supportsPlanUpdates;
        private String tenantId;
        public Builder() {}
        public Builder(GetSubaccountSubscriptionsValue defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalPlanFeatures = defaults.additionalPlanFeatures;
    	      this.appId = defaults.appId;
    	      this.appName = defaults.appName;
    	      this.authenticationProvider = defaults.authenticationProvider;
    	      this.automationState = defaults.automationState;
    	      this.automationStateMessage = defaults.automationStateMessage;
    	      this.category = defaults.category;
    	      this.categoryDisplayName = defaults.categoryDisplayName;
    	      this.commercialAppName = defaults.commercialAppName;
    	      this.createdDate = defaults.createdDate;
    	      this.customerDeveloped = defaults.customerDeveloped;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.formationSolutionName = defaults.formationSolutionName;
    	      this.globalaccountId = defaults.globalaccountId;
    	      this.id = defaults.id;
    	      this.incidentTrackingComponent = defaults.incidentTrackingComponent;
    	      this.labels = defaults.labels;
    	      this.lastModified = defaults.lastModified;
    	      this.planDescription = defaults.planDescription;
    	      this.planName = defaults.planName;
    	      this.platformEntityId = defaults.platformEntityId;
    	      this.quota = defaults.quota;
    	      this.shortDescription = defaults.shortDescription;
    	      this.state = defaults.state;
    	      this.subscribedSubaccountId = defaults.subscribedSubaccountId;
    	      this.subscribedTenantId = defaults.subscribedTenantId;
    	      this.subscriptionUrl = defaults.subscriptionUrl;
    	      this.supportsParametersUpdates = defaults.supportsParametersUpdates;
    	      this.supportsPlanUpdates = defaults.supportsPlanUpdates;
    	      this.tenantId = defaults.tenantId;
        }

        @CustomType.Setter
        public Builder additionalPlanFeatures(List<String> additionalPlanFeatures) {
            this.additionalPlanFeatures = Objects.requireNonNull(additionalPlanFeatures);
            return this;
        }
        public Builder additionalPlanFeatures(String... additionalPlanFeatures) {
            return additionalPlanFeatures(List.of(additionalPlanFeatures));
        }
        @CustomType.Setter
        public Builder appId(String appId) {
            this.appId = Objects.requireNonNull(appId);
            return this;
        }
        @CustomType.Setter
        public Builder appName(String appName) {
            this.appName = Objects.requireNonNull(appName);
            return this;
        }
        @CustomType.Setter
        public Builder authenticationProvider(String authenticationProvider) {
            this.authenticationProvider = Objects.requireNonNull(authenticationProvider);
            return this;
        }
        @CustomType.Setter
        public Builder automationState(String automationState) {
            this.automationState = Objects.requireNonNull(automationState);
            return this;
        }
        @CustomType.Setter
        public Builder automationStateMessage(String automationStateMessage) {
            this.automationStateMessage = Objects.requireNonNull(automationStateMessage);
            return this;
        }
        @CustomType.Setter
        public Builder category(String category) {
            this.category = Objects.requireNonNull(category);
            return this;
        }
        @CustomType.Setter
        public Builder categoryDisplayName(String categoryDisplayName) {
            this.categoryDisplayName = Objects.requireNonNull(categoryDisplayName);
            return this;
        }
        @CustomType.Setter
        public Builder commercialAppName(String commercialAppName) {
            this.commercialAppName = Objects.requireNonNull(commercialAppName);
            return this;
        }
        @CustomType.Setter
        public Builder createdDate(String createdDate) {
            this.createdDate = Objects.requireNonNull(createdDate);
            return this;
        }
        @CustomType.Setter
        public Builder customerDeveloped(Boolean customerDeveloped) {
            this.customerDeveloped = Objects.requireNonNull(customerDeveloped);
            return this;
        }
        @CustomType.Setter
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        @CustomType.Setter
        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }
        @CustomType.Setter
        public Builder formationSolutionName(String formationSolutionName) {
            this.formationSolutionName = Objects.requireNonNull(formationSolutionName);
            return this;
        }
        @CustomType.Setter
        public Builder globalaccountId(String globalaccountId) {
            this.globalaccountId = Objects.requireNonNull(globalaccountId);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder incidentTrackingComponent(String incidentTrackingComponent) {
            this.incidentTrackingComponent = Objects.requireNonNull(incidentTrackingComponent);
            return this;
        }
        @CustomType.Setter
        public Builder labels(Map<String,List<String>> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }
        @CustomType.Setter
        public Builder lastModified(String lastModified) {
            this.lastModified = Objects.requireNonNull(lastModified);
            return this;
        }
        @CustomType.Setter
        public Builder planDescription(String planDescription) {
            this.planDescription = Objects.requireNonNull(planDescription);
            return this;
        }
        @CustomType.Setter
        public Builder planName(String planName) {
            this.planName = Objects.requireNonNull(planName);
            return this;
        }
        @CustomType.Setter
        public Builder platformEntityId(String platformEntityId) {
            this.platformEntityId = Objects.requireNonNull(platformEntityId);
            return this;
        }
        @CustomType.Setter
        public Builder quota(Integer quota) {
            this.quota = Objects.requireNonNull(quota);
            return this;
        }
        @CustomType.Setter
        public Builder shortDescription(String shortDescription) {
            this.shortDescription = Objects.requireNonNull(shortDescription);
            return this;
        }
        @CustomType.Setter
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        @CustomType.Setter
        public Builder subscribedSubaccountId(String subscribedSubaccountId) {
            this.subscribedSubaccountId = Objects.requireNonNull(subscribedSubaccountId);
            return this;
        }
        @CustomType.Setter
        public Builder subscribedTenantId(String subscribedTenantId) {
            this.subscribedTenantId = Objects.requireNonNull(subscribedTenantId);
            return this;
        }
        @CustomType.Setter
        public Builder subscriptionUrl(String subscriptionUrl) {
            this.subscriptionUrl = Objects.requireNonNull(subscriptionUrl);
            return this;
        }
        @CustomType.Setter
        public Builder supportsParametersUpdates(Boolean supportsParametersUpdates) {
            this.supportsParametersUpdates = Objects.requireNonNull(supportsParametersUpdates);
            return this;
        }
        @CustomType.Setter
        public Builder supportsPlanUpdates(Boolean supportsPlanUpdates) {
            this.supportsPlanUpdates = Objects.requireNonNull(supportsPlanUpdates);
            return this;
        }
        @CustomType.Setter
        public Builder tenantId(String tenantId) {
            this.tenantId = Objects.requireNonNull(tenantId);
            return this;
        }
        public GetSubaccountSubscriptionsValue build() {
            final var _resultValue = new GetSubaccountSubscriptionsValue();
            _resultValue.additionalPlanFeatures = additionalPlanFeatures;
            _resultValue.appId = appId;
            _resultValue.appName = appName;
            _resultValue.authenticationProvider = authenticationProvider;
            _resultValue.automationState = automationState;
            _resultValue.automationStateMessage = automationStateMessage;
            _resultValue.category = category;
            _resultValue.categoryDisplayName = categoryDisplayName;
            _resultValue.commercialAppName = commercialAppName;
            _resultValue.createdDate = createdDate;
            _resultValue.customerDeveloped = customerDeveloped;
            _resultValue.description = description;
            _resultValue.displayName = displayName;
            _resultValue.formationSolutionName = formationSolutionName;
            _resultValue.globalaccountId = globalaccountId;
            _resultValue.id = id;
            _resultValue.incidentTrackingComponent = incidentTrackingComponent;
            _resultValue.labels = labels;
            _resultValue.lastModified = lastModified;
            _resultValue.planDescription = planDescription;
            _resultValue.planName = planName;
            _resultValue.platformEntityId = platformEntityId;
            _resultValue.quota = quota;
            _resultValue.shortDescription = shortDescription;
            _resultValue.state = state;
            _resultValue.subscribedSubaccountId = subscribedSubaccountId;
            _resultValue.subscribedTenantId = subscribedTenantId;
            _resultValue.subscriptionUrl = subscriptionUrl;
            _resultValue.supportsParametersUpdates = supportsParametersUpdates;
            _resultValue.supportsPlanUpdates = supportsPlanUpdates;
            _resultValue.tenantId = tenantId;
            return _resultValue;
        }
    }
}