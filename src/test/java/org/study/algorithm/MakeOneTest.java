package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MakeOneTest {
    private MakeOne makeOne;

    @BeforeEach
    void setUp() {
        makeOne = new MakeOne();
    }

    @Test
    void solution() {
        int[] num_list = {12, 4, 15, 1, 14};
        int result = makeOne.solution(num_list);
        assertEquals(11, result);
    }
}