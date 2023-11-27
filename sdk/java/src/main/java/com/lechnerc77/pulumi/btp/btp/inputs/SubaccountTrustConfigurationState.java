// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.lechnerc77.pulumi.btp.btp.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SubaccountTrustConfigurationState extends com.pulumi.resources.ResourceArgs {

    public static final SubaccountTrustConfigurationState Empty = new SubaccountTrustConfigurationState();

    /**
     * Determines that any user from the tenant can log in. If not set, only the ones who already have a shadow user can log in.
     * 
     */
    @Import(name="autoCreateShadowUsers")
    private @Nullable Output<Boolean> autoCreateShadowUsers;

    /**
     * @return Determines that any user from the tenant can log in. If not set, only the ones who already have a shadow user can log in.
     * 
     */
    public Optional<Output<Boolean>> autoCreateShadowUsers() {
        return Optional.ofNullable(this.autoCreateShadowUsers);
    }

    /**
     * Determines that end users can choose the trust configuration for login. If not set, the trust configuration can remain active, however only application users that explicitly specify the origin key can use if for login.
     * 
     */
    @Import(name="availableForUserLogon")
    private @Nullable Output<Boolean> availableForUserLogon;

    /**
     * @return Determines that end users can choose the trust configuration for login. If not set, the trust configuration can remain active, however only application users that explicitly specify the origin key can use if for login.
     * 
     */
    public Optional<Output<Boolean>> availableForUserLogon() {
        return Optional.ofNullable(this.availableForUserLogon);
    }

    /**
     * Description of the trust configuration.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Description of the trust configuration.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The tenant&#39;s domain which should be used for user logon.
     * 
     */
    @Import(name="domain")
    private @Nullable Output<String> domain;

    /**
     * @return The tenant&#39;s domain which should be used for user logon.
     * 
     */
    public Optional<Output<String>> domain() {
        return Optional.ofNullable(this.domain);
    }

    /**
     * The name of the Identity Authentication tenant that you want to connect to the subaccount.
     * 
     */
    @Import(name="identityProvider")
    private @Nullable Output<String> identityProvider;

    /**
     * @return The name of the Identity Authentication tenant that you want to connect to the subaccount.
     * 
     */
    public Optional<Output<String>> identityProvider() {
        return Optional.ofNullable(this.identityProvider);
    }

    /**
     * Short string that helps users to identify the link for login.
     * 
     */
    @Import(name="linkText")
    private @Nullable Output<String> linkText;

    /**
     * @return Short string that helps users to identify the link for login.
     * 
     */
    public Optional<Output<String>> linkText() {
        return Optional.ofNullable(this.linkText);
    }

    /**
     * The display name of the trust configuration.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The display name of the trust configuration.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The origin of the identity provider.
     * 
     */
    @Import(name="origin")
    private @Nullable Output<String> origin;

    /**
     * @return The origin of the identity provider.
     * 
     */
    public Optional<Output<String>> origin() {
        return Optional.ofNullable(this.origin);
    }

    /**
     * The protocol used to establish trust with the identity provider.
     * 
     */
    @Import(name="protocol")
    private @Nullable Output<String> protocol;

    /**
     * @return The protocol used to establish trust with the identity provider.
     * 
     */
    public Optional<Output<String>> protocol() {
        return Optional.ofNullable(this.protocol);
    }

    /**
     * Shows whether the trust configuration can be modified.
     * 
     */
    @Import(name="readOnly")
    private @Nullable Output<Boolean> readOnly;

    /**
     * @return Shows whether the trust configuration can be modified.
     * 
     */
    public Optional<Output<Boolean>> readOnly() {
        return Optional.ofNullable(this.readOnly);
    }

    /**
     * Determines whether the identity provider is currently &#39;active&#39; or &#39;inactive&#39;.
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return Determines whether the identity provider is currently &#39;active&#39; or &#39;inactive&#39;.
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
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

    /**
     * The trust type.
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return The trust type.
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    private SubaccountTrustConfigurationState() {}

    private SubaccountTrustConfigurationState(SubaccountTrustConfigurationState $) {
        this.autoCreateShadowUsers = $.autoCreateShadowUsers;
        this.availableForUserLogon = $.availableForUserLogon;
        this.description = $.description;
        this.domain = $.domain;
        this.identityProvider = $.identityProvider;
        this.linkText = $.linkText;
        this.name = $.name;
        this.origin = $.origin;
        this.protocol = $.protocol;
        this.readOnly = $.readOnly;
        this.status = $.status;
        this.subaccountId = $.subaccountId;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SubaccountTrustConfigurationState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SubaccountTrustConfigurationState $;

        public Builder() {
            $ = new SubaccountTrustConfigurationState();
        }

        public Builder(SubaccountTrustConfigurationState defaults) {
            $ = new SubaccountTrustConfigurationState(Objects.requireNonNull(defaults));
        }

        /**
         * @param autoCreateShadowUsers Determines that any user from the tenant can log in. If not set, only the ones who already have a shadow user can log in.
         * 
         * @return builder
         * 
         */
        public Builder autoCreateShadowUsers(@Nullable Output<Boolean> autoCreateShadowUsers) {
            $.autoCreateShadowUsers = autoCreateShadowUsers;
            return this;
        }

        /**
         * @param autoCreateShadowUsers Determines that any user from the tenant can log in. If not set, only the ones who already have a shadow user can log in.
         * 
         * @return builder
         * 
         */
        public Builder autoCreateShadowUsers(Boolean autoCreateShadowUsers) {
            return autoCreateShadowUsers(Output.of(autoCreateShadowUsers));
        }

        /**
         * @param availableForUserLogon Determines that end users can choose the trust configuration for login. If not set, the trust configuration can remain active, however only application users that explicitly specify the origin key can use if for login.
         * 
         * @return builder
         * 
         */
        public Builder availableForUserLogon(@Nullable Output<Boolean> availableForUserLogon) {
            $.availableForUserLogon = availableForUserLogon;
            return this;
        }

        /**
         * @param availableForUserLogon Determines that end users can choose the trust configuration for login. If not set, the trust configuration can remain active, however only application users that explicitly specify the origin key can use if for login.
         * 
         * @return builder
         * 
         */
        public Builder availableForUserLogon(Boolean availableForUserLogon) {
            return availableForUserLogon(Output.of(availableForUserLogon));
        }

        /**
         * @param description Description of the trust configuration.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Description of the trust configuration.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param domain The tenant&#39;s domain which should be used for user logon.
         * 
         * @return builder
         * 
         */
        public Builder domain(@Nullable Output<String> domain) {
            $.domain = domain;
            return this;
        }

        /**
         * @param domain The tenant&#39;s domain which should be used for user logon.
         * 
         * @return builder
         * 
         */
        public Builder domain(String domain) {
            return domain(Output.of(domain));
        }

        /**
         * @param identityProvider The name of the Identity Authentication tenant that you want to connect to the subaccount.
         * 
         * @return builder
         * 
         */
        public Builder identityProvider(@Nullable Output<String> identityProvider) {
            $.identityProvider = identityProvider;
            return this;
        }

        /**
         * @param identityProvider The name of the Identity Authentication tenant that you want to connect to the subaccount.
         * 
         * @return builder
         * 
         */
        public Builder identityProvider(String identityProvider) {
            return identityProvider(Output.of(identityProvider));
        }

        /**
         * @param linkText Short string that helps users to identify the link for login.
         * 
         * @return builder
         * 
         */
        public Builder linkText(@Nullable Output<String> linkText) {
            $.linkText = linkText;
            return this;
        }

        /**
         * @param linkText Short string that helps users to identify the link for login.
         * 
         * @return builder
         * 
         */
        public Builder linkText(String linkText) {
            return linkText(Output.of(linkText));
        }

        /**
         * @param name The display name of the trust configuration.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The display name of the trust configuration.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param origin The origin of the identity provider.
         * 
         * @return builder
         * 
         */
        public Builder origin(@Nullable Output<String> origin) {
            $.origin = origin;
            return this;
        }

        /**
         * @param origin The origin of the identity provider.
         * 
         * @return builder
         * 
         */
        public Builder origin(String origin) {
            return origin(Output.of(origin));
        }

        /**
         * @param protocol The protocol used to establish trust with the identity provider.
         * 
         * @return builder
         * 
         */
        public Builder protocol(@Nullable Output<String> protocol) {
            $.protocol = protocol;
            return this;
        }

        /**
         * @param protocol The protocol used to establish trust with the identity provider.
         * 
         * @return builder
         * 
         */
        public Builder protocol(String protocol) {
            return protocol(Output.of(protocol));
        }

        /**
         * @param readOnly Shows whether the trust configuration can be modified.
         * 
         * @return builder
         * 
         */
        public Builder readOnly(@Nullable Output<Boolean> readOnly) {
            $.readOnly = readOnly;
            return this;
        }

        /**
         * @param readOnly Shows whether the trust configuration can be modified.
         * 
         * @return builder
         * 
         */
        public Builder readOnly(Boolean readOnly) {
            return readOnly(Output.of(readOnly));
        }

        /**
         * @param status Determines whether the identity provider is currently &#39;active&#39; or &#39;inactive&#39;.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status Determines whether the identity provider is currently &#39;active&#39; or &#39;inactive&#39;.
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
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

        /**
         * @param type The trust type.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The trust type.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public SubaccountTrustConfigurationState build() {
            return $;
        }
    }

}