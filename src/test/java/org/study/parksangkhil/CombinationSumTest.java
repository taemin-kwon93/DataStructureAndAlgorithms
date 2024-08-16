package org.study.parksangkhil;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CombinationSumTest {
    private CombinationSum combinationSum;

    @BeforeEach
    void setUp() {
        combinationSum = new CombinationSum();
    }

    @Test
    void combinationSum() {
        int[] candidates = {2, 3, 5, 8};
        int target = 8;
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(new ArrayList<>(Arrays.asList(2, 2, 2, 2)));
        expected.add(new ArrayList<>(Arrays.asList(2, 3, 3)));
        expected.add(new ArrayList<>(Arrays.asList(3, 5)));
        expected.add(new ArrayList<>(List.of(8)));

        List<List<Integer>> results = combinationSum.combinationSum(candidates, target);

        assertEquals(expected, results);
    }
}