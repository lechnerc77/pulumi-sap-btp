// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.lechnerc77.pulumi.btp.btp.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetSubaccountEnvironmentInstancesPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSubaccountEnvironmentInstancesPlainArgs Empty = new GetSubaccountEnvironmentInstancesPlainArgs();

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

    private GetSubaccountEnvironmentInstancesPlainArgs() {}

    private GetSubaccountEnvironmentInstancesPlainArgs(GetSubaccountEnvironmentInstancesPlainArgs $) {
        this.subaccountId = $.subaccountId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSubaccountEnvironmentInstancesPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSubaccountEnvironmentInstancesPlainArgs $;

        public Builder() {
            $ = new GetSubaccountEnvironmentInstancesPlainArgs();
        }

        public Builder(GetSubaccountEnvironmentInstancesPlainArgs defaults) {
            $ = new GetSubaccountEnvironmentInstancesPlainArgs(Objects.requireNonNull(defaults));
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

        public GetSubaccountEnvironmentInstancesPlainArgs build() {
            $.subaccountId = Objects.requireNonNull($.subaccountId, "expected parameter 'subaccountId' to be non-null");
            return $;
        }
    }

}
