package com.webcache.springdemo.beanscope;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.webcache.springdemo.ICoach;

/**
 * Wywalenie scope Prototype = scope Singleton (default) 
 *
 */
public class BeanScopeDemoApp {	
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean-scope-applicationContext.xml");
		
		ICoach coach = applicationContext.getBean("myCoach", ICoach.class);		
		ICoach coach2 = applicationContext.getBean("myCoach", ICoach.class);
	
		System.out.println(coach == coach2);
		System.out.println(coach);
		System.out.println(coach2);
		
		applicationContext.close();
	}
	
}
