package com.crimeasos.java.course.fourth;

/**
 * Created by ���� on 05.12.2015.
 */
public class SpainSpeakerModule implements Speaking {
    @Override
    public void speak(String text) {
        System.out.println("in Spain "  + text);
    }
}
