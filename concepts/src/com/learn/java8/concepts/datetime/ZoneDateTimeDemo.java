package com.learn.java8.concepts.datetime;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZoneDateTimeDemo {

    public static void main(String[] args) {
        ZonedDateTime zonedDateTime = ZonedDateTime.ofInstant(Instant.ofEpochMilli(System.currentTimeMillis()), ZoneId.systemDefault());
        System.out.println("Zoned Datetime              : " + zonedDateTime);
        System.out.println("Epoch time in Seconds       : " + zonedDateTime.toEpochSecond());
        System.out.println("Epoch time in Milliseconds  : " + zonedDateTime.toEpochSecond() * 1000L);
    }
}
