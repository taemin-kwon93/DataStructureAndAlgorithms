package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountUpTest {
    private CountUp countUp;

    @BeforeEach
    void setUp() {
        countUp = new CountUp();
    }

    @Test
    void solution() {
        // Given
        int start_num = 3;
        int end_num = 10;
        int[] actual = new int[] {3, 4, 5, 6, 7, 8, 9, 10};

        // When
        int[] result = countUp.solution(start_num, end_num);

        // Then
        assertArrayEquals(actual, result);

    }
}