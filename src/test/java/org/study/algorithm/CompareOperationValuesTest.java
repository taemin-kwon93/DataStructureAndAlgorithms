package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompareOperationValuesTest {
    private CompareOperationValues compOperVal;

    @BeforeEach
    void setUp() {
        compOperVal = new CompareOperationValues();
    }

    @Test
    void solution() {
        int result = compOperVal.solution(2, 91);
        assertEquals(364, result);
    }

    @Test
    void solution2() {
        int result = compOperVal.solution2(2, 91);
        assertEquals(364, result);
    }
}