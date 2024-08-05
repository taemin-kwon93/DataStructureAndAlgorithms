package org.study.parksangkhil;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FrequentElemTest {
    private FrequentElem frequentElem;

    @BeforeEach
    void setUp() {
        frequentElem = new FrequentElem();
    }

    @Test
    void solution() {
        int[] nums = {1, 1, 1, 1, 2, 2, 3, 4};
        int[] expected = {1, 2};

        int k = 2;

        int[] result = frequentElem.solution(nums, k);

        assertArrayEquals(expected, result);
    }

    @Test
    void solutionB() {
        int[] nums = {1, 1, 1, 1, 2, 2, 3, 4};
        int[] expected = {1, 2};

        int k = 2;

        int[] result = frequentElem.solutionB(nums, k);

        assertArrayEquals(expected, result);
    }
}