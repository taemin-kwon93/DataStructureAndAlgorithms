package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReturnBasedOnConditionTest {
    private ReturnBasedOnCondition rbOnCondition;

    @BeforeEach
    void setUp() {
        rbOnCondition = new ReturnBasedOnCondition();
    }

    @Test
    void WhenGivenNumberIsOddThenReturnIsSumNumbers() {
        int result = rbOnCondition.solution(7);
        assertEquals(16, result);
    }

    @Test
    void WhenGivenNumberIsEvenThenReturnIsSumNumbersSquare() {
        int result = rbOnCondition.solution(10);
        assertEquals(220, result);
    }
}