package com.learn.java8.concepts.functionalinterface;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BinaryOperatorDemo {

    public static void main(String[] args) {
        BinaryOperator<String> binaryOperator = (a, b) -> a + b;
        System.out.println(binaryOperator.apply("ashok", " murthy"));

        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };

        BinaryOperator<Integer> max = BinaryOperator.maxBy(comparator);
        System.out.println(max.apply(10, 20));

        BinaryOperator<Integer> max2 = BinaryOperator.maxBy((a, b) -> (a > b) ? 1 : (a == b) ? 0 : -1);
        System.out.println(max2.apply(10, 20));

        BinaryOperator<Integer> max3 = BinaryOperator.maxBy(Integer::compareTo);
        System.out.println(max3.apply(10, 20));

        BinaryOperator<Integer> min = BinaryOperator.minBy(Integer::compareTo);
        System.out.println(min.apply(10, 20));
    }
}
