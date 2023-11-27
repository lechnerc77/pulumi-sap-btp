// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.lechnerc77.pulumi.btp.btp.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetDirectoryResult {
    /**
     * @return The details of the user that created the directory.
     * 
     */
    private String createdBy;
    /**
     * @return The date and time when the resource was created in [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) format.
     * 
     */
    private String createdDate;
    /**
     * @return The description of the directory.
     * 
     */
    private String description;
    /**
     * @return The features that are enabled for the directory. Possible values are:
     * 
     */
    private List<String> features;
    /**
     * @return The ID of the directory.
     * 
     */
    private String id;
    private Map<String,List<String>> labels;
    private String lastModified;
    private String name;
    private String parentId;
    private String state;
    private String subdomain;

    private GetDirectoryResult() {}
    /**
     * @return The details of the user that created the directory.
     * 
     */
    public String createdBy() {
        return this.createdBy;
    }
    /**
     * @return The date and time when the resource was created in [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) format.
     * 
     */
    public String createdDate() {
        return this.createdDate;
    }
    /**
     * @return The description of the directory.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return The features that are enabled for the directory. Possible values are:
     * 
     */
    public List<String> features() {
        return this.features;
    }
    /**
     * @return The ID of the directory.
     * 
     */
    public String id() {
        return this.id;
    }
    public Map<String,List<String>> labels() {
        return this.labels;
    }
    public String lastModified() {
        return this.lastModified;
    }
    public String name() {
        return this.name;
    }
    public String parentId() {
        return this.parentId;
    }
    public String state() {
        return this.state;
    }
    public String subdomain() {
        return this.subdomain;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDirectoryResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String createdBy;
        private String createdDate;
        private String description;
        private List<String> features;
        private String id;
        private Map<String,List<String>> labels;
        private String lastModified;
        private String name;
        private String parentId;
        private String state;
        private String subdomain;
        public Builder() {}
        public Builder(GetDirectoryResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createdBy = defaults.createdBy;
    	      this.createdDate = defaults.createdDate;
    	      this.description = defaults.description;
    	      this.features = defaults.features;
    	      this.id = defaults.id;
    	      this.labels = defaults.labels;
    	      this.lastModified = defaults.lastModified;
    	      this.name = defaults.name;
    	      this.parentId = defaults.parentId;
    	      this.state = defaults.state;
    	      this.subdomain = defaults.subdomain;
        }

        @CustomType.Setter
        public Builder createdBy(String createdBy) {
            this.createdBy = Objects.requireNonNull(createdBy);
            return this;
        }
        @CustomType.Setter
        public Builder createdDate(String createdDate) {
            this.createdDate = Objects.requireNonNull(createdDate);
            return this;
        }
        @CustomType.Setter
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        @CustomType.Setter
        public Builder features(List<String> features) {
            this.features = Objects.requireNonNull(features);
            return this;
        }
        public Builder features(String... features) {
            return features(List.of(features));
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder labels(Map<String,List<String>> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }
        @CustomType.Setter
        public Builder lastModified(String lastModified) {
            this.lastModified = Objects.requireNonNull(lastModified);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder parentId(String parentId) {
            this.parentId = Objects.requireNonNull(parentId);
            return this;
        }
        @CustomType.Setter
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        @CustomType.Setter
        public Builder subdomain(String subdomain) {
            this.subdomain = Objects.requireNonNull(subdomain);
            return this;
        }
        public GetDirectoryResult build() {
            final var _resultValue = new GetDirectoryResult();
            _resultValue.createdBy = createdBy;
            _resultValue.createdDate = createdDate;
            _resultValue.description = description;
            _resultValue.features = features;
            _resultValue.id = id;
            _resultValue.labels = labels;
            _resultValue.lastModified = lastModified;
            _resultValue.name = name;
            _resultValue.parentId = parentId;
            _resultValue.state = state;
            _resultValue.subdomain = subdomain;
            return _resultValue;
        }
    }
}