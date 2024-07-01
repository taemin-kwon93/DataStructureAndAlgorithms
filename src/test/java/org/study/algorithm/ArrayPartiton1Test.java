package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayPartiton1Test {
    private ArrayPartiton1 arrayPartiton1;

    @BeforeEach
    void setUp() {
        arrayPartiton1 = new ArrayPartiton1();
    }

    @Test
    void solution() {
        int[] arr = {1, 3, 4, 2};

        int result = arrayPartiton1.solution(arr);

        assertEquals(4, result);
    }
}