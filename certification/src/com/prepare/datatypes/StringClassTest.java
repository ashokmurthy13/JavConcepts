package com.prepare.datatypes;

public class StringClassTest {
    public static void main(String[] args) {
        String str1 = "Java";
        String str2 = "Java";
        String str3 = new String("Java");
        System.out.println(str1 == str2);
        System.out.println(str2 == str3);
    }
}
