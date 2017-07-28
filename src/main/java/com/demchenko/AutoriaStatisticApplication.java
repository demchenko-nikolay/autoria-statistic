package com.demchenko;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:url.properties")
public class AutoriaStatisticApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(AutoriaStatisticApplication.class, args);
	}

	@Override
	public void run(String... strings) throws Exception {

	}
}
