package com.github.jw.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by Jeffrey on 12/11/2017.
 */
@Service("userRibbonService")
public class UserRibbonService {

    @Autowired
    private RestTemplate restTemplate;

    public String userIndex() {
        return restTemplate.getForObject("http://user-server-center/user/index", String.class);
    }
}
