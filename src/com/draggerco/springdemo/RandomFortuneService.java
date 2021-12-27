package com.draggerco.springdemo;

import java.util.Random;

public class RandomFortuneService implements FortuneService {

	public String[] fortune_message = { "you will have an excellent day!", "Better not leave the house",
			"It will be a normal day " };

	private Random random = null;

	public RandomFortuneService() {
		random = new Random();
	}

	@Override
	public String getFortune() {
		int idx = random.nextInt(3);
		System.out.println("Random: " + idx);
		return fortune_message[idx];
	}

}
