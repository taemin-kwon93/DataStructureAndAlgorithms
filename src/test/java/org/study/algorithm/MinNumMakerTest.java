package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinNumMakerTest {
    private MinNumMaker minNumMaker;

    @BeforeEach
    void setUp() {
        minNumMaker = new MinNumMaker();
    }

    @Test
    void solution() {
        int[] a = {1, 4, 2};
        int[] b = {5, 4, 4};

        int result = minNumMaker.solution(a, b);

        assertEquals(29, result);
    }
}