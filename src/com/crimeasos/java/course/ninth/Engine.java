package com.crimeasos.java.course.ninth;

/**
 * Created by Паша on 27.01.2016.
 */
public class Engine implements Cloneable {
    String name;

    public Engine(String name) {
        this.name = name;
    }

    public Engine(Engine engine) {
        this.name = engine.name;
    }


    public static Engine getClone(Engine engine) {
        Engine engine1 = new Engine(engine.name);
        return engine1;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Engine{" +
                "name='" + name + '\'' +
                '}';
    }
}
