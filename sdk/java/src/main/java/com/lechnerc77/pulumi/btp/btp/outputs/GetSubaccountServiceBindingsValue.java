// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.lechnerc77.pulumi.btp.btp.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetSubaccountServiceBindingsValue {
    /**
     * @return Contains the resources associated with the binding.
     * 
     */
    private Map<String,String> bindResource;
    /**
     * @return Contextual data for the resource.
     * 
     */
    private Map<String,String> context;
    /**
     * @return The date and time when the resource was created in [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) format.
     * 
     */
    private String createdDate;
    /**
     * @return The credentials to access the binding.
     * 
     */
    private String credentials;
    /**
     * @return The ID of the service binding.
     * 
     */
    private String id;
    /**
     * @return The set of words or phrases assigned to the binding.
     * 
     */
    private Map<String,List<String>> labels;
    /**
     * @return The date and time when the resource was last modified in [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) format.
     * 
     */
    private String lastModified;
    /**
     * @return The name of the service binding.
     * 
     */
    private String name;
    /**
     * @return Shows whether the service binding is ready.
     * 
     */
    private Boolean ready;
    /**
     * @return The ID of the service instance associated with the binding.
     * 
     */
    private String serviceInstanceId;

    private GetSubaccountServiceBindingsValue() {}
    /**
     * @return Contains the resources associated with the binding.
     * 
     */
    public Map<String,String> bindResource() {
        return this.bindResource;
    }
    /**
     * @return Contextual data for the resource.
     * 
     */
    public Map<String,String> context() {
        return this.context;
    }
    /**
     * @return The date and time when the resource was created in [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) format.
     * 
     */
    public String createdDate() {
        return this.createdDate;
    }
    /**
     * @return The credentials to access the binding.
     * 
     */
    public String credentials() {
        return this.credentials;
    }
    /**
     * @return The ID of the service binding.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The set of words or phrases assigned to the binding.
     * 
     */
    public Map<String,List<String>> labels() {
        return this.labels;
    }
    /**
     * @return The date and time when the resource was last modified in [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) format.
     * 
     */
    public String lastModified() {
        return this.lastModified;
    }
    /**
     * @return The name of the service binding.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Shows whether the service binding is ready.
     * 
     */
    public Boolean ready() {
        return this.ready;
    }
    /**
     * @return The ID of the service instance associated with the binding.
     * 
     */
    public String serviceInstanceId() {
        return this.serviceInstanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSubaccountServiceBindingsValue defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Map<String,String> bindResource;
        private Map<String,String> context;
        private String createdDate;
        private String credentials;
        private String id;
        private Map<String,List<String>> labels;
        private String lastModified;
        private String name;
        private Boolean ready;
        private String serviceInstanceId;
        public Builder() {}
        public Builder(GetSubaccountServiceBindingsValue defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bindResource = defaults.bindResource;
    	      this.context = defaults.context;
    	      this.createdDate = defaults.createdDate;
    	      this.credentials = defaults.credentials;
    	      this.id = defaults.id;
    	      this.labels = defaults.labels;
    	      this.lastModified = defaults.lastModified;
    	      this.name = defaults.name;
    	      this.ready = defaults.ready;
    	      this.serviceInstanceId = defaults.serviceInstanceId;
        }

        @CustomType.Setter
        public Builder bindResource(Map<String,String> bindResource) {
            this.bindResource = Objects.requireNonNull(bindResource);
            return this;
        }
        @CustomType.Setter
        public Builder context(Map<String,String> context) {
            this.context = Objects.requireNonNull(context);
            return this;
        }
        @CustomType.Setter
        public Builder createdDate(String createdDate) {
            this.createdDate = Objects.requireNonNull(createdDate);
            return this;
        }
        @CustomType.Setter
        public Builder credentials(String credentials) {
            this.credentials = Objects.requireNonNull(credentials);
            return this;
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
        public Builder ready(Boolean ready) {
            this.ready = Objects.requireNonNull(ready);
            return this;
        }
        @CustomType.Setter
        public Builder serviceInstanceId(String serviceInstanceId) {
            this.serviceInstanceId = Objects.requireNonNull(serviceInstanceId);
            return this;
        }
        public GetSubaccountServiceBindingsValue build() {
            final var _resultValue = new GetSubaccountServiceBindingsValue();
            _resultValue.bindResource = bindResource;
            _resultValue.context = context;
            _resultValue.createdDate = createdDate;
            _resultValue.credentials = credentials;
            _resultValue.id = id;
            _resultValue.labels = labels;
            _resultValue.lastModified = lastModified;
            _resultValue.name = name;
            _resultValue.ready = ready;
            _resultValue.serviceInstanceId = serviceInstanceId;
            return _resultValue;
        }
    }
}
