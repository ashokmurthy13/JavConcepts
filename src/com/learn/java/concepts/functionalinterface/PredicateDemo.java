package com.learn.java.concepts.functionalinterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo {

    public static void main(String[] args) {

        // Creating a Predicate with traditional way - using anonymous class
        Predicate<Integer> even = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer % 2 == 0;
            }
        };

        // Creating a Predicate
        Predicate<Integer> isEven = i -> i % 2 == 0;

        // Calling Predicate method
        System.out.println("Is the number 61 even ? : " + even.test(61));

        // Predicate AND chaining
        Predicate<Integer> isGreaterThan50 = i -> i > 50;
        System.out.println("Is the number 60 even & greater than 50 ? : " + isGreaterThan50.and(isEven).test(60));

        // Predicate OR chaining
        System.out.println("Is the number 61 is either even ot greater than 50 ? : " + isGreaterThan50.or(isEven).test(61));

        // Predicate negate chaining
        System.out.println("Is the number 61 odd: " + isEven.negate().test(61));
        //System.out.println("is the number 61 odd: " + Predicate.not(isEven).test(61));

        // Usage of Predicate inside Collections and Streams
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        //List<Integer> collect = list.stream().filter(isEven).toList();

        //System.out.println("List of even numbers from the given list: " + collect);
    }
}
