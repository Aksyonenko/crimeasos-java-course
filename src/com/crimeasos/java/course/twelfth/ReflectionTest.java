package com.crimeasos.java.course.twelfth;

import java.lang.reflect.Array;
import java.lang.reflect.Field;

/**
 * Created by Паша on 15.02.2016.
 */
public class ReflectionTest {


    public static void main(String[] args) throws NoSuchFieldException {
        Class clazz = ReflectionClass.class;
//        System.out.println(clazz.getPackage());
//        System.out.println(clazz.getName());
//        System.out.println(clazz.getSimpleName());
//
//
//        Field[] fields = clazz.getDeclaredFields();
//        for (Field field : fields)
//            System.out.println(field);




        Field field = clazz.getDeclaredField("i");
        field.setAccessible(true);
        ReflectionClass reflectionClass = new ReflectionClass();
        try {
            System.out.println(field.get(reflectionClass));
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        int[] intArray = (int[]) Array.newInstance(int.class, 3);

        Array.set(intArray, 0, 123);
        Array.set(intArray, 1, 456);
        Array.set(intArray, 2, 789);

        for (int i : intArray) {
            System.out.println(i);
        }
    }
}


class ReflectionClass {

    private int i = 5;
    public int j;
//    @DefaultStringValue(defaultValue = "test")
//    private String privateField;
}
