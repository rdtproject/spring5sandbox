package com.webcache.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Workout {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		ICoach coach = context.getBean("myCoach", ICoach.class);		
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getDailyFortune());
		System.out.println(coach.getRandomDailyFortune());
		context.close();
	}

}
