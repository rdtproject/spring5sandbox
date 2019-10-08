package com.webcache.springannotations.autowiredbyfield;

import com.webcache.springannotations.IWaterCoach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		IWaterCoach coach = applicationContext.getBean("supCoach2", IWaterCoach.class);

		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getDailyFortune());

		applicationContext.close();
	}

}
