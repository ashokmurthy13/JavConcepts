package com.learn.java.concepts.stringclass;

public class StringTest {

    public static void main(String[] args) {
        String str1 = new String("Core");
        String str2 = new String("CoRe");
        System.out.println(str1 = str2);

        String s1 = String.valueOf(100); // "100"
        String s2 = String.valueOf(50 * 2); // "100"
        String s3 = String.valueOf("100"); // "100"
        String s4 = String.valueOf(Double.valueOf(100.0).intValue()); // "100"

        System.out.println();
        System.out.printf("%b:%b:%b", s1.equals(s2),
                s1.equals(s3),
                s1.equals(s4));
    }
}
