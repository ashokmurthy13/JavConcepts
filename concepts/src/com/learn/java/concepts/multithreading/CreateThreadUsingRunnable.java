package com.learn.java.concepts.multithreading;

public class CreateThreadUsingRunnable {



    public static void main(String[] args) {
        System.out.println("Thread Name : " + Thread.currentThread().getName());

        // Way 1 using Runnable Functional Interface
        Thread t1 = new Thread(new Vehicle());
        t1.start();

        // Way 2 using Runnable Functional Interface
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Using Runnable - Thread Name : " + Thread.currentThread().getName());
            }
        });
        t2.start();

        // Way 2 using Runnable Functional Interface and Lambda Expression
        Thread t3 = new Thread(() -> System.out.println("Using Lambda Expression - Thread Name : " + Thread.currentThread().getName()));
        t3.start();
    }
}

class Vehicle implements Runnable {

    @Override
    public void run() {
        System.out.println("Start the vehicle from Thread : " + Thread.currentThread().getName());
    }
}
