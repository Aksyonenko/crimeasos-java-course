package com.crimeasos.java.course.thirteenth;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Паша on 17.02.2016.
 */
public class ThreadTest {

    public static void main(String[] args) {
//        List<String> sharedList = new ArrayList<>();

        Thread thread1 = new ThreadClass1("test1");
        Thread thread2 = new Thread(new ThreadClass2(), "test2");
        thread1.start();
        thread2.start();
    }
}


class ThreadClass1 extends Thread {

    public ThreadClass1(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(getName() +  " is running");
    }

}


class ThreadClass2 implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is running");
        Test test = new Test();
        System.out.println(test.sum(2, 6));
    }
}

class Test {
    public int sum(int i1, int i2) {
        return i1 + i2;
    }
}