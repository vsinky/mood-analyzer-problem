package com.bridgelabz.mood.analyzer;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws MoodAnalysisException { 
		//System.out.println("Welcome to Mood Analyzer");
		//Scanner sc = new Scanner(System.in);

		//String mood = sc.nextLine();
		MoodAnalyzer md =  MoodAnalyzer.getInstance(null);
		System.out.println(md.analyzeMood());
	
	}
}