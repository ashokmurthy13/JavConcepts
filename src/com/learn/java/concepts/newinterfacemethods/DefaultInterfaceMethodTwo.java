package com.learn.java.concepts.newinterfacemethods;

public interface DefaultInterfaceMethodTwo {

    default void print() {
        System.out.println("Welcome to default method inside DefaultInterfaceMethodTwo interface");
    }
}
