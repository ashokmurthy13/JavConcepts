/*
package com.learn.java.concepts.streams;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

*/
/**
 * Streams flapMap intermediate operation internal workings
 *//*

public class FlapMapIntermediateOperation {

    public static void main(String[] args) {

        List<List<String>> list = Arrays.asList(List.of("ashok"), List.of("murthy"));
        System.out.println(list);

        list.stream().map(Collection::stream).forEach(System.out::println);
        list.stream().flatMap(Collection::stream).forEach(System.out::println);

        Stream<Stream<Integer>> streamOfStreams = Stream.of(Stream.of(1, 2, 3, 4, 5));
        //streamOfStreams.map(v -> v).forEach(System.out::println);
        streamOfStreams.flatMap(v -> v).forEach(System.out::println);
    }
}
*/
