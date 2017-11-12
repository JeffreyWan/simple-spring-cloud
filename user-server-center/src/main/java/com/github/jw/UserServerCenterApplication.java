package com.github.jw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class UserServerCenterApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserServerCenterApplication.class, args);
	}
}
