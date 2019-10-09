package com.webcache.noxmlconfig;

import com.webcache.springannotations.ICoach;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		IVehicle vehicle = applicationContext.getBean("car", IVehicle.class);

		System.out.println(vehicle.getName());
		System.out.println(vehicle.getDriversName());

		applicationContext.close();
	}

}
