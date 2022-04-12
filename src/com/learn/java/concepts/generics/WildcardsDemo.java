package com.learn.java.concepts.generics;

import java.util.Arrays;
import java.util.List;

public class WildcardsDemo {

    public static void print(List<?> list) {
        for (Object o : list) {
            System.out.println(o.toString());
        }
    }

    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
        print(list1);

        List<String> list2 = Arrays.asList("ashok", "poorani", "saravanan");
        print(list2);

    }
}
