package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicatedPairTest {
    private RemoveDuplicatedPair rdp;

    @BeforeEach
    void setUp() {
        rdp = new RemoveDuplicatedPair();
    }

    @Test
    void solution() {
        int result1 = rdp.solution("baabaa");
        int result2 = rdp.solution("cdcd");

        assertEquals(1, result1);
        assertEquals(0, result2);
    }
}