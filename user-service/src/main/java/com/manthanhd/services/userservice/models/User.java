package com.manthanhd.services.userservice.models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by manth on 04-Dec-16.
 */
public class User {
    private String uid;
    private List<String> names;

    public User() {
    }

    private User(Builder builder) {
        uid = builder.uid;
        names = builder.names;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getUid() {
        return uid;
    }

    public List<String> getNames() {
        return names;
    }

    public static final class Builder {
        private String uid;
        private List<String> names;

        private Builder() {
        }

        public Builder uid(String val) {
            uid = val;
            return this;
        }

        public Builder names(List<String> val) {
            names = val;
            return this;
        }

        public Builder name(String... nameVarArg) {
            if (names == null) names = new ArrayList<>();

            Collections.addAll(names, nameVarArg);
            return this;
        }

        public User build() {
            return new User(this);
        }
    }
}
