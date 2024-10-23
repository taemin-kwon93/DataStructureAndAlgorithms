package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JumpOrWarpTest {
    private JumpOrWarp jumpOrWarp;

    @BeforeEach
    void setUp() {
        jumpOrWarp = new JumpOrWarp();
    }

    @Test
    void solution() {
        int result1 = jumpOrWarp.solution(5);
        int result2 = jumpOrWarp.solution(6);
        int result3 = jumpOrWarp.solution(5000);

        assertEquals(2, result1);
        assertEquals(2, result2);
        assertEquals(5, result3);
    }
}