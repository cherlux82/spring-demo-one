package com.draggerco.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

		Coach coach1 = context.getBean("myCoach", Coach.class);
		Coach coach2 = context.getBean("myCoach", Coach.class);

		boolean result = coach1 == coach2;

		System.out.println("\n Son la misma referencia? " + result);

		System.out.println("\n Memoria COACH 1: " + coach1);
		System.out.println("\n Memoria COACH 2: " + coach2);
	}

}
