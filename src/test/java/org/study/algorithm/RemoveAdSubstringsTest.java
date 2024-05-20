package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveAdSubstringsTest {
    private RemoveAdSubstrings removeAdSubstrings;

    @BeforeEach
    void setUp() {
        removeAdSubstrings = new RemoveAdSubstrings();
    }

    @Test
    void solution() {
        // Given
        String[] a = {"and","notad","abcd"};
        String[] expected = {"and", "abcd"};

        // When
        String[] result = removeAdSubstrings.solution(a);

        // Then
        assertArrayEquals(expected, result);
    }
}