package com.ms;

import java.time.LocalDateTime;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class ConfigServerApplication{

	private static final Logger logger = LoggerFactory.getLogger(ConfigServerApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(ConfigServerApplication.class, args);
		logger.info("Started Config Server App: {}", LocalDateTime.now());
	}

}
