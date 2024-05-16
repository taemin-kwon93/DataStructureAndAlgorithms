package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SamYukGooTest {
    private SamYukGoo samYukGoo;
    @BeforeEach
    void setUp() {
        samYukGoo = new SamYukGoo();
    }

    @Test
    void solution() {
        int result = samYukGoo.solution(29423);
        assertEquals(2, result);
    }
}