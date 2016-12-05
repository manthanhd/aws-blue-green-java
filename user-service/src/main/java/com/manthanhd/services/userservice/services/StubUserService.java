package com.manthanhd.services.userservice.services;

import com.manthanhd.services.userservice.models.User;
import com.manthanhd.services.userservice.models.UserList;
import org.springframework.stereotype.Service;

/**
 * Created by manth on 04-Dec-16.
 */
@Service
public class StubUserService implements UserService {

    private UserList fakeUserList;

    public StubUserService() {
        generateFakeUsers();
    }

    private void generateFakeUsers() {
        final User john = User.newBuilder().name("jonathan", "john", "kaleton")
                .uid("john1980").build();
        final User kate = User.newBuilder().name("Kate", "Cunningham")
                .uid("katie12").build();
        final User marie = User.newBuilder().name("Marie", "Elizabeth", "Kaleton")
                .uid("marie1992").build();

        fakeUserList = UserList.from(john, kate, marie);
    }

    @Override
    public UserList getAllUsers() {
        return fakeUserList;
    }
}
