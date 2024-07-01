package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayMaker4Test {
    private ArrayMaker4 arrayMaker4;

    @BeforeEach
    void setUp() {
        arrayMaker4 = new ArrayMaker4();
    }

    @Test
    void solution() {
        int[] arr = {1, 4, 2, 5, 3};
        int[] expected = {1, 2, 3};

        int[] result = arrayMaker4.solution(arr);

        assertArrayEquals(expected, result);
    }
}