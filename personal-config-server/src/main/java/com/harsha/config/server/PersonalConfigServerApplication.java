package com.harsha.config.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class PersonalConfigServerApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(PersonalConfigServerApplication.class, args);
	}

}
