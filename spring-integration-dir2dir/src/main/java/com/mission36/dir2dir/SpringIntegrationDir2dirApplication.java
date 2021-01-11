package com.mission36.dir2dir;

import java.util.Scanner;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.mission36.dir2dir.configuration.BasicIntegrationConfig;

@SpringBootApplication
public class SpringIntegrationDir2dirApplication {

	public static void main(String[] args) {
		// SpringApplication.run(SpringIntegrationDir2dirApplication.class, args);
		AbstractApplicationContext ctx = new AnnotationConfigApplicationContext(BasicIntegrationConfig.class);
		ctx.registerShutdownHook();

		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter q and press <enter> to exit the program: ");

		while (true) {
			String input = scanner.nextLine();
			if ("q".equals(input.trim())) {
				break;
			}
		}
		scanner.close(); ctx.close();
		System.exit(0);
	}

}
