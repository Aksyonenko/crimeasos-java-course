package com.crimeasos.java.course.fourth;

/**
 * Created by Паша on 05.12.2015.
 * Клас EnglishSpeakerModule імплементує інтерфейс Speaking,
 * тому в ньому має бути визначений метод speak
 */
public class EnglishSpeakerModule implements Speaking {

    /**
     * Цей метод додає "in English " на початку тексту який виводить
     * @param text - параметр передається який в метод
     */
    @Override
    public void speak(String text) {
        System.out.println("in English "  + text);
    }
}
