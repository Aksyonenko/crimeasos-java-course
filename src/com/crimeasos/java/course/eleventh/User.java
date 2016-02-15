package com.crimeasos.java.course.eleventh;

import java.beans.Transient;
import java.io.Serializable;

/**
 * Created by Паша on 10.02.2016.
 */
public class User implements Serializable {


    private static final long serialVersionUID = -8467932483391165735L;
    private String name;
    private String name2;
    private int age;

    transient
    private String pasword = "test";

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", pasword='" + pasword + '\'' +
                '}';
    }
}
