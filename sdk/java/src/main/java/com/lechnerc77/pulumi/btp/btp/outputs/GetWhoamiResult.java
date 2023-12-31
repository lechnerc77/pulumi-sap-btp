// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.lechnerc77.pulumi.btp.btp.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetWhoamiResult {
    /**
     * @return The e-mail address of the logged-in user.
     * 
     */
    private String email;
    /**
     * @return The ID of the logged-in user.
     * 
     */
    private String id;
    /**
     * @return The name of the token issuer.
     * 
     */
    private String issuer;

    private GetWhoamiResult() {}
    /**
     * @return The e-mail address of the logged-in user.
     * 
     */
    public String email() {
        return this.email;
    }
    /**
     * @return The ID of the logged-in user.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The name of the token issuer.
     * 
     */
    public String issuer() {
        return this.issuer;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWhoamiResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String email;
        private String id;
        private String issuer;
        public Builder() {}
        public Builder(GetWhoamiResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.email = defaults.email;
    	      this.id = defaults.id;
    	      this.issuer = defaults.issuer;
        }

        @CustomType.Setter
        public Builder email(String email) {
            this.email = Objects.requireNonNull(email);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder issuer(String issuer) {
            this.issuer = Objects.requireNonNull(issuer);
            return this;
        }
        public GetWhoamiResult build() {
            final var _resultValue = new GetWhoamiResult();
            _resultValue.email = email;
            _resultValue.id = id;
            _resultValue.issuer = issuer;
            return _resultValue;
        }
    }
}
