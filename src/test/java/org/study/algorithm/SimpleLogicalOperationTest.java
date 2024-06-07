package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleLogicalOperationTest {
    private SimpleLogicalOperation simpleLogicalOperation;

    @BeforeEach
    void setUp() {
        simpleLogicalOperation = new SimpleLogicalOperation();
    }
    @Test
    void solution() {
        boolean x1, x2, x3, x4;
        x1 = false;
        x2 = true;
        x3 = true;
        x4 = true;
        boolean result = simpleLogicalOperation.solution(x1, x2, x3, x4);

        assertEquals(true, result);
    }
}