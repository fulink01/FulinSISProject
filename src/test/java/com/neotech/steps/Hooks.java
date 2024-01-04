package com.neotech.steps;

import com.neotech.testbase.BaseClass;
import com.neotech.utils.CommonMethods;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks extends CommonMethods{
	
	@Before
	public static void start() {
		BaseClass.setUp();
	}
	
	@After
	public static void finish(Scenario scenario) {
		
		byte[] picture;

		if (scenario.isFailed()) {

			picture = CommonMethods.takeScreenShot("/failed/" + scenario.getName());
		
		} else {

			picture = CommonMethods.takeScreenShot("/passed/" + scenario.getName());
		}

		scenario.attach(picture, "image/png", scenario.getName());

		BaseClass.tearDown();
		
	}

}
