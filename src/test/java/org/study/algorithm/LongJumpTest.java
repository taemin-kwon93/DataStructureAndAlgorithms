package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongJumpTest {
    private LongJump longJump;

    @BeforeEach
    void setUp() {
        longJump = new LongJump();
    }

    @Test
    void solution() {
        int result1 = longJump.solution(4);
        int result2 = longJump.solution(5);

        assertEquals(5, result1);
        assertEquals(8, result2);
    }
}