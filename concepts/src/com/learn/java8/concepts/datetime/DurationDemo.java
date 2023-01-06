package com.learn.java8.concepts.datetime;

import java.time.Duration;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

/**
 * The duration class is used to work with amounts of times that are expressed in nanoseconds to days.
 * Minutes, and hours and the DAYS unit can be used to work with durations
 */
public class DurationDemo {

    public static void main(String[] args) {
        LocalTime history = LocalTime.of(12, 12, 12);
        LocalTime now = LocalTime.now();

        Duration d1 = Duration.of(1, ChronoUnit.DAYS);
        Duration duration = Duration.between(history, now);
        System.out.println(d1);
        System.out.println(duration);
    }
}
