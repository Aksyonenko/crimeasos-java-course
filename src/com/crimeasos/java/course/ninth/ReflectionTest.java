package com.crimeasos.java.course.ninth;

/**
 * Created by Паша on 03.02.2016.
 */
public class ReflectionTest {

    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        A a = new A();
        Class classA1 = a.getClass();
        Class classA2 = A.class;

        A a2 = (A) classA1.newInstance();


        System.out.println(a2);
    }
}

class A {
    int field = 5;

    @Override
    public String toString() {
        return "A{" +
                "field=" + field +
                '}';
    }
}
