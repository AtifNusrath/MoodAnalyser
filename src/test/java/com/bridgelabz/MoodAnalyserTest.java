package com.bridgelabz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MoodAnalyserTest {
    @Test
    public void givenMessage_WhenSad_ShouldReturnSad() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Sad Mood");
        String mood = null;
        try {
            mood = moodAnalyser.analyseMood();
        } catch (MoodAnalysisException e) {
            e.printStackTrace();
        }
        assertEquals("SAD", mood);
    }

    @Test
    public void givenMessage_WhenHappy_ShouldReturnHappy() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Happy Mood");
        String mood = null;
        try {
            mood = moodAnalyser.analyseMood();
        } catch (MoodAnalysisException e) {
            e.printStackTrace();
        }
        assertEquals("HAPPY", mood);
    }

    @Test
    public void givenNullMood_ShouldReturnHappy() {
        MoodAnalyser moodAnalyser = new MoodAnalyser(null);
        String mood = null;
        try {
            mood = moodAnalyser.analyseMood();
        } catch (MoodAnalysisException e) {
            e.printStackTrace();
        }
        assertEquals("HAPPY", mood);
    }

    @Test
    public void givenEmptyMood_ShouldThrowException_withType() {
        MoodAnalyser realMoodAnalyser = new MoodAnalyser("");
        try {
            realMoodAnalyser.analyseMood();
        } catch (MoodAnalysisException e) {
            e.printStackTrace();
            assertEquals(MoodAnalysisException.ExceptionType.ENTERED_EMPTY,e.type);
        }
    }

    @Test
    public void givenNullMood_ShouldThrowException_withType() {
        MoodAnalyser realMoodAnalyser = new MoodAnalyser(null);
        try {
            realMoodAnalyser.analyseMood();
        } catch (MoodAnalysisException e) {
            e.printStackTrace();
            assertEquals(MoodAnalysisException.ExceptionType.ENTERED_NULL,e.type);
        }
    }

}
