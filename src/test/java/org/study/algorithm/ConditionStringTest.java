package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConditionStringTest {
    private ConditionString conditionString;

    @BeforeEach
    void setUp() {
        conditionString = new ConditionString();
    }

    @Test
    void solution() {
        int result = conditionString.solution("<", "=", 5, 2);
        assertEquals(0, result);
    }
}