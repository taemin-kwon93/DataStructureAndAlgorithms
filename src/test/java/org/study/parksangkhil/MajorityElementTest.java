package org.study.parksangkhil;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MajorityElementTest {
    private MajorityElement majorityElem;

    @BeforeEach
    void setUp() {
        majorityElem = new MajorityElement();
    }

    @Test
    void majorityElement() {
        int[] nums1 = {1, 2, 1, 3, 1, 4, 1, 1};
        int[] nums2 = {2, 2, 1, 1, 3, 2, 2};

        int result1 = majorityElem.majorityElement(nums1);
        int result2 = majorityElem.majorityElement(nums2);

        assertEquals(1, result1);
        assertEquals(2, result2);
    }
}