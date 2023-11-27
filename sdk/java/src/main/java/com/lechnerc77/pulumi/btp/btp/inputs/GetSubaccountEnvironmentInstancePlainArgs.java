// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.lechnerc77.pulumi.btp.btp.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetSubaccountEnvironmentInstancePlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSubaccountEnvironmentInstancePlainArgs Empty = new GetSubaccountEnvironmentInstancePlainArgs();

    /**
     * The ID of the environment instance.
     * 
     */
    @Import(name="id", required=true)
    private String id;

    /**
     * @return The ID of the environment instance.
     * 
     */
    public String id() {
        return this.id;
    }

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

    private GetSubaccountEnvironmentInstancePlainArgs() {}

    private GetSubaccountEnvironmentInstancePlainArgs(GetSubaccountEnvironmentInstancePlainArgs $) {
        this.id = $.id;
        this.subaccountId = $.subaccountId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSubaccountEnvironmentInstancePlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSubaccountEnvironmentInstancePlainArgs $;

        public Builder() {
            $ = new GetSubaccountEnvironmentInstancePlainArgs();
        }

        public Builder(GetSubaccountEnvironmentInstancePlainArgs defaults) {
            $ = new GetSubaccountEnvironmentInstancePlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param id The ID of the environment instance.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            $.id = id;
            return this;
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

        public GetSubaccountEnvironmentInstancePlainArgs build() {
            $.id = Objects.requireNonNull($.id, "expected parameter 'id' to be non-null");
            $.subaccountId = Objects.requireNonNull($.subaccountId, "expected parameter 'subaccountId' to be non-null");
            return $;
        }
    }

}
