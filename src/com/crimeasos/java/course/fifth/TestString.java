package com.crimeasos.java.course.fifth;

/**
 * Created by Паша on 22.12.2015.
 * Клас демонструю різницю при свторенню змінної типу String
 */
class TestString {

    public static void main(String[] args) {
        //Сторюється новий об'єкт в heap
        String test1 = new String("test");
        //Сторюється новий об'єкт в стрінг пулі
        String test2 = "test";
        //Береться створений в стрінг пулі об'єкт
        String test3 = "test";

        //знак == порівнює чи силки ссилаються на один і той сами об'єкт в пам'яті
        System.out.println(test1 == test2);
        System.out.println(test2 == test3);
    }
}
