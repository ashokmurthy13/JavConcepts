package com.learn.java8.concepts.datetime;

import java.time.LocalDate;

public class CompareLocalDate {

    public static void main(String[] args) {
        LocalDate newYear = LocalDate.of(2023, 01, 01);
        LocalDate tamilNewYear = LocalDate.of(2023, 04, 13);
        boolean first = newYear.isAfter(tamilNewYear);
        boolean second = newYear.isBefore(tamilNewYear);
        System.out.println(first + ":" + second);
    }
}
