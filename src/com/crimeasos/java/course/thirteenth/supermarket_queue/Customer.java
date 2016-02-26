package com.crimeasos.java.course.thirteenth.supermarket_queue;

import java.util.List;

/**
 * Created by Паша on 16.02.2016.
 */
public class Customer implements Runnable {

    private final List<Integer> clientIdes;
    private int clientId;

    public Customer(List<Integer> clientIdes) {
        this.clientIdes = clientIdes;
    }

    @Override
    public void run() {
        while (true) {
            try {
                buy(clientId++);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private void buy(int clientId) throws InterruptedException{
        synchronized (clientIdes) {
            while (!clientIdes.isEmpty()) {
                System.out.println("Customer" + clientId + " is waiting..." );
                clientIdes.wait();
            }
            Thread.sleep(1000);
            clientIdes.add(clientId);
            System.out.println("Customer" + clientId + " is buying products");
            clientIdes.notifyAll();
        }
    }
}
