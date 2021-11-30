package com.bridgelabz.mood.analyzer;

public class MoodAnalyzer {
	public static MoodAnalyzer instance;
	public static String mood;

	 MoodAnalyzer(String mood) {
		this.mood = mood;
	}

	public static MoodAnalyzer getInstance() {
		if (instance == null) {
			instance = new MoodAnalyzer(mood);
		}
		return instance;
	}

	public String analyseMood(String message) {
		if (message.toLowerCase().contains("sad"))
			mood = "SAD";
		else {
			mood = "HAPPY";
		}
		return mood;
	}
}
