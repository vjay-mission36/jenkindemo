package com.mission36;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringWebMvcApplication {

	protected SpringWebMvcApplication configure(SpringApllicationBuilder application) {
		return application.sources();
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringWebMvcApplication.class, args);
	}

}
