// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.lechnerc77.pulumi.btp.btp;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SubaccountSubscriptionArgs extends com.pulumi.resources.ResourceArgs {

    public static final SubaccountSubscriptionArgs Empty = new SubaccountSubscriptionArgs();

    /**
     * The unique registration name of the deployed multitenant application as defined by the app developer.
     * 
     */
    @Import(name="appName", required=true)
    private Output<String> appName;

    /**
     * @return The unique registration name of the deployed multitenant application as defined by the app developer.
     * 
     */
    public Output<String> appName() {
        return this.appName;
    }

    /**
     * The parameters of the subscription as a valid JSON object.
     * 
     */
    @Import(name="parameters")
    private @Nullable Output<String> parameters;

    /**
     * @return The parameters of the subscription as a valid JSON object.
     * 
     */
    public Optional<Output<String>> parameters() {
        return Optional.ofNullable(this.parameters);
    }

    /**
     * The plan name of the application to which the consumer has subscribed.
     * 
     */
    @Import(name="planName", required=true)
    private Output<String> planName;

    /**
     * @return The plan name of the application to which the consumer has subscribed.
     * 
     */
    public Output<String> planName() {
        return this.planName;
    }

    /**
     * The ID of the subaccount.
     * 
     */
    @Import(name="subaccountId", required=true)
    private Output<String> subaccountId;

    /**
     * @return The ID of the subaccount.
     * 
     */
    public Output<String> subaccountId() {
        return this.subaccountId;
    }

    private SubaccountSubscriptionArgs() {}

    private SubaccountSubscriptionArgs(SubaccountSubscriptionArgs $) {
        this.appName = $.appName;
        this.parameters = $.parameters;
        this.planName = $.planName;
        this.subaccountId = $.subaccountId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SubaccountSubscriptionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SubaccountSubscriptionArgs $;

        public Builder() {
            $ = new SubaccountSubscriptionArgs();
        }

        public Builder(SubaccountSubscriptionArgs defaults) {
            $ = new SubaccountSubscriptionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param appName The unique registration name of the deployed multitenant application as defined by the app developer.
         * 
         * @return builder
         * 
         */
        public Builder appName(Output<String> appName) {
            $.appName = appName;
            return this;
        }

        /**
         * @param appName The unique registration name of the deployed multitenant application as defined by the app developer.
         * 
         * @return builder
         * 
         */
        public Builder appName(String appName) {
            return appName(Output.of(appName));
        }

        /**
         * @param parameters The parameters of the subscription as a valid JSON object.
         * 
         * @return builder
         * 
         */
        public Builder parameters(@Nullable Output<String> parameters) {
            $.parameters = parameters;
            return this;
        }

        /**
         * @param parameters The parameters of the subscription as a valid JSON object.
         * 
         * @return builder
         * 
         */
        public Builder parameters(String parameters) {
            return parameters(Output.of(parameters));
        }

        /**
         * @param planName The plan name of the application to which the consumer has subscribed.
         * 
         * @return builder
         * 
         */
        public Builder planName(Output<String> planName) {
            $.planName = planName;
            return this;
        }

        /**
         * @param planName The plan name of the application to which the consumer has subscribed.
         * 
         * @return builder
         * 
         */
        public Builder planName(String planName) {
            return planName(Output.of(planName));
        }

        /**
         * @param subaccountId The ID of the subaccount.
         * 
         * @return builder
         * 
         */
        public Builder subaccountId(Output<String> subaccountId) {
            $.subaccountId = subaccountId;
            return this;
        }

        /**
         * @param subaccountId The ID of the subaccount.
         * 
         * @return builder
         * 
         */
        public Builder subaccountId(String subaccountId) {
            return subaccountId(Output.of(subaccountId));
        }

        public SubaccountSubscriptionArgs build() {
            $.appName = Objects.requireNonNull($.appName, "expected parameter 'appName' to be non-null");
            $.planName = Objects.requireNonNull($.planName, "expected parameter 'planName' to be non-null");
            $.subaccountId = Objects.requireNonNull($.subaccountId, "expected parameter 'subaccountId' to be non-null");
            return $;
        }
    }

}