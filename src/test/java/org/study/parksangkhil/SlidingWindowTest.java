package org.study.parksangkhil;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SlidingWindowTest {
    private SlidingWindow slidingWindow;

    @BeforeEach
    void setUp() {
        slidingWindow = new SlidingWindow();
    }

    @Test
    void maxSlidingWindow() {
        int[] nums1 = {1, 3, -1, -3, 5, 3, 6, 7};
        int[] nums2 = {1, -1};
        int[] expected1 = {3,3,5,5,6,7};
        int[] expected2 = {1, -1};

        int[] result1 = slidingWindow.maxSlidingWindow(nums1, 3);
        int[] result2 = slidingWindow.maxSlidingWindow(nums2, 1);

        assertArrayEquals(expected1, result1);
        assertArrayEquals(expected2, result2);
    }
}