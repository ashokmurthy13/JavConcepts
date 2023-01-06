package com.learn.java8.concepts.datetime;

import java.time.Clock;
import java.time.ZoneId;

public class ClocksDemo {

    public static void main(String[] args) {
        Clock clock = Clock.systemDefaultZone();
        System.out.println(clock);
        System.out.println(clock.instant());

        Clock clock1 = Clock.systemUTC();
        System.out.println(clock1.instant());

        Clock clock2 = Clock.system(ZoneId.of("America/Los_Angeles"));
        System.out.println(clock2.instant());
    }
}
