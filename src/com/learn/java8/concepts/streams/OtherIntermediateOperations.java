package com.learn.java8.concepts.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class OtherIntermediateOperations {

    public static void main(String[] args) {

        // limit() intermediate operation

        Stream.generate(new Random()::nextInt)
                .limit(10).forEach(System.out::println);

        List<String> names = new ArrayList<>();
        names.add("Toyota");
        names.add("Honda");
        names.add("Mitsubishi");
        names.add("Subaru");
        names.add("Hyundai");
        names.add("Isuzu");

        names.stream().limit(2).forEach(System.out::println);
        System.out.println("--------");
        // skip() intermediate operation

        Stream.iterate(1, n -> n + 1).skip(10).limit(20).forEach(System.out::println);
        System.out.println("--------");
        names.stream().skip(2).limit(4).forEach(System.out::println);
    }
}
