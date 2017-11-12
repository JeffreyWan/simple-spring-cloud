package com.github.jw.service.impl;

import com.github.jw.service.UserService;
import org.springframework.stereotype.Service;

/**
 * Created by Jeffrey on 12/11/2017.
 */
@Service
public class UserServiceHiHystric implements UserService {
    @Override
    public String userIndex() {
        return "sorry user Server is out off service";
    }
}
