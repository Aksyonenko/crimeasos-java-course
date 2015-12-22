package com.crimeasos.java.course.fifth;

/**
 * Created by Паша on 21.12.2015.
 * Клас демонструє роботу збірника сміття
 */
class TestGC {

    /**
     * Свторення змінної, присвоєння їй нульового значення і виклик  збірника сміття
     * @param args
     */
    public static void main(String[] args) {
        Test test = new Test();
        test = null;
        System.gc();
    }

}