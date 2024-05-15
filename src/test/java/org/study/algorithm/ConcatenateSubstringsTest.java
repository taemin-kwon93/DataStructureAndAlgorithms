package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConcatenateSubstringsTest {

    private ConcatenateSubstrings concatSubStr;

    @BeforeEach
    void setUp() {
        concatSubStr = new ConcatenateSubstrings();
    }

    @Test
    void solution() {
        String[] my_string = new String[] {"progressive", "hamburger", "hammer", "ahocorasick"};
        int[][] parts = new int[][] {{0, 4}, {1, 2}, {3, 5}, {7, 7}};

        String result = concatSubStr.solution(my_string, parts);

        assertEquals("programmers", result);

    }
}