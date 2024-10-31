package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CokeTest {
    private Coke coke;

    @BeforeEach
    void setUp() {
        coke = new Coke();
    }

    @Test
    void solution() {
        int result = coke.solution(3, 2, 20);
        assertEquals(36, result);

    }
}