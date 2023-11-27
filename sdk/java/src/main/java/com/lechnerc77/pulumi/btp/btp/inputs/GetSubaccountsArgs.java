// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.lechnerc77.pulumi.btp.btp.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetSubaccountsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSubaccountsArgs Empty = new GetSubaccountsArgs();

    /**
     * Filters the response based on the labels query.
     * 
     */
    @Import(name="labelsFilter")
    private @Nullable Output<String> labelsFilter;

    /**
     * @return Filters the response based on the labels query.
     * 
     */
    public Optional<Output<String>> labelsFilter() {
        return Optional.ofNullable(this.labelsFilter);
    }

    private GetSubaccountsArgs() {}

    private GetSubaccountsArgs(GetSubaccountsArgs $) {
        this.labelsFilter = $.labelsFilter;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSubaccountsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSubaccountsArgs $;

        public Builder() {
            $ = new GetSubaccountsArgs();
        }

        public Builder(GetSubaccountsArgs defaults) {
            $ = new GetSubaccountsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param labelsFilter Filters the response based on the labels query.
         * 
         * @return builder
         * 
         */
        public Builder labelsFilter(@Nullable Output<String> labelsFilter) {
            $.labelsFilter = labelsFilter;
            return this;
        }

        /**
         * @param labelsFilter Filters the response based on the labels query.
         * 
         * @return builder
         * 
         */
        public Builder labelsFilter(String labelsFilter) {
            return labelsFilter(Output.of(labelsFilter));
        }

        public GetSubaccountsArgs build() {
            return $;
        }
    }

}