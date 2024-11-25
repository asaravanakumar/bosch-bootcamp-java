package com.labs.java.concurrency;

import java.util.concurrent.Callable;

public class PrinterTask implements Callable<String> {
    @Override
    public String call() throws Exception {
        System.out.println(Thread.currentThread().getName() + " processing...");
        Thread.sleep(1000);
        // TODO: Logic to be executed as part of Thread
        return "Hello Java!!!!";
    }
}
