/*
package com.learn.java.concepts.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CollectTerminalOperation {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Toyota");
        names.add("Honda");
        names.add("Mitsubishi");
        names.add("Subaru");
        names.add("Hyundai");
        names.add("Isuzu");

        List<String> list = names.stream()
                .filter(Predicate.not(name -> name.startsWith("H")))
                .collect(Collectors.toList());
        list.forEach(System.out::println);

        Long count = names.stream()
                .filter(Predicate.not(name -> name.startsWith("H")))
                .collect(Collectors.counting());
        System.out.println(count);

        String listString = names.stream()
                .filter(Predicate.not(name -> name.startsWith("H")))
                .collect(Collectors.joining());
        System.out.println(listString);

        Set<String> set = names.stream()
                .filter(Predicate.not(name -> name.startsWith("H")))
                .collect(Collectors.toSet());

        // using Java 16
        List<String> list2 = names.stream()
                .filter(Predicate.not(name -> name.startsWith("H")))
                .toList();
        list2.forEach(System.out::println);
    }
}
*/
