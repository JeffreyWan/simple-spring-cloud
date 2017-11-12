package com.github.jw.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Jeffrey on 12/11/2017.
 */
@RestController
@RequestMapping("user")
public class IndexController {

    @Value("${server.port}")
    private String port;

    @GetMapping("index")
    public ResponseEntity index() {
        return ResponseEntity.ok("user server run on port:".concat(port));
    }

}
