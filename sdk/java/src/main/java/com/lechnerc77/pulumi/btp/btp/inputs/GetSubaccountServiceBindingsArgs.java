// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.lechnerc77.pulumi.btp.btp.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetSubaccountServiceBindingsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSubaccountServiceBindingsArgs Empty = new GetSubaccountServiceBindingsArgs();

    /**
     * Filters the service bindings based on the field query.
     * 
     */
    @Import(name="fieldsFilter")
    private @Nullable Output<String> fieldsFilter;

    /**
     * @return Filters the service bindings based on the field query.
     * 
     */
    public Optional<Output<String>> fieldsFilter() {
        return Optional.ofNullable(this.fieldsFilter);
    }

    /**
     * Filters the service binding based on the label query.
     * 
     */
    @Import(name="labelsFilter")
    private @Nullable Output<String> labelsFilter;

    /**
     * @return Filters the service binding based on the label query.
     * 
     */
    public Optional<Output<String>> labelsFilter() {
        return Optional.ofNullable(this.labelsFilter);
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

    private GetSubaccountServiceBindingsArgs() {}

    private GetSubaccountServiceBindingsArgs(GetSubaccountServiceBindingsArgs $) {
        this.fieldsFilter = $.fieldsFilter;
        this.labelsFilter = $.labelsFilter;
        this.subaccountId = $.subaccountId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSubaccountServiceBindingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSubaccountServiceBindingsArgs $;

        public Builder() {
            $ = new GetSubaccountServiceBindingsArgs();
        }

        public Builder(GetSubaccountServiceBindingsArgs defaults) {
            $ = new GetSubaccountServiceBindingsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param fieldsFilter Filters the service bindings based on the field query.
         * 
         * @return builder
         * 
         */
        public Builder fieldsFilter(@Nullable Output<String> fieldsFilter) {
            $.fieldsFilter = fieldsFilter;
            return this;
        }

        /**
         * @param fieldsFilter Filters the service bindings based on the field query.
         * 
         * @return builder
         * 
         */
        public Builder fieldsFilter(String fieldsFilter) {
            return fieldsFilter(Output.of(fieldsFilter));
        }

        /**
         * @param labelsFilter Filters the service binding based on the label query.
         * 
         * @return builder
         * 
         */
        public Builder labelsFilter(@Nullable Output<String> labelsFilter) {
            $.labelsFilter = labelsFilter;
            return this;
        }

        /**
         * @param labelsFilter Filters the service binding based on the label query.
         * 
         * @return builder
         * 
         */
        public Builder labelsFilter(String labelsFilter) {
            return labelsFilter(Output.of(labelsFilter));
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

        public GetSubaccountServiceBindingsArgs build() {
            $.subaccountId = Objects.requireNonNull($.subaccountId, "expected parameter 'subaccountId' to be non-null");
            return $;
        }
    }

}
