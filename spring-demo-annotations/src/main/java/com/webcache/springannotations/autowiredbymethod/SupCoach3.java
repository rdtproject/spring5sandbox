package com.webcache.springannotations.autowiredbymethod;

import com.webcache.springannotations.IFortuneService;
import com.webcache.springannotations.IWaterCoach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SupCoach3 implements IWaterCoach {

    /** through reflections */

    private IFortuneService fortuneService;

    public SupCoach3() {
        System.out.println("Inside SupCoach3 constructor");
    }

    @Autowired
    public void setFortuneServicee(IFortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Workout from tennis coach";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getDailyFortune();
    }

}
