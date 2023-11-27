// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.lechnerc77.pulumi.btp.btp.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SubaccountState extends com.pulumi.resources.ResourceArgs {

    public static final SubaccountState Empty = new SubaccountState();

    /**
     * Shows whether the subaccount can use beta services and applications.
     * 
     */
    @Import(name="betaEnabled")
    private @Nullable Output<Boolean> betaEnabled;

    /**
     * @return Shows whether the subaccount can use beta services and applications.
     * 
     */
    public Optional<Output<Boolean>> betaEnabled() {
        return Optional.ofNullable(this.betaEnabled);
    }

    /**
     * The details of the user that created the subaccount.
     * 
     */
    @Import(name="createdBy")
    private @Nullable Output<String> createdBy;

    /**
     * @return The details of the user that created the subaccount.
     * 
     */
    public Optional<Output<String>> createdBy() {
        return Optional.ofNullable(this.createdBy);
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
     * A description of the subaccount for customer-facing UIs.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return A description of the subaccount for customer-facing UIs.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The set of words or phrases assigned to the subaccount.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,List<String>>> labels;

    /**
     * @return The set of words or phrases assigned to the subaccount.
     * 
     */
    public Optional<Output<Map<String,List<String>>>> labels() {
        return Optional.ofNullable(this.labels);
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
     * A descriptive name of the subaccount for customer-facing UIs.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return A descriptive name of the subaccount for customer-facing UIs.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The features of parent entity of the subaccount.
     * 
     */
    @Import(name="parentFeatures")
    private @Nullable Output<List<String>> parentFeatures;

    /**
     * @return The features of parent entity of the subaccount.
     * 
     */
    public Optional<Output<List<String>>> parentFeatures() {
        return Optional.ofNullable(this.parentFeatures);
    }

    /**
     * The ID of the subaccount’s parent entity. If the subaccount is located directly in the global account (not in a directory), then this is the ID of the global account.
     * 
     */
    @Import(name="parentId")
    private @Nullable Output<String> parentId;

    /**
     * @return The ID of the subaccount’s parent entity. If the subaccount is located directly in the global account (not in a directory), then this is the ID of the global account.
     * 
     */
    public Optional<Output<String>> parentId() {
        return Optional.ofNullable(this.parentId);
    }

    /**
     * The region in which the subaccount was created.
     * 
     */
    @Import(name="region")
    private @Nullable Output<String> region;

    /**
     * @return The region in which the subaccount was created.
     * 
     */
    public Optional<Output<String>> region() {
        return Optional.ofNullable(this.region);
    }

    /**
     * The current state of the subaccount. Possible values are: | state | description | | --- | --- | | `OK` | The CRUD
     * operation or series of operations completed successfully. | | `STARTED` | CRUD operation on the subaccount has started.
     * | | `CANCELED` | The operation or processing was canceled by the operator. | | `PROCESSING` | A series of operations
     * related to the subaccount are in progress. | | `PROCESSING_FAILED` | The processing operations failed. | | `CREATING` |
     * Creating the subaccount is in progress. | | `CREATION_FAILED` | The creation operation failed, and the subaccount was
     * not created or was created but cannot be used. | | `UPDATING` | Updating the subaccount is in progress. | |
     * `UPDATE_FAILED` | The update operation failed, and the subaccount was not updated. | | `UPDATE_DIRECTORY_TYPE_FAILED` |
     * The update of the directory type failed. | | `UPDATE_ACCOUNT_TYPE_FAILED` | The update of the account type failed. | |
     * `DELETING` | Deleting the subaccount is in progress. | | `DELETION_FAILED` | The deletion of the subaccount failed, and
     * the subaccount was not deleted. | | `MOVING` | Moving the subaccount is in progress. | | `MOVE_FAILED` | The moving of
     * the subaccount failed. | | `MOVING_TO_OTHER_GA` | Moving the subaccount to another global account is in progress. | |
     * `MOVE_TO_OTHER_GA_FAILED` | Moving the subaccount to another global account failed. | | `PENDING_REVIEW` | The
     * processing operation has been stopped for reviewing and can be restarted by the operator. | | `MIGRATING` | Migrating
     * the subaccount from Neo to Cloud Foundry. | | `MIGRATED` | The migration of the subaccount completed. | |
     * `MIGRATION_FAILED` | The migration of the subaccount failed and the subaccount was not migrated. | |
     * `ROLLBACK_MIGRATION_PROCESSING` | The migration of the subaccount was rolled back and the subaccount is not migrated. |
     * | `SUSPENSION_FAILED` | The suspension operations failed. |
     * 
     */
    @Import(name="state")
    private @Nullable Output<String> state;

    /**
     * @return The current state of the subaccount. Possible values are: | state | description | | --- | --- | | `OK` | The CRUD
     * operation or series of operations completed successfully. | | `STARTED` | CRUD operation on the subaccount has started.
     * | | `CANCELED` | The operation or processing was canceled by the operator. | | `PROCESSING` | A series of operations
     * related to the subaccount are in progress. | | `PROCESSING_FAILED` | The processing operations failed. | | `CREATING` |
     * Creating the subaccount is in progress. | | `CREATION_FAILED` | The creation operation failed, and the subaccount was
     * not created or was created but cannot be used. | | `UPDATING` | Updating the subaccount is in progress. | |
     * `UPDATE_FAILED` | The update operation failed, and the subaccount was not updated. | | `UPDATE_DIRECTORY_TYPE_FAILED` |
     * The update of the directory type failed. | | `UPDATE_ACCOUNT_TYPE_FAILED` | The update of the account type failed. | |
     * `DELETING` | Deleting the subaccount is in progress. | | `DELETION_FAILED` | The deletion of the subaccount failed, and
     * the subaccount was not deleted. | | `MOVING` | Moving the subaccount is in progress. | | `MOVE_FAILED` | The moving of
     * the subaccount failed. | | `MOVING_TO_OTHER_GA` | Moving the subaccount to another global account is in progress. | |
     * `MOVE_TO_OTHER_GA_FAILED` | Moving the subaccount to another global account failed. | | `PENDING_REVIEW` | The
     * processing operation has been stopped for reviewing and can be restarted by the operator. | | `MIGRATING` | Migrating
     * the subaccount from Neo to Cloud Foundry. | | `MIGRATED` | The migration of the subaccount completed. | |
     * `MIGRATION_FAILED` | The migration of the subaccount failed and the subaccount was not migrated. | |
     * `ROLLBACK_MIGRATION_PROCESSING` | The migration of the subaccount was rolled back and the subaccount is not migrated. |
     * | `SUSPENSION_FAILED` | The suspension operations failed. |
     * 
     */
    public Optional<Output<String>> state() {
        return Optional.ofNullable(this.state);
    }

    /**
     * The subdomain that becomes part of the path used to access the authorization tenant of the subaccount. Must be unique within the defined region and cannot be changed after the subaccount has been created.
     * 
     */
    @Import(name="subdomain")
    private @Nullable Output<String> subdomain;

    /**
     * @return The subdomain that becomes part of the path used to access the authorization tenant of the subaccount. Must be unique within the defined region and cannot be changed after the subaccount has been created.
     * 
     */
    public Optional<Output<String>> subdomain() {
        return Optional.ofNullable(this.subdomain);
    }

    /**
     * Shows whether the subaccount is used for production purposes. This flag can help your cloud operator to take appropriate action when handling incidents that are related to mission-critical accounts in production systems. Do not apply for subaccounts that are used for nonproduction purposes, such as development, testing, and demos. Applying this setting this does not modify the subaccount. Possible values are:
     * 
     */
    @Import(name="usage")
    private @Nullable Output<String> usage;

    /**
     * @return Shows whether the subaccount is used for production purposes. This flag can help your cloud operator to take appropriate action when handling incidents that are related to mission-critical accounts in production systems. Do not apply for subaccounts that are used for nonproduction purposes, such as development, testing, and demos. Applying this setting this does not modify the subaccount. Possible values are:
     * 
     */
    public Optional<Output<String>> usage() {
        return Optional.ofNullable(this.usage);
    }

    private SubaccountState() {}

    private SubaccountState(SubaccountState $) {
        this.betaEnabled = $.betaEnabled;
        this.createdBy = $.createdBy;
        this.createdDate = $.createdDate;
        this.description = $.description;
        this.labels = $.labels;
        this.lastModified = $.lastModified;
        this.name = $.name;
        this.parentFeatures = $.parentFeatures;
        this.parentId = $.parentId;
        this.region = $.region;
        this.state = $.state;
        this.subdomain = $.subdomain;
        this.usage = $.usage;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SubaccountState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SubaccountState $;

        public Builder() {
            $ = new SubaccountState();
        }

        public Builder(SubaccountState defaults) {
            $ = new SubaccountState(Objects.requireNonNull(defaults));
        }

        /**
         * @param betaEnabled Shows whether the subaccount can use beta services and applications.
         * 
         * @return builder
         * 
         */
        public Builder betaEnabled(@Nullable Output<Boolean> betaEnabled) {
            $.betaEnabled = betaEnabled;
            return this;
        }

        /**
         * @param betaEnabled Shows whether the subaccount can use beta services and applications.
         * 
         * @return builder
         * 
         */
        public Builder betaEnabled(Boolean betaEnabled) {
            return betaEnabled(Output.of(betaEnabled));
        }

        /**
         * @param createdBy The details of the user that created the subaccount.
         * 
         * @return builder
         * 
         */
        public Builder createdBy(@Nullable Output<String> createdBy) {
            $.createdBy = createdBy;
            return this;
        }

        /**
         * @param createdBy The details of the user that created the subaccount.
         * 
         * @return builder
         * 
         */
        public Builder createdBy(String createdBy) {
            return createdBy(Output.of(createdBy));
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
         * @param description A description of the subaccount for customer-facing UIs.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description A description of the subaccount for customer-facing UIs.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param labels The set of words or phrases assigned to the subaccount.
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<Map<String,List<String>>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels The set of words or phrases assigned to the subaccount.
         * 
         * @return builder
         * 
         */
        public Builder labels(Map<String,List<String>> labels) {
            return labels(Output.of(labels));
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
         * @param name A descriptive name of the subaccount for customer-facing UIs.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name A descriptive name of the subaccount for customer-facing UIs.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param parentFeatures The features of parent entity of the subaccount.
         * 
         * @return builder
         * 
         */
        public Builder parentFeatures(@Nullable Output<List<String>> parentFeatures) {
            $.parentFeatures = parentFeatures;
            return this;
        }

        /**
         * @param parentFeatures The features of parent entity of the subaccount.
         * 
         * @return builder
         * 
         */
        public Builder parentFeatures(List<String> parentFeatures) {
            return parentFeatures(Output.of(parentFeatures));
        }

        /**
         * @param parentFeatures The features of parent entity of the subaccount.
         * 
         * @return builder
         * 
         */
        public Builder parentFeatures(String... parentFeatures) {
            return parentFeatures(List.of(parentFeatures));
        }

        /**
         * @param parentId The ID of the subaccount’s parent entity. If the subaccount is located directly in the global account (not in a directory), then this is the ID of the global account.
         * 
         * @return builder
         * 
         */
        public Builder parentId(@Nullable Output<String> parentId) {
            $.parentId = parentId;
            return this;
        }

        /**
         * @param parentId The ID of the subaccount’s parent entity. If the subaccount is located directly in the global account (not in a directory), then this is the ID of the global account.
         * 
         * @return builder
         * 
         */
        public Builder parentId(String parentId) {
            return parentId(Output.of(parentId));
        }

        /**
         * @param region The region in which the subaccount was created.
         * 
         * @return builder
         * 
         */
        public Builder region(@Nullable Output<String> region) {
            $.region = region;
            return this;
        }

        /**
         * @param region The region in which the subaccount was created.
         * 
         * @return builder
         * 
         */
        public Builder region(String region) {
            return region(Output.of(region));
        }

        /**
         * @param state The current state of the subaccount. Possible values are: | state | description | | --- | --- | | `OK` | The CRUD
         * operation or series of operations completed successfully. | | `STARTED` | CRUD operation on the subaccount has started.
         * | | `CANCELED` | The operation or processing was canceled by the operator. | | `PROCESSING` | A series of operations
         * related to the subaccount are in progress. | | `PROCESSING_FAILED` | The processing operations failed. | | `CREATING` |
         * Creating the subaccount is in progress. | | `CREATION_FAILED` | The creation operation failed, and the subaccount was
         * not created or was created but cannot be used. | | `UPDATING` | Updating the subaccount is in progress. | |
         * `UPDATE_FAILED` | The update operation failed, and the subaccount was not updated. | | `UPDATE_DIRECTORY_TYPE_FAILED` |
         * The update of the directory type failed. | | `UPDATE_ACCOUNT_TYPE_FAILED` | The update of the account type failed. | |
         * `DELETING` | Deleting the subaccount is in progress. | | `DELETION_FAILED` | The deletion of the subaccount failed, and
         * the subaccount was not deleted. | | `MOVING` | Moving the subaccount is in progress. | | `MOVE_FAILED` | The moving of
         * the subaccount failed. | | `MOVING_TO_OTHER_GA` | Moving the subaccount to another global account is in progress. | |
         * `MOVE_TO_OTHER_GA_FAILED` | Moving the subaccount to another global account failed. | | `PENDING_REVIEW` | The
         * processing operation has been stopped for reviewing and can be restarted by the operator. | | `MIGRATING` | Migrating
         * the subaccount from Neo to Cloud Foundry. | | `MIGRATED` | The migration of the subaccount completed. | |
         * `MIGRATION_FAILED` | The migration of the subaccount failed and the subaccount was not migrated. | |
         * `ROLLBACK_MIGRATION_PROCESSING` | The migration of the subaccount was rolled back and the subaccount is not migrated. |
         * | `SUSPENSION_FAILED` | The suspension operations failed. |
         * 
         * @return builder
         * 
         */
        public Builder state(@Nullable Output<String> state) {
            $.state = state;
            return this;
        }

        /**
         * @param state The current state of the subaccount. Possible values are: | state | description | | --- | --- | | `OK` | The CRUD
         * operation or series of operations completed successfully. | | `STARTED` | CRUD operation on the subaccount has started.
         * | | `CANCELED` | The operation or processing was canceled by the operator. | | `PROCESSING` | A series of operations
         * related to the subaccount are in progress. | | `PROCESSING_FAILED` | The processing operations failed. | | `CREATING` |
         * Creating the subaccount is in progress. | | `CREATION_FAILED` | The creation operation failed, and the subaccount was
         * not created or was created but cannot be used. | | `UPDATING` | Updating the subaccount is in progress. | |
         * `UPDATE_FAILED` | The update operation failed, and the subaccount was not updated. | | `UPDATE_DIRECTORY_TYPE_FAILED` |
         * The update of the directory type failed. | | `UPDATE_ACCOUNT_TYPE_FAILED` | The update of the account type failed. | |
         * `DELETING` | Deleting the subaccount is in progress. | | `DELETION_FAILED` | The deletion of the subaccount failed, and
         * the subaccount was not deleted. | | `MOVING` | Moving the subaccount is in progress. | | `MOVE_FAILED` | The moving of
         * the subaccount failed. | | `MOVING_TO_OTHER_GA` | Moving the subaccount to another global account is in progress. | |
         * `MOVE_TO_OTHER_GA_FAILED` | Moving the subaccount to another global account failed. | | `PENDING_REVIEW` | The
         * processing operation has been stopped for reviewing and can be restarted by the operator. | | `MIGRATING` | Migrating
         * the subaccount from Neo to Cloud Foundry. | | `MIGRATED` | The migration of the subaccount completed. | |
         * `MIGRATION_FAILED` | The migration of the subaccount failed and the subaccount was not migrated. | |
         * `ROLLBACK_MIGRATION_PROCESSING` | The migration of the subaccount was rolled back and the subaccount is not migrated. |
         * | `SUSPENSION_FAILED` | The suspension operations failed. |
         * 
         * @return builder
         * 
         */
        public Builder state(String state) {
            return state(Output.of(state));
        }

        /**
         * @param subdomain The subdomain that becomes part of the path used to access the authorization tenant of the subaccount. Must be unique within the defined region and cannot be changed after the subaccount has been created.
         * 
         * @return builder
         * 
         */
        public Builder subdomain(@Nullable Output<String> subdomain) {
            $.subdomain = subdomain;
            return this;
        }

        /**
         * @param subdomain The subdomain that becomes part of the path used to access the authorization tenant of the subaccount. Must be unique within the defined region and cannot be changed after the subaccount has been created.
         * 
         * @return builder
         * 
         */
        public Builder subdomain(String subdomain) {
            return subdomain(Output.of(subdomain));
        }

        /**
         * @param usage Shows whether the subaccount is used for production purposes. This flag can help your cloud operator to take appropriate action when handling incidents that are related to mission-critical accounts in production systems. Do not apply for subaccounts that are used for nonproduction purposes, such as development, testing, and demos. Applying this setting this does not modify the subaccount. Possible values are:
         * 
         * @return builder
         * 
         */
        public Builder usage(@Nullable Output<String> usage) {
            $.usage = usage;
            return this;
        }

        /**
         * @param usage Shows whether the subaccount is used for production purposes. This flag can help your cloud operator to take appropriate action when handling incidents that are related to mission-critical accounts in production systems. Do not apply for subaccounts that are used for nonproduction purposes, such as development, testing, and demos. Applying this setting this does not modify the subaccount. Possible values are:
         * 
         * @return builder
         * 
         */
        public Builder usage(String usage) {
            return usage(Output.of(usage));
        }

        public SubaccountState build() {
            return $;
        }
    }

}
