package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ThreeSplitterTest {
    private ThreeSplitter threeSplitter;

    @BeforeEach
    void setUp() {
        threeSplitter = new ThreeSplitter();
    }

    @Test
    void solution() {
        String myStr = "baconlettucetomato";
        String[] expected = {"onlettu", "etom", "to"};
        String[] result = threeSplitter.solution(myStr);

        assertArrayEquals(expected, result);
    }
}