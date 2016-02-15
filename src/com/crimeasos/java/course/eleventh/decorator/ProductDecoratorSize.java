package com.crimeasos.java.course.eleventh.decorator;

/**
 * Created by Паша on 07.04.2015.
 */
public class ProductDecoratorSize extends ProductDecorator {

    private String size;

    public ProductDecoratorSize(IProduct product, String size) {
        super(product);
        this.size = size;
    }

    public double cost() {
        return product.cost();
    }

    public String description() {
        return product.description() + ", size:" + size;
    }
}
