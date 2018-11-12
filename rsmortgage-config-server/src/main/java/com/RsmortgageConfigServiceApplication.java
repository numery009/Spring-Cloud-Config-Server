package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration
@EnableConfigServer
public class RsmortgageConfigServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RsmortgageConfigServiceApplication.class, args);
	}
}
