package com.manthanhd.services.userservice.controllers;

import com.manthanhd.services.userservice.models.HealthStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by manth on 04-Dec-16.
 */
@RestController
public class HealthcheckController {

    @RequestMapping(path = "/healthcheck",
            method = RequestMethod.GET,
            produces = "application/json")
    @ResponseBody
    public HealthStatus healthcheck() {
        return HealthStatus.newBuilder().status("OK").build();
    }
}