package com.crimeasos.java.course.eleventh.decorator;

/**
 * Created by Паша on 07.04.2015.
 */
public class ProductDecoratorColor extends ProductDecorator {

    private String color;

    public ProductDecoratorColor(IProduct product, String color) {
        super(product);
        this.color = color;
    }

    public double cost() {
        return product.cost();
    }

    public String description() {
        return product.description() + ", color:" + color;
    }
}
