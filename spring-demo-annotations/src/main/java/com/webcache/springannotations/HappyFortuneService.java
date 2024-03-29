package com.webcache.springannotations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements IFortuneService {

	@Value("${joke.good}")
	private String fortuneText;

	public String getDailyFortune() {
		return fortuneText;
	}

}
