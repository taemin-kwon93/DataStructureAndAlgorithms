package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrderingCareTest {
    private OrderingCare orderingCare;

    @BeforeEach
    void setUp() {
        orderingCare = new OrderingCare();
    }
    @Test
    void solution() {
        int[] emergency = {30, 10, 23, 6, 100};
        int[] expected = {2, 4, 3, 5, 1};

        int[] result = orderingCare.solution(emergency);

        assertArrayEquals(expected, result);
    }
}