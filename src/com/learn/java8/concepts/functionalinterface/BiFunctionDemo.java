package com.learn.java8.concepts.functionalinterface;

import java.util.function.BiFunction;

public class BiFunctionDemo {

    public static void main(String[] args) {
        BiFunction<String, String, Boolean> biFunction = (a, b) -> a.equals("java8") && b.equals("fi");
        System.out.println(biFunction.apply("java8", "fi"));
        System.out.println(biFunction.apply("java9", "fi"));
    }
}
