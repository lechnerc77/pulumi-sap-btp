// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.lechnerc77.pulumi.btp.btp.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetSubaccountServiceOfferingsValue {
    /**
     * @return Shows whether the context for the service offering can be updated.
     * 
     */
    private Boolean allowContextUpdates;
    /**
     * @return Shows whether the service offering is bindable.
     * 
     */
    private Boolean bindable;
    /**
     * @return Shows whether the bindings associated with the service offering can be retrieved.
     * 
     */
    private Boolean bindingsRetrievable;
    /**
     * @return The ID of the broker that provides the service plan.
     * 
     */
    private String brokerId;
    /**
     * @return The ID of the service offering as provided by the catalog.
     * 
     */
    private String catalogId;
    /**
     * @return The catalog name of the service offering.
     * 
     */
    private String catalogName;
    /**
     * @return The date and time when the resource was created in [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) format.
     * 
     */
    private String createdDate;
    /**
     * @return The description of the service offering.
     * 
     */
    private String description;
    /**
     * @return The ID of the service offering.
     * 
     */
    private String id;
    /**
     * @return Shows whether the service instances associated with the service offering can be retrieved.
     * 
     */
    private Boolean instancesRetrievable;
    /**
     * @return The date and time when the resource was last modified in [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) format.
     * 
     */
    private String lastModified;
    /**
     * @return The name of the service offering.
     * 
     */
    private String name;
    /**
     * @return Shows whether the offered plan can be updated.
     * 
     */
    private Boolean planUpdateable;
    /**
     * @return Shows whether the service offering is ready to be advertised.
     * 
     */
    private Boolean ready;
    /**
     * @return The list of tags for the service offering.
     * 
     */
    private List<String> tags;

    private GetSubaccountServiceOfferingsValue() {}
    /**
     * @return Shows whether the context for the service offering can be updated.
     * 
     */
    public Boolean allowContextUpdates() {
        return this.allowContextUpdates;
    }
    /**
     * @return Shows whether the service offering is bindable.
     * 
     */
    public Boolean bindable() {
        return this.bindable;
    }
    /**
     * @return Shows whether the bindings associated with the service offering can be retrieved.
     * 
     */
    public Boolean bindingsRetrievable() {
        return this.bindingsRetrievable;
    }
    /**
     * @return The ID of the broker that provides the service plan.
     * 
     */
    public String brokerId() {
        return this.brokerId;
    }
    /**
     * @return The ID of the service offering as provided by the catalog.
     * 
     */
    public String catalogId() {
        return this.catalogId;
    }
    /**
     * @return The catalog name of the service offering.
     * 
     */
    public String catalogName() {
        return this.catalogName;
    }
    /**
     * @return The date and time when the resource was created in [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) format.
     * 
     */
    public String createdDate() {
        return this.createdDate;
    }
    /**
     * @return The description of the service offering.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return The ID of the service offering.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Shows whether the service instances associated with the service offering can be retrieved.
     * 
     */
    public Boolean instancesRetrievable() {
        return this.instancesRetrievable;
    }
    /**
     * @return The date and time when the resource was last modified in [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) format.
     * 
     */
    public String lastModified() {
        return this.lastModified;
    }
    /**
     * @return The name of the service offering.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Shows whether the offered plan can be updated.
     * 
     */
    public Boolean planUpdateable() {
        return this.planUpdateable;
    }
    /**
     * @return Shows whether the service offering is ready to be advertised.
     * 
     */
    public Boolean ready() {
        return this.ready;
    }
    /**
     * @return The list of tags for the service offering.
     * 
     */
    public List<String> tags() {
        return this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSubaccountServiceOfferingsValue defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean allowContextUpdates;
        private Boolean bindable;
        private Boolean bindingsRetrievable;
        private String brokerId;
        private String catalogId;
        private String catalogName;
        private String createdDate;
        private String description;
        private String id;
        private Boolean instancesRetrievable;
        private String lastModified;
        private String name;
        private Boolean planUpdateable;
        private Boolean ready;
        private List<String> tags;
        public Builder() {}
        public Builder(GetSubaccountServiceOfferingsValue defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowContextUpdates = defaults.allowContextUpdates;
    	      this.bindable = defaults.bindable;
    	      this.bindingsRetrievable = defaults.bindingsRetrievable;
    	      this.brokerId = defaults.brokerId;
    	      this.catalogId = defaults.catalogId;
    	      this.catalogName = defaults.catalogName;
    	      this.createdDate = defaults.createdDate;
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.instancesRetrievable = defaults.instancesRetrievable;
    	      this.lastModified = defaults.lastModified;
    	      this.name = defaults.name;
    	      this.planUpdateable = defaults.planUpdateable;
    	      this.ready = defaults.ready;
    	      this.tags = defaults.tags;
        }

        @CustomType.Setter
        public Builder allowContextUpdates(Boolean allowContextUpdates) {
            this.allowContextUpdates = Objects.requireNonNull(allowContextUpdates);
            return this;
        }
        @CustomType.Setter
        public Builder bindable(Boolean bindable) {
            this.bindable = Objects.requireNonNull(bindable);
            return this;
        }
        @CustomType.Setter
        public Builder bindingsRetrievable(Boolean bindingsRetrievable) {
            this.bindingsRetrievable = Objects.requireNonNull(bindingsRetrievable);
            return this;
        }
        @CustomType.Setter
        public Builder brokerId(String brokerId) {
            this.brokerId = Objects.requireNonNull(brokerId);
            return this;
        }
        @CustomType.Setter
        public Builder catalogId(String catalogId) {
            this.catalogId = Objects.requireNonNull(catalogId);
            return this;
        }
        @CustomType.Setter
        public Builder catalogName(String catalogName) {
            this.catalogName = Objects.requireNonNull(catalogName);
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
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder instancesRetrievable(Boolean instancesRetrievable) {
            this.instancesRetrievable = Objects.requireNonNull(instancesRetrievable);
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
        public Builder planUpdateable(Boolean planUpdateable) {
            this.planUpdateable = Objects.requireNonNull(planUpdateable);
            return this;
        }
        @CustomType.Setter
        public Builder ready(Boolean ready) {
            this.ready = Objects.requireNonNull(ready);
            return this;
        }
        @CustomType.Setter
        public Builder tags(List<String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }
        public GetSubaccountServiceOfferingsValue build() {
            final var _resultValue = new GetSubaccountServiceOfferingsValue();
            _resultValue.allowContextUpdates = allowContextUpdates;
            _resultValue.bindable = bindable;
            _resultValue.bindingsRetrievable = bindingsRetrievable;
            _resultValue.brokerId = brokerId;
            _resultValue.catalogId = catalogId;
            _resultValue.catalogName = catalogName;
            _resultValue.createdDate = createdDate;
            _resultValue.description = description;
            _resultValue.id = id;
            _resultValue.instancesRetrievable = instancesRetrievable;
            _resultValue.lastModified = lastModified;
            _resultValue.name = name;
            _resultValue.planUpdateable = planUpdateable;
            _resultValue.ready = ready;
            _resultValue.tags = tags;
            return _resultValue;
        }
    }
}