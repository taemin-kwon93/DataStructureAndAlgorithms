package org.study.parksangkhil;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayPartitionTest {
    private ArrayPartition arrayPartition;

    @BeforeEach
    void setUp() {
        arrayPartition = new ArrayPartition();
    }

    @Test
    void arrayPairSum() {
        int[] nums = {1, 4, 3, 2};
        int expected = 4;

        int result = arrayPartition.arrayPairSum(nums);

        assertEquals(expected, result);
    }
}