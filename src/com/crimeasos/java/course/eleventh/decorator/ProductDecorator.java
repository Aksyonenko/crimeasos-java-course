package com.crimeasos.java.course.eleventh.decorator;

/**
 * Created by Паша on 07.04.2015.
 */
public abstract class ProductDecorator implements IProduct {

    protected IProduct product;

    public ProductDecorator(IProduct product) {
        this.product = product;
    }
}
