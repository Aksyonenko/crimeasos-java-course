package com.crimeasos.java.course.eleventh.decorator;

/**
 * Created by Паша on 07.04.2015.
 */
public class ProductA implements IProduct {

    public double cost() {
        return 0.5;
    }

    public String description() {
        return "productA, cost=" + cost();
    }

}
