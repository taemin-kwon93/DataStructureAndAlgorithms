package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayMaker5Test {
    private ArrayMaker5 arrayMaker5;

    @BeforeEach
    void setUp() {
        arrayMaker5 = new ArrayMaker5();
    }

    @Test
    void solution() {
        String[] intStrs = {"0123456789","9876543210","9999999999999"};
        int k, s, l;
        k = 50000;
        s = 5;
        l = 5;

        int[] expected = {56789, 99999};

        int[] result = arrayMaker5.solution(intStrs, k, s, l);

        assertArrayEquals(expected, result);
    }
}