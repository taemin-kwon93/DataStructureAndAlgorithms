package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EntryScreeningTest {
    private EntryScreening entryScreening;

    @BeforeEach
    void setUp() {
        entryScreening = new EntryScreening();
    }

    @Test
    void solution() {
        int[] times = {7, 10};
        long result = entryScreening.solution(6, times);
        assertEquals(28, result);
    }
}