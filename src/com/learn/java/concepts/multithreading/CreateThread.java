package com.learn.java.concepts.multithreading;

public class CreateThread {

    public static void main(String[] args) {
        SystemDetails systemDetails = new SystemDetails();
        systemDetails.run();

        Thread thread = new Thread(systemDetails);
        thread.start();

        Thread thread2 = new Thread(systemDetails);
        thread2.start();
    }
}

class SystemDetails implements Runnable {

    public void run() {
        System.out.println("------------------");
        System.out.println(Thread.currentThread().getName());
        System.out.println(System.currentTimeMillis());
        System.out.println(Runtime.getRuntime().availableProcessors());
        System.out.println("------------------");
    }
}
