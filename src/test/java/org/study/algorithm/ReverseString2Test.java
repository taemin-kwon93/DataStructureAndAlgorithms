package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseString2Test {
    private ReverseString2 reverseString2;

    @BeforeEach
    void setUp() {
        reverseString2 = new ReverseString2();
    }
    @Test
    void solution() {
        String my_string = "0123456789";

        String result = reverseString2.solution(my_string, 0, 9);

        assertEquals("9876543210", result);
    }

    @Test
    void swap() {
        char[] a = {'a', 'b', 'c', 'd', 'e'};
        int idx1 = 0;
        int idx2 = 4;
        char[] expected = {'e', 'b', 'c', 'd', 'a'};

        char[] result = reverseString2.swap(a, idx1, idx2);

        assertArrayEquals(expected, result);
    }
}