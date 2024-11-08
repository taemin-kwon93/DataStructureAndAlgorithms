package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiscountEvent2Test {
    private DiscountEvent2 discountEvent;

    @BeforeEach
    void setUp() {
        discountEvent = new DiscountEvent2();
    }

    @Test
    void solution() {
        String[] wants1 = {"banana", "apple", "rice", "pork", "pot"};
        String[] wants2 = {"apple"};
        int[] amount1 = {3, 2, 2, 2, 1};
        int[] amount2 = {10};
        String[] items1 = {
                "chicken", "apple", "apple",
                "banana", "rice", "apple",
                "pork", "banana", "pork",
                "rice", "pot", "banana",
                "apple", "banana"
        };
        String[] items2 = {
                "banana", "banana", "banana",
                "banana", "banana", "banana",
                "banana", "banana", "banana",
                "banana"
        };


        int result1 = discountEvent.solution(wants1, amount1, items1);
        int result2 = discountEvent.solution(wants2, amount2, items2);

        assertEquals(3, result1);
        assertEquals(0, result2);
    }
}