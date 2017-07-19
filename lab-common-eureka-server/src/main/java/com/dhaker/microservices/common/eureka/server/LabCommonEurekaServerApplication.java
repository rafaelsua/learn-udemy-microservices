package com.dhaker.microservices.common.eureka.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class LabCommonEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(LabCommonEurekaServerApplication.class, args);
	}
}
