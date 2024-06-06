package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClosestNumberFinderTest {
    private ClosestNumberFinder closestNumberFinder;

    @BeforeEach
    void setUp() {
        closestNumberFinder = new ClosestNumberFinder();
    }

    @Test
    void solution() {
        int[] array = {3, 10, 28};
        int n = 20;

        int result = closestNumberFinder.solution(array, n);
        assertEquals(28, result);
    }

    @Test
    void solution2() {
        int[] array = {10, 11, 12};
        int n = 13;

        int result = closestNumberFinder.solution(array, n);
        assertEquals(12, result);
    }

    @Test
    void solution3() {
        int[] array = {10, 11, 12};
        int n = 1;

        int result = closestNumberFinder.solution(array, n);
        assertEquals(10, result);
    }

    @Test
    void solution4() {
        int[] array = {3, 10, 28, 29};
        int n = 20;

        int result = closestNumberFinder.solution(array, n);
        assertEquals(28, result);
    }
}