package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReturnBasedOnFlagTest {
    private ReturnBasedOnFlag returnBasedOnFlag;

    @BeforeEach
    void setUp() {
        returnBasedOnFlag = new ReturnBasedOnFlag();
    }

    @Test
    void solution() {
        int result = returnBasedOnFlag.solution(-4, 7, true);
        assertEquals(3, result);
    }
}