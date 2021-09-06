package com.example.demoapp;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoappApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(DemoappApplication.class, args);
		
		//Beans
		String[] names = context.getBeanDefinitionNames();
		
		for (String name : names) {
			System.out.println(name);
		}
		
		Arrays.stream(names).forEach(System.out::println);
		
		System.out.println(context.getBeanDefinitionCount());
	}

}
