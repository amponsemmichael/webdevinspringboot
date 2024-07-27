package com.amponsem.webdevinspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.amponsem")
public class WebdevinspringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebdevinspringbootApplication.class, args);
	}

}
