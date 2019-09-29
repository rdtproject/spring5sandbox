package com.webcache.springdemo;

public class HappyFortuneService implements IFortuneService {

	@Override
	public String getFortune() {
		return "Today is your lukcy day";
	}

}
