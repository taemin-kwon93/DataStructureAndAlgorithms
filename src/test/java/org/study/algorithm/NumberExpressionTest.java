package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberExpressionTest {
    private NumberExpression numberExpression;

    @BeforeEach
    void setUp() {
        numberExpression = new NumberExpression();
    }

    @Test
    void solution() {
        int n = 15;
        int expected = 4;

        int result = numberExpression.solution(n);

        assertEquals(expected, result);
    }
}