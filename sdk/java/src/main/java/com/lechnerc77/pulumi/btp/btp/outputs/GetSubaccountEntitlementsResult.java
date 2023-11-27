// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.lechnerc77.pulumi.btp.btp.outputs;

import com.lechnerc77.pulumi.btp.btp.outputs.GetSubaccountEntitlementsValues;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetSubaccountEntitlementsResult {
    /**
     * @return The ID of the subaccount.
     * 
     * @deprecated
     * Use the `subaccount_id` attribute instead
     * 
     */
    @Deprecated /* Use the `subaccount_id` attribute instead */
    private String id;
    /**
     * @return The ID of the subaccount.
     * 
     */
    private String subaccountId;
    private Map<String,GetSubaccountEntitlementsValues> values;

    private GetSubaccountEntitlementsResult() {}
    /**
     * @return The ID of the subaccount.
     * 
     * @deprecated
     * Use the `subaccount_id` attribute instead
     * 
     */
    @Deprecated /* Use the `subaccount_id` attribute instead */
    public String id() {
        return this.id;
    }
    /**
     * @return The ID of the subaccount.
     * 
     */
    public String subaccountId() {
        return this.subaccountId;
    }
    public Map<String,GetSubaccountEntitlementsValues> values() {
        return this.values;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSubaccountEntitlementsResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private String subaccountId;
        private Map<String,GetSubaccountEntitlementsValues> values;
        public Builder() {}
        public Builder(GetSubaccountEntitlementsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.subaccountId = defaults.subaccountId;
    	      this.values = defaults.values;
        }

        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder subaccountId(String subaccountId) {
            this.subaccountId = Objects.requireNonNull(subaccountId);
            return this;
        }
        @CustomType.Setter
        public Builder values(Map<String,GetSubaccountEntitlementsValues> values) {
            this.values = Objects.requireNonNull(values);
            return this;
        }
        public GetSubaccountEntitlementsResult build() {
            final var _resultValue = new GetSubaccountEntitlementsResult();
            _resultValue.id = id;
            _resultValue.subaccountId = subaccountId;
            _resultValue.values = values;
            return _resultValue;
        }
    }
}