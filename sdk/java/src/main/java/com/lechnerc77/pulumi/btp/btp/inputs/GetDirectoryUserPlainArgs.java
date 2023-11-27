// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.lechnerc77.pulumi.btp.btp.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetDirectoryUserPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDirectoryUserPlainArgs Empty = new GetDirectoryUserPlainArgs();

    /**
     * The ID of the directory.
     * 
     */
    @Import(name="directoryId", required=true)
    private String directoryId;

    /**
     * @return The ID of the directory.
     * 
     */
    public String directoryId() {
        return this.directoryId;
    }

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

    private GetDirectoryUserPlainArgs() {}

    private GetDirectoryUserPlainArgs(GetDirectoryUserPlainArgs $) {
        this.directoryId = $.directoryId;
        this.origin = $.origin;
        this.userName = $.userName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDirectoryUserPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDirectoryUserPlainArgs $;

        public Builder() {
            $ = new GetDirectoryUserPlainArgs();
        }

        public Builder(GetDirectoryUserPlainArgs defaults) {
            $ = new GetDirectoryUserPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param directoryId The ID of the directory.
         * 
         * @return builder
         * 
         */
        public Builder directoryId(String directoryId) {
            $.directoryId = directoryId;
            return this;
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
         * @param userName The username of the user.
         * 
         * @return builder
         * 
         */
        public Builder userName(String userName) {
            $.userName = userName;
            return this;
        }

        public GetDirectoryUserPlainArgs build() {
            $.directoryId = Objects.requireNonNull($.directoryId, "expected parameter 'directoryId' to be non-null");
            $.userName = Objects.requireNonNull($.userName, "expected parameter 'userName' to be non-null");
            return $;
        }
    }

}
