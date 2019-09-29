package com.webcache.springdemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomFortuneService {

	private static final List<String> fortunes = new ArrayList<String>();

	static {
		fortunes.add("Random1");
		fortunes.add("Random2");
		fortunes.add("Random3");
	}

	public String getRandomFortune() {
		return fortunes.get(new Random().nextInt(fortunes.size()));
	}

}
