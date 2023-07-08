package com.learn.java.concepts.generics;

public class AfterGenerics {
    public static void main(String[] args) {
        AfterSample<Integer> s1 = new AfterSample<>();
        s1.setData(1);
        System.out.println(s1.getData());

        AfterSample<Double> s2 = new AfterSample<>();
        s2.setData(1.2);
        System.out.println(s2.getData());

        AfterSample<String> s3 = new AfterSample<>();
        s3.setData("Generics");
        System.out.println(s3.getData());

        AfterSample<String> s4 = new AfterSample<>();
        s4.setData("test");
        // now this can be cached at compile time - which ensures strong type check
//        Integer intData = (Integer) s4.getData();
//        System.out.println(intData);
    }
}


class AfterSample<T> {
    private T data;

    public void setData(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }
}
