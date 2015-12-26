package com.crimeasos.java.course.sixth;

/**
 * Created by Паша on 25.12.2015.
 */
public class DesitionAndLoopingStatementsTest {

    public static void main(String[] args) {
        int a = 2, b = 1;

        if (a<b) {
            System.out.println("a<b");
        } else if (a==b) {
            System.out.println("a==b");
        } else {
            System.out.println("a>b");
        }

        switch (a) {
            case 0:
                System.out.println("0");
                break;
            case 1:
                System.out.println("1");
                break;
            default:
                System.out.println("default");
        }

        a =5;
        while (a>5) {
            System.out.print(a);
            a--;
        }
        System.out.println();
        a =5;
        do {
            System.out.print(a);
            a--;
        }
        while (a>5);
        System.out.println();
        int[] arr = {0, 1, 2, 3, 4, 5};
        for (int i = 0; i<arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();
        for (int j : arr) {
            System.out.print(j);
        }
    }
}
