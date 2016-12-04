package com.manthanhd.services.userservice.controllers;

import com.manthanhd.services.userservice.models.UserList;
import com.manthanhd.services.userservice.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by manth on 04-Dec-16.
 */
@RestController
public class UsersController {

    private final UserService userService;

    @Autowired
    public UsersController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(
            path = "/users",
            method = RequestMethod.GET,
            produces = "application/json"
    )
    @ResponseBody public UserList getAllUsers() {
        return userService.getAllUsers();
    }
}
