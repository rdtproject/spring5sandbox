package com.webcache.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.webcache.springdemo.diproperties.CricketCoach;

public class SetterDemoApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		CricketCoach coach = context.getBean("myCricketCoach", CricketCoach.class);
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getDailyFortune());
		
		System.out.println(coach.getTeam());
		System.out.println(coach.getEmailAddress());
		
		System.out.println(coach.getRandomDailyFortune());
		
		context.close();
	}

}
