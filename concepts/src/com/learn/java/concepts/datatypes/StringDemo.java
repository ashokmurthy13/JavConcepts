package com.learn.java.concepts.datatypes;

public class StringDemo {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(100);
        System.out.println(sb.length() +":" + sb.toString().length());
    }
}
