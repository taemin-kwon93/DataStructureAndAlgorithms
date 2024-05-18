package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CommonMultipleTest {
    private CommonMultiple commMultiple;

    @BeforeEach
    void setUp() {
        commMultiple = new CommonMultiple();
    }

    @Test
    void solution() {
        int result = commMultiple.solution(60, 2, 3);
        assertEquals(1, result);
    }
}