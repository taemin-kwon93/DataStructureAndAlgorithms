package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GCDandLCMTest {
    private GCDandLCM gCDandLCM;

    @BeforeEach
    void setUp() {
        gCDandLCM = new GCDandLCM();
    }

    @Test
    void solution() {
        int[] expected = {2, 24};

        int[] result = gCDandLCM.solution(6, 8);

        assertArrayEquals(expected, result);
    }
}