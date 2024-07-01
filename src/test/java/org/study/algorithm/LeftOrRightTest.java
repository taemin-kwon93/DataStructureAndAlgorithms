package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeftOrRightTest {
    private LeftOrRight leftOrRight;

    @BeforeEach
    void setUp() {
        leftOrRight = new LeftOrRight();
    }

    @Test
    void solution() {
        String[] strs = {"u", "u", "l", "r"};
        String[] expected = {"u", "u"};

        String[] result = leftOrRight.solution(strs);

        assertArrayEquals(expected, result);
    }
}