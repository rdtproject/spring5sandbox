package com.webcache.springdemo.diproperties;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("diproperties/applicationContext.xml");
		CricketCoach coach = context.getBean("myCricketCoach", CricketCoach.class);
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getDailyFortune());
		System.out.println(coach.getTeam());
		System.out.println(coach.getEmailAddress());
		System.out.println(coach.getRandomDailyFortune());
		
		context.close();
	}

}
