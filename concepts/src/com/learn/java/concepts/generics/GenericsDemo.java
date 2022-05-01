package com.learn.java.concepts.generics;

public class GenericsDemo {

    public static void main(String[] args) {
        // raw type
        Basket rawBasket = new Basket();

        // <> diamond operator
        Basket<String> basket = new Basket<>();
        basket.setItem("10");
        // throws Compile Time error
        //Integer item = (Integer) basket.getItem();
        String item = basket.getItem();
        System.out.println(item);
    }
}
