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
         boolean result = simpleLogicalOperation.solution(false, true, true, true);
        assertTrue(result);
    }
}