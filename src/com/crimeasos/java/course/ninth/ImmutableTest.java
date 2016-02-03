package com.crimeasos.java.course.ninth;

import java.math.BigDecimal;

/**
 * Created by Паша on 27.01.2016.
 */
public class ImmutableTest {

    public static void main(String[] args) throws CloneNotSupportedException {
        String name = "name";
        StringBuilder sb = new StringBuilder();
        sb.append("name");


        for (int i=0; i<5; i++ ) {
            sb.append(i);
            //name = name + i;
        }

        System.out.println(sb.toString());

        Integer i1 = 128;
        Integer i2 = 128;
        System.out.println(i1 == i2);

        BigDecimal bc = new BigDecimal("1.03");
        BigDecimal bc2 = bc.subtract(new BigDecimal("0.42"));
        System.out.println(bc2);
    }
}