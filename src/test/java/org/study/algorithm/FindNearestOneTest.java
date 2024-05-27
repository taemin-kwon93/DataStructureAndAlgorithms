package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindNearestOneTest {
    private FindNearestOne findNearestOne;

    @BeforeEach
    void setUp() {
        findNearestOne = new FindNearestOne();
    }

    @Test
    void shouldReturnCorrectIndexWhenOneExistsAfterIdx() {
        int[] arr = {1, 1, 1, 1, 0};
        int result = findNearestOne.solution(arr, 3);
        assertEquals(3, result);
    }

    @Test
    void shouldReturnMinusOneWhenNoOneExistsAfterIdx() {
        int[] arr = {1, 0, 0, 1, 0, 0};
        int result = findNearestOne.solution(arr, 4);
        assertEquals(-1, result);
    }
}