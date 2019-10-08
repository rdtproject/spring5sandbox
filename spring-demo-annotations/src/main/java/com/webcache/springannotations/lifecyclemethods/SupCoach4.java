package com.webcache.springannotations.lifecyclemethods;

import com.webcache.springannotations.IFortuneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class SupCoach4 implements IRaceCoach {

    /**
     * through reflections
     */
    @Autowired
    private IFortuneService fortuneService;

    public SupCoach4() {
        System.out.println("Inside SupCoach4 constructor");
    }

    @PostConstruct
    public void somePostConstructMethod() {
        System.out.println("Post construct of SupCoach4 executed");
    }

    @PreDestroy
    public void somePreDestroyMethod() {
        System.out.println("Pre destroy of SupCoach4 executed");
    }

    public String abc() {
        return fortuneService.getDailyFortune();
    }

}
