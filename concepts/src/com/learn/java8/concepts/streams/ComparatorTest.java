package com.learn.java8.concepts.streams;

import com.learn.model.Authorization;

import java.math.BigDecimal;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class ComparatorTest {

    public static void main(String[] args) {
        Set<Authorization> set = new HashSet<>();
        Authorization auth1 = new Authorization();
        auth1.setId(1000001000L);
        auth1.setCustomerId(1000001000L);
        auth1.setTransactionId(1000001000L);
        auth1.setCurrency("INR");
        auth1.setAmount(new BigDecimal("100.00"));
        auth1.setTransactionType(5);
        auth1.setCreationTime(System.currentTimeMillis());
        set.add(auth1);

        Authorization auth2 = new Authorization();
        auth2.setId(1000001001L);
        auth2.setCustomerId(1000001001L);
        auth2.setTransactionId(1000001001L);
        auth2.setCurrency("INR");
        auth2.setAmount(new BigDecimal("100.00"));
        auth2.setTransactionType(5);
        auth2.setCreationTime(System.currentTimeMillis());
        set.add(auth2);

        System.out.println(auth1.getId() + "::" + auth1.getCreationTime());
        System.out.println(auth2.getId() + "::" + auth2.getCreationTime());

        Authorization authorization = getFirst(set);
        System.out.println(authorization.getId() + "::" + authorization.getCreationTime());
    }

    private static Authorization getFirst(Set<Authorization> authorizationSet) {
        return authorizationSet.stream()
                .sorted(Comparator.comparing(Authorization::getCreationTime).thenComparing(Authorization::getId))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Could not find an authorization for transaction"));
    }
}
