package com.SpringAssignment1.SpringAssignment1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	System.out.println("Spring-Injected Class with Custom Map Values");
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        MapClass mapClass = context.getBean("myClass", MapClass.class);
        mapClass.printMap();
        ((AbstractApplicationContext) context).close();
    }
}