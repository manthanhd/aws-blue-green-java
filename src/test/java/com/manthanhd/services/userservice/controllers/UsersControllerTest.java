package com.manthanhd.services.userservice.controllers;

import com.manthanhd.services.userservice.models.User;
import com.manthanhd.services.userservice.models.UserList;
import com.manthanhd.services.userservice.services.UserService;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.UUID;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.sameInstance;
import static org.junit.Assert.*;

/**
 * Created by manth on 04-Dec-16.
 */
public class UsersControllerTest {

    private UsersController controller;
    private UserService mockService;

    @Before
    public void setUp() throws Exception {
        mockService = Mockito.mock(UserService.class);
        controller = new UsersController(mockService);
    }

    @Test
    public void getAllUsersReturnsUserListFromUserService() throws Exception {
        final User fakeUser = User.newBuilder().name("Jonathan", "John", "Kaleton")
                .uid(UUID.randomUUID().toString()).build();
        final UserList fakeUserList = UserList.from(fakeUser);

        Mockito.doReturn(fakeUserList).when(mockService).getAllUsers();

        final UserList actualUserList = controller.getAllUsers();

        assertThat(actualUserList, is(sameInstance(fakeUserList)));
        assertThat(actualUserList.getUsers().get(0), is(sameInstance(fakeUser)));
    }
}