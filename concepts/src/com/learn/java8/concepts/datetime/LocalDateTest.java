package com.learn.java8.concepts.datetime;

import java.time.YearMonth;
import java.time.format.DateTimeFormatter;

public class LocalDateTest {

    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMM");
        YearMonth yearMonth = YearMonth.parse("202802", formatter);
        System.out.println(yearMonth);
    }
}

// class MyLocalDate extends LocalDate {} // LocalDate is a final class and it cannot be extended