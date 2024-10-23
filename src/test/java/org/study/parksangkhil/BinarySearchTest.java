package org.study.parksangkhil;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {
    private BinarySearch bs;

    @BeforeEach
    void setUp() {
        bs = new BinarySearch();
    }

    @Test
    void search() {
        int[] nums1 = {-1, 0, 3, 5, 9, 12};
        int[] nums2 = {2, 5};

        int result1 = bs.search(nums1, 9);
        int result2 = bs.search(nums1, 2);
        int result3 = bs.search(nums2, 2);

        assertEquals(4, result1);
        assertEquals(-1, result2);
        assertEquals(0, result3);
    }
}