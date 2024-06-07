package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PowerOfTwoArrayLengthTest {
    private PowerOfTwoArrayLength powerOfTwoArrayLength;

    @BeforeEach
    void setUp() {
        powerOfTwoArrayLength = new PowerOfTwoArrayLength();
    }

    @Test
    void case1() {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int[] expected = {1, 2, 3, 4, 5, 6, 0, 0};

        int[] result = powerOfTwoArrayLength.solution(arr);

        assertArrayEquals(expected, result);
    }

    // arr의 길이가 2의 제곱수 인 경우
    @Test
    void case2() {
        int[] arr = {58, 172, 746, 89};
        int[] expected = {58, 172, 746, 89};

        int[] result = powerOfTwoArrayLength.solution(arr);

        assertArrayEquals(expected, result);
    }

    @Test
    void case3() {
        int[] arr = {};
        int[] expected = {0};

        int[] result = powerOfTwoArrayLength.solution(arr);

        assertArrayEquals(expected, result);
    }

    @Test
    void case4() {
        int[] arr = {1};
        int[] expected = {1};

        int[] result = powerOfTwoArrayLength.solution(arr);

        assertArrayEquals(expected, result);
    }
}