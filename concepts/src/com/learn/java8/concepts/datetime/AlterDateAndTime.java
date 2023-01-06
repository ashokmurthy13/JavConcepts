package com.learn.java8.concepts.datetime;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;

public class AlterDateAndTime {

    public static void main(String[] args) {
        LocalDateTime ldt1 = LocalDateTime.now();
        System.out.println("Original : " + ldt1);

        // plus, minus etc
        LocalDateTime ldt2 = ldt1.plusDays(7);
        System.out.println("Plus Days : " + ldt2);
        LocalDateTime ldt2a = ldt1.plus(Period.ofDays(7));
        System.out.println(ldt2a);

        LocalDateTime ldt3 = ldt1.minusHours(1);
        System.out.println("Minus Hours : " + ldt3);
        LocalDateTime ltd3a = ldt1.minus(Duration.ofHours(1));
        System.out.println(ltd3a);

        // with()
        LocalDateTime ldt4 = ldt1.withMonth(12);
        System.out.println("With month : " + ldt4);


    }
}
