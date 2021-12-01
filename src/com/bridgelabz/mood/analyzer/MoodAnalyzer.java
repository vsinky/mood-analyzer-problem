package com.bridgelabz.mood.analyzer;

import com.bridgelabz.mood.analyzer.MoodAnalysisException.Mood;

public class MoodAnalyzer {
	public static MoodAnalyzer instance;
	public  static String message;

	 MoodAnalyzer(String message) {
		this.message = message;
	}

	public static MoodAnalyzer getInstance(String message) {
		if (instance == null) {
			instance = new MoodAnalyzer(message);
		}
		return instance;
	}

	public String analyzeMood() throws MoodAnalysisException {
		try {
			 if (message == null) {
				 throw new MoodAnalysisException(Mood.Empty, "Empty");
			 }
			if (message.toLowerCase().contains("sad"))
				return"SAD";
		else 
				return "HAPPY";
			
		} catch(Exception ex) {
			return null;
		}
	}

	}

