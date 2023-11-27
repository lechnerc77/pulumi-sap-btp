// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.lechnerc77.pulumi.btp.btp.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetGlobalaccountTrustConfigurationsValue {
    /**
     * @return The description of the trust configuration.
     * 
     */
    private String description;
    /**
     * @return The tenant&#39;s domain which should be used for user logon.
     * 
     */
    private String domain;
    /**
     * @return The origin of the identity provider.
     * 
     * @deprecated
     * Use the `origin` attribute instead
     * 
     */
    @Deprecated /* Use the `origin` attribute instead */
    private String id;
    /**
     * @return The name of the Identity Authentication tenant the global account is connected to.
     * 
     */
    private String identityProvider;
    /**
     * @return The display name of the trust configuration.
     * 
     */
    private String name;
    /**
     * @return The origin of the identity provider.
     * 
     */
    private String origin;
    /**
     * @return The protocol used to establish trust with the identity provider.
     * 
     */
    private String protocol;
    /**
     * @return Shows whether the trust configuration can be modified.
     * 
     */
    private Boolean readOnly;
    /**
     * @return Shows whether the identity provider is currently &#39;active&#39; or &#39;inactive&#39;.
     * 
     */
    private String status;
    /**
     * @return The trust type.
     * 
     */
    private String type;

    private GetGlobalaccountTrustConfigurationsValue() {}
    /**
     * @return The description of the trust configuration.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return The tenant&#39;s domain which should be used for user logon.
     * 
     */
    public String domain() {
        return this.domain;
    }
    /**
     * @return The origin of the identity provider.
     * 
     * @deprecated
     * Use the `origin` attribute instead
     * 
     */
    @Deprecated /* Use the `origin` attribute instead */
    public String id() {
        return this.id;
    }
    /**
     * @return The name of the Identity Authentication tenant the global account is connected to.
     * 
     */
    public String identityProvider() {
        return this.identityProvider;
    }
    /**
     * @return The display name of the trust configuration.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The origin of the identity provider.
     * 
     */
    public String origin() {
        return this.origin;
    }
    /**
     * @return The protocol used to establish trust with the identity provider.
     * 
     */
    public String protocol() {
        return this.protocol;
    }
    /**
     * @return Shows whether the trust configuration can be modified.
     * 
     */
    public Boolean readOnly() {
        return this.readOnly;
    }
    /**
     * @return Shows whether the identity provider is currently &#39;active&#39; or &#39;inactive&#39;.
     * 
     */
    public String status() {
        return this.status;
    }
    /**
     * @return The trust type.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGlobalaccountTrustConfigurationsValue defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String description;
        private String domain;
        private String id;
        private String identityProvider;
        private String name;
        private String origin;
        private String protocol;
        private Boolean readOnly;
        private String status;
        private String type;
        public Builder() {}
        public Builder(GetGlobalaccountTrustConfigurationsValue defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.domain = defaults.domain;
    	      this.id = defaults.id;
    	      this.identityProvider = defaults.identityProvider;
    	      this.name = defaults.name;
    	      this.origin = defaults.origin;
    	      this.protocol = defaults.protocol;
    	      this.readOnly = defaults.readOnly;
    	      this.status = defaults.status;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        @CustomType.Setter
        public Builder domain(String domain) {
            this.domain = Objects.requireNonNull(domain);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder identityProvider(String identityProvider) {
            this.identityProvider = Objects.requireNonNull(identityProvider);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder origin(String origin) {
            this.origin = Objects.requireNonNull(origin);
            return this;
        }
        @CustomType.Setter
        public Builder protocol(String protocol) {
            this.protocol = Objects.requireNonNull(protocol);
            return this;
        }
        @CustomType.Setter
        public Builder readOnly(Boolean readOnly) {
            this.readOnly = Objects.requireNonNull(readOnly);
            return this;
        }
        @CustomType.Setter
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetGlobalaccountTrustConfigurationsValue build() {
            final var _resultValue = new GetGlobalaccountTrustConfigurationsValue();
            _resultValue.description = description;
            _resultValue.domain = domain;
            _resultValue.id = id;
            _resultValue.identityProvider = identityProvider;
            _resultValue.name = name;
            _resultValue.origin = origin;
            _resultValue.protocol = protocol;
            _resultValue.readOnly = readOnly;
            _resultValue.status = status;
            _resultValue.type = type;
            return _resultValue;
        }
    }
}