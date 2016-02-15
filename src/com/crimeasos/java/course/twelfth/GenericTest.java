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
        List<String> stringList = new ArrayList<String>();
        List list = new ArrayList();

        list = stringList;
        list.add(1);

        //String test = (String) list.get(0);
        System.out.println(stringList);

        SomeType someType = new SomeType();
        //someType.test(Arrays.asList("test"));

        List<Object> objectList = new ArrayList<>();
        someType.test(stringList);
        someType.test(objectList);
    }
}

class SomeType<T> {
//    public <E> void test(Collection<E> collection) {
//        for (E e : collection) {
//            System.out.println(e);
//        }
//    }

    public  void test(List<Integer> list) {
        for (Integer el : list) {
            System.out.println(el);
        }
    }

}
