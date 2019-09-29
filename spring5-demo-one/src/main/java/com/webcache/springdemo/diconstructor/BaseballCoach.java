package com.webcache.springdemo.diconstructor;

import com.webcache.springdemo.ICoach;
import com.webcache.springdemo.IFortuneService;
import com.webcache.springdemo.RandomFortuneService;

public class BaseballCoach implements ICoach {

	private IFortuneService fortuneService;	
	private RandomFortuneService randomFortuneService;

	public BaseballCoach(IFortuneService fortuneService, RandomFortuneService randomFortuneService) {
		this.fortuneService = fortuneService;
		this.randomFortuneService = randomFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Baseball workout instruction";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	@Override
	public String getRandomDailyFortune() {
		return randomFortuneService.getRandomFortune();
	}

}
