package com.cloud.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaServer2Application {

	public static void main(String[] args) {
		SpringApplication springApplication = new SpringApplication(EurekaServerApplication.class);
		springApplication.setAdditionalProfiles("server2");
		springApplication.run(args);
	}
}
