package com.webcache.springannotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements ICoach {

	@Autowired
	private IFortuneService fortuneService;

	public TennisCoach() {
		System.out.println("Inside constructor");
	}

	@Override
	public String getDailyWorkout() {
		return "Workout from tennis coach";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getDailyFortune();
	}

}
