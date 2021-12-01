package com.bridgelabz.mood.analyzer;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

public class MoodAnalyzerTest {
	
	public static MoodAnalyzer mood;

	@BeforeClass
	public static void init() {
		mood = MoodAnalyzer.getInstance();
	}

	@Test
	public void given_message_should_return_SAD(String mesage) {
		String message = "I am in sad Mood";
		String reaction = mood.analyzeMood();
		System.out.println(reaction);
		assertEquals("SAD", reaction);
	}

	@Test
	public void given_message_should_return_HAPPY() {
		String message = "I am in any Mood";

		String reaction = mood.analyzeMood();
		System.out.println(reaction);
		assertEquals("HAPPY", reaction);
	}
	 
}
