package com.prepare.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTest {
    public static void main(String[] args) {
        LocalDate janDate = LocalDate.of(2023, 01, 31);
        LocalDate expectedExpireDate = LocalDate.now().plusMonths(1);
        LocalDate janExpectedDate = janDate.plusMonths(1);
        System.out.println(expectedExpireDate);
        System.out.println(janExpectedDate);

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime.getNano());
        System.out.println(localDateTime.getSecond());
        System.out.println(localDateTime.getMinute());
        System.out.println(localDateTime.getHour());
        System.out.println(localDateTime.getDayOfMonth());
        System.out.println(localDateTime.getDayOfWeek());
        System.out.println(localDateTime.getDayOfYear());
        System.out.println(localDateTime.getMonth());
        System.out.println(localDateTime.getYear());

        LocalDate ld = LocalDate.parse("1947-08-14");
        LocalTime lt = LocalTime.MAX;
        System.out.println(ld.atTime(lt));

        LocalDate date = LocalDate.of(2023,9, 31);
        System.out.println(date);
    }
}
