package com.webcache.springdemo.beanlifecyclemethods;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.webcache.springdemo.ICoach;

/**
 * For Prototype scope methods, Spring does not call Destroy method!!!
 * 
 * In contrast to the other scopes, Spring does not manage the complete
 * lifecycle of a prototype bean: the container instantiates, configures, and
 * otherwise assembles a prototype object, and hands it to the client, with no
 * further record of that prototype instance.
 * 
 * Thus, although initialization lifecycle callback methods are called on all
 * objects regardless of scope, in the case of prototypes, configured
 * destruction lifecycle callbacks are not called. The client code must clean up
 * prototype-scoped objects and release expensive resources that the prototype
 * bean(s) are holding.
 * 
 * This also applies to both XML configuration and Annotation-based
 * configuration.
 */
public class BeanLifecycleDemoApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"bean-lifecycle-applicationContext.xml");

		ICoach tennisCoach = applicationContext.getBean("myCoach", ICoach.class);

		System.out.println(tennisCoach.getDailyWorkout());
		System.out.println(tennisCoach.getDailyFortune());
		System.out.println(tennisCoach.getRandomDailyFortune());

		applicationContext.close();
	}

}
