package com.draggerco.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RandomSpringApp {

	public static void main(String[] args) {
		System.out.println(
				"====================================== S P R I N G =========================================");

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Coach theCoach = context.getBean("myKarateCoach", Coach.class);
		System.out.println(theCoach.getDailyWorkout());

		for (int i = 0; i < 5; i++)
			System.out.println(theCoach.getDailyFortune());

		context.close();

	}

}
