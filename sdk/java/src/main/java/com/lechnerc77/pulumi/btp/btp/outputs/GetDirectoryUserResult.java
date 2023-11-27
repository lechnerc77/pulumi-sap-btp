// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.lechnerc77.pulumi.btp.btp.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetDirectoryUserResult {
    /**
     * @return Shows if the account is still in use.
     * 
     */
    private Boolean active;
    /**
     * @return The ID of the directory.
     * 
     */
    private String directoryId;
    /**
     * @return The e-mail address of the user.
     * 
     */
    private String email;
    /**
     * @return The last name of the user.
     * 
     */
    private String familyName;
    /**
     * @return The given name of the user.
     * 
     */
    private String givenName;
    /**
     * @return The ID of the user.
     * 
     */
    private String id;
    /**
     * @return The identity provider that hosts the user. The default value is &#39;ldap&#39;
     * 
     */
    private String origin;
    /**
     * @return The set of role collections, which are assigned to the user.
     * 
     */
    private List<String> roleCollections;
    /**
     * @return The username of the user.
     * 
     */
    private String userName;
    /**
     * @return The verification status of the user.
     * 
     */
    private Boolean verified;

    private GetDirectoryUserResult() {}
    /**
     * @return Shows if the account is still in use.
     * 
     */
    public Boolean active() {
        return this.active;
    }
    /**
     * @return The ID of the directory.
     * 
     */
    public String directoryId() {
        return this.directoryId;
    }
    /**
     * @return The e-mail address of the user.
     * 
     */
    public String email() {
        return this.email;
    }
    /**
     * @return The last name of the user.
     * 
     */
    public String familyName() {
        return this.familyName;
    }
    /**
     * @return The given name of the user.
     * 
     */
    public String givenName() {
        return this.givenName;
    }
    /**
     * @return The ID of the user.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The identity provider that hosts the user. The default value is &#39;ldap&#39;
     * 
     */
    public String origin() {
        return this.origin;
    }
    /**
     * @return The set of role collections, which are assigned to the user.
     * 
     */
    public List<String> roleCollections() {
        return this.roleCollections;
    }
    /**
     * @return The username of the user.
     * 
     */
    public String userName() {
        return this.userName;
    }
    /**
     * @return The verification status of the user.
     * 
     */
    public Boolean verified() {
        return this.verified;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDirectoryUserResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean active;
        private String directoryId;
        private String email;
        private String familyName;
        private String givenName;
        private String id;
        private String origin;
        private List<String> roleCollections;
        private String userName;
        private Boolean verified;
        public Builder() {}
        public Builder(GetDirectoryUserResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.active = defaults.active;
    	      this.directoryId = defaults.directoryId;
    	      this.email = defaults.email;
    	      this.familyName = defaults.familyName;
    	      this.givenName = defaults.givenName;
    	      this.id = defaults.id;
    	      this.origin = defaults.origin;
    	      this.roleCollections = defaults.roleCollections;
    	      this.userName = defaults.userName;
    	      this.verified = defaults.verified;
        }

        @CustomType.Setter
        public Builder active(Boolean active) {
            this.active = Objects.requireNonNull(active);
            return this;
        }
        @CustomType.Setter
        public Builder directoryId(String directoryId) {
            this.directoryId = Objects.requireNonNull(directoryId);
            return this;
        }
        @CustomType.Setter
        public Builder email(String email) {
            this.email = Objects.requireNonNull(email);
            return this;
        }
        @CustomType.Setter
        public Builder familyName(String familyName) {
            this.familyName = Objects.requireNonNull(familyName);
            return this;
        }
        @CustomType.Setter
        public Builder givenName(String givenName) {
            this.givenName = Objects.requireNonNull(givenName);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder origin(String origin) {
            this.origin = Objects.requireNonNull(origin);
            return this;
        }
        @CustomType.Setter
        public Builder roleCollections(List<String> roleCollections) {
            this.roleCollections = Objects.requireNonNull(roleCollections);
            return this;
        }
        public Builder roleCollections(String... roleCollections) {
            return roleCollections(List.of(roleCollections));
        }
        @CustomType.Setter
        public Builder userName(String userName) {
            this.userName = Objects.requireNonNull(userName);
            return this;
        }
        @CustomType.Setter
        public Builder verified(Boolean verified) {
            this.verified = Objects.requireNonNull(verified);
            return this;
        }
        public GetDirectoryUserResult build() {
            final var _resultValue = new GetDirectoryUserResult();
            _resultValue.active = active;
            _resultValue.directoryId = directoryId;
            _resultValue.email = email;
            _resultValue.familyName = familyName;
            _resultValue.givenName = givenName;
            _resultValue.id = id;
            _resultValue.origin = origin;
            _resultValue.roleCollections = roleCollections;
            _resultValue.userName = userName;
            _resultValue.verified = verified;
            return _resultValue;
        }
    }
}