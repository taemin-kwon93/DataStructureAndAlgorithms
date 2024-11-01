package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LCMTest {
    private LCM lcm;

    @BeforeEach
    void setUp() {
        lcm = new LCM();
    }

    @Test
    void solution() {
        int[] arr1 = {2, 6, 8, 14};
        int[] arr2 = {1, 2, 3};
        int[] arr3 = {4, 8, 20};

        int result1 = lcm.solution(arr1);
        System.out.println("result1: " + result1);

        int result2 = lcm.solution(arr2);
        System.out.println("result2: " + result2);

        int result3 = lcm.solution(arr3);
        System.out.println("result3: " + result3);

        assertEquals(168, result1);
        assertEquals(6, result2);
        assertEquals(40, result3);
    }

    @Test
    void solution2() {
        int[] arr1 = {2, 6, 8, 14};
        int[] arr2 = {1, 2, 3};
        int[] arr3 = {4, 8, 20};

        long result1 = lcm.solution2(arr1);
        long result2 = lcm.solution2(arr2);
        long result3 = lcm.solution2(arr3);

        assertEquals(168, result1);
        assertEquals(6, result2);
        assertEquals(40, result3);
    }
}