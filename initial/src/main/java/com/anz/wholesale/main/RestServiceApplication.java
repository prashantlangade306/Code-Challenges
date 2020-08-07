package com.anz.wholesale.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * This is the spring boot class that is used by spring initialiser to look for
 * and create needed beans to start the application successfully.
 *
 */
@SpringBootApplication
@ComponentScan({
		"com.anz.wholesale.controller",
		"com.anz.wholesale.domain",
		"com.anz.wholesale.service",
		"com.anz.wholesale.Exception"
})
public class RestServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestServiceApplication.class, args);
	}
}
