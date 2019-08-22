package com.yx.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class YaoxiMicroEureka7002Application {

	public static void main(String[] args) {
		SpringApplication.run(YaoxiMicroEureka7002Application.class, args);
	}

}
