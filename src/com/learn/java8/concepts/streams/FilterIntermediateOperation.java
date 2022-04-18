/*
package com.learn.java.concepts.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class FilterIntermediateOperation {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Toyota");
        names.add("Honda");
        names.add("Mitsubishi");
        names.add("Subaru");
        names.add("Hyundai");
        names.add("Isuzu");

        names.stream()
                .filter(Predicate.not(name -> name.startsWith("H")))
                .forEach(System.out::println);
    }
}
*/
