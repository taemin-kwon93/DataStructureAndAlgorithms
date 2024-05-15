package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SubmissionHistoryTest {
    private SubmissionHistory subHistory;

    @BeforeEach
    void setUp() {
        subHistory = new SubmissionHistory();
    }

    @Test
    void solution() {
        // Given
        String a = "heLLo";

        // When
        String result = subHistory.solution(a);

        // Then
        assertEquals("ehllo", result);
    }

    @Test
    void solution2() {
        String a = "heLLo";

        String result = subHistory.solution2(a);

        assertEquals("ehllo", result);
    }
}