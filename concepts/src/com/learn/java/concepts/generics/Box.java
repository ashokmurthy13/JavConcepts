package com.learn.java.concepts.generics;

import java.lang.reflect.*;

public class Box {
    public static void main(String... args) {
        SampleBox sampleBox = new SampleBox();
        sampleBox.setData(10L);

        SampleBox sampleBox2 = new SampleBox("abc");
        System.out.println(sampleBox2.getClass().getTypeName());

        Class<?> reflect = sampleBox.getClass();
        System.out.println(reflect.getTypeParameters()[0]);
    }
}

class SampleBox<T> {

    private T data;

    public SampleBox() {}

    public SampleBox(T data) {
        this.data = data;
    }

    void setData(T data) {
        this.data = data;
    }
}