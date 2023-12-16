package com.likhith.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerJava17Application {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServerJava17Application.class, args);
	}

}