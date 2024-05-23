package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringSplitterAndSorterTest {
    private StringSplitterAndSorter stringSplitterAndSorter;

    @BeforeEach
    void setUp() {
        stringSplitterAndSorter = new StringSplitterAndSorter();
    }

    @Test
    void solution() {
        String a = "dxccxbbbxaaaaxxxsmx";
        String[] expected = {"aaaa","bbb","cc","d", "sm"};

        String[] result = stringSplitterAndSorter.solution(a);
        assertArrayEquals(expected, result);
    }

    @Test
    void solution2() {
        String a = "dxccxbbbxaaaaxxxsmx";
        String[] expected = {"aaaa","bbb","cc","d", "sm"};

        String[] result = stringSplitterAndSorter.solution2(a);
        assertArrayEquals(expected, result);
    }
}