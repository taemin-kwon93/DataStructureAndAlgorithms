package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ThreeMusketeersTest {
    private ThreeMusketeers threeMusketeers;

    @BeforeEach
    void setUp() {
        threeMusketeers = new ThreeMusketeers();
    }

    @Test
    void solution() {
        int[] number = {0, 0, 0, 0, 0};

        int result = threeMusketeers.solution(number);

        assertEquals(10, result);
    }
}