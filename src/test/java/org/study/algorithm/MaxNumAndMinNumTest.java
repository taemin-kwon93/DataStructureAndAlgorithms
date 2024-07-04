package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxNumAndMinNumTest {
    private MaxNumAndMinNum maxNumAndMinNum;

    @BeforeEach
    void setUp() {
        maxNumAndMinNum = new MaxNumAndMinNum();
    }

    @Test
    void solution() {
        String result = maxNumAndMinNum.solution("1 2 3 4");
        assertEquals("1 4", result);
    }
}