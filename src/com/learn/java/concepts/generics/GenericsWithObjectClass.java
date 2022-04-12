package com.learn.java.concepts.generics;

public class GenericsWithObjectClass {

    public static void main(String[] args) {
        Store store = new Store();
        store.setItem(10.5);
        // type casting
        // we can cast Object into any other object
        Integer item = (Integer) store.getItem();
        System.out.println(item);
    }
}
