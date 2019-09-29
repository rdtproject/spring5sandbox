package com.webcache.springannotations.explicitcomponentname;

import org.springframework.stereotype.Component;

@Component("yourSwimmingCoach")
public class SwimmingCoach implements ISwimmingCoach {

	public String getDailyWorkout() {
		return "Your swimmin workout";
	}

}
