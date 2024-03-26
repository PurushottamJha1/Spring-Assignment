package com.SpringAssignment3.SpringAssignment3;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.SpringAssignment3.SpringAssignment3")
public class TriangleConfig{
	@Bean
    public Triangle triangle() {
        return new Triangle(18.12, 12.18);
    }
}