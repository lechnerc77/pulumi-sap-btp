// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.lechnerc77.pulumi.btp.btp;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DirectoryEntitlementArgs extends com.pulumi.resources.ResourceArgs {

    public static final DirectoryEntitlementArgs Empty = new DirectoryEntitlementArgs();

    /**
     * The quota assigned to the directory.
     * 
     */
    @Import(name="amount")
    private @Nullable Output<Integer> amount;

    /**
     * @return The quota assigned to the directory.
     * 
     */
    public Optional<Output<Integer>> amount() {
        return Optional.ofNullable(this.amount);
    }

    /**
     * Determines whether the plans of entitlements that have a numeric quota with the amount specified in `auto_distribute_amount` are automatically allocated to any new subaccount that is added to the directory in the future. For entitlements without a numeric quota, it shows if the plan are assigned to any new subaccount that is added to the directory in the future (`auto_distribute_amount` is not needed). If the `distribute` parameter is set, the same assignment is also made to all subaccounts currently in the directory. Entitlements are subject to available quota in the directory.
     * 
     */
    @Import(name="autoAssign")
    private @Nullable Output<Boolean> autoAssign;

    /**
     * @return Determines whether the plans of entitlements that have a numeric quota with the amount specified in `auto_distribute_amount` are automatically allocated to any new subaccount that is added to the directory in the future. For entitlements without a numeric quota, it shows if the plan are assigned to any new subaccount that is added to the directory in the future (`auto_distribute_amount` is not needed). If the `distribute` parameter is set, the same assignment is also made to all subaccounts currently in the directory. Entitlements are subject to available quota in the directory.
     * 
     */
    public Optional<Output<Boolean>> autoAssign() {
        return Optional.ofNullable(this.autoAssign);
    }

    /**
     * The quota of the specified plan automatically allocated to any new subaccount that is created in the future in the directory. When applying this option, `auto_assign` and/or `distribute` must also be set. Applies only to entitlements that have a numeric quota.
     * 
     */
    @Import(name="autoDistributeAmount")
    private @Nullable Output<Integer> autoDistributeAmount;

    /**
     * @return The quota of the specified plan automatically allocated to any new subaccount that is created in the future in the directory. When applying this option, `auto_assign` and/or `distribute` must also be set. Applies only to entitlements that have a numeric quota.
     * 
     */
    public Optional<Output<Integer>> autoDistributeAmount() {
        return Optional.ofNullable(this.autoDistributeAmount);
    }

    /**
     * The ID of the directory.
     * 
     */
    @Import(name="directoryId", required=true)
    private Output<String> directoryId;

    /**
     * @return The ID of the directory.
     * 
     */
    public Output<String> directoryId() {
        return this.directoryId;
    }

    /**
     * Defines the assignment of the plan with the quota specified in `auto_distribute_amount` to subaccounts currently located in the specified directory. For entitlements without a numeric quota, the plan is assigned to the subaccounts currently located in the directory (`auto_distribute_amount` is not needed). When applying this option, `auto_assign` must also be set.
     * 
     */
    @Import(name="distribute")
    private @Nullable Output<Boolean> distribute;

    /**
     * @return Defines the assignment of the plan with the quota specified in `auto_distribute_amount` to subaccounts currently located in the specified directory. For entitlements without a numeric quota, the plan is assigned to the subaccounts currently located in the directory (`auto_distribute_amount` is not needed). When applying this option, `auto_assign` must also be set.
     * 
     */
    public Optional<Output<Boolean>> distribute() {
        return Optional.ofNullable(this.distribute);
    }

    /**
     * The name of the entitled service plan.
     * 
     */
    @Import(name="planName", required=true)
    private Output<String> planName;

    /**
     * @return The name of the entitled service plan.
     * 
     */
    public Output<String> planName() {
        return this.planName;
    }

    /**
     * The name of the entitled service.
     * 
     */
    @Import(name="serviceName", required=true)
    private Output<String> serviceName;

    /**
     * @return The name of the entitled service.
     * 
     */
    public Output<String> serviceName() {
        return this.serviceName;
    }

    private DirectoryEntitlementArgs() {}

    private DirectoryEntitlementArgs(DirectoryEntitlementArgs $) {
        this.amount = $.amount;
        this.autoAssign = $.autoAssign;
        this.autoDistributeAmount = $.autoDistributeAmount;
        this.directoryId = $.directoryId;
        this.distribute = $.distribute;
        this.planName = $.planName;
        this.serviceName = $.serviceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DirectoryEntitlementArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DirectoryEntitlementArgs $;

        public Builder() {
            $ = new DirectoryEntitlementArgs();
        }

        public Builder(DirectoryEntitlementArgs defaults) {
            $ = new DirectoryEntitlementArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param amount The quota assigned to the directory.
         * 
         * @return builder
         * 
         */
        public Builder amount(@Nullable Output<Integer> amount) {
            $.amount = amount;
            return this;
        }

        /**
         * @param amount The quota assigned to the directory.
         * 
         * @return builder
         * 
         */
        public Builder amount(Integer amount) {
            return amount(Output.of(amount));
        }

        /**
         * @param autoAssign Determines whether the plans of entitlements that have a numeric quota with the amount specified in `auto_distribute_amount` are automatically allocated to any new subaccount that is added to the directory in the future. For entitlements without a numeric quota, it shows if the plan are assigned to any new subaccount that is added to the directory in the future (`auto_distribute_amount` is not needed). If the `distribute` parameter is set, the same assignment is also made to all subaccounts currently in the directory. Entitlements are subject to available quota in the directory.
         * 
         * @return builder
         * 
         */
        public Builder autoAssign(@Nullable Output<Boolean> autoAssign) {
            $.autoAssign = autoAssign;
            return this;
        }

        /**
         * @param autoAssign Determines whether the plans of entitlements that have a numeric quota with the amount specified in `auto_distribute_amount` are automatically allocated to any new subaccount that is added to the directory in the future. For entitlements without a numeric quota, it shows if the plan are assigned to any new subaccount that is added to the directory in the future (`auto_distribute_amount` is not needed). If the `distribute` parameter is set, the same assignment is also made to all subaccounts currently in the directory. Entitlements are subject to available quota in the directory.
         * 
         * @return builder
         * 
         */
        public Builder autoAssign(Boolean autoAssign) {
            return autoAssign(Output.of(autoAssign));
        }

        /**
         * @param autoDistributeAmount The quota of the specified plan automatically allocated to any new subaccount that is created in the future in the directory. When applying this option, `auto_assign` and/or `distribute` must also be set. Applies only to entitlements that have a numeric quota.
         * 
         * @return builder
         * 
         */
        public Builder autoDistributeAmount(@Nullable Output<Integer> autoDistributeAmount) {
            $.autoDistributeAmount = autoDistributeAmount;
            return this;
        }

        /**
         * @param autoDistributeAmount The quota of the specified plan automatically allocated to any new subaccount that is created in the future in the directory. When applying this option, `auto_assign` and/or `distribute` must also be set. Applies only to entitlements that have a numeric quota.
         * 
         * @return builder
         * 
         */
        public Builder autoDistributeAmount(Integer autoDistributeAmount) {
            return autoDistributeAmount(Output.of(autoDistributeAmount));
        }

        /**
         * @param directoryId The ID of the directory.
         * 
         * @return builder
         * 
         */
        public Builder directoryId(Output<String> directoryId) {
            $.directoryId = directoryId;
            return this;
        }

        /**
         * @param directoryId The ID of the directory.
         * 
         * @return builder
         * 
         */
        public Builder directoryId(String directoryId) {
            return directoryId(Output.of(directoryId));
        }

        /**
         * @param distribute Defines the assignment of the plan with the quota specified in `auto_distribute_amount` to subaccounts currently located in the specified directory. For entitlements without a numeric quota, the plan is assigned to the subaccounts currently located in the directory (`auto_distribute_amount` is not needed). When applying this option, `auto_assign` must also be set.
         * 
         * @return builder
         * 
         */
        public Builder distribute(@Nullable Output<Boolean> distribute) {
            $.distribute = distribute;
            return this;
        }

        /**
         * @param distribute Defines the assignment of the plan with the quota specified in `auto_distribute_amount` to subaccounts currently located in the specified directory. For entitlements without a numeric quota, the plan is assigned to the subaccounts currently located in the directory (`auto_distribute_amount` is not needed). When applying this option, `auto_assign` must also be set.
         * 
         * @return builder
         * 
         */
        public Builder distribute(Boolean distribute) {
            return distribute(Output.of(distribute));
        }

        /**
         * @param planName The name of the entitled service plan.
         * 
         * @return builder
         * 
         */
        public Builder planName(Output<String> planName) {
            $.planName = planName;
            return this;
        }

        /**
         * @param planName The name of the entitled service plan.
         * 
         * @return builder
         * 
         */
        public Builder planName(String planName) {
            return planName(Output.of(planName));
        }

        /**
         * @param serviceName The name of the entitled service.
         * 
         * @return builder
         * 
         */
        public Builder serviceName(Output<String> serviceName) {
            $.serviceName = serviceName;
            return this;
        }

        /**
         * @param serviceName The name of the entitled service.
         * 
         * @return builder
         * 
         */
        public Builder serviceName(String serviceName) {
            return serviceName(Output.of(serviceName));
        }

        public DirectoryEntitlementArgs build() {
            $.directoryId = Objects.requireNonNull($.directoryId, "expected parameter 'directoryId' to be non-null");
            $.planName = Objects.requireNonNull($.planName, "expected parameter 'planName' to be non-null");
            $.serviceName = Objects.requireNonNull($.serviceName, "expected parameter 'serviceName' to be non-null");
            return $;
        }
    }

}
