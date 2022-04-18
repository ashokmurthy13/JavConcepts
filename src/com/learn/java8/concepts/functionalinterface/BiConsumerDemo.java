package com.learn.java8.concepts.functionalinterface;

import java.util.function.BiConsumer;

public class BiConsumerDemo {

    public static void main(String[] args) {
        BiConsumer<String, Integer> biConsumer = (a, b) -> System.out.println(a + ":" + b);
        biConsumer.accept("java8", 9);
        biConsumer.accept("java11", 8);
    }
}
