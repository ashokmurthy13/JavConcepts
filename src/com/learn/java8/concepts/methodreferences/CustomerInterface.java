package com.learn.java8.concepts.methodreferences;

@FunctionalInterface
public interface CustomerInterface {

    Customer getCustomer(String name, int age);
}
