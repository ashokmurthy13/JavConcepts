package com.learn.java8.concepts.datetime;

import java.time.LocalDate;
import java.time.Period;

/**
 * Period represents the amount of time in days, months, and years
 */
public class PeriodDemo {

    public static void main(String[] args) {
        LocalDate history = LocalDate.of(1947, 8, 01);
        LocalDate now = LocalDate.now();
        Period period = Period.between(history, now);
        System.out.println(period);
        System.out.println(period.getYears());
    }
}
