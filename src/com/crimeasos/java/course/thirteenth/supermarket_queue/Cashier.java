package com.crimeasos.java.course.thirteenth.supermarket_queue;

import java.util.List;

/**
 * Created by Паша on 16.02.2016.
 */
public class Cashier implements Runnable {

    private final List<Integer> clientIdes;

    public Cashier(List<Integer> clientIdes) {
        this.clientIdes = clientIdes;
    }

    @Override
    public void run() {
        while (true) {
            try {
                process();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private void process() throws InterruptedException{
        synchronized (clientIdes) {
            while (clientIdes.isEmpty()) {
                System.out.println(Thread.currentThread().getName() + " is waiting for a new customer...");
                clientIdes.wait();
            }
            Thread.sleep(1000);
            int client = clientIdes.remove(0);
            System.out.println(Thread.currentThread().getName() + " has processed customer " + client);
            clientIdes.notify();
        }
    }
}
