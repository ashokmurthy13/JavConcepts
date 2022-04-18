package com.learn.java8.concepts.functionalinterface;

import java.util.Arrays;
import java.util.function.Function;

public class PrimitiveFunctionalInterfaceExample {

    public static void main(String[] args) {
        problemWithNormalFunctionalInterface();
    }

    private static void problemWithNormalFunctionalInterface() {

        // this requires AutoBoxing and AutoUnboxing which is a performance issue when dealing with large data
        Function<Integer, Integer> doubleTheValue = a -> a * 2;

        int[] input = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] output = new int[input.length];

        for (int idx = 0; idx < input.length; idx++) {
            output[idx] = doubleTheValue.apply(input[idx]);
        }

        System.out.println("Input array: " + Arrays.toString(input));
        System.out.println("Output array: " + Arrays.toString(output));
    }
}
