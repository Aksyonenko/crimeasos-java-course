package com.crimeasos.java.course.eleventh.decorator;

/**
 * Created by Паша on 07.04.2015.
 */
public class ProductB implements IProduct {

    public double cost() {
        return 0.2;
    }

    public String description() {
        return "productB, cost=" + cost();
    }
}
