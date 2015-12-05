package com.crimeasos.java.course.fourth;

/**
 * Created by Паша on 05.12.2015.
 */
public class Robot {
    String simpleRobotName = "simpleRobotName";
    protected String name;

    Robot() {
        name = "Simon";
    }

    Robot(String name) {
        this.name = name;
    }

    public void printName() {
        System.out.println(this.name);
    }

}
