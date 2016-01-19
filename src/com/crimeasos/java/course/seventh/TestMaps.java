package com.crimeasos.java.course.seventh;

import java.util.*;

/**
 * Created by Паша on 15.01.2016.
 * Клас описує головні можливості реалізацій Map - HashMap, LinkedHashMap, TreeMap
 */
public class TestMaps {

    public static void  main(String[] args) {
        //HashMap - завдяки принципу зберігання на основі хеш-таблиць
        // показує високу продуктивність але не зберігає порядок елементів.
        Map map = new HashMap();
        fillMap(map);
        System.out.println(map);
        //Очистити карту
        map.clear();
        //LinkedHashMap - також завдяки принципу зберігання на основі хеш-таблиць
        // показує високу порівняно продуктивність і що важливо зберігається порядок доданих елементів
        map = new LinkedHashMap();
        fillMap(map);
        System.out.println(map);
        //Очистити карту
        map.clear();
        //TreeMap -  зберігає елементи у відсортованому порядку, але при цьому втрачає у продуктивності
        map = new TreeMap();
        fillMap(map);
        System.out.println(map);

        //виводить всі ключи-keys карти
        System.out.println(map.keySet());
        //виводить всі значення-values карти
        System.out.println(map.values());
        //видалення елемента за ключем
        map.remove("a");
        System.out.println(map);
    }

    /**
     * Заповнює будь-яку реалізацію карти набором значень
     * @param map - повертає заповенену тестовим набором значень карту
     */
    private static void fillMap(Map map) {
        map.put("e", "letter_e");
        map.put("b", "letter_b");
        map.put("a", "letter_a");
        map.put("d", "letter_d");
        map.put("c", "letter_c");
    }
}
