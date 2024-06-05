package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MakeAtoBTest {
    private MakeAtoB makeAtoB;

    @BeforeEach
    void setUp() {
        makeAtoB = new MakeAtoB();
    }

    @Test
    void solution() {
        int result = makeAtoB.solution("hello", "olleh");
        assertEquals(1, result);
    }
}