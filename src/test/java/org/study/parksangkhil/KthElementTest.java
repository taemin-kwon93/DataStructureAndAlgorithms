package org.study.parksangkhil;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class KthElementTest {
    private KthElement kthElement;

    @BeforeEach
    void setUp() {
        kthElement = new KthElement();
    }

    @Test
    void findKthLargest() {
        int[] arr = {3,2,1,5,6,4};
        int result = kthElement.findKthLargest(arr, 2);
        assertEquals(2, result);
    }
}