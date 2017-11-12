package com.github.jw.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Jeffrey on 12/11/2017.
 */
@RestController
@RequestMapping("doctor")
public class DoctorController {

    @Value("${server.port}")
    private String port;

    @GetMapping("index")
    String index() {
        return "doctor server port:".concat(port);
    }

}
