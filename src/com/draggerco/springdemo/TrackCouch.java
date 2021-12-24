/**
 * 
 */
package com.draggerco.springdemo;

/**
 * @author iccvi
 *
 */
public class TrackCouch implements Coach {

	private FortuneService fortuneService;

	public TrackCouch() {
		 
	}

	public TrackCouch(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyFortune() {
		return "Just Do It!" + fortuneService.getFortune();
	}

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5K";
	}
}
