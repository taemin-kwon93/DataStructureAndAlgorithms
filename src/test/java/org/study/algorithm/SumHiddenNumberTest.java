package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumHiddenNumberTest {
    private SumHiddenNumber sumHiddenNumber;

    @BeforeEach
    void setUp() {
        sumHiddenNumber = new SumHiddenNumber();
    }

    @Test
    void solution() {
        int result = sumHiddenNumber.solution("aAb1B2cC34oOp");
        assertEquals(37, result);
    }

    @Test
    void solution2() {
        int result = sumHiddenNumber.solution2("aAb1B2cC34oOp");
        assertEquals(37, result);
    }
}