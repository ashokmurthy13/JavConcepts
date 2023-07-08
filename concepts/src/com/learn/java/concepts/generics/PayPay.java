package com.learn.java.concepts.generics;

public class PayPay<T> {
    private T data;

    public <T> boolean isString(T data) {
        return data instanceof String;
    }
}
