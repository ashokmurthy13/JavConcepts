package com.learn.java.concepts.exceptions;

public class ExceptionDemo {

    public static void main(String[] args) throws Exception {
        m1(); // compile-time exception : Unhandled exception: java.lang.Exception : if exception not handled
        System.out.println("Output is: " + (10 != 5));
    }

    private static void m1() throws Exception {
        System.out.println("HI");
    }
}
