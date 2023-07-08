package com.prepare.functionalinterfaces;

import java.util.function.Predicate;

public class LearnPredicate {

    public static void main(String[] args) {
        String [] arr = {"A", "ab", "bab", "Aa", "bb", "baba", "aba", "Abab"};

        Predicate<String> predicate = s -> s.toUpperCase().substring(0,1).equals("A");

        for (String str: arr) {
            if (predicate.test(str)){
                System.out.println(str);
            }
        }
    }
}
