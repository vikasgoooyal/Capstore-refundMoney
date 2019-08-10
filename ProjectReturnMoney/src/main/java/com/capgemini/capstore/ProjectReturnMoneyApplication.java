package com.capgemini.capstore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.capgemini.capstore")
@EntityScan("com.capgemini.capstore.beans")
public class ProjectReturnMoneyApplication {

	public static void main(String[] args) {
		
	}

}
