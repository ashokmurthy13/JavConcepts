package com.prepare.datatypes;

public class StringBuilderTest {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append((String) null);
        System.out.println(stringBuilder);
        System.out.println(stringBuilder.length());

        StringBuilder sb = new StringBuilder("Java");
        String str1 = sb.toString();
        String str2 = sb.toString();
        System.out.println(str1 == str2);
    }
}
