package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortStringArrayByNthCharacterTest {
    private SortStringArrayByNthCharacter sortString;

    @BeforeEach
    void setUp() {
        sortString = new SortStringArrayByNthCharacter();
    }

    @Test
    void solution() {
        String[] strings1 = {"sun", "bed", "car"};
        String[] expected1 = {"car", "bed", "sun"};
        String[] strings2 = {"abce", "abcd", "cdx"};
        String[] expected2 = {"abcd", "abce", "cdx"};
        String[] strings3 = {"cnbc", "anbcd"};
        String[] expected3 = {"anbcd", "cnbc"};


        String[] result1 = sortString.solution(strings1, 1);
        String[] result2 = sortString.solution(strings2, 2);
        String[] result3 = sortString.solution(strings3, 1);

        assertArrayEquals(expected1, result1);
        assertArrayEquals(expected2, result2);
        assertArrayEquals(expected3, result3);
    }
}