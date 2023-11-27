// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.lechnerc77.pulumi.btp.btp.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetSubaccountServiceOfferingArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSubaccountServiceOfferingArgs Empty = new GetSubaccountServiceOfferingArgs();

    /**
     * The ID of the service offering.
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    /**
     * @return The ID of the service offering.
     * 
     */
    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * The name of the service offering.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the service offering.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The ID of the subaccount.
     * 
     */
    @Import(name="subaccountId", required=true)
    private Output<String> subaccountId;

    /**
     * @return The ID of the subaccount.
     * 
     */
    public Output<String> subaccountId() {
        return this.subaccountId;
    }

    private GetSubaccountServiceOfferingArgs() {}

    private GetSubaccountServiceOfferingArgs(GetSubaccountServiceOfferingArgs $) {
        this.id = $.id;
        this.name = $.name;
        this.subaccountId = $.subaccountId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSubaccountServiceOfferingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSubaccountServiceOfferingArgs $;

        public Builder() {
            $ = new GetSubaccountServiceOfferingArgs();
        }

        public Builder(GetSubaccountServiceOfferingArgs defaults) {
            $ = new GetSubaccountServiceOfferingArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param id The ID of the service offering.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id The ID of the service offering.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param name The name of the service offering.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the service offering.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param subaccountId The ID of the subaccount.
         * 
         * @return builder
         * 
         */
        public Builder subaccountId(Output<String> subaccountId) {
            $.subaccountId = subaccountId;
            return this;
        }

        /**
         * @param subaccountId The ID of the subaccount.
         * 
         * @return builder
         * 
         */
        public Builder subaccountId(String subaccountId) {
            return subaccountId(Output.of(subaccountId));
        }

        public GetSubaccountServiceOfferingArgs build() {
            $.subaccountId = Objects.requireNonNull($.subaccountId, "expected parameter 'subaccountId' to be non-null");
            return $;
        }
    }

}
