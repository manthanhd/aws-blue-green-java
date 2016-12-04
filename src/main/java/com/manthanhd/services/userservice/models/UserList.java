package com.manthanhd.services.userservice.models;

import java.util.Arrays;
import java.util.List;

/**
 * Created by manth on 04-Dec-16.
 */
public class UserList {
    private List<User> users;

    private UserList(Builder builder) {
        users = builder.users;
    }

    public List<User> getUsers() {
        return users;
    }

    public static UserList from(List<User> userList) {
        return UserList.newBuilder().users(userList).build();
    }

    public static UserList from(User... userList) {
        return UserList.newBuilder().users(Arrays.asList(userList)).build();
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static final class Builder {
        private List<User> users;

        private Builder() {
        }

        public Builder users(List<User> val) {
            users = val;
            return this;
        }

        public UserList build() {
            return new UserList(this);
        }
    }
}
