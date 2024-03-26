package com.SpringAssignment4.SpringAssignment4;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println("Enhance Functionality: Implement Aspects to Log Execution Time in Milliseconds for Each Executed Function");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Triangle triangle = context.getBean(Triangle.class);
        triangle.setName("Scalene Triangle");
        triangle.draw();
        context.close();
    }
}