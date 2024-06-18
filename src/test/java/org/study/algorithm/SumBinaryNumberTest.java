package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumBinaryNumberTest {
    private SumBinaryNumber sumBinaryNumber;

    @BeforeEach
    void setUp() {
        sumBinaryNumber = new SumBinaryNumber();
    }

    @Test
    void solution() {
        String bin1 = "10";
        String bin2 = "11";
        String expected = "101";

        String result = sumBinaryNumber.solution(bin1, bin2);

        assertEquals(expected, result);
    }

    @Test
    void getIntFromBinString() {
        String s = "11";
        int expected = 3;

        int result = sumBinaryNumber.getIntFromBinString(s);

        assertEquals(expected, result);
    }

    @Test
    void reverse() {
        char[] chars = {'a', 'b', 'c', 'd'};
        char[] expected = {'d', 'c', 'b', 'a'};

        char[] result = sumBinaryNumber.reverse(chars, chars.length);

        assertArrayEquals(expected, result);
    }
}