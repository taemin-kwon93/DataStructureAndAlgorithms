package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumAbsoluteValuesTest {
    private SumAbsoluteValues sumAbsoluteValues;

    @BeforeEach
    void setUp() {
        sumAbsoluteValues = new SumAbsoluteValues();
    }

    @Test
    void solution() {
        int[] absolutes = {4,7,12};
        boolean[] signs = {true,false,true};

        int result = sumAbsoluteValues.solution(absolutes, signs);

        assertEquals(9, result);
    }
}