// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.lechnerc77.pulumi.btp.btp.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetSubaccountSubscriptionsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSubaccountSubscriptionsArgs Empty = new GetSubaccountSubscriptionsArgs();

    @Import(name="subaccountId", required=true)
    private Output<String> subaccountId;

    public Output<String> subaccountId() {
        return this.subaccountId;
    }

    private GetSubaccountSubscriptionsArgs() {}

    private GetSubaccountSubscriptionsArgs(GetSubaccountSubscriptionsArgs $) {
        this.subaccountId = $.subaccountId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSubaccountSubscriptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSubaccountSubscriptionsArgs $;

        public Builder() {
            $ = new GetSubaccountSubscriptionsArgs();
        }

        public Builder(GetSubaccountSubscriptionsArgs defaults) {
            $ = new GetSubaccountSubscriptionsArgs(Objects.requireNonNull(defaults));
        }

        public Builder subaccountId(Output<String> subaccountId) {
            $.subaccountId = subaccountId;
            return this;
        }

        public Builder subaccountId(String subaccountId) {
            return subaccountId(Output.of(subaccountId));
        }

        public GetSubaccountSubscriptionsArgs build() {
            $.subaccountId = Objects.requireNonNull($.subaccountId, "expected parameter 'subaccountId' to be non-null");
            return $;
        }
    }

}
