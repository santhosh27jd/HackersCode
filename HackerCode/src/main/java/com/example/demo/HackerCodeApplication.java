package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class HackerCodeApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(HackerCodeApplication.class, args);
		System.out.println("Hacker code");
		
		MyCode code = context.getBean(MyCode.class);
		code.test();
	}

}
