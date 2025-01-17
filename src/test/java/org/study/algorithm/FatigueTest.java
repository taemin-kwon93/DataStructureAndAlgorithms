package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FatigueTest {
    private Fatigue fatigue;

    @BeforeEach
    void setUp() {
        fatigue = new Fatigue();
    }

    @Test
    void solution() {
        int[][] dungeons = {{80, 20}, {50, 40}, {30, 10}};

        int result = fatigue.solution(80, dungeons);

        assertEquals(3, result);
    }
}