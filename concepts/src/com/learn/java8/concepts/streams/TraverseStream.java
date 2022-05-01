package com.learn.java8.concepts.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class TraverseStream {

    public static void main(String[] args) {
        traverseStream();
    }

    private static void traverseStream() {
        try {
            List<String> names = new ArrayList<>();
            names.add("Toyota");
            names.add("Honda");
            names.add("Mitsubishi");
            names.add("Subaru");
            names.add("Hyundai");
            names.add("Isuzu");

            Stream<String> stream = names.stream();
            stream.forEach(System.out::println);
            // java.lang.IllegalStateException: stream has already been operated upon or closed
            stream.forEach(System.out::println);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
