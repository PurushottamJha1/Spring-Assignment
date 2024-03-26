package com.SpringAssignment4.SpringAssignment4;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackages = {"com.springcore.question4","com.springcore.service"})
public class AppConfig {
    @Bean
    public Triangle triangle() {
    	return new Triangle();
    }
}