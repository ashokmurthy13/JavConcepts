package com.prepare.math;

import java.math.BigDecimal;

public class BigDecimalTest {
    public static void main(String[] args) {
        BigDecimal first = new BigDecimal("12.27000");
        BigDecimal second = new BigDecimal("-498.20000");
        BigDecimal sum = first.add(second);
        System.out.println(sum); //-485.93000
    }
}
