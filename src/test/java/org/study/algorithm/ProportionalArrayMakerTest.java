package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProportionalArrayMakerTest {
    private ProportionalArrayMaker proportionalArrayMaker;

    @BeforeEach
    void setUp() {
        proportionalArrayMaker = new ProportionalArrayMaker();
    }

    @Test
    void solution() {
        int[][] arr = {{572, 22, 37}, {287, 726, 384}, {85, 137, 292}, {487, 13, 876}};
        int[][] expected = {{572, 22, 37, 0}, {287, 726, 384, 0}, {85, 137, 292, 0}, {487, 13, 876, 0}};

        int[][] result = proportionalArrayMaker.solution(arr);

        assertArrayEquals(expected, result);
    }
}