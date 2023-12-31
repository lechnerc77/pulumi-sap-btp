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
public final class GetSubaccountServiceInstanceResult {
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
     * @return The ID of the service instance.
     * 
     */
    private String id;
    /**
     * @return The set of words or phrases assigned to the service instance.
     * 
     */
    private Map<String,List<String>> labels;
    /**
     * @return The date and time when the resource was last modified in [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) format.
     * 
     */
    private String lastModified;
    /**
     * @return The name of the service instance.
     * 
     */
    private String name;
    /**
     * @return The configuration parameters for the service instance.
     * 
     */
    private String parameters;
    /**
     * @return The platform ID.
     * 
     */
    private String platformId;
    private Boolean ready;
    /**
     * @return The ID of the instance to which the service instance refers.
     * 
     */
    private String referencedInstanceId;
    /**
     * @return The ID of the service plan.
     * 
     */
    private String serviceplanId;
    /**
     * @return Shows whether the service instance is shared.
     * 
     */
    private Boolean shared;
    /**
     * @return The current state of the service instance.
     * 
     */
    private String state;
    /**
     * @return The ID of the subaccount.
     * 
     */
    private String subaccountId;
    /**
     * @return Shows whether the resource can be used.
     * 
     */
    private Boolean usable;

    private GetSubaccountServiceInstanceResult() {}
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
     * @return The ID of the service instance.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The set of words or phrases assigned to the service instance.
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
     * @return The name of the service instance.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The configuration parameters for the service instance.
     * 
     */
    public String parameters() {
        return this.parameters;
    }
    /**
     * @return The platform ID.
     * 
     */
    public String platformId() {
        return this.platformId;
    }
    public Boolean ready() {
        return this.ready;
    }
    /**
     * @return The ID of the instance to which the service instance refers.
     * 
     */
    public String referencedInstanceId() {
        return this.referencedInstanceId;
    }
    /**
     * @return The ID of the service plan.
     * 
     */
    public String serviceplanId() {
        return this.serviceplanId;
    }
    /**
     * @return Shows whether the service instance is shared.
     * 
     */
    public Boolean shared() {
        return this.shared;
    }
    /**
     * @return The current state of the service instance.
     * 
     */
    public String state() {
        return this.state;
    }
    /**
     * @return The ID of the subaccount.
     * 
     */
    public String subaccountId() {
        return this.subaccountId;
    }
    /**
     * @return Shows whether the resource can be used.
     * 
     */
    public Boolean usable() {
        return this.usable;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSubaccountServiceInstanceResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Map<String,String> context;
        private String createdDate;
        private String id;
        private Map<String,List<String>> labels;
        private String lastModified;
        private String name;
        private String parameters;
        private String platformId;
        private Boolean ready;
        private String referencedInstanceId;
        private String serviceplanId;
        private Boolean shared;
        private String state;
        private String subaccountId;
        private Boolean usable;
        public Builder() {}
        public Builder(GetSubaccountServiceInstanceResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.context = defaults.context;
    	      this.createdDate = defaults.createdDate;
    	      this.id = defaults.id;
    	      this.labels = defaults.labels;
    	      this.lastModified = defaults.lastModified;
    	      this.name = defaults.name;
    	      this.parameters = defaults.parameters;
    	      this.platformId = defaults.platformId;
    	      this.ready = defaults.ready;
    	      this.referencedInstanceId = defaults.referencedInstanceId;
    	      this.serviceplanId = defaults.serviceplanId;
    	      this.shared = defaults.shared;
    	      this.state = defaults.state;
    	      this.subaccountId = defaults.subaccountId;
    	      this.usable = defaults.usable;
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
        public Builder parameters(String parameters) {
            this.parameters = Objects.requireNonNull(parameters);
            return this;
        }
        @CustomType.Setter
        public Builder platformId(String platformId) {
            this.platformId = Objects.requireNonNull(platformId);
            return this;
        }
        @CustomType.Setter
        public Builder ready(Boolean ready) {
            this.ready = Objects.requireNonNull(ready);
            return this;
        }
        @CustomType.Setter
        public Builder referencedInstanceId(String referencedInstanceId) {
            this.referencedInstanceId = Objects.requireNonNull(referencedInstanceId);
            return this;
        }
        @CustomType.Setter
        public Builder serviceplanId(String serviceplanId) {
            this.serviceplanId = Objects.requireNonNull(serviceplanId);
            return this;
        }
        @CustomType.Setter
        public Builder shared(Boolean shared) {
            this.shared = Objects.requireNonNull(shared);
            return this;
        }
        @CustomType.Setter
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        @CustomType.Setter
        public Builder subaccountId(String subaccountId) {
            this.subaccountId = Objects.requireNonNull(subaccountId);
            return this;
        }
        @CustomType.Setter
        public Builder usable(Boolean usable) {
            this.usable = Objects.requireNonNull(usable);
            return this;
        }
        public GetSubaccountServiceInstanceResult build() {
            final var _resultValue = new GetSubaccountServiceInstanceResult();
            _resultValue.context = context;
            _resultValue.createdDate = createdDate;
            _resultValue.id = id;
            _resultValue.labels = labels;
            _resultValue.lastModified = lastModified;
            _resultValue.name = name;
            _resultValue.parameters = parameters;
            _resultValue.platformId = platformId;
            _resultValue.ready = ready;
            _resultValue.referencedInstanceId = referencedInstanceId;
            _resultValue.serviceplanId = serviceplanId;
            _resultValue.shared = shared;
            _resultValue.state = state;
            _resultValue.subaccountId = subaccountId;
            _resultValue.usable = usable;
            return _resultValue;
        }
    }
}
