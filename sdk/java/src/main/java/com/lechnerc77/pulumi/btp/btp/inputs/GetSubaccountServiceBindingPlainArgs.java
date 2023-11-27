// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.lechnerc77.pulumi.btp.btp.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetSubaccountServiceBindingPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSubaccountServiceBindingPlainArgs Empty = new GetSubaccountServiceBindingPlainArgs();

    /**
     * The ID of the service binding.
     * 
     */
    @Import(name="id")
    private @Nullable String id;

    /**
     * @return The ID of the service binding.
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * The name of the service binding.
     * 
     */
    @Import(name="name")
    private @Nullable String name;

    /**
     * @return The name of the service binding.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
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

    private GetSubaccountServiceBindingPlainArgs() {}

    private GetSubaccountServiceBindingPlainArgs(GetSubaccountServiceBindingPlainArgs $) {
        this.id = $.id;
        this.name = $.name;
        this.subaccountId = $.subaccountId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSubaccountServiceBindingPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSubaccountServiceBindingPlainArgs $;

        public Builder() {
            $ = new GetSubaccountServiceBindingPlainArgs();
        }

        public Builder(GetSubaccountServiceBindingPlainArgs defaults) {
            $ = new GetSubaccountServiceBindingPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param id The ID of the service binding.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable String id) {
            $.id = id;
            return this;
        }

        /**
         * @param name The name of the service binding.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable String name) {
            $.name = name;
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

        public GetSubaccountServiceBindingPlainArgs build() {
            $.subaccountId = Objects.requireNonNull($.subaccountId, "expected parameter 'subaccountId' to be non-null");
            return $;
        }
    }

}