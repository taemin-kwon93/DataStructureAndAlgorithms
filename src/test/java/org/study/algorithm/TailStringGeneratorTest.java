package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TailStringGeneratorTest {
    private TailStringGenerator tailStrGenerator;

    @BeforeEach
    void setUp() {
        tailStrGenerator = new TailStringGenerator();
    }

    @Test
    void solution() {
        // Given
        String[] str_list = {"abc", "def", "ghi"};
        String ex = "ef";

        // When
        String result = tailStrGenerator.solution(str_list, ex);

        // Then
        assertEquals("abcghi", result);
    }
}