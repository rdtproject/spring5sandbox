package com.webcache.noxmlconfigandparams;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        ICoach coach = applicationContext.getBean("swimSrim", ICoach.class);

        System.out.println(coach.getDailyWorkout());
        System.out.println(coach.getDailyFortune());
        System.out.println(((SwimCoach)coach).getTeam());
        System.out.println(((SwimCoach)coach).getEmail());
    }

}
