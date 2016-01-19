package com.crimeasos.java.course.seventh;

import java.util.*;

/**
 * Created by Паша on 18.01.2016.
 * Тестування колекцій
 */
public class TestCollections {

    public static void main(String[] args) {
        //Тестуємо ArrayList який оснований на принципі масивів
        List list  = new ArrayList();
        list.add(2);
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("d");
        list.add(1, "e");
        System.out.println(list);
        list.remove("e");
        System.out.println(list);

        //HashSet - оснований на HashMap, ми не можемо гарантувати
        // порядок його елементів і він утримує лише унікальні елементи
        Set set = new HashSet();
        set.addAll(list);
        System.out.println(set);
    }
}

