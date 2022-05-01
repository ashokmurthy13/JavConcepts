package com.learn.java8.concepts.functionalinterface;

import java.util.function.Function;

public class FunctionDemo {

    public static void main(String[] args) {
        functionFunctionalInterfaceDemo();
    }

    private static void functionFunctionalInterfaceDemo() {
        Function<String, String> function = new Function<String, String>() {
            @Override
            public String apply(String s) {
                return s.toUpperCase();
            }
        };
        System.out.println("Traditional Way: " + function.apply("ashok"));

        Function<String, String> convert = str -> str.toUpperCase();
        System.out.println("Lambda way: " + convert.apply("ashok"));

        Function<String, String> convertMR = String::toUpperCase;
        System.out.println("Simplified Lambda Way: " + convertMR.apply("ashok murthy"));

        Function<String, String> identity = Function.identity();
        System.out.println("Identity: " + identity.apply("ashok"));

        Function<Integer, Integer> multiply = num -> {
            System.out.println("Double Operation");
            return num * 2;
        };

        multiply = multiply.andThen(num -> {
            System.out.println("Triple Operation");
            return num * 3;
        });

        System.out.println(multiply.apply(5));

        Function<Integer, Integer> division = num -> {
            System.out.println("Division by 2 Operation");
            return num / 2;
        };

        division = division.compose(num -> {
            System.out.println("Division by 3 operation");
            return num / 3;
        });

        System.out.println(division.apply(30));
    }
}
