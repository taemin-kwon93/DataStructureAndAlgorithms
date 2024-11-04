package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TangerineTest {
    private Tangerine tangerine;

    @BeforeEach
    void setUp() {
        tangerine = new Tangerine();
    }

    @Test
    void solution() {
        int[] items1 = {1, 3, 2, 5, 4, 5, 2, 3};
        int[] items2 = {1, 1, 2, 2};

        int result1 = tangerine.solution(6, items1);
        int result2 = tangerine.solution(3, items2);

        assertEquals(3, result1);
        assertEquals(2, result2);
    }
}