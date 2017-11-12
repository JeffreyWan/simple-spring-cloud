package com.github.jw.controller;

import com.github.jw.service.UserService;
import com.github.jw.service.impl.UserRibbonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Jeffrey on 12/11/2017.
 */
@RestController
@RequestMapping("api")
public class IndexController {

    @Autowired
    private UserRibbonService userRibbonService;

    @Autowired
    private UserService userService;

    @GetMapping("user/index/ribbon")
    public ResponseEntity userIndex() {
        return ResponseEntity.ok(userRibbonService.userIndex());
    }

    @GetMapping("user/index/feign")
    public ResponseEntity userIndexFeign() {
        return ResponseEntity.ok(userService.userIndex());
    }

}
