package com.bridgelabz.mood.analyzer;

public class MoodAnalyzer {
	public static MoodAnalyzer instance;
	private String mood;

	private MoodAnalyzer() {

	}

	public static MoodAnalyzer getInstance() {
		if (instance == null) {
			instance = new MoodAnalyzer();
		}
		return instance;
	}

	public String analyseMood(String message) {
		if (message.toLowerCase().contains("sad"))
			mood = "SAD";
		else   {
			mood = "HAPPY";
		}
		return mood;
	}
}
