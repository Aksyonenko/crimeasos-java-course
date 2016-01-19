package com.crimeasos.java.course.seventh;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Паша on 18.01.2016.
 */
public class TestCollections {

    public static void main(String[] args) {
        List list  = new ArrayList();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("d");
        list.add(1, "e");
        System.out.println(list);
        list.remove("e");
        System.out.println(list);
    }
}

