package com.learn.java.concepts.newinterfacemethods;

import java.time.LocalDate;

public class StaticInterfaceMethods implements StaticMethodInterface {

    public static void main(String[] args) {
        LocalDate date = StaticMethodInterface.getDate();
        System.out.println(date);
        System.out.println(getDate());
    }

    public static LocalDate getDate() {
        return LocalDate.now();
    }
}
