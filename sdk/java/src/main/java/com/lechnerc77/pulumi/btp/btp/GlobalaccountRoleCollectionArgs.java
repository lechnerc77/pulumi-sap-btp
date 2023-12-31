// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.lechnerc77.pulumi.btp.btp;

import com.lechnerc77.pulumi.btp.btp.inputs.GlobalaccountRoleCollectionRoleArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GlobalaccountRoleCollectionArgs extends com.pulumi.resources.ResourceArgs {

    public static final GlobalaccountRoleCollectionArgs Empty = new GlobalaccountRoleCollectionArgs();

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
    private Output<List<GlobalaccountRoleCollectionRoleArgs>> roles;

    public Output<List<GlobalaccountRoleCollectionRoleArgs>> roles() {
        return this.roles;
    }

    private GlobalaccountRoleCollectionArgs() {}

    private GlobalaccountRoleCollectionArgs(GlobalaccountRoleCollectionArgs $) {
        this.description = $.description;
        this.name = $.name;
        this.roles = $.roles;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GlobalaccountRoleCollectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GlobalaccountRoleCollectionArgs $;

        public Builder() {
            $ = new GlobalaccountRoleCollectionArgs();
        }

        public Builder(GlobalaccountRoleCollectionArgs defaults) {
            $ = new GlobalaccountRoleCollectionArgs(Objects.requireNonNull(defaults));
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

        public Builder roles(Output<List<GlobalaccountRoleCollectionRoleArgs>> roles) {
            $.roles = roles;
            return this;
        }

        public Builder roles(List<GlobalaccountRoleCollectionRoleArgs> roles) {
            return roles(Output.of(roles));
        }

        public Builder roles(GlobalaccountRoleCollectionRoleArgs... roles) {
            return roles(List.of(roles));
        }

        public GlobalaccountRoleCollectionArgs build() {
            $.roles = Objects.requireNonNull($.roles, "expected parameter 'roles' to be non-null");
            return $;
        }
    }

}
