package com.learn.java8.concepts.datetime;

import java.time.LocalTime;

public class LocalTimeTest {

    public static void main(String[] args) {
        LocalTime localTime = LocalTime.of(16, 40);
        //String amPm = localTime.getHour() >= 12 ? (localTime.getHour() == 12) ? "PM" : "AM";
        String amPm = localTime.getHour() >= 12 ? (localTime.getHour() == 12) ? "AMPM": "PM" : "AM";
        System.out.println(amPm);
    }
}
