package com.crimeasos.java.course.third;

/**
 * Created by Паша on 03.12.2015.
 * Клас Animal - описує спільні можливості для всіх творин,
 * всі класи які наслідуватимуть Animal мають доступ до всіх не private полей і методів
 */
public class Animal {

    /**
     * Метод sleep() виводить "Z-z-z-z-z"
     * він має модифікатор доступу protected, тому до нього матимуть доступ всі наслідники також
     */
    protected void sleep() {
        System.out.println("Z-z-z-z-z");
    }
}
