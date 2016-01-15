package com.crimeasos.java.course.sixth.calculator;

import java.util.Arrays;

/**
 * Created by Паша on 07.01.2016.
 */
public class CalculatorTest {

    public static void main(String[] args) {
        int a = 5, b=3;
        System.out.println("a+b=" + Calculator.add(a, b));
        System.out.println("a-b=" + Calculator.subtraction(a, b));
        System.out.println("a*b=" + Calculator.multiply(a, b));
        System.out.println("a/b=" + Calculator.divide(a, b));

        double c = 12, d = 5;
        System.out.println("c+d=" + Calculator.add(c, d));
        System.out.println("c-d=" + Calculator.subtraction(c, d));
        System.out.println("c*d=" + Calculator.multiply(c, d));
        System.out.println("c/d=" + Calculator.divide(c, d));

        int[] intArr = {1, 3, 12, 22};
        System.out.println("1+3+12+22=" + Calculator.addMultiple(intArr));
        double[] doubleArr = {5.5, 2.12, 7.66, 3.12};
        System.out.println("5.5+2.12+7.66+3.12=" + Calculator.addMultiple(doubleArr));


    }
}
