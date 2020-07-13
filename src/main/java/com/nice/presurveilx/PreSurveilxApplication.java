package com.nice.presurveilx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.nice.controller")
public class PreSurveilxApplication {

	public static void main(String[] args) {
		SpringApplication.run(PreSurveilxApplication.class, args);
	}

}
