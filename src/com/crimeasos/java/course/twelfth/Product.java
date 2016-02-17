package com.crimeasos.java.course.twelfth;

import java.math.BigDecimal;

/**
 * Created by Паша on 15.02.2016.
 */
public class Product {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    BigDecimal price;

    public Product(String name, BigDecimal price) {
        this.name = name;
        this.price = price;
    }
}


class Vehicle extends Product {
    int speed;

    public Vehicle(String name, BigDecimal price, int speed) {
        super(name, price);
        this.speed = speed;
    }
}

class Car extends Vehicle {
    int peopleCount;

    public Car(String name, BigDecimal price, int speed, int peopleCount) {
        super(name, price, speed);
        this.peopleCount = peopleCount;
    }
}

class Truck extends Vehicle {
    int capacity;

    public Truck(String name, BigDecimal price, int speed, int capacity) {
        super(name, price, speed);
        this.capacity = capacity;
    }
}