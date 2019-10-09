package com.webcache.noxmlconfigandparams;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements ICoach {

    private IFortuneService fortuneService;

    @Value("${foo.email}")
    private String email;
    @Value("${foo.team}")
    private String team;

    public SwimCoach(IFortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Daily workout from Swim coach";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    public String getEmail() {
        return email;
    }

    public String getTeam() {
        return team;
    }
}
