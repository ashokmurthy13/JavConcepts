package com.learn.java.concepts.generics;

public class NonGenericsDemo {

    public static void add(int num1, int num2) {
        int result = num1 + num2;
        System.out.println("Result is " + result);
    }

    public static void add(double num1, double num2) {
        double result = num1 + num2;
        System.out.println("Result is " + result);
    }

    public static void main(String[] args) {
        add(10, 28);
        add(10.10, 28.20);
    }
}

