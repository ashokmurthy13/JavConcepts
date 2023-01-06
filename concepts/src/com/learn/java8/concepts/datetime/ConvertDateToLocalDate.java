package com.learn.java8.concepts.datetime;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

public class ConvertDateToLocalDate {

    public static void main(String[] args) {
        Date date = new Date(123, 00, 05);
        LocalDateTime localDateTime = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
        System.out.println(localDateTime);
    }
}
