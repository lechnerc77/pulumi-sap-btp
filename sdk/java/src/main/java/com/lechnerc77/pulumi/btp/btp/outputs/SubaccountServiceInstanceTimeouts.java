// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.lechnerc77.pulumi.btp.btp.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SubaccountServiceInstanceTimeouts {
    /**
     * @return Timeout for creating the service instance.
     * 
     */
    private @Nullable String create;
    /**
     * @return Timeout for deleting the service instance.
     * 
     */
    private @Nullable String delete;
    /**
     * @return Timeout for updating the service instance.
     * 
     */
    private @Nullable String update;

    private SubaccountServiceInstanceTimeouts() {}
    /**
     * @return Timeout for creating the service instance.
     * 
     */
    public Optional<String> create() {
        return Optional.ofNullable(this.create);
    }
    /**
     * @return Timeout for deleting the service instance.
     * 
     */
    public Optional<String> delete() {
        return Optional.ofNullable(this.delete);
    }
    /**
     * @return Timeout for updating the service instance.
     * 
     */
    public Optional<String> update() {
        return Optional.ofNullable(this.update);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SubaccountServiceInstanceTimeouts defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String create;
        private @Nullable String delete;
        private @Nullable String update;
        public Builder() {}
        public Builder(SubaccountServiceInstanceTimeouts defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.create = defaults.create;
    	      this.delete = defaults.delete;
    	      this.update = defaults.update;
        }

        @CustomType.Setter
        public Builder create(@Nullable String create) {
            this.create = create;
            return this;
        }
        @CustomType.Setter
        public Builder delete(@Nullable String delete) {
            this.delete = delete;
            return this;
        }
        @CustomType.Setter
        public Builder update(@Nullable String update) {
            this.update = update;
            return this;
        }
        public SubaccountServiceInstanceTimeouts build() {
            final var _resultValue = new SubaccountServiceInstanceTimeouts();
            _resultValue.create = create;
            _resultValue.delete = delete;
            _resultValue.update = update;
            return _resultValue;
        }
    }
}
