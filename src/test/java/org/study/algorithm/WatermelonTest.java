package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WatermelonTest {
    private Watermelon watermelon;

    @BeforeEach
    void setUp() {
        watermelon = new Watermelon();
    }

    @Test
    void solution() {
        String result = watermelon.solution(3);
        assertEquals("수박수", result);
    }
}