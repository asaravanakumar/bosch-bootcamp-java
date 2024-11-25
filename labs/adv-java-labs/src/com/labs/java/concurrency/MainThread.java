package com.labs.java.concurrency;

public class MainThread {
    public static void main(String[] args) {
        System.out.println("Thread Name: " + Thread.currentThread().getName());
        System.out.println("Thread ID: " + Thread.currentThread().getId());
        System.out.println("Thread Priority: " + Thread.currentThread().getPriority());
        System.out.println("Thread State: " + Thread.currentThread().getState().name());

        PrinterThread t1 = new PrinterThread();
//        t1.setDaemon(true);
        t1.setName("PrinterThread1");
//        System.out.println("Thread State: " + t1.getState().name());
        t1.start(); // submits the thread to scheduler
        try {
            t1.join();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

        PrinterThread t2 = new PrinterThread();
//        t2.setDaemon(true);
        t2.setName("PrinterThread2");
        t2.start();
        try {
            t2.join();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }


        for(int i =1; i <= 10; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
        }

        try {
                Thread.sleep(1000); // pause the execution for 10 secs
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
                e.printStackTrace();
            }

        System.out.println("Java Thread Demo!!!");
    }
}
