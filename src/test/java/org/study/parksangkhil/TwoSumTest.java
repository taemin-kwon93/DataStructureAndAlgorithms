package org.study.parksangkhil;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {
    private TwoSum twoSum;

    @BeforeEach
    void setUp() {
        twoSum = new TwoSum();
    }

    @Test
    void solution() {
        int[] nums = {2,11, 15, 6};
        int target = 8;
        int[] expected = {0, 3};

        int[] result = twoSum.solution(nums, target);

        assertArrayEquals(expected, result);
    }

    @Test
    void solutionB() {
        int[] nums = {2,11, 15, 6};
        int target = 8;
        int[] expected = {0, 3};

        int[] result = twoSum.solutionB(nums, target);

        assertArrayEquals(expected, result);
    }
}