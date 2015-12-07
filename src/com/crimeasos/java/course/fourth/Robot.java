package com.crimeasos.java.course.fourth;

/**
 * Created by Паша on 05.12.2015.
 * клас Robot описує головні властивості і можливості робота
 */
public class Robot {

    /**
     * поле ім'я, типу String тобто текстове
     * protected - означає що до нього можна дістатись
     * 1. з самого класу
     * 2. з класу наслідника
     * 3. з будь-якого місця цьому самому в пакеті
     */
    protected String name;

    /**
     * Конструктор без параметрів,
     * викликається автоматично якщо створити новий екзмепляр наступним чином
     * Robot robot = new Robot();
     */
    public Robot() {
        name = "Simon";
    }

    /**
     * Конструктор з параметром,
     * викликається автоматично якщо створити новий екзмепляр наступним чином
     * Robot robot = new Robot("robot");
     * this.name - це name нашого класу
     * name - це name який передається параметром в конструкторі
     */
    Robot(String name) {
        this.name = name;
    }

    /**
     * Публічний метод виводить ім'я робота
     */
    public void printName() {
        System.out.println(this.name);
    }

}
