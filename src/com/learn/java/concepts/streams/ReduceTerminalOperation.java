package com.learn.java.concepts.streams;

import java.util.stream.Stream;

public class ReduceTerminalOperation {

    // reduce() - a stream is reduced to a value
    public static void main(String[] args) {
        System.out.println(Stream
                .iterate(1, n -> n + 1)
                .limit(10)
                .reduce(0, Integer::sum));
    }
}
