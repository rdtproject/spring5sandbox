package com.webcache.springdemo.beanscope;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.webcache.springdemo.ICoach;

/**
 * Wywalenie scope Prototype = scope Singleton (default) 
 *
 */
public class BeanScopeDemoApp {
	
	public static void main(String[] args) {
		singletonScope();
		prototypeScope();
		defaultScope();
	}

	public static void prototypeScope() {
		ClassPathXmlApplicationContext applicationContextPrototype = new ClassPathXmlApplicationContext("beanscope/bean-scope-prototype-applicationContext.xml");
		compare(applicationContextPrototype, "Prototype scope gives:");
		applicationContextPrototype.close();
	}

	public static void singletonScope() {
		ClassPathXmlApplicationContext applicationContextSingleton = new ClassPathXmlApplicationContext("beanscope/bean-scope-singleton-applicationContext.xml");
		compare(applicationContextSingleton, "Singleton (default) scope gives:");
		applicationContextSingleton.close();
	}

	public static void defaultScope() {
		ClassPathXmlApplicationContext applicationContextDefault = new ClassPathXmlApplicationContext("beanscope/bean-scope-default-applicationContext.xml");
		compare(applicationContextDefault, "Default scope gives:");
		applicationContextDefault.close();
	}

	private static void compare(ClassPathXmlApplicationContext context, String comment) {
		ICoach coach1 = context.getBean("myCoach", ICoach.class);
		ICoach coach2 = context.getBean("myCoach", ICoach.class);

		System.out.println("---------" + comment + "--------------------");
		System.out.println("coach1 == coach2: " + (coach1 == coach2));
		System.out.println("coach1" + coach1);
		System.out.println("coach2" + coach2);
		System.out.println("");
	}
	
}
