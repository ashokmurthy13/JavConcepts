package com.learn.java.concepts.functionalinterface;

import java.time.LocalDate;
import java.util.List;
import java.util.function.Supplier;

public class SupplierDemo {

    public static void main(String[] args) {

        Supplier<String> supplier = () -> "Supplier: ashok";
        System.out.println(supplier.get());

/*
        Supplier<List<Integer>> ages = () -> List.of(1, 2, 3, 4, 5);
        ages.get().forEach(System.out::println);
*/

        Supplier<Integer> day = () -> LocalDate.now().getDayOfMonth();
        System.out.println("Day of month: " + day.get());
    }
}

