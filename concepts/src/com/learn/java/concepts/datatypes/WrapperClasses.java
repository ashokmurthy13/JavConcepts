package com.learn.java.concepts.datatypes;

public class WrapperClasses {

    public static void main(String[] args) {

        //　Exception in thread "main" java.lang.NullPointerException: Cannot invoke "java.lang.Integer.intValue()" because "intArr[0]" is null
        Integer[] intArr = new Integer[2];
        System.out.println(intArr[0]+intArr[1]);

        // Exception in thread "main" java.lang.NullPointerException: Cannot invoke "java.lang.Double.doubleValue()" because "arr[0]" is null
        Double[] arr = new Double[2];
        System.out.println(arr[0]+arr[1]);
    }
}
