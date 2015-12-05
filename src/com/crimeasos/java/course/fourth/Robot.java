package com.crimeasos.java.course.fourth;

/**
 * Created by Паша on 05.12.2015.
 */
public class Robot {
    protected String name;

    Robot() {
        name = "Simon";
    }

    Robot(String name) {
        this.name = name;
    }

//    public void speak(String text) {
//        System.out.println(text);
//    }

    public void printName() {
        System.out.println(this.name);
    }

}
