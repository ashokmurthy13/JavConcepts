package com.learn.java.concepts.functionalinterface;

import java.util.function.BiPredicate;

public class BiPredicateDemo {

    public static void main(String[] args) {
        BiPredicate<String, Integer> biPredicate = (a, b) -> a.equals("ashok") && b.equals(19);
        System.out.println(biPredicate.test("ashok", 33));
        System.out.println(biPredicate.test("ashok murthy", 33));
        System.out.println(biPredicate.test("ashok", 19));
    }
}
