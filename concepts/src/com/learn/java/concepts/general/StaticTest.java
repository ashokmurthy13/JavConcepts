package com.learn.java.concepts.general;

public class StaticTest {

    static int a = 50;

    public static void main(String[] args) {
        int a = 10;
        a = StaticTest.a = 90;
        System.out.println(a);
        System.out.println(StaticTest.a);
    }
}
