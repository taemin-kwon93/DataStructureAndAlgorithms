package org.study.parksangkhil;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntersectionOfTwoArraysTest {
    private IntersectionOfTwoArrays ita;

    @BeforeEach
    void setUp() {
        ita = new IntersectionOfTwoArrays();
    }

    @Test
    void intersection() {
        int[] nums1 = {4, 9, 5};
        int[] nums2 = {9, 4, 9, 8, 4};
        int[] expected = {4, 9};

        int[] result = ita.intersection(nums1, nums2);
        assertArrayEquals(expected, result);
    }
}