package com.learn.java.concepts.math;

public class MathUtil {

    public static void main(String[] args) {
        System.out.println(Math.abs(-19));
        System.out.println(Math.abs(-19.45));
        System.out.println(Math.abs(-2147483648)); // Integer.MIN_VALUE
        System.out.println(Math.abs(-837448232));

        System.out.println(Math.max(Integer.MAX_VALUE, Long.MAX_VALUE));
        System.out.println(Math.max(Integer.MIN_VALUE, -1));


    }
}
