package com.crimeasos.java.course.twelfth.custom_annotation;

import java.lang.reflect.Field;

/**
 * Created by Паша on 17.02.2016.
 */
public class TestCustomAnnotation {

    public static void main(String[] args) {
        TestClass testClass = new TestClass();
        System.out.println(testClass);
        defaultStringValueParser(testClass);
        System.out.println(testClass);
    }

    private static void defaultStringValueParser(Object o) {
        try {
            Field[] fields = Class.forName(o.getClass().getName()).getDeclaredFields();
            for (Field field : fields) {
                if (field.isAnnotationPresent(DefaultStringValue.class)) {
                    DefaultStringValue defaultStringValue = field.getAnnotation(DefaultStringValue.class);
                    String value = defaultStringValue.defaultValue();
                    try {
                        field.set(o, value);
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    }
                }

            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}


class TestClass {

    @DefaultStringValue()
    String field1;

    @DefaultStringValue(defaultValue = "test")
    String field2;

    String field3;

    @Override
    public String toString() {
        return "TestClass{" +
                "field1='" + field1 + '\'' +
                ", field2='" + field2 + '\'' +
                ", field3='" + field3 + '\'' +
                '}';
    }
}
