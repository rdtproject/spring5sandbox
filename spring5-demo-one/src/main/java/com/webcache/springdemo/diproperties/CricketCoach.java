package com.webcache.springdemo.diproperties;

import com.webcache.springdemo.ICoach;
import com.webcache.springdemo.IFortuneService;
import com.webcache.springdemo.RandomFortuneService;

public class CricketCoach implements ICoach {

	private String emailAddress;
	private String team;

	private IFortuneService fortuneService;
	private RandomFortuneService randomFortuneService;

	public CricketCoach() {
		System.out.println("Inside constructor");
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
		System.out.println("inside set email address");
	}

	public String getTeam() {
		return team;
	}

 	public void setTeam(String team) {
		this.team = team;
		System.out.println("inside set team");
	}

	public void setFortuneService(IFortuneService fortuneService) {
		this.fortuneService = fortuneService;
		System.out.println("Inside setter");
	}

	public void setRandomFortuneService(RandomFortuneService randomFortuneService) {
		this.randomFortuneService = randomFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Cricket daily workout";
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
