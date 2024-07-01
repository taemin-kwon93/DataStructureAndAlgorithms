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
        int[] arr = {-1, 0, 1, 2, -1, -5};
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(-1, -1, 2));
        expected.add(Arrays.asList(-1, 0, 1));

        List<List<Integer>> result = sumThreeNumbers.solution(arr);

        assertArrayEquals(expected.toArray(), result.toArray());
    }
}