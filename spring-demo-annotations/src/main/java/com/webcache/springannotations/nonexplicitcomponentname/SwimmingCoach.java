package com.webcache.springannotations.nonexplicitcomponentname;

import org.springframework.stereotype.Component;

@Component
public class SwimmingCoach implements ISwimmingCoach {

	public String getDailyWorkout() {
		return "Your swimmin workout";
	}

}
