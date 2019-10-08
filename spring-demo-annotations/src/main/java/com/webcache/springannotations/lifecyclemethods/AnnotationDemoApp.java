package com.webcache.springannotations.lifecyclemethods;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		IRaceCoach coach = applicationContext.getBean("supCoach4", IRaceCoach.class);

		System.out.println(coach.abc());

		System.out.println("Closing app ctx");
		applicationContext.close();
		System.out.println("App ctx closed");
	}

}
