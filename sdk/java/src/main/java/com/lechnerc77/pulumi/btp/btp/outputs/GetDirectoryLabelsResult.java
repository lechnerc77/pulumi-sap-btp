// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.lechnerc77.pulumi.btp.btp.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetDirectoryLabelsResult {
    /**
     * @return The ID of the directory.
     * 
     */
    private String directoryId;
    /**
     * @return The ID of the directory.
     * 
     * @deprecated
     * Use the `directory_id` attribute instead
     * 
     */
    @Deprecated /* Use the `directory_id` attribute instead */
    private String id;
    /**
     * @return Contains the label values
     * 
     */
    private Map<String,List<String>> values;

    private GetDirectoryLabelsResult() {}
    /**
     * @return The ID of the directory.
     * 
     */
    public String directoryId() {
        return this.directoryId;
    }
    /**
     * @return The ID of the directory.
     * 
     * @deprecated
     * Use the `directory_id` attribute instead
     * 
     */
    @Deprecated /* Use the `directory_id` attribute instead */
    public String id() {
        return this.id;
    }
    /**
     * @return Contains the label values
     * 
     */
    public Map<String,List<String>> values() {
        return this.values;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDirectoryLabelsResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String directoryId;
        private String id;
        private Map<String,List<String>> values;
        public Builder() {}
        public Builder(GetDirectoryLabelsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.directoryId = defaults.directoryId;
    	      this.id = defaults.id;
    	      this.values = defaults.values;
        }

        @CustomType.Setter
        public Builder directoryId(String directoryId) {
            this.directoryId = Objects.requireNonNull(directoryId);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder values(Map<String,List<String>> values) {
            this.values = Objects.requireNonNull(values);
            return this;
        }
        public GetDirectoryLabelsResult build() {
            final var _resultValue = new GetDirectoryLabelsResult();
            _resultValue.directoryId = directoryId;
            _resultValue.id = id;
            _resultValue.values = values;
            return _resultValue;
        }
    }
}
