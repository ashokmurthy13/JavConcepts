package com.learn.java.concepts.functionalinterface;

@FunctionalInterface
public interface FunctionalInterfaceDemo {

    int calculate(int a, int b);

    default void method() {
        System.out.println("default method in interface");
    }

    default void method(String name) {
        System.out.println("overloaded default method in interface: " + name);
    }

/*
    private int sum(int a, int b) {
        return a + b;
    }

    private int sum(int a, int b, int c) {
        return a + b + c;
    }
*/

    static void print() {
        System.out.println("static method in interface");
    }

    static void print(String name) {
        System.out.println("overloaded static method in interface");
    }

}
