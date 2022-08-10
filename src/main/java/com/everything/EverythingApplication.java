package com.everything;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.everything.*")
@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class EverythingApplication {

	public static void main(String[] args) {
		SpringApplication.run(EverythingApplication.class, args);
	}

}
