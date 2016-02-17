package com.crimeasos.java.course.twelfth;

import java.lang.reflect.Field;

/**
 * Created by Паша on 15.02.2016.
 */
public class ReflectionTest {


    public static void main(String[] args) throws NoSuchFieldException {
        Class clazz = ReflectionClass.class;
        System.out.println(clazz.getPackage());
        System.out.println(clazz.getName());
        System.out.println(clazz.getSimpleName());


        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields)
            System.out.println(field);




//        Field field = clazz.getDeclaredField("test");
//        System.out.print(field.getName());
//        field.setAccessible(true);
//        ReflectionClass reflectionClass = new ReflectionClass();

    }
}


class ReflectionClass {

    private int i;
    public int j;
//    @DefaultStringValue(defaultValue = "test")
//    private String privateField;
}
