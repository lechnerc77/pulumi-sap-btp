// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.lechnerc77.pulumi.btp.btp.outputs;

import com.lechnerc77.pulumi.btp.btp.outputs.GetGlobalaccountRolesValueScope;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetGlobalaccountRolesValue {
    /**
     * @return The id of the application that provides the role template and the role.
     * 
     */
    private String appId;
    /**
     * @return The name of the application that provides the role template and the role.
     * 
     */
    private String appName;
    /**
     * @return The description of the role.
     * 
     */
    private String description;
    /**
     * @return The name of the role.
     * 
     */
    private String name;
    /**
     * @return Shows whether the role can be modified or not.
     * 
     */
    private Boolean readOnly;
    /**
     * @return The name of the role template.
     * 
     */
    private String roleTemplateName;
    /**
     * @return The scopes available with this role.
     * 
     */
    private List<GetGlobalaccountRolesValueScope> scopes;

    private GetGlobalaccountRolesValue() {}
    /**
     * @return The id of the application that provides the role template and the role.
     * 
     */
    public String appId() {
        return this.appId;
    }
    /**
     * @return The name of the application that provides the role template and the role.
     * 
     */
    public String appName() {
        return this.appName;
    }
    /**
     * @return The description of the role.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return The name of the role.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Shows whether the role can be modified or not.
     * 
     */
    public Boolean readOnly() {
        return this.readOnly;
    }
    /**
     * @return The name of the role template.
     * 
     */
    public String roleTemplateName() {
        return this.roleTemplateName;
    }
    /**
     * @return The scopes available with this role.
     * 
     */
    public List<GetGlobalaccountRolesValueScope> scopes() {
        return this.scopes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGlobalaccountRolesValue defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String appId;
        private String appName;
        private String description;
        private String name;
        private Boolean readOnly;
        private String roleTemplateName;
        private List<GetGlobalaccountRolesValueScope> scopes;
        public Builder() {}
        public Builder(GetGlobalaccountRolesValue defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appId = defaults.appId;
    	      this.appName = defaults.appName;
    	      this.description = defaults.description;
    	      this.name = defaults.name;
    	      this.readOnly = defaults.readOnly;
    	      this.roleTemplateName = defaults.roleTemplateName;
    	      this.scopes = defaults.scopes;
        }

        @CustomType.Setter
        public Builder appId(String appId) {
            this.appId = Objects.requireNonNull(appId);
            return this;
        }
        @CustomType.Setter
        public Builder appName(String appName) {
            this.appName = Objects.requireNonNull(appName);
            return this;
        }
        @CustomType.Setter
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder readOnly(Boolean readOnly) {
            this.readOnly = Objects.requireNonNull(readOnly);
            return this;
        }
        @CustomType.Setter
        public Builder roleTemplateName(String roleTemplateName) {
            this.roleTemplateName = Objects.requireNonNull(roleTemplateName);
            return this;
        }
        @CustomType.Setter
        public Builder scopes(List<GetGlobalaccountRolesValueScope> scopes) {
            this.scopes = Objects.requireNonNull(scopes);
            return this;
        }
        public Builder scopes(GetGlobalaccountRolesValueScope... scopes) {
            return scopes(List.of(scopes));
        }
        public GetGlobalaccountRolesValue build() {
            final var _resultValue = new GetGlobalaccountRolesValue();
            _resultValue.appId = appId;
            _resultValue.appName = appName;
            _resultValue.description = description;
            _resultValue.name = name;
            _resultValue.readOnly = readOnly;
            _resultValue.roleTemplateName = roleTemplateName;
            _resultValue.scopes = scopes;
            return _resultValue;
        }
    }
}
