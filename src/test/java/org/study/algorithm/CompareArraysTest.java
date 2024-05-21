package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompareArraysTest {
    private CompareArrays compareArrays;

    @BeforeEach
    void setUp() {
        compareArrays = new CompareArrays();
    }

    @Test
    void shouldReturnMinusOneWhenArr2IsLongerThenArr1() {
        int[] a = {49, 13};
        int[] b = {70, 11, 2};

        int result = compareArrays.solution(a, b);

        assertEquals(-1, result);
    }

    @Test
    void shouldReturnOneWhenArr1LongerThenArr2() {
        int[] a = {100, 17, 84, 1, 3};
        int[] b = {55, 12, 65, 36};

        int result = compareArrays.solution(a, b);

        assertEquals(1, result);
    }

    @Test
    void shouldReturnMinusOneWhenArraysAreEqualInLengthButArr2HasGreaterSum() {
        int[] a = {10, 20, 10};
        int[] b = {30, 20, 10};

        int result = compareArrays.solution(a, b);

        assertEquals(-1, result);
    }

    @Test
    void shouldReturnOneWhenArraysAreEqualInLengthButArr1HasGreaterSum() {
        int[] a = {40, 20, 30};
        int[] b = {30, 20, 10};

        int result = compareArrays.solution(a, b);

        assertEquals(1, result);
    }
}