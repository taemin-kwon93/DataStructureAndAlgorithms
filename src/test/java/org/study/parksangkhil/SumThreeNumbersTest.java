package org.study.parksangkhil;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class SumThreeNumbersTest {
    private SumThreeNumbers sumThreeNumbers;

    @BeforeEach
    void setUp() {
        sumThreeNumbers = new SumThreeNumbers();
    }

    @Test
    void solution() {
        int[] arr1 = {-1, 0, 1, 2, -1, -5};
        int[] arr2 = {0, 0, 0, 0};

        List<List<Integer>> expected1 = new ArrayList<>();
        expected1.add(Arrays.asList(-1, -1, 2));
        expected1.add(Arrays.asList(-1, 0, 1));

        List<List<Integer>> expected2 = new ArrayList<>();
        expected2.add(Arrays.asList(0, 0, 0));

        List<List<Integer>> result1 = sumThreeNumbers.solution(arr1);
        List<List<Integer>> result2 = sumThreeNumbers.solution(arr2);

        assertArrayEquals(expected1.toArray(), result1.toArray());
        assertArrayEquals(expected2.toArray(), result2.toArray());
    }

    @Test
    void threeSum() {
        int[] arr1 = {-1, 0, 1, 2, -1, -5};
        int[] arr2 = {0, 0, 0, 0};

        List<List<Integer>> expected1 = new ArrayList<>();
        expected1.add(Arrays.asList(-1, -1, 2));
        expected1.add(Arrays.asList(-1, 0, 1));

        List<List<Integer>> expected2 = new ArrayList<>();
        expected2.add(Arrays.asList(0, 0, 0));

        List<List<Integer>> result1 = sumThreeNumbers.threeSum(arr1);
        List<List<Integer>> result2 = sumThreeNumbers.threeSum(arr2);

        assertArrayEquals(expected1.toArray(), result1.toArray());
        assertArrayEquals(expected2.toArray(), result2.toArray());
    }
}