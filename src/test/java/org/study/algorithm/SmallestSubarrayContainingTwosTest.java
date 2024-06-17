package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SmallestSubarrayContainingTwosTest {
    private SmallestSubarrayContainingTwos smallestSubarrayContainingTwos;

    @BeforeEach
    void setUp() {
        smallestSubarrayContainingTwos = new SmallestSubarrayContainingTwos();
    }

    @Test
    void case1() {
        int[] arr = {1, 2, 1, 4, 5, 2, 9};
        int[] expected = {2, 1, 4, 5, 2};
        int[] result = smallestSubarrayContainingTwos.solution(arr);
        assertArrayEquals(expected, result);
    }

    @Test
    void case2() {
        int[] arr = {1, 2, 1};
        int[] expected = {2};
        int[] result = smallestSubarrayContainingTwos.solution(arr);
        assertArrayEquals(expected, result);
    }

    @Test
    void case3() {
        int[] arr = {1, 1, 1};
        int[] expected = {-1};
        int[] result = smallestSubarrayContainingTwos.solution(arr);
        assertArrayEquals(expected, result);
    }

    @Test
    void case4() {
        int[] arr = {10, 10, 10, 2, 1, 3, 2, 2, 6};
        int[] expected = {2, 1, 3, 2, 2};
        int[] result = smallestSubarrayContainingTwos.solution(arr);
        assertArrayEquals(expected, result);
    }
}

