// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.lechnerc77.pulumi.btp.btp;

import com.lechnerc77.pulumi.btp.btp.SubaccountArgs;
import com.lechnerc77.pulumi.btp.btp.Utilities;
import com.lechnerc77.pulumi.btp.btp.inputs.SubaccountState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Creates a subaccount in a global account or directory.
 * 
 * __Tip:__
 * You must be assigned to the global account or directory admin role.
 * 
 * __Further documentation:__
 * &lt;https://help.sap.com/docs/btp/sap-business-technology-platform/account-model&gt;
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * terraform
 * 
 * ```sh
 *  $ pulumi import btp:index/subaccount:Subaccount &lt;resource_name&gt; &lt;subaccount_id&gt;
 * ```
 * 
 * ```sh
 *  $ pulumi import btp:index/subaccount:Subaccount my_project 6aa64c2f-38c1-49a9-b2e8-cf9fea769b7f
 * ```
 * 
 */
@ResourceType(type="btp:index/subaccount:Subaccount")
public class Subaccount extends com.pulumi.resources.CustomResource {
    /**
     * Shows whether the subaccount can use beta services and applications.
     * 
     */
    @Export(name="betaEnabled", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> betaEnabled;

    /**
     * @return Shows whether the subaccount can use beta services and applications.
     * 
     */
    public Output<Boolean> betaEnabled() {
        return this.betaEnabled;
    }
    /**
     * The details of the user that created the subaccount.
     * 
     */
    @Export(name="createdBy", refs={String.class}, tree="[0]")
    private Output<String> createdBy;

    /**
     * @return The details of the user that created the subaccount.
     * 
     */
    public Output<String> createdBy() {
        return this.createdBy;
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
     * A description of the subaccount for customer-facing UIs.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output<String> description;

    /**
     * @return A description of the subaccount for customer-facing UIs.
     * 
     */
    public Output<String> description() {
        return this.description;
    }
    /**
     * The set of words or phrases assigned to the subaccount.
     * 
     */
    @Export(name="labels", refs={Map.class,String.class,List.class}, tree="[0,1,[2,1]]")
    private Output</* @Nullable */ Map<String,List<String>>> labels;

    /**
     * @return The set of words or phrases assigned to the subaccount.
     * 
     */
    public Output<Optional<Map<String,List<String>>>> labels() {
        return Codegen.optional(this.labels);
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
     * A descriptive name of the subaccount for customer-facing UIs.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return A descriptive name of the subaccount for customer-facing UIs.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The features of parent entity of the subaccount.
     * 
     */
    @Export(name="parentFeatures", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> parentFeatures;

    /**
     * @return The features of parent entity of the subaccount.
     * 
     */
    public Output<List<String>> parentFeatures() {
        return this.parentFeatures;
    }
    /**
     * The ID of the subaccount’s parent entity. If the subaccount is located directly in the global account (not in a directory), then this is the ID of the global account.
     * 
     */
    @Export(name="parentId", refs={String.class}, tree="[0]")
    private Output<String> parentId;

    /**
     * @return The ID of the subaccount’s parent entity. If the subaccount is located directly in the global account (not in a directory), then this is the ID of the global account.
     * 
     */
    public Output<String> parentId() {
        return this.parentId;
    }
    /**
     * The region in which the subaccount was created.
     * 
     */
    @Export(name="region", refs={String.class}, tree="[0]")
    private Output<String> region;

    /**
     * @return The region in which the subaccount was created.
     * 
     */
    public Output<String> region() {
        return this.region;
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
    @Export(name="state", refs={String.class}, tree="[0]")
    private Output<String> state;

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
    public Output<String> state() {
        return this.state;
    }
    /**
     * The subdomain that becomes part of the path used to access the authorization tenant of the subaccount. Must be unique within the defined region and cannot be changed after the subaccount has been created.
     * 
     */
    @Export(name="subdomain", refs={String.class}, tree="[0]")
    private Output<String> subdomain;

    /**
     * @return The subdomain that becomes part of the path used to access the authorization tenant of the subaccount. Must be unique within the defined region and cannot be changed after the subaccount has been created.
     * 
     */
    public Output<String> subdomain() {
        return this.subdomain;
    }
    /**
     * Shows whether the subaccount is used for production purposes. This flag can help your cloud operator to take appropriate action when handling incidents that are related to mission-critical accounts in production systems. Do not apply for subaccounts that are used for nonproduction purposes, such as development, testing, and demos. Applying this setting this does not modify the subaccount. Possible values are:
     * 
     */
    @Export(name="usage", refs={String.class}, tree="[0]")
    private Output<String> usage;

    /**
     * @return Shows whether the subaccount is used for production purposes. This flag can help your cloud operator to take appropriate action when handling incidents that are related to mission-critical accounts in production systems. Do not apply for subaccounts that are used for nonproduction purposes, such as development, testing, and demos. Applying this setting this does not modify the subaccount. Possible values are:
     * 
     */
    public Output<String> usage() {
        return this.usage;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Subaccount(String name) {
        this(name, SubaccountArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Subaccount(String name, SubaccountArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Subaccount(String name, SubaccountArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("btp:index/subaccount:Subaccount", name, args == null ? SubaccountArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Subaccount(String name, Output<String> id, @Nullable SubaccountState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("btp:index/subaccount:Subaccount", name, state, makeResourceOptions(options, id));
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
    public static Subaccount get(String name, Output<String> id, @Nullable SubaccountState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Subaccount(name, id, state, options);
    }
}
