package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SharePizza2Test {
    private SharePizza2 sharePizza2;

    @BeforeEach
    void setUp() {
        sharePizza2 = new SharePizza2();
    }

    @Test
    void solution() {
        int result = sharePizza2.solution(4);
        assertEquals(2, result);
    }
}