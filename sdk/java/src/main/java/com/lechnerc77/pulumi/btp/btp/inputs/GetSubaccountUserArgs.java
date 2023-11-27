// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.lechnerc77.pulumi.btp.btp.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetSubaccountUserArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSubaccountUserArgs Empty = new GetSubaccountUserArgs();

    /**
     * The identity provider that hosts the user. The default value is &#39;ldap&#39;
     * 
     */
    @Import(name="origin")
    private @Nullable Output<String> origin;

    /**
     * @return The identity provider that hosts the user. The default value is &#39;ldap&#39;
     * 
     */
    public Optional<Output<String>> origin() {
        return Optional.ofNullable(this.origin);
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

    /**
     * The username of the user.
     * 
     */
    @Import(name="userName", required=true)
    private Output<String> userName;

    /**
     * @return The username of the user.
     * 
     */
    public Output<String> userName() {
        return this.userName;
    }

    private GetSubaccountUserArgs() {}

    private GetSubaccountUserArgs(GetSubaccountUserArgs $) {
        this.origin = $.origin;
        this.subaccountId = $.subaccountId;
        this.userName = $.userName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSubaccountUserArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSubaccountUserArgs $;

        public Builder() {
            $ = new GetSubaccountUserArgs();
        }

        public Builder(GetSubaccountUserArgs defaults) {
            $ = new GetSubaccountUserArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param origin The identity provider that hosts the user. The default value is &#39;ldap&#39;
         * 
         * @return builder
         * 
         */
        public Builder origin(@Nullable Output<String> origin) {
            $.origin = origin;
            return this;
        }

        /**
         * @param origin The identity provider that hosts the user. The default value is &#39;ldap&#39;
         * 
         * @return builder
         * 
         */
        public Builder origin(String origin) {
            return origin(Output.of(origin));
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

        /**
         * @param userName The username of the user.
         * 
         * @return builder
         * 
         */
        public Builder userName(Output<String> userName) {
            $.userName = userName;
            return this;
        }

        /**
         * @param userName The username of the user.
         * 
         * @return builder
         * 
         */
        public Builder userName(String userName) {
            return userName(Output.of(userName));
        }

        public GetSubaccountUserArgs build() {
            $.subaccountId = Objects.requireNonNull($.subaccountId, "expected parameter 'subaccountId' to be non-null");
            $.userName = Objects.requireNonNull($.userName, "expected parameter 'userName' to be non-null");
            return $;
        }
    }

}