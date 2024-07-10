package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveConsecutiveDuplicatesTest {
    private RemoveConsecutiveDuplicates removeConsecutiveDuplicates;

    @BeforeEach
    void setUp() {
        removeConsecutiveDuplicates = new RemoveConsecutiveDuplicates();
    }

    @Test
    void solution() {
        int[] arr = {1, 1, 3, 3, 0, 1, 1};
        int[] expected = {1, 3, 0, 1};

        int[] result = removeConsecutiveDuplicates.solution(arr);

        assertArrayEquals(expected, result);
    }
}