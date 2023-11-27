// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.lechnerc77.pulumi.btp.btp.outputs;

import com.lechnerc77.pulumi.btp.btp.outputs.GetSubaccountRolesValue;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetSubaccountRolesResult {
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
    private List<GetSubaccountRolesValue> values;

    private GetSubaccountRolesResult() {}
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
    public List<GetSubaccountRolesValue> values() {
        return this.values;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSubaccountRolesResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private String subaccountId;
        private List<GetSubaccountRolesValue> values;
        public Builder() {}
        public Builder(GetSubaccountRolesResult defaults) {
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
        public Builder values(List<GetSubaccountRolesValue> values) {
            this.values = Objects.requireNonNull(values);
            return this;
        }
        public Builder values(GetSubaccountRolesValue... values) {
            return values(List.of(values));
        }
        public GetSubaccountRolesResult build() {
            final var _resultValue = new GetSubaccountRolesResult();
            _resultValue.id = id;
            _resultValue.subaccountId = subaccountId;
            _resultValue.values = values;
            return _resultValue;
        }
    }
}