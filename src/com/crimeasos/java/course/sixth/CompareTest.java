package com.crimeasos.java.course.sixth;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by Паша on 26.12.2015.
 */
public class CompareTest {

    public static void main(String[] args) {
        Horse horse1 = new Horse("Gorbunok",4, 10, 12);
        Horse horse2 = new Horse("Sylach", 5, 5, 10);

        printBestHorse(horse1, horse2, horse1.compareTo(horse2));

        Comparator<Horse> horsePowerComparator = new Comparator<Horse>() {
            @Override
            public int compare(Horse o1, Horse o2) {
                return Integer.compare(o1.power, o2.power);
            }
        };


        Comparator<Horse> horseAgeComparator = new Comparator<Horse>() {
            @Override
            public int compare(Horse o1, Horse o2) {
                return  Integer.compare(o1.age, o2.age);
            }
        };

        printBestHorse(horse1, horse2, horsePowerComparator.compare(horse1, horse2));

        Horse horse3 = new Horse("Junior", 15, 1, 1);
        Set<Horse> set = new TreeSet<>(horsePowerComparator);
        set.add(horse1);
        set.add(horse2);
        set.add(horse3);
        System.out.println(set);

    }

    private static void printBestHorse(Horse horse1, Horse horse2, int result) {
        if (result>0) {
            System.out.println(horse1 + " is better than " + horse2);
        } else  if (result<0) {
            System.out.println(horse2 + " is better than " + horse1);
        } else {
            System.out.println(horse1 + " is equal with " + horse2);
        }
    }
}

class Horse implements Comparable<Horse> {
    String name;
    int speed;
    int age;
    int power;

    public Horse(String name, int speed, int age, int power) {
        this.name = name;
        this.speed = speed;
        this.age = age;
        this.power = power;
    }

    @Override
    public int compareTo(Horse horse) {
        return Integer.compare(this.speed, horse.speed);
//        if (this.speed > horse.speed) return 1;
//        if (this.speed < horse.speed) return -1;
//        return 0;
    }

    @Override
    public String toString() {
        return "Horse{" +
                "name='" + name + '\'' +
                '}';
    }
}
