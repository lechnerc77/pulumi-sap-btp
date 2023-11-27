// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.lechnerc77.pulumi.btp.btp;

import com.lechnerc77.pulumi.btp.btp.inputs.SubaccountEnvironmentInstanceTimeoutsArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SubaccountEnvironmentInstanceArgs extends com.pulumi.resources.ResourceArgs {

    public static final SubaccountEnvironmentInstanceArgs Empty = new SubaccountEnvironmentInstanceArgs();

    /**
     * The type of the environment instance that is used.
     * 
     */
    @Import(name="environmentType", required=true)
    private Output<String> environmentType;

    /**
     * @return The type of the environment instance that is used.
     * 
     */
    public Output<String> environmentType() {
        return this.environmentType;
    }

    /**
     * The name of the landscape within the logged in region on which the environment instance is created.
     * 
     */
    @Import(name="landscapeLabel")
    private @Nullable Output<String> landscapeLabel;

    /**
     * @return The name of the landscape within the logged in region on which the environment instance is created.
     * 
     */
    public Optional<Output<String>> landscapeLabel() {
        return Optional.ofNullable(this.landscapeLabel);
    }

    /**
     * The name of the environment instance.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the environment instance.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The configuration parameters for the environment instance.
     * 
     */
    @Import(name="parameters", required=true)
    private Output<String> parameters;

    /**
     * @return The configuration parameters for the environment instance.
     * 
     */
    public Output<String> parameters() {
        return this.parameters;
    }

    /**
     * The name of the service plan for the environment instance in the corresponding service broker&#39;s catalog.
     * 
     */
    @Import(name="planName", required=true)
    private Output<String> planName;

    /**
     * @return The name of the service plan for the environment instance in the corresponding service broker&#39;s catalog.
     * 
     */
    public Output<String> planName() {
        return this.planName;
    }

    /**
     * The name of the service for the environment instance in the corresponding service broker&#39;s catalog.
     * 
     */
    @Import(name="serviceName", required=true)
    private Output<String> serviceName;

    /**
     * @return The name of the service for the environment instance in the corresponding service broker&#39;s catalog.
     * 
     */
    public Output<String> serviceName() {
        return this.serviceName;
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

    @Import(name="timeouts")
    private @Nullable Output<SubaccountEnvironmentInstanceTimeoutsArgs> timeouts;

    public Optional<Output<SubaccountEnvironmentInstanceTimeoutsArgs>> timeouts() {
        return Optional.ofNullable(this.timeouts);
    }

    private SubaccountEnvironmentInstanceArgs() {}

    private SubaccountEnvironmentInstanceArgs(SubaccountEnvironmentInstanceArgs $) {
        this.environmentType = $.environmentType;
        this.landscapeLabel = $.landscapeLabel;
        this.name = $.name;
        this.parameters = $.parameters;
        this.planName = $.planName;
        this.serviceName = $.serviceName;
        this.subaccountId = $.subaccountId;
        this.timeouts = $.timeouts;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SubaccountEnvironmentInstanceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SubaccountEnvironmentInstanceArgs $;

        public Builder() {
            $ = new SubaccountEnvironmentInstanceArgs();
        }

        public Builder(SubaccountEnvironmentInstanceArgs defaults) {
            $ = new SubaccountEnvironmentInstanceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param environmentType The type of the environment instance that is used.
         * 
         * @return builder
         * 
         */
        public Builder environmentType(Output<String> environmentType) {
            $.environmentType = environmentType;
            return this;
        }

        /**
         * @param environmentType The type of the environment instance that is used.
         * 
         * @return builder
         * 
         */
        public Builder environmentType(String environmentType) {
            return environmentType(Output.of(environmentType));
        }

        /**
         * @param landscapeLabel The name of the landscape within the logged in region on which the environment instance is created.
         * 
         * @return builder
         * 
         */
        public Builder landscapeLabel(@Nullable Output<String> landscapeLabel) {
            $.landscapeLabel = landscapeLabel;
            return this;
        }

        /**
         * @param landscapeLabel The name of the landscape within the logged in region on which the environment instance is created.
         * 
         * @return builder
         * 
         */
        public Builder landscapeLabel(String landscapeLabel) {
            return landscapeLabel(Output.of(landscapeLabel));
        }

        /**
         * @param name The name of the environment instance.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the environment instance.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param parameters The configuration parameters for the environment instance.
         * 
         * @return builder
         * 
         */
        public Builder parameters(Output<String> parameters) {
            $.parameters = parameters;
            return this;
        }

        /**
         * @param parameters The configuration parameters for the environment instance.
         * 
         * @return builder
         * 
         */
        public Builder parameters(String parameters) {
            return parameters(Output.of(parameters));
        }

        /**
         * @param planName The name of the service plan for the environment instance in the corresponding service broker&#39;s catalog.
         * 
         * @return builder
         * 
         */
        public Builder planName(Output<String> planName) {
            $.planName = planName;
            return this;
        }

        /**
         * @param planName The name of the service plan for the environment instance in the corresponding service broker&#39;s catalog.
         * 
         * @return builder
         * 
         */
        public Builder planName(String planName) {
            return planName(Output.of(planName));
        }

        /**
         * @param serviceName The name of the service for the environment instance in the corresponding service broker&#39;s catalog.
         * 
         * @return builder
         * 
         */
        public Builder serviceName(Output<String> serviceName) {
            $.serviceName = serviceName;
            return this;
        }

        /**
         * @param serviceName The name of the service for the environment instance in the corresponding service broker&#39;s catalog.
         * 
         * @return builder
         * 
         */
        public Builder serviceName(String serviceName) {
            return serviceName(Output.of(serviceName));
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

        public Builder timeouts(@Nullable Output<SubaccountEnvironmentInstanceTimeoutsArgs> timeouts) {
            $.timeouts = timeouts;
            return this;
        }

        public Builder timeouts(SubaccountEnvironmentInstanceTimeoutsArgs timeouts) {
            return timeouts(Output.of(timeouts));
        }

        public SubaccountEnvironmentInstanceArgs build() {
            $.environmentType = Objects.requireNonNull($.environmentType, "expected parameter 'environmentType' to be non-null");
            $.parameters = Objects.requireNonNull($.parameters, "expected parameter 'parameters' to be non-null");
            $.planName = Objects.requireNonNull($.planName, "expected parameter 'planName' to be non-null");
            $.serviceName = Objects.requireNonNull($.serviceName, "expected parameter 'serviceName' to be non-null");
            $.subaccountId = Objects.requireNonNull($.subaccountId, "expected parameter 'subaccountId' to be non-null");
            return $;
        }
    }

}