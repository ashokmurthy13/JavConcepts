package com.learn.java.concepts.oops.polymorphism;

public class OverloadChallenge {

    public static void main(String[] args) {
        method(123);
    }

    public static void method(float f) {
        System.out.println("called method(Float f)");
    }

    public static void method(Integer i) {
        System.out.println("called method(Integer i)");
    }
}
