package com.crimeasos.java.course.third;

/**
 * Created by Паша on 03.12.2015.
 * Cat наслідує Animal тому теж має доступ до методу sleep()
 */
public class Cat extends Animal {

    //приватне поле ім'я , до нього можна доступитись тільки в самому класі Cat
    private String name ="Simon";
    //приватне поле вік , до нього можна доступитись тільки в самому класі Cat
    //int - числовий тип даних
    private int age = 7;

    /**
     * Публічний, тобто доступний з будь-якого місця метод
     * метод має повертати значення типу String
     * @return повертає змінну name
     */
    public String getName() {
        return name;
    }

    /**
     * Публічний, тобто доступний з будь-якого місця метод
     * метод має повертати значення типу int
     * @return повертає змінну age
     */
    public int getAge() {
        return age;
    }

}
