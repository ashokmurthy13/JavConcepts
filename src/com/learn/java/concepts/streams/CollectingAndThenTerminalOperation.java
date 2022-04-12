package com.learn.java.concepts.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CollectingAndThenTerminalOperation {

    public static void main(String[] args) {
        // List.of
        List<Customer> customers = Arrays.asList(
                new Customer("ashok", 34),
                new Customer("poorani", 33),
                new Customer("murthy", 60),
                new Customer("rajamani", 53),
                new Customer("velusamy", 61),
                new Customer("jayamani", 52));

        int maxAge = customers.stream()
                .collect(Collectors.collectingAndThen(
                        Collectors.maxBy(Comparator.comparing(Customer::getAge)),
                        customer -> customer.map(Customer::getAge).orElse(0)));
        System.out.println(maxAge);
    }
}


class Customer {

    private String name;
    private int age;

    public Customer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
