// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.lechnerc77.pulumi.btp.btp.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SubaccountEntitlementState extends com.pulumi.resources.ResourceArgs {

    public static final SubaccountEntitlementState Empty = new SubaccountEntitlementState();

    /**
     * The quota assigned to the subaccount.
     * 
     */
    @Import(name="amount")
    private @Nullable Output<Integer> amount;

    /**
     * @return The quota assigned to the subaccount.
     * 
     */
    public Optional<Output<Integer>> amount() {
        return Optional.ofNullable(this.amount);
    }

    /**
     * The current state of the entitlement. Possible values are:
     * 
     */
    @Import(name="category")
    private @Nullable Output<String> category;

    /**
     * @return The current state of the entitlement. Possible values are:
     * 
     */
    public Optional<Output<String>> category() {
        return Optional.ofNullable(this.category);
    }

    /**
     * The date and time when the resource was created in [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) format.
     * 
     */
    @Import(name="createdDate")
    private @Nullable Output<String> createdDate;

    /**
     * @return The date and time when the resource was created in [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) format.
     * 
     */
    public Optional<Output<String>> createdDate() {
        return Optional.ofNullable(this.createdDate);
    }

    /**
     * The date and time when the resource was last modified in [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) format.
     * 
     */
    @Import(name="lastModified")
    private @Nullable Output<String> lastModified;

    /**
     * @return The date and time when the resource was last modified in [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) format.
     * 
     */
    public Optional<Output<String>> lastModified() {
        return Optional.ofNullable(this.lastModified);
    }

    /**
     * The ID of the entitled service plan.
     * 
     */
    @Import(name="planId")
    private @Nullable Output<String> planId;

    /**
     * @return The ID of the entitled service plan.
     * 
     */
    public Optional<Output<String>> planId() {
        return Optional.ofNullable(this.planId);
    }

    /**
     * The name of the entitled service plan.
     * 
     */
    @Import(name="planName")
    private @Nullable Output<String> planName;

    /**
     * @return The name of the entitled service plan.
     * 
     */
    public Optional<Output<String>> planName() {
        return Optional.ofNullable(this.planName);
    }

    /**
     * The name of the entitled service.
     * 
     */
    @Import(name="serviceName")
    private @Nullable Output<String> serviceName;

    /**
     * @return The name of the entitled service.
     * 
     */
    public Optional<Output<String>> serviceName() {
        return Optional.ofNullable(this.serviceName);
    }

    /**
     * The current state of the entitlement. Possible values are: | state | description | | --- | --- | | `OK` | The CRUD
     * operation or series of operations completed successfully. | | `STARTED` | The processing operation started | |
     * `PROCESSING` | The processing operation is in progress | | `PROCESSING_FAILED` | The processing operation failed |
     * 
     */
    @Import(name="state")
    private @Nullable Output<String> state;

    /**
     * @return The current state of the entitlement. Possible values are: | state | description | | --- | --- | | `OK` | The CRUD
     * operation or series of operations completed successfully. | | `STARTED` | The processing operation started | |
     * `PROCESSING` | The processing operation is in progress | | `PROCESSING_FAILED` | The processing operation failed |
     * 
     */
    public Optional<Output<String>> state() {
        return Optional.ofNullable(this.state);
    }

    /**
     * The ID of the subaccount.
     * 
     */
    @Import(name="subaccountId")
    private @Nullable Output<String> subaccountId;

    /**
     * @return The ID of the subaccount.
     * 
     */
    public Optional<Output<String>> subaccountId() {
        return Optional.ofNullable(this.subaccountId);
    }

    private SubaccountEntitlementState() {}

    private SubaccountEntitlementState(SubaccountEntitlementState $) {
        this.amount = $.amount;
        this.category = $.category;
        this.createdDate = $.createdDate;
        this.lastModified = $.lastModified;
        this.planId = $.planId;
        this.planName = $.planName;
        this.serviceName = $.serviceName;
        this.state = $.state;
        this.subaccountId = $.subaccountId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SubaccountEntitlementState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SubaccountEntitlementState $;

        public Builder() {
            $ = new SubaccountEntitlementState();
        }

        public Builder(SubaccountEntitlementState defaults) {
            $ = new SubaccountEntitlementState(Objects.requireNonNull(defaults));
        }

        /**
         * @param amount The quota assigned to the subaccount.
         * 
         * @return builder
         * 
         */
        public Builder amount(@Nullable Output<Integer> amount) {
            $.amount = amount;
            return this;
        }

        /**
         * @param amount The quota assigned to the subaccount.
         * 
         * @return builder
         * 
         */
        public Builder amount(Integer amount) {
            return amount(Output.of(amount));
        }

        /**
         * @param category The current state of the entitlement. Possible values are:
         * 
         * @return builder
         * 
         */
        public Builder category(@Nullable Output<String> category) {
            $.category = category;
            return this;
        }

        /**
         * @param category The current state of the entitlement. Possible values are:
         * 
         * @return builder
         * 
         */
        public Builder category(String category) {
            return category(Output.of(category));
        }

        /**
         * @param createdDate The date and time when the resource was created in [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) format.
         * 
         * @return builder
         * 
         */
        public Builder createdDate(@Nullable Output<String> createdDate) {
            $.createdDate = createdDate;
            return this;
        }

        /**
         * @param createdDate The date and time when the resource was created in [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) format.
         * 
         * @return builder
         * 
         */
        public Builder createdDate(String createdDate) {
            return createdDate(Output.of(createdDate));
        }

        /**
         * @param lastModified The date and time when the resource was last modified in [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) format.
         * 
         * @return builder
         * 
         */
        public Builder lastModified(@Nullable Output<String> lastModified) {
            $.lastModified = lastModified;
            return this;
        }

        /**
         * @param lastModified The date and time when the resource was last modified in [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) format.
         * 
         * @return builder
         * 
         */
        public Builder lastModified(String lastModified) {
            return lastModified(Output.of(lastModified));
        }

        /**
         * @param planId The ID of the entitled service plan.
         * 
         * @return builder
         * 
         */
        public Builder planId(@Nullable Output<String> planId) {
            $.planId = planId;
            return this;
        }

        /**
         * @param planId The ID of the entitled service plan.
         * 
         * @return builder
         * 
         */
        public Builder planId(String planId) {
            return planId(Output.of(planId));
        }

        /**
         * @param planName The name of the entitled service plan.
         * 
         * @return builder
         * 
         */
        public Builder planName(@Nullable Output<String> planName) {
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
        public Builder serviceName(@Nullable Output<String> serviceName) {
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

        /**
         * @param state The current state of the entitlement. Possible values are: | state | description | | --- | --- | | `OK` | The CRUD
         * operation or series of operations completed successfully. | | `STARTED` | The processing operation started | |
         * `PROCESSING` | The processing operation is in progress | | `PROCESSING_FAILED` | The processing operation failed |
         * 
         * @return builder
         * 
         */
        public Builder state(@Nullable Output<String> state) {
            $.state = state;
            return this;
        }

        /**
         * @param state The current state of the entitlement. Possible values are: | state | description | | --- | --- | | `OK` | The CRUD
         * operation or series of operations completed successfully. | | `STARTED` | The processing operation started | |
         * `PROCESSING` | The processing operation is in progress | | `PROCESSING_FAILED` | The processing operation failed |
         * 
         * @return builder
         * 
         */
        public Builder state(String state) {
            return state(Output.of(state));
        }

        /**
         * @param subaccountId The ID of the subaccount.
         * 
         * @return builder
         * 
         */
        public Builder subaccountId(@Nullable Output<String> subaccountId) {
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

        public SubaccountEntitlementState build() {
            return $;
        }
    }

}
