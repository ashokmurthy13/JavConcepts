package com.learn.java8.concepts.functionalinterface;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class UnaryOperatorDemo {

    public static void main(String[] args) {
        Function<String, String> convert = str -> str.toUpperCase();
        System.out.println("Using Function: " + convert.apply("ashok"));

        UnaryOperator<String> unary = str -> str.toUpperCase();
        System.out.println("Using Unary Operator: " + unary.apply("ashok"));

        // Mix of Function and UnaryOperator also possible, but Function should have same Input and Output data type
        Function<Integer, Integer> function = num -> {
            System.out.println("Function Multiply by 2 operation");
            return num * 2;
        };

        UnaryOperator<Integer> unaryOperator = num -> {
            System.out.println("Unary Operation Multiply by 3 operation");
            return num * 3;
        };

        function = function.andThen(unaryOperator);
        System.out.println(function.apply(5));

        function = function.compose(unaryOperator);
        System.out.println(function.apply(5));
    }
}
