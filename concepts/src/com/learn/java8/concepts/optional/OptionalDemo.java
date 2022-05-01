package com.learn.java8.concepts.optional;

import java.util.Optional;

public class OptionalDemo {

    public static void main(String[] args) {
        Optional<Integer> numbers = Optional.empty(); // create an empty optional
        System.out.println(numbers);
    }
}
