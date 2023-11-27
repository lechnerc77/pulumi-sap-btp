// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.lechnerc77.pulumi.btp.btp;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GlobalaccountResourceProviderArgs extends com.pulumi.resources.ResourceArgs {

    public static final GlobalaccountResourceProviderArgs Empty = new GlobalaccountResourceProviderArgs();

    /**
     * The configuration properties for the resource provider as required by the vendor.
     * 
     */
    @Import(name="configuration", required=true)
    private Output<String> configuration;

    /**
     * @return The configuration properties for the resource provider as required by the vendor.
     * 
     */
    public Output<String> configuration() {
        return this.configuration;
    }

    /**
     * The description of the resource provider.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The description of the resource provider.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The descriptive name of the resource provider.
     * 
     */
    @Import(name="displayName", required=true)
    private Output<String> displayName;

    /**
     * @return The descriptive name of the resource provider.
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
    }

    /**
     * The cloud vendor from which to consume services through your subscribed account. Possible values are:
     * 
     */
    @Import(name="providerType", required=true)
    private Output<String> providerType;

    /**
     * @return The cloud vendor from which to consume services through your subscribed account. Possible values are:
     * 
     */
    public Output<String> providerType() {
        return this.providerType;
    }

    /**
     * The unique technical name of the resource provider.
     * 
     */
    @Import(name="technicalName", required=true)
    private Output<String> technicalName;

    /**
     * @return The unique technical name of the resource provider.
     * 
     */
    public Output<String> technicalName() {
        return this.technicalName;
    }

    private GlobalaccountResourceProviderArgs() {}

    private GlobalaccountResourceProviderArgs(GlobalaccountResourceProviderArgs $) {
        this.configuration = $.configuration;
        this.description = $.description;
        this.displayName = $.displayName;
        this.providerType = $.providerType;
        this.technicalName = $.technicalName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GlobalaccountResourceProviderArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GlobalaccountResourceProviderArgs $;

        public Builder() {
            $ = new GlobalaccountResourceProviderArgs();
        }

        public Builder(GlobalaccountResourceProviderArgs defaults) {
            $ = new GlobalaccountResourceProviderArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param configuration The configuration properties for the resource provider as required by the vendor.
         * 
         * @return builder
         * 
         */
        public Builder configuration(Output<String> configuration) {
            $.configuration = configuration;
            return this;
        }

        /**
         * @param configuration The configuration properties for the resource provider as required by the vendor.
         * 
         * @return builder
         * 
         */
        public Builder configuration(String configuration) {
            return configuration(Output.of(configuration));
        }

        /**
         * @param description The description of the resource provider.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description of the resource provider.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param displayName The descriptive name of the resource provider.
         * 
         * @return builder
         * 
         */
        public Builder displayName(Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName The descriptive name of the resource provider.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param providerType The cloud vendor from which to consume services through your subscribed account. Possible values are:
         * 
         * @return builder
         * 
         */
        public Builder providerType(Output<String> providerType) {
            $.providerType = providerType;
            return this;
        }

        /**
         * @param providerType The cloud vendor from which to consume services through your subscribed account. Possible values are:
         * 
         * @return builder
         * 
         */
        public Builder providerType(String providerType) {
            return providerType(Output.of(providerType));
        }

        /**
         * @param technicalName The unique technical name of the resource provider.
         * 
         * @return builder
         * 
         */
        public Builder technicalName(Output<String> technicalName) {
            $.technicalName = technicalName;
            return this;
        }

        /**
         * @param technicalName The unique technical name of the resource provider.
         * 
         * @return builder
         * 
         */
        public Builder technicalName(String technicalName) {
            return technicalName(Output.of(technicalName));
        }

        public GlobalaccountResourceProviderArgs build() {
            $.configuration = Objects.requireNonNull($.configuration, "expected parameter 'configuration' to be non-null");
            $.displayName = Objects.requireNonNull($.displayName, "expected parameter 'displayName' to be non-null");
            $.providerType = Objects.requireNonNull($.providerType, "expected parameter 'providerType' to be non-null");
            $.technicalName = Objects.requireNonNull($.technicalName, "expected parameter 'technicalName' to be non-null");
            return $;
        }
    }

}