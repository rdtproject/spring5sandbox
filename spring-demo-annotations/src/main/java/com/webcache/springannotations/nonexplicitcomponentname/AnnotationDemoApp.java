package com.webcache.springannotations.nonexplicitcomponentname;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * if Swimming coach does not have explicit name, it can be still referenced by camel case class name
 */
public class AnnotationDemoApp {
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		ISwimmingCoach coach = applicationContext.getBean("swimmingCoach", ISwimmingCoach.class);
		
		System.out.println(coach.getDailyWorkout());
		
		applicationContext.close();
	}
	
}
