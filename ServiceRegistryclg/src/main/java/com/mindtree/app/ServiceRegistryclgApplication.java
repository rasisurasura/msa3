package com.mindtree.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServiceRegistryclgApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceRegistryclgApplication.class, args);
	}

}
