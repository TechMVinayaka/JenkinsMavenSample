package com.jenkins.maven;

import static org.junit.Assert.assertEquals;

import org.junit.Test;



public class JenkinsCalculatorTest {

	@Test
	public void addTest() {
		JenkinsCalculator calculator = new JenkinsCalculator();
		assertEquals(10, calculator.addNumbers(5,5));
		
	}
	
	@Test
	public void subtractTest() {
		JenkinsCalculator calculator = new JenkinsCalculator();
		assertEquals(5, calculator.subtractNumbers(10,5));
		
	}

}
