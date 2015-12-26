package com.crimeasos.java.course.sixth;

/**
 * Created by Паша on 25.12.2015.
 */
public class OperatorTest {

    public static void main(String[] args) {
        int a = 5, b = 3;
        boolean c = false, d = true;
        testArithmeticOperators(a, b);
        testRelationalOperators(a, b);
        testBitwiseOperators(a, b);
        testShorthandOperators(a, b);
        testLogicalOperators(c, d);
    }

    private static void testArithmeticOperators(int a, int b) {
        System.out.println("a+b=" + (a+b));
        System.out.println("a-b=" + (a-b));
        System.out.println("a*b=" + (a*b));
        System.out.println("a/b=" + (a/b));
        System.out.println("a%b=" + (a%b));
        System.out.println("a++=" + (a++));
        System.out.println("++a=" + (++a));
        System.out.println("a--=" + (a--));
        System.out.println("--a=" + (--a));
        System.out.println();
    }
    private static void testRelationalOperators(int a, int b) {
        System.out.println("a<b=" + (a<b));
        System.out.println("a>b=" + (a>b));
        System.out.println("a<=b=" + (a<=b));
        System.out.println("a>=b=" + (a>=b));
        System.out.println("a==b=" + (a==b));
        System.out.println("a!=b=" + (a!=b));
        System.out.println();
    }
    private static void testBitwiseOperators(int a, int b) {
        System.out.println("a&b=" + (a&b));
        System.out.println("a|b=" + (a|b));
        System.out.println("a^b=" + (a^b));
        System.out.println("~a=" + (~a));
        System.out.println("a<<b=" + (a<<b));
        System.out.println("a>>b=" + (a>>b));
        System.out.println("a>>>b=" + (a>>>b));
        System.out.println();
    }

    private static void testShorthandOperators(int a, int b) {
        System.out.println("a+=1" + (a+=1));
        System.out.println("a-=1" + (a-=1));
        System.out.println("a*=1" + (a*=1));
        System.out.println("a/=1" + (a/=1));
        System.out.println("a%=1" + (a%=1));
        System.out.println();
    }
    private static void testLogicalOperators(boolean a, boolean b) {
        System.out.println("a&&b=" + (a&&b));
        System.out.println("a||b=" + (a||b));
        System.out.println("a<=b=" + (!a));
        System.out.println();
    }
}
