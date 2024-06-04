package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayMaker6Test {
    private ArrayMaker6 arrayMaker6;

    @BeforeEach
    void setUp() {
        arrayMaker6 = new ArrayMaker6();
    }

    @Test
    void solution() {
        int[] arr = {2, 36, 1, 3};
        int divisor = 1;
        int[] expected = {1, 2, 3, 36};

        int[] result = arrayMaker6.solution(arr, divisor);

        assertArrayEquals(expected, result);
    }

    @Test
    void shouldReturnMinusOneWhenArrayIsEmpty() {
        int[] arr = {3,2,6};
        int divisor = 10;
        int[] expected = {-1};

        int[] result = arrayMaker6.solution(arr, divisor);

        assertArrayEquals(expected, result);
    }
}