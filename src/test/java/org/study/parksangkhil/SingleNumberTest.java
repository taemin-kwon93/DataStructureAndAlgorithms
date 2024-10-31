package org.study.parksangkhil;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SingleNumberTest {
    private SingleNumber singleNumber;

    @BeforeEach
    void setUp() {
        singleNumber = new SingleNumber();
    }

    @Test
    void singleNumber() {
        int[] nums = {4, 1, 2, 1, 2};
        int result = singleNumber.singleNumber(nums);
        assertEquals(4, result);
    }
}