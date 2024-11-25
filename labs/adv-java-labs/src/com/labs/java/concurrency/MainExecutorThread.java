package com.labs.java.concurrency;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MainExecutorThread {
    public static void main(String[] args) {
        int cores = Runtime.getRuntime().availableProcessors();
        System.out.println(cores);

        // Create ThreadPool
//        ExecutorService es = Executors.newFixedThreadPool(cores);
//        ExecutorService es = Executors.newSingleThreadExecutor();
        ExecutorService es = Executors.newCachedThreadPool();

        System.out.println(es);

        // Create Tasks
//        for(int i=0; i < 10000; i++) {
//            PrinterTask r = new PrinterTask();
////            try {
////                Thread.sleep(1000);
////            } catch (InterruptedException e) {
////                throw new RuntimeException(e);
////            }
//            es.submit(r);
//            System.out.println(es);
//        }

        PrinterTask r = new PrinterTask();

        Future<String> f = es.submit(r);

        try {
            System.out.println(f.get());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }

//        while(true) {
//            if (!f.isDone()) {
//                System.out.println("waiting...");
//            } else {
//                try {
//                    System.out.println(f.get());
//                    break;
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                } catch (ExecutionException e) {
//                    throw new RuntimeException(e);
//                }
//            }
//        }


        System.out.println("Shutting down...");
        es.shutdown(); // graceful shutdowns - means will not accept any new tasks and ensures all submitted tasks are completed.
//        es.shutdownNow(); // force shutdown

        System.out.println("It's over!!!");
    }
}
