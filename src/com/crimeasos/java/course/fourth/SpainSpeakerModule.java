package com.crimeasos.java.course.fourth;

/**
 * Created by Паша on 05.12.2015.
 * Клас SpainSpeakerModule імплементує інтерфейс Speaking,
 * тому в ньому має бути визначений метод speak
 */
public class SpainSpeakerModule implements Speaking {

    /**
     * Цей метод додає "in Spain " на початку тексту який виводить
     * @param text - параметр передається який в метод
     */
    @Override
    public void speak(String text) {
        System.out.println("in Spain "  + text);
    }
}
