package com.crimeasos.java.course.ninth;

/**
 * Created by Паша on 27.01.2016.
 */
public class Car implements Cloneable {
    String name;
    Engine engine;
    int maxSpeed;

    public Car(Car car) {
        this.name = car.name;
        this.engine = Engine.getClone(car.engine); //new Engine(car.engine);
        this.maxSpeed = car.maxSpeed;
    }

    public Car(String name, Engine engine, int maxSpeed) {
        this.name = name;
        this.engine = engine;
        this.maxSpeed = maxSpeed;
    }


    @Override
    public Object clone() throws CloneNotSupportedException {
        Car car = (Car) super.clone();
        car.engine = (Engine) this.engine.clone();
        return car;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", engine=" + engine +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}
