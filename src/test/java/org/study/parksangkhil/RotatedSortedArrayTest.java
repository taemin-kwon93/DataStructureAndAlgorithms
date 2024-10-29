package org.study.parksangkhil;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RotatedSortedArrayTest {
    private RotatedSortedArray rsa;

    @BeforeEach
    void setUp() {
        rsa = new RotatedSortedArray();
    }

    @Test
    void solution() {
        int[] nums1 = {3, 4, 5, 6, 0, 1, 2};
        int[] nums2 = {4, 5, 6, 7, 0, 1, 2};
        int[] nums3 = {4, 5, 6, 7, 0, 1, 2};

        int result1 = rsa.search(nums1, 1);
        int result2 = rsa.search(nums2, 0);
        int result3 = rsa.search(nums3, 3);

        assertEquals(5, result1);
        assertEquals(4, result2);
        assertEquals(-1, result3);
    }
}