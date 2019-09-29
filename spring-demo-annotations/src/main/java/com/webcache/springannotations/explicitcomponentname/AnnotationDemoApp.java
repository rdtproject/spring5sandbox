package com.webcache.springannotations.explicitcomponentname;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		ISwimmingCoach coach = applicationContext.getBean("yourSwimmingCoach", ISwimmingCoach.class);
		
		System.out.println(coach.getDailyWorkout());
		
		applicationContext.close();
	}
	
}
