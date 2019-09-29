package com.webcache.springdemo.beanlifecyclemethods;

import com.webcache.springdemo.ICoach;
import com.webcache.springdemo.IFortuneService;
import com.webcache.springdemo.RandomFortuneService;

public class TennisCoach implements ICoach {

	private IFortuneService fortuneService;
	private RandomFortuneService randomFortuneService;

	public TennisCoach(IFortuneService fortuneService, RandomFortuneService randomFortuneService) {
		this.fortuneService = fortuneService;
		this.randomFortuneService = randomFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Tennis workout instruction";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	@Override
	public String getRandomDailyFortune() {
		return randomFortuneService.getRandomFortune();
	}

	public void doMyInitStuff() {
		System.out.println("TennisCoach - inside init method");
	}

	public void doMyDestroyStuff() {
		System.out.println("TennisCoach - inside destroy method");
	}
}
