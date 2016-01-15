package com.crimeasos.java.course.sixth.calculator;

/**
 * Created by Паша on 06.01.2016.
 */
public class Calculator {
    public static int add(int a, int b) {
        return a+b;
    }
    public static int multiply(int a, int b) {
        return a*b;
    }
    public static int divide(int a, int b) {
        return a/b;
    }
    public static int subtraction(int a, int b) {
        return a-b;
    }

    public static double add(double a, double b) {
        return a+b;
    }
    public static double multiply(double a, double b) {
        return a*b;
    }
    public static double divide(double a, double b) {
        return a/b;
    }
    public static double subtraction(double a, double b) {
        return a-b;
    }

    public static int addMultiple(int[] arr) {
        int result =0;
        for (int a : arr) {
            result += a;
        }
        return result;
    }
    public static double addMultiple(double[] arr) {
        double result =0;
        for (double a : arr) {
            result += a;
        }
        return result;
    }
}
