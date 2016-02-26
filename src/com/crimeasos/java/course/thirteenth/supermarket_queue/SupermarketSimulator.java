package com.crimeasos.java.course.thirteenth.supermarket_queue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Паша on 16.02.2016.
 */
public class SupermarketSimulator {

    public static void main(String[] args) {

        List<Integer> clientIdes =  new ArrayList<>();


        new Thread(new Customer(clientIdes), "Customer").start();
        new Thread(new Cashier(clientIdes), "Cashier1").start();
        new Thread(new Cashier(clientIdes), "Cashier2").start();
    }
}


