package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArithmeticSequenceSumTest {
    private ArithmeticSequenceSum arithmeticSequenceSum;
    @BeforeEach
    void setUp() {
        arithmeticSequenceSum = new ArithmeticSequenceSum();
    }

    @Test
    void solution() {
        boolean[] included = {true, false, false, true, true};

        int result = arithmeticSequenceSum.solution(3, 4, included);

        assertEquals(37, result);
    }
}