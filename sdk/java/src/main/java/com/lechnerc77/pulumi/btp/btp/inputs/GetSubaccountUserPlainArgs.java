// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.lechnerc77.pulumi.btp.btp.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetSubaccountUserPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSubaccountUserPlainArgs Empty = new GetSubaccountUserPlainArgs();

    /**
     * The identity provider that hosts the user. The default value is &#39;ldap&#39;
     * 
     */
    @Import(name="origin")
    private @Nullable String origin;

    /**
     * @return The identity provider that hosts the user. The default value is &#39;ldap&#39;
     * 
     */
    public Optional<String> origin() {
        return Optional.ofNullable(this.origin);
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

    /**
     * The username of the user.
     * 
     */
    @Import(name="userName", required=true)
    private String userName;

    /**
     * @return The username of the user.
     * 
     */
    public String userName() {
        return this.userName;
    }

    private GetSubaccountUserPlainArgs() {}

    private GetSubaccountUserPlainArgs(GetSubaccountUserPlainArgs $) {
        this.origin = $.origin;
        this.subaccountId = $.subaccountId;
        this.userName = $.userName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSubaccountUserPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSubaccountUserPlainArgs $;

        public Builder() {
            $ = new GetSubaccountUserPlainArgs();
        }

        public Builder(GetSubaccountUserPlainArgs defaults) {
            $ = new GetSubaccountUserPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param origin The identity provider that hosts the user. The default value is &#39;ldap&#39;
         * 
         * @return builder
         * 
         */
        public Builder origin(@Nullable String origin) {
            $.origin = origin;
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

        /**
         * @param userName The username of the user.
         * 
         * @return builder
         * 
         */
        public Builder userName(String userName) {
            $.userName = userName;
            return this;
        }

        public GetSubaccountUserPlainArgs build() {
            $.subaccountId = Objects.requireNonNull($.subaccountId, "expected parameter 'subaccountId' to be non-null");
            $.userName = Objects.requireNonNull($.userName, "expected parameter 'userName' to be non-null");
            return $;
        }
    }

}
