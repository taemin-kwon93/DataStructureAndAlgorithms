package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompareOperationValues2Test {
    private CompareOperationValues2 compOperVal2;

    @BeforeEach
    void setUp() {
        compOperVal2 = new CompareOperationValues2();
    }

    @Test
    void solution() {
        int result = compOperVal2.solution(2, 91);
        assertEquals(912, result);
    }
}