// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.lechnerc77.pulumi.btp.btp.outputs;

import com.lechnerc77.pulumi.btp.btp.outputs.GetGlobalaccountEntitlementsValues;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetGlobalaccountEntitlementsResult {
    /**
     * @return The ID of the global account.
     * 
     * @deprecated
     * Use the `btp_globalaccount` datasource instead
     * 
     */
    @Deprecated /* Use the `btp_globalaccount` datasource instead */
    private String id;
    private Map<String,GetGlobalaccountEntitlementsValues> values;

    private GetGlobalaccountEntitlementsResult() {}
    /**
     * @return The ID of the global account.
     * 
     * @deprecated
     * Use the `btp_globalaccount` datasource instead
     * 
     */
    @Deprecated /* Use the `btp_globalaccount` datasource instead */
    public String id() {
        return this.id;
    }
    public Map<String,GetGlobalaccountEntitlementsValues> values() {
        return this.values;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGlobalaccountEntitlementsResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private Map<String,GetGlobalaccountEntitlementsValues> values;
        public Builder() {}
        public Builder(GetGlobalaccountEntitlementsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.values = defaults.values;
        }

        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder values(Map<String,GetGlobalaccountEntitlementsValues> values) {
            this.values = Objects.requireNonNull(values);
            return this;
        }
        public GetGlobalaccountEntitlementsResult build() {
            final var _resultValue = new GetGlobalaccountEntitlementsResult();
            _resultValue.id = id;
            _resultValue.values = values;
            return _resultValue;
        }
    }
}