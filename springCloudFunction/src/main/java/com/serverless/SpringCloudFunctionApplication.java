package com.serverless;

import java.util.function.Consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.google.common.base.Function;
import com.google.common.base.Supplier;

@SpringBootApplication
public class SpringCloudFunctionApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudFunctionApplication.class, args);
	}
	@Bean
	public Function<String, String> function(){
		return input -> input;
	}
	
	@Bean
	public Consumer<String> consume(){
		return input -> System.out.println("input: "+ input);
		}
		
		@Bean
		public Supplier<String> supply(){
			return () -> "Hello Youtube";
		}
	

}

	