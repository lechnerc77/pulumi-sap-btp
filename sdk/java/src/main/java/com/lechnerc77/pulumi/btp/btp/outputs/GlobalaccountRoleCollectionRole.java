// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.lechnerc77.pulumi.btp.btp.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GlobalaccountRoleCollectionRole {
    /**
     * @return The name of the referenced role.
     * 
     */
    private String name;
    /**
     * @return The name of the referenced template app id.
     * 
     */
    private String roleTemplateAppId;
    /**
     * @return The name of the referenced role template.
     * 
     */
    private String roleTemplateName;

    private GlobalaccountRoleCollectionRole() {}
    /**
     * @return The name of the referenced role.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The name of the referenced template app id.
     * 
     */
    public String roleTemplateAppId() {
        return this.roleTemplateAppId;
    }
    /**
     * @return The name of the referenced role template.
     * 
     */
    public String roleTemplateName() {
        return this.roleTemplateName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GlobalaccountRoleCollectionRole defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String name;
        private String roleTemplateAppId;
        private String roleTemplateName;
        public Builder() {}
        public Builder(GlobalaccountRoleCollectionRole defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.roleTemplateAppId = defaults.roleTemplateAppId;
    	      this.roleTemplateName = defaults.roleTemplateName;
        }

        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder roleTemplateAppId(String roleTemplateAppId) {
            this.roleTemplateAppId = Objects.requireNonNull(roleTemplateAppId);
            return this;
        }
        @CustomType.Setter
        public Builder roleTemplateName(String roleTemplateName) {
            this.roleTemplateName = Objects.requireNonNull(roleTemplateName);
            return this;
        }
        public GlobalaccountRoleCollectionRole build() {
            final var _resultValue = new GlobalaccountRoleCollectionRole();
            _resultValue.name = name;
            _resultValue.roleTemplateAppId = roleTemplateAppId;
            _resultValue.roleTemplateName = roleTemplateName;
            return _resultValue;
        }
    }
}
