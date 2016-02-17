package com.crimeasos.java.course.twelfth;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * Created by Паша on 11.02.2016.
 */
public class GenericTest {


    public static void main(String[] args) {
//        List<String> stringList = new ArrayList<>();
//
//
//        List list = new ArrayList();
//
//        list = stringList;
//        list.add(1);
//
//
//        String test = (String) list.get(0);
//        System.out.println(stringList);
//
        SomeType<String>  someType = new SomeType<>();
        List<Integer> list = new ArrayList<>();
        list.add(1);
//
//        List<Object> objectList = new ArrayList<>();
//        someType.test(stringList);
//        someType.test(objectList);

//        List<String> stringList1 = Arrays.asList("a1", "a2");
//        Utilities.fill(stringList1, "test");
//        System.out.println(stringList1);
    }
}

class SomeType<T> {
//    public <E> void test(Collection<E> collection) {
//        for (E e : collection) {
//            System.out.println(e);
//        }
//    }

    public void print(T t) {
        System.out.println(t);
    }

    public  void test(ArrayList<Integer> list) {
        for (Integer el : list) {
            System.out.println(el);
        }
    }

}

class Utilities {
    public static <T> void fill(List<T> list, T val) {
        for (int i = 0; i < list.size(); i++)
            list.set(i, val);
    }
}
