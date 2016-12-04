package com.manthanhd.services.userservice.models;

/**
 * Created by manth on 04-Dec-16.
 */
public class HealthStatus {
    private String status;

    private HealthStatus(Builder builder) {
        status = builder.status;
    }

    public String getStatus() {
        return status;
    }

    public static Builder newBuilder() {
        return new Builder();
    }


    public static final class Builder {
        private String status;

        private Builder() {
        }

        public Builder status(String val) {
            status = val;
            return this;
        }

        public HealthStatus build() {
            return new HealthStatus(this);
        }
    }
}
