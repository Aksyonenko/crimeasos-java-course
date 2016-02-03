package com.crimeasos.java.course.ninth;

/**
 * Created by Паша on 27.01.2016.
 */
public class TestClone {

    public static void main(String[] args) throws CloneNotSupportedException {

        Engine engine = new Engine("Super engine");
        Car car1 = new Car("BMW", engine, 280);
        Car car2 = (Car) car1.clone();
        System.out.println(car1);
        System.out.println(car2);

        System.out.println();

        car1.name = "Porshe";
        car1.engine.name = "Bad engine";
        System.out.println(car1);
        System.out.println(car2);
    }
}
