// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.lechnerc77.pulumi.btp.btp.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetSubaccountAppOauth2Configuration {
    private List<String> allowedproviders;
    private Boolean autoapprove;
    private List<String> grantTypes;
    private List<String> redirectUris;
    private Integer refreshTokenValidity;
    private List<String> systemAttributes;
    private Integer tokenValidity;

    private GetSubaccountAppOauth2Configuration() {}
    public List<String> allowedproviders() {
        return this.allowedproviders;
    }
    public Boolean autoapprove() {
        return this.autoapprove;
    }
    public List<String> grantTypes() {
        return this.grantTypes;
    }
    public List<String> redirectUris() {
        return this.redirectUris;
    }
    public Integer refreshTokenValidity() {
        return this.refreshTokenValidity;
    }
    public List<String> systemAttributes() {
        return this.systemAttributes;
    }
    public Integer tokenValidity() {
        return this.tokenValidity;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSubaccountAppOauth2Configuration defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<String> allowedproviders;
        private Boolean autoapprove;
        private List<String> grantTypes;
        private List<String> redirectUris;
        private Integer refreshTokenValidity;
        private List<String> systemAttributes;
        private Integer tokenValidity;
        public Builder() {}
        public Builder(GetSubaccountAppOauth2Configuration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedproviders = defaults.allowedproviders;
    	      this.autoapprove = defaults.autoapprove;
    	      this.grantTypes = defaults.grantTypes;
    	      this.redirectUris = defaults.redirectUris;
    	      this.refreshTokenValidity = defaults.refreshTokenValidity;
    	      this.systemAttributes = defaults.systemAttributes;
    	      this.tokenValidity = defaults.tokenValidity;
        }

        @CustomType.Setter
        public Builder allowedproviders(List<String> allowedproviders) {
            this.allowedproviders = Objects.requireNonNull(allowedproviders);
            return this;
        }
        public Builder allowedproviders(String... allowedproviders) {
            return allowedproviders(List.of(allowedproviders));
        }
        @CustomType.Setter
        public Builder autoapprove(Boolean autoapprove) {
            this.autoapprove = Objects.requireNonNull(autoapprove);
            return this;
        }
        @CustomType.Setter
        public Builder grantTypes(List<String> grantTypes) {
            this.grantTypes = Objects.requireNonNull(grantTypes);
            return this;
        }
        public Builder grantTypes(String... grantTypes) {
            return grantTypes(List.of(grantTypes));
        }
        @CustomType.Setter
        public Builder redirectUris(List<String> redirectUris) {
            this.redirectUris = Objects.requireNonNull(redirectUris);
            return this;
        }
        public Builder redirectUris(String... redirectUris) {
            return redirectUris(List.of(redirectUris));
        }
        @CustomType.Setter
        public Builder refreshTokenValidity(Integer refreshTokenValidity) {
            this.refreshTokenValidity = Objects.requireNonNull(refreshTokenValidity);
            return this;
        }
        @CustomType.Setter
        public Builder systemAttributes(List<String> systemAttributes) {
            this.systemAttributes = Objects.requireNonNull(systemAttributes);
            return this;
        }
        public Builder systemAttributes(String... systemAttributes) {
            return systemAttributes(List.of(systemAttributes));
        }
        @CustomType.Setter
        public Builder tokenValidity(Integer tokenValidity) {
            this.tokenValidity = Objects.requireNonNull(tokenValidity);
            return this;
        }
        public GetSubaccountAppOauth2Configuration build() {
            final var _resultValue = new GetSubaccountAppOauth2Configuration();
            _resultValue.allowedproviders = allowedproviders;
            _resultValue.autoapprove = autoapprove;
            _resultValue.grantTypes = grantTypes;
            _resultValue.redirectUris = redirectUris;
            _resultValue.refreshTokenValidity = refreshTokenValidity;
            _resultValue.systemAttributes = systemAttributes;
            _resultValue.tokenValidity = tokenValidity;
            return _resultValue;
        }
    }
}
