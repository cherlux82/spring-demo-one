package com.draggerco.springdemo;

public class KarateCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Make some karate";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	private FortuneService fortuneService;

	public KarateCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
}
