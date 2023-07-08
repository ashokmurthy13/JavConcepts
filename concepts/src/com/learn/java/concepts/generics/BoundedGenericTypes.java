package com.learn.java.concepts.generics;

public class BoundedGenericTypes {

    public static <T extends Comparable<T>> T calculateMin(T num1, T num2) {
        if (num1.compareTo(num2) < 0) {
            return num1;
        }
        return num2;
    }

    public static <T extends Number> double addDouble(T num1, T num2) {
        return num1.doubleValue() + num2.doubleValue();
    }

    public static <T extends Number> int addInteger(T num1, T num2) {
        return num1.intValue() + num2.intValue();
    }

    public static void main(String[] args) {
        System.out.println(calculateMin(10, 20));
        System.out.println(calculateMin(22.5, 19.001));
        System.out.println(calculateMin('a', 's'));
        System.out.println(calculateMin("ashok", "ashok murthy"));
        System.out.println(calculateMin(new Person(35, "Ashok"), new Person(34, "Poorani")));
        System.out.println(addDouble(10.113, 21.9475));
        System.out.println(addInteger(10, 20));
    }
}
