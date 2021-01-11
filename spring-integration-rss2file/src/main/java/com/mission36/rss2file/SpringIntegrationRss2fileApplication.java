package com.mission36.rss2file;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("/integration/integration.xml")
public class SpringIntegrationRss2fileApplication {

	public static void main(String[] args) throws IOException {
		//SpringApplication.run(SpringIntegrationRss2fileApplication.class, args);
		
		ConfigurableApplicationContext cfgAplCtx = new SpringApplication(SpringIntegrationRss2fileApplication.class).run(args);
		System.out.println("Hit enter to stop !!!!!");
		System.in.read();
		cfgAplCtx.close();
	}

}
