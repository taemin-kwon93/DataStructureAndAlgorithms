package org.study.parksangkhil;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LargestNumberTest {
    private LargestNumber largestNumber;

    @BeforeEach
    void setUp() {
        largestNumber = new LargestNumber();
    }

    @Test
    void largestNumber() {
        int[] nums = {3, 30, 34, 8, 9};
        String result = largestNumber.largestNumber(nums);
        String expected = "9834330";

        assertEquals(expected, result);
    }
}