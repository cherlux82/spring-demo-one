package com.draggerco.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		CicketCoach coach = context.getBean("myCricketCoach", CicketCoach.class);
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getDailyFortune());
		System.out.println(" Team: " + coach.getTeam());
		System.out.println(" email: " + coach.getEmailAddress());
		context.close();
	}
}
