package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BackToFifthTest {
    private BackToFifth backToFifth;

    @BeforeEach
    void setUp() {
        backToFifth = new BackToFifth();
    }

    @Test
    void solution() {
        int[] result = backToFifth.solution(new int[] {12, 4, 15, 46, 38, 1, 14});
        assertArrayEquals(new int[] {1, 4, 12, 14, 15}, result);
    }
}