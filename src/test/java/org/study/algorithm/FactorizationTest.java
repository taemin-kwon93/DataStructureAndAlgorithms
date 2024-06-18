package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorizationTest {
    private Factorization factorization;

    @BeforeEach
    void setUp() {
        factorization = new Factorization();
    }

    @Test
    void case1() {
        int[] expected = {2, 3};

        int[] result = factorization.solution(12);

        assertArrayEquals(expected, result);
    }

    @Test
    void case2() {
        int[] expected = {17};

        int[] result = factorization.solution(17);

        assertArrayEquals(expected, result);
    }

    @Test
    void case3() {
        int[] expected = {2, 3, 5, 7};

        int[] result = factorization.solution(420);

        assertArrayEquals(expected, result);
    }
}