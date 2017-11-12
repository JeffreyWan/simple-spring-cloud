package com.github.jw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class DoctorServerCenterApplication {

	public static void main(String[] args) {
		SpringApplication.run(DoctorServerCenterApplication.class, args);
	}
}
