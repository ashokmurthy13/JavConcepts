package com.learn.java.concepts.multithreading;

public class ThreadCapabilities {

    public static void main(String[] args) {

        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("------------------");
                System.out.println(Thread.currentThread().getName());
                System.out.println(System.currentTimeMillis());
                System.out.println(Runtime.getRuntime().availableProcessors());
                System.out.println("------------------");
            }
        };
        new Thread(r).start();
    }
}
