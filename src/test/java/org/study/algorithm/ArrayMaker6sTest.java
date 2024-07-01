package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayMaker6sTest {
    private ArrayMaker6s arrayMaker6s;

    @BeforeEach
    void setUp() {
        arrayMaker6s = new ArrayMaker6s();
    }

    @Test
    void solution() {
        int[] arr = {0, 1, 1, 1, 0};
        int[] expected = {0, 1, 0};

        int[] result = arrayMaker6s.solution(arr);

        assertArrayEquals(expected, result);
    }
}