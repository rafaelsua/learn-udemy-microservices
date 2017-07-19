package com.dhaker.microservices.common.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class LabCommonServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(LabCommonServerApplication.class, args);
	}
}
