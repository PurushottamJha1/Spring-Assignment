package com.SpringAssignment4.SpringAssignment4;

import java.util.Random;

public class Triangle {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public void draw() {
		System.out.println("The triangle created is :  " + name);
		Random random = new Random();
        int delay = random.nextInt(100);
        try {
        	System.out.println("Logged Execution time : "+delay+ " ms");
            Thread.sleep(delay);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}