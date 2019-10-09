package com.webcache.springannotations.autowiredbyconstructor;
import com.webcache.springannotations.IWaterCoach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * By occasion example of qualifier to select one of two available implementations of IJoke interface
 * For constructor - more tricky as Qualifier has to be placed next to constructor parameter
 */

@Component
public class SupCoach implements IWaterCoach {

	private IJoke jokeService;

	@Autowired
	public SupCoach(@Qualifier("jokeService1") IJoke jokeService) {
		this.jokeService = jokeService;
		System.out.println("Inside constructor");
	}

	@Override
	public String getDailyWorkout() {
		return "Workout from tennis coach";
	}

	@Override
	public String getDailyFortune() {
		return null;
	}

	@PostConstruct
	public void postCon() {
		System.out.println("SupCoach post construct");
	}

	@PreDestroy
	public void preDest() {
		System.out.println("SupCoach pre destroy");
	}
}
