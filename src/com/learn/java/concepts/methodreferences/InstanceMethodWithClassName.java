package com.learn.java.concepts.methodreferences;

import java.util.ArrayList;
import java.util.List;

public class InstanceMethodWithClassName {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");

        list.forEach(System.out::println);
    }
}
