package com.github.jw.service;

import com.github.jw.service.impl.UserServiceHiHystric;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by Jeffrey on 12/11/2017.
 */
@FeignClient(value = "user-server-center", fallback = UserServiceHiHystric.class)
public interface UserService {

    @GetMapping("user/index")
    String userIndex();

}
