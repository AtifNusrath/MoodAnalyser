package com.bridgelabz;

public class MoodAnalyser {
    public static void main(String[] args) {
        System.out.println("Mood Analyzer Problem");
    }

    public String analyseMood(String message) {
        if (message.contains("Sad")){
            return "SAD";
        }else{
            return "HAPPY";
        }
    }
}
