// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.lechnerc77.pulumi.btp.btp;

import com.lechnerc77.pulumi.btp.btp.inputs.SubaccountRoleCollectionRoleArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SubaccountRoleCollectionArgs extends com.pulumi.resources.ResourceArgs {

    public static final SubaccountRoleCollectionArgs Empty = new SubaccountRoleCollectionArgs();

    /**
     * The description of the role collection.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The description of the role collection.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The name of the role collection.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the role collection.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="roles", required=true)
    private Output<List<SubaccountRoleCollectionRoleArgs>> roles;

    public Output<List<SubaccountRoleCollectionRoleArgs>> roles() {
        return this.roles;
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

    private SubaccountRoleCollectionArgs() {}

    private SubaccountRoleCollectionArgs(SubaccountRoleCollectionArgs $) {
        this.description = $.description;
        this.name = $.name;
        this.roles = $.roles;
        this.subaccountId = $.subaccountId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SubaccountRoleCollectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SubaccountRoleCollectionArgs $;

        public Builder() {
            $ = new SubaccountRoleCollectionArgs();
        }

        public Builder(SubaccountRoleCollectionArgs defaults) {
            $ = new SubaccountRoleCollectionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description The description of the role collection.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description of the role collection.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param name The name of the role collection.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the role collection.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder roles(Output<List<SubaccountRoleCollectionRoleArgs>> roles) {
            $.roles = roles;
            return this;
        }

        public Builder roles(List<SubaccountRoleCollectionRoleArgs> roles) {
            return roles(Output.of(roles));
        }

        public Builder roles(SubaccountRoleCollectionRoleArgs... roles) {
            return roles(List.of(roles));
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

        public SubaccountRoleCollectionArgs build() {
            $.roles = Objects.requireNonNull($.roles, "expected parameter 'roles' to be non-null");
            $.subaccountId = Objects.requireNonNull($.subaccountId, "expected parameter 'subaccountId' to be non-null");
            return $;
        }
    }

}
