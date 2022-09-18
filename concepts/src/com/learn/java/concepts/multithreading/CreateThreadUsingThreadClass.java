package com.learn.java.concepts.multithreading;

public class CreateThreadUsingThreadClass {

    public static void main(String[] args) {
        System.out.println("Thread Name : " + Thread.currentThread().getName());

        // Way 1
        Thread t1 = new Car();
        t1.start();

        // Way 2
        Car car = new Car();
        Thread t2 = new Thread(car);
        t2.start();
    }
}

class Car extends Thread {

    @Override
    public void run() {
        System.out.println("Start the car from Thread : " + Thread.currentThread().getName());
    }
}
