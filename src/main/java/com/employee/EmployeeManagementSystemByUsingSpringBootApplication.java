package com.employee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
/* It is the combination of @Enable auto configuration ,@ComponentScan ,@springbotot configuartion 
 * it is used to run spring boot application
 * it is used to enable auto configuration 
 * it is used to scan component classes
 * it is used to enable the  @SpringBootConfigurtion*/
@EnableAutoConfiguration
@ComponentScan(basePackages="com.employee")
@SpringBootConfiguration
@SpringBootApplication
public class EmployeeManagementSystemByUsingSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeManagementSystemByUsingSpringBootApplication.class, args);
	}

}
