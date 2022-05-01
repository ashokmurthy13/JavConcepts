package com.learn.java8.concepts.streams;

import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class StreamsDemo {

    public static void main(String[] args) {

        // Create Stream using Stream.of()
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6, 7);
        stream.forEach(System.out::print);

        System.out.println();

        // Create Stream from Collections
/*
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7);
        Stream<Integer> numStream = numbers.stream();
        numStream.forEach(System.out::print);
*/

        System.out.println();

        // Create Parallel Stream
/*
        Stream<Integer> parallelStream = numbers.parallelStream();
        parallelStream.forEach(System.out::print);
*/

        // Create an Empty Stream
        Stream<String> emptyStream = Stream.empty();
        emptyStream.forEach(System.out::print);
    }
}
