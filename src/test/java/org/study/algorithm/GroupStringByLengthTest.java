package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GroupStringByLengthTest {
    private GroupStringByLength groupStringByLength;

    @BeforeEach
    void setUp() {
        groupStringByLength = new GroupStringByLength();
    }

    @Test
    void solution() {
        String[] strArr = {"a","bc","d","efg","hi"};
        int result = groupStringByLength.solution(strArr);
        assertEquals(2, result);
    }

    @Test
    void solution2() {
        String[] strArr = {"a","bc","d","efg","hi"};
        int result = groupStringByLength.solution2(strArr);
        assertEquals(2, result);
    }
}