package com.bridgelabz.mood.analyzer;

public class MoodAnalyzer {
	public static MoodAnalyzer instance;
	private String mood;

	private MoodAnalyzer(String mood) {
		this.mood = mood;
	}

	public static MoodAnalyzer getInstance(String mood) {
		if (instance == null) {
			instance = new MoodAnalyzer(mood);
		}
		return instance;
	}

	public String analyseMood() {
		if (mood.contains("sad"))
			mood = "SAD";
		else if (mood.contains("happy")) {
			mood = "HAPPY";
		}
		return mood;
	}
}
