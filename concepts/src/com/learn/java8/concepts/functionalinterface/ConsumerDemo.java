package com.learn.java8.concepts.functionalinterface;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {

    public static void main(String[] args) {

        Consumer<String> consumer = name -> System.out.println(name.toUpperCase());
        consumer.accept("ashok");

        Consumer<String> consumer1 = System.out::println;
        consumer1.accept("ashok");

        Consumer<List<String>> namesList = names -> names.forEach(name -> System.out.println(name.toUpperCase()));
        /*namesList.accept(List.of("java", "java8", "java9", "java10", "java11"));*/

    }
}
