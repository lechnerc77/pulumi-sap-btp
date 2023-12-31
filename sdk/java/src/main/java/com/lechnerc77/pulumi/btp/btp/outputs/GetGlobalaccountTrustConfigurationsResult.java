// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.lechnerc77.pulumi.btp.btp.outputs;

import com.lechnerc77.pulumi.btp.btp.outputs.GetGlobalaccountTrustConfigurationsValue;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetGlobalaccountTrustConfigurationsResult {
    /**
     * @return The ID of the global account.
     * 
     * @deprecated
     * Use the `btp_globalaccount` datasource instead
     * 
     */
    @Deprecated /* Use the `btp_globalaccount` datasource instead */
    private String id;
    /**
     * @return The trust configurations associated with the global account.
     * 
     */
    private List<GetGlobalaccountTrustConfigurationsValue> values;

    private GetGlobalaccountTrustConfigurationsResult() {}
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
    /**
     * @return The trust configurations associated with the global account.
     * 
     */
    public List<GetGlobalaccountTrustConfigurationsValue> values() {
        return this.values;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGlobalaccountTrustConfigurationsResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private List<GetGlobalaccountTrustConfigurationsValue> values;
        public Builder() {}
        public Builder(GetGlobalaccountTrustConfigurationsResult defaults) {
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
        public Builder values(List<GetGlobalaccountTrustConfigurationsValue> values) {
            this.values = Objects.requireNonNull(values);
            return this;
        }
        public Builder values(GetGlobalaccountTrustConfigurationsValue... values) {
            return values(List.of(values));
        }
        public GetGlobalaccountTrustConfigurationsResult build() {
            final var _resultValue = new GetGlobalaccountTrustConfigurationsResult();
            _resultValue.id = id;
            _resultValue.values = values;
            return _resultValue;
        }
    }
}
