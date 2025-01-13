package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MockExamTest {
    private MockExam mockExam;

    @BeforeEach
    void setUp() {
        mockExam = new MockExam();
    }

    @Test
    void solution() {
        int[] answers1 = {1, 2, 3, 4, 5};
        int[] answers2 = {1, 3, 2, 4, 2};
        int[] expected1 = {1};
        int[] expected2 = {1, 2, 3};

        int[] result1 = mockExam.solution(answers1);
        int[] result2 = mockExam.solution(answers2);

        assertArrayEquals(expected1, result1);
        assertArrayEquals(expected2, result2);
    }
}