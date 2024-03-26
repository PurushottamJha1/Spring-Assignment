package com.SpringAssignment3.SpringAssignment3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.ApplicationContext;

@Component
public class App 
{
	private Triangle triangle;
	@Autowired
	public App(Triangle triangle) {
		this.triangle=triangle;
	}
    public static void main( String[] args )
    {
        System.out.println("Transitioning to Annotation-Based Configuration for the Triangle Bean in Spring");
        ApplicationContext context = new AnnotationConfigApplicationContext(TriangleConfig.class);
        App app = context.getBean(App.class);
        System.out.println("Area of the triangle: " + app.triangle.calculateArea());
    }
}