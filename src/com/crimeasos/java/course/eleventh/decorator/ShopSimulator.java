package com.crimeasos.java.course.eleventh.decorator;

/**
 * Created by Паша on 07.04.2015.
 */
public class ShopSimulator {

    public static void main(String[] args) {

        IProduct product = new ProductA();

        System.out.println(product.description());
        product = new ProductDecoratorColor(product, "red");
        System.out.println(product.description());
        product = new ProductDecoratorSize(product, "medium");
        System.out.println(product.description());
    }
}
