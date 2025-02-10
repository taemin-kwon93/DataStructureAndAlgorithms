package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProcessTest {
    private Process process;
    @BeforeEach
    void setUp() {
        process = new Process();
    }

    @Test
    void solution() {
        int[] priorities1 = {2, 1, 3, 2};
        int[] priorities2 = {1, 1, 9, 1, 1, 1};
        int[] priorities3 = {2, 2, 1, 1, 5, 4, 4, 5, 3, 2, 1};

//        int result1 = process.solution(priorities1, 2);
//        int result2 = process.solution(priorities2, 0);
        int result3 = process.solution(priorities3, 8);

//        assertEquals(1, result1);
//        assertEquals(5, result2);
        assertEquals(5, result3);
    }
}