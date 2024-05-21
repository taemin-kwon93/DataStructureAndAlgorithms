package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountOBetweenXTest {
    private CountOBetweenX countOBetweenX;

    @BeforeEach
    void setUp() {
        countOBetweenX = new CountOBetweenX();
    }

    @Test
    void solution() {
        int[] result = countOBetweenX.solution("oxooxoxxox");
        assertArrayEquals(new int[] {1, 2, 1, 0, 1, 0}, result);
    }
}