package com.learn.java.concepts.methodreferences;

public class ConstructorReference {

    public static void main(String[] args) {

        // Lambda way
        CustomerInterface customerOne = (a, b) -> new Customer(a, b);
        Customer customer1 = customerOne.getCustomer("ashok", 33);
        System.out.println(customer1.getAge());

        // Constructor Reference way
        CustomerInterface customer = Customer::new;
        Customer customer2 = customer.getCustomer("poorani", 32);
        System.out.println(customer2.getAge());
    }
}
