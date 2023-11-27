// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.lechnerc77.pulumi.btp.btp.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetSubaccountEntitlementsPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSubaccountEntitlementsPlainArgs Empty = new GetSubaccountEntitlementsPlainArgs();

    /**
     * The ID of the subaccount.
     * 
     */
    @Import(name="subaccountId", required=true)
    private String subaccountId;

    /**
     * @return The ID of the subaccount.
     * 
     */
    public String subaccountId() {
        return this.subaccountId;
    }

    private GetSubaccountEntitlementsPlainArgs() {}

    private GetSubaccountEntitlementsPlainArgs(GetSubaccountEntitlementsPlainArgs $) {
        this.subaccountId = $.subaccountId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSubaccountEntitlementsPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSubaccountEntitlementsPlainArgs $;

        public Builder() {
            $ = new GetSubaccountEntitlementsPlainArgs();
        }

        public Builder(GetSubaccountEntitlementsPlainArgs defaults) {
            $ = new GetSubaccountEntitlementsPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param subaccountId The ID of the subaccount.
         * 
         * @return builder
         * 
         */
        public Builder subaccountId(String subaccountId) {
            $.subaccountId = subaccountId;
            return this;
        }

        public GetSubaccountEntitlementsPlainArgs build() {
            $.subaccountId = Objects.requireNonNull($.subaccountId, "expected parameter 'subaccountId' to be non-null");
            return $;
        }
    }

}
