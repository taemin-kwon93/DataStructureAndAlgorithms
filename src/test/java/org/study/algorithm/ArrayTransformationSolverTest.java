package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * '미완' 해당 문제는 풀이가 완료되지 않은 문제입니다.
 */
class ArrayTransformationSolverTest {
    private ArrayTransformationSolver arrayTransformationSolver;

    @BeforeEach
    void setUp() {
        arrayTransformationSolver = new ArrayTransformationSolver();
    }

    @Test
    void solution() {
        int[] arr = {1, 2, 3, 100, 99, 98};
        int[] arr2 = {15, 2, 31, 51, 99, 99};
        int[] arr3 = {7, 2, 15, 25, 99, 99};
        int result = arrayTransformationSolver.solution(arr3);
        System.out.println("return value in Test Code: " + result); // 3
    }
}