// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.lechnerc77.pulumi.btp.btp.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetSubaccountUsersResult {
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
     * @return The identity provider that hosts the user. The default value is &#39;ldap&#39;.
     * 
     */
    private String origin;
    /**
     * @return The ID of the subaccount.
     * 
     */
    private String subaccountId;
    /**
     * @return The list of users assigned to the subaccount.
     * 
     */
    private List<String> values;

    private GetSubaccountUsersResult() {}
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
     * @return The identity provider that hosts the user. The default value is &#39;ldap&#39;.
     * 
     */
    public String origin() {
        return this.origin;
    }
    /**
     * @return The ID of the subaccount.
     * 
     */
    public String subaccountId() {
        return this.subaccountId;
    }
    /**
     * @return The list of users assigned to the subaccount.
     * 
     */
    public List<String> values() {
        return this.values;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSubaccountUsersResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private String origin;
        private String subaccountId;
        private List<String> values;
        public Builder() {}
        public Builder(GetSubaccountUsersResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.origin = defaults.origin;
    	      this.subaccountId = defaults.subaccountId;
    	      this.values = defaults.values;
        }

        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder origin(String origin) {
            this.origin = Objects.requireNonNull(origin);
            return this;
        }
        @CustomType.Setter
        public Builder subaccountId(String subaccountId) {
            this.subaccountId = Objects.requireNonNull(subaccountId);
            return this;
        }
        @CustomType.Setter
        public Builder values(List<String> values) {
            this.values = Objects.requireNonNull(values);
            return this;
        }
        public Builder values(String... values) {
            return values(List.of(values));
        }
        public GetSubaccountUsersResult build() {
            final var _resultValue = new GetSubaccountUsersResult();
            _resultValue.id = id;
            _resultValue.origin = origin;
            _resultValue.subaccountId = subaccountId;
            _resultValue.values = values;
            return _resultValue;
        }
    }
}
