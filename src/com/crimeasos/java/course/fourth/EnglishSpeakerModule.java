package com.crimeasos.java.course.fourth;

/**
 * Created by ���� on 05.12.2015.
 */
public class EnglishSpeakerModule implements Speaking {
    @Override
    public void speak(String text) {
        System.out.println("in English "  + text);
    }
}
