package com.crimeasos.java.course.thirteenth;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Паша on 17.02.2016.
 */
public class ThreadTest {

    public static void main(String[] args) {
        List<String> sharedList = new ArrayList<>();

        new ThreadClass1("test1", sharedList).start();
        new Thread(new ThreadClass2(sharedList), "test2").start();
    }
}


class ThreadClass1 extends Thread {
    private final List<String> list;

    public ThreadClass1(String name, List<String> sharedList) {
        super(name);
        list = sharedList;
    }

    @Override
    public void run() {
        System.out.println(getName());

        for (int i = 0; i < 10; i++)
            list.add(Integer.toString(i));
    }


}


class ThreadClass2 implements Runnable {

    final List<String> list;
    public ThreadClass2(List<String> sharedList) {
        list = sharedList;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
//        synchronized (list) {
            for (int i =0; i<10; i++)
                list.add(Integer.toString(i));
//        }
        System.out.println(list);
    }
}