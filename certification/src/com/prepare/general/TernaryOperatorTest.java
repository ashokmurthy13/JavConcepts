package com.prepare.general;

public class TernaryOperatorTest {

    public static void main(String[] args) {
        long creationTime = -1L;
        calculate(creationTime);
    }

    private static void calculate(long creationTime) {
        System.out.println(creationTime > 0 ? creationTime : System.currentTimeMillis() - (24 * 60 * 60 * 1000L * 30));
    }
}
