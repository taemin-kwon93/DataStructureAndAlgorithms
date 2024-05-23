package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleExpressionEvaluatorTest {
    private SimpleExpressionEvaluator simpleExpressionEvaluator;

    @BeforeEach
    void setUp() {
        simpleExpressionEvaluator = new SimpleExpressionEvaluator();
    }

    @Test
    void solution() {
        int result = simpleExpressionEvaluator.solution("43 + 12");
        assertEquals(55, result);
    }
}