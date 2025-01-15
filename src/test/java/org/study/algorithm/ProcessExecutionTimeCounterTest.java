package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProcessExecutionTimeCounterTest {
    private ProcessExecutionTimeCounter petc;

    @BeforeEach
    void setUp() {
        petc = new ProcessExecutionTimeCounter();
    }

    @Test
    void solution() {
        String[] strs1 = {
                "Jeju", "Pangyo", "Seoul",
                "Jeju", "Pangyo", "Seoul",
                "Jeju", "Pangyo", "Seoul"
        };

        String[] strs2 = {
                "Jeju", "Pangyo", "Seoul",
                "NewYork", "LA", "Jeju",
                "Pangyo", "Seoul", "NewYork",
                "LA"
        };

        String[] strs3 = {
                "Jeju", "Pangyo", "Seoul",
                "NewYork", "LA", "SanFrancisco",
                "Seoul", "Rome", "Paris", "Jeju",
                "NewYork", "Rome"
        };

        String[] strs4 = {
                "Jeju", "Pangyo", "NewYork",
                "newyork"
        };

        String[] strs5 = {
                "a", "b", "a", "c", "d", "a"
        };

        int result1 = petc.solution(3, strs1);
        int result2 = petc.solution(3, strs2);
        int result3 = petc.solution(5, strs3);
        int result4 = petc.solution(2, strs4);
        int result5 = petc.solution(0, strs5);

        assertEquals(21, result1);
        assertEquals(50, result2);
        assertEquals(52, result3);
        assertEquals(16, result4);
        assertEquals(30, result5);
    }
}