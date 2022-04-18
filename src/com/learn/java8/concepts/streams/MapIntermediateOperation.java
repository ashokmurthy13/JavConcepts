package com.learn.java8.concepts.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

/**
 * Streams map intermediate operation in-depth working
 */
public class MapIntermediateOperation {

    public static void main(String[] args) {

        List<String> flightNames = new ArrayList<>();
        flightNames.add("ANA");
        flightNames.add("JAL");
        flightNames.add("AI");
        flightNames.add("USA");
        flightNames.add("Indigo");

        // traditional approach to process the sequence of objects in the collections
        for (String flightName : flightNames) {
            System.out.println(flightName.toLowerCase());
        }

        /*
         * map - intermediate operation
         *     - lazy operation
         *     - map elements in collection to different form
         *     - it returns a Stream of new elements(transformed elements)
         *
         *     - <R> Stream<R> map(Function<? super T, ? extends R> mapper);
         */
        flightNames.stream()
                .map(String::toLowerCase)
                .forEach(System.out::println);

        /*
         * in-depth working of map intermediate operation
         */

        // Step 1: Create an Anonymous function - Function functional interface
        Function<String, String> mapFunction = new Function<String, String>() {
            @Override
            public String apply(String s) {
                return s.toLowerCase();
            }
        };

        // Step 2: Apply the function in the map method
        flightNames.stream()
                .map(mapFunction)
                .forEach(System.out::println);

        // Simplified form of step 1
        Function<String, String> lambdaMapFunction = (input) -> input.toLowerCase();
        // Simplified form of above Lambda using Method Reference
        Function<String, String> methodRefMapFunction = String::toLowerCase;

        flightNames.stream()
                .map(lambdaMapFunction)
                .forEach(System.out::println);

        flightNames.stream()
                .map(methodRefMapFunction)
                .forEach(System.out::println);
    }
}
