package com.learn.java.concepts.generics;

public class MultipleGenericTypes {

    public static void main(String[] args) {

        Hashtable<String, Integer> hashtable = new Hashtable<>("Hello", 10);
        System.out.println(hashtable);
    }
}
