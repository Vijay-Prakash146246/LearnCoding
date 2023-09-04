package com.Lect24;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication //(exclude={DataSourceAutoConfiguration.class})
public class Lect24Application {

	public static void main(String[] args) {
		SpringApplication.run(Lect24Application.class, args);
	}

}
