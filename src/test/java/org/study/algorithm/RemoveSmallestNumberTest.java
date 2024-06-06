package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveSmallestNumberTest {
    private RemoveSmallestNumber removeSmallestNumber;

    @BeforeEach
    void setUp() {
        removeSmallestNumber = new RemoveSmallestNumber();
    }

    @Test
    void shouldReturnArrayWhenExistAnswer() {
        int[] arr = {4,3,2,1};
        int[] expected = {4, 3, 2};

        int[] result = removeSmallestNumber.solution(arr);

        assertArrayEquals(expected, result);
    }

    @Test
    void shouldReturnArrayContainingMinusOne() {
        int[] arr = {10};
        int[] expected = {-1};

        int[] result = removeSmallestNumber.solution(arr);

        assertArrayEquals(expected, result);
    }
}