// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.lechnerc77.pulumi.btp.btp.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetSubaccountRoleCollectionsValueRole {
    private String description;
    private String name;
    private String roleTemplateAppId;
    private String roleTemplateName;

    private GetSubaccountRoleCollectionsValueRole() {}
    public String description() {
        return this.description;
    }
    public String name() {
        return this.name;
    }
    public String roleTemplateAppId() {
        return this.roleTemplateAppId;
    }
    public String roleTemplateName() {
        return this.roleTemplateName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSubaccountRoleCollectionsValueRole defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String description;
        private String name;
        private String roleTemplateAppId;
        private String roleTemplateName;
        public Builder() {}
        public Builder(GetSubaccountRoleCollectionsValueRole defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.name = defaults.name;
    	      this.roleTemplateAppId = defaults.roleTemplateAppId;
    	      this.roleTemplateName = defaults.roleTemplateName;
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
        public Builder roleTemplateAppId(String roleTemplateAppId) {
            this.roleTemplateAppId = Objects.requireNonNull(roleTemplateAppId);
            return this;
        }
        @CustomType.Setter
        public Builder roleTemplateName(String roleTemplateName) {
            this.roleTemplateName = Objects.requireNonNull(roleTemplateName);
            return this;
        }
        public GetSubaccountRoleCollectionsValueRole build() {
            final var _resultValue = new GetSubaccountRoleCollectionsValueRole();
            _resultValue.description = description;
            _resultValue.name = name;
            _resultValue.roleTemplateAppId = roleTemplateAppId;
            _resultValue.roleTemplateName = roleTemplateName;
            return _resultValue;
        }
    }
}
