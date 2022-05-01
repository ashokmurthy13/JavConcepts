package com.learn.java8.concepts.newinterfacemethods;

public interface DefaultInterfaceMethodDemo {

    int x = 10;
    default void print() {
        int age = 33;
        System.out.println("Welcome to default method inside DefaultInterfaceMethodDemo interface");
        System.out.println(x);
        System.out.println(age);
    }
}
