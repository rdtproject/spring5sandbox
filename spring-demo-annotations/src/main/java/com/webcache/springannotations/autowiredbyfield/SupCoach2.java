package com.webcache.springannotations.autowiredbyfield;

import com.webcache.springannotations.IFortuneService;
import com.webcache.springannotations.IWaterCoach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SupCoach2 implements IWaterCoach {

    /** through reflections */
    @Autowired
    private IFortuneService fortuneService;

    @Override
    public String getDailyWorkout() {
        return "Workout from tennis coach";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getDailyFortune();
    }

}
