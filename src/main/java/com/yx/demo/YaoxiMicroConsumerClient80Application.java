package com.yx.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class YaoxiMicroConsumerClient80Application {

	public static void main(String[] args) {
		SpringApplication.run(YaoxiMicroConsumerClient80Application.class, args);
	}

}
