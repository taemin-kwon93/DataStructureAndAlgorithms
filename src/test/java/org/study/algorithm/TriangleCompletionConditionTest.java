package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleCompletionConditionTest {
    private TriangleCompletionCondition triangleCompletionCondition;

    @BeforeEach
    void setUp() {
        triangleCompletionCondition = new TriangleCompletionCondition();
    }

    @Test
    void solution() {
        int[] lines = {11, 7};

        int result = triangleCompletionCondition.solution(lines);

        assertEquals(13, result);
    }

}