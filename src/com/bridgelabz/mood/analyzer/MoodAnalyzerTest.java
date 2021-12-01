package com.bridgelabz.mood.analyzer;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

public class MoodAnalyzerTest {

	public static MoodAnalyzer mood;
	public static String message;

	public MoodAnalyzerTest() {
		message = null;
	}

	@BeforeClass
	public static void init() {
		new MoodAnalyzerTest();

		mood = MoodAnalyzer.getInstance(message);
	}

	@Test
	public void given_message_should_return_SAD() throws MoodAnalysisException {

		String reaction = mood.analyzeMood();
		System.out.println(reaction);
		assertEquals("SAD", reaction);
	}

	@Test
	public void given_message_should_return_HAPPY() {

		String reaction;
		try {

			reaction = mood.analyzeMood();
			assertEquals("HAPPY", reaction);
		} catch (MoodAnalysisException e) {

		}

	}

}
