package com.bridgelabz.mood.analyzer;

public class MoodAnalysisException extends Exception {
       Mood mood ;
       enum Mood {Empty}
       
       MoodAnalysisException(Mood mood , String message){
    	   super(message);
    	   this.mood = mood;
       }
}
