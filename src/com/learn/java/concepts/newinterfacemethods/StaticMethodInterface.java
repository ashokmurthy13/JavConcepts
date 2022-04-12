package com.learn.java.concepts.newinterfacemethods;

import java.time.LocalDate;

public interface StaticMethodInterface {

    static LocalDate getDate() {
        return LocalDate.now();
    }

    // possible
    public static void main(String args[]) {
        System.out.println(getDate());
    }
}
