package com.crimeasos.java.course.fifth;

/**
 * Created by Паша on 13.12.2015.
 * Клас демонструє класи обгортки для примітивів
 */
class WrapperData {
    Integer i1 = 1;
    Integer i3 = new Integer("1");
    Long l1 = 1l;
    Long l3 = new Long("1l");
    Short sh1 = 1;
    Short sh3 = new Short("1l");
    Character ch1 = 'C';
    Character ch2 = new Character('C');

    Boolean result = true;
    Character capitalC = 'C';
    Byte b = 100;
    Short s = 10000;
    Integer i = 100000;
    Long l = 10000l;
    Double d1 = 123.4;
    Float f1 = 123.4f;


    public static void main(String[] args) {
        //Сторення та ініціалізація деількох змінних одночасно
        Integer c1 = 1, c2 = 3, c3 = new Integer("1");
        //Створення декількох змінних без присвоєння їм значень
        Integer b1, b2, b3;
    }
}


