package org.study.parksangkhil;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class SubsetsTest {
    private Subsets subsets;

    @BeforeEach
    void setUp() {
        subsets = new Subsets();
    }

    @Test
    void subsets() {
        int[] nums = {1, 2, 3};
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(List.of()); // Empty subset
        expected.add(List.of(1));
        expected.add(List.of(2));
        expected.add(List.of(3));
        expected.add(Arrays.asList(1, 2));
        expected.add(Arrays.asList(1, 3));
        expected.add(Arrays.asList(2, 3));
        expected.add(Arrays.asList(1, 2, 3));

        List<List<Integer>> results = subsets.subsets(nums);

        // Sort the result for comparison
        results.forEach(Collections::sort);
        results.sort(Comparator.comparingInt(List::size));

        assertEquals(expected, results);
    }

    @Test
    void subsetsB() {
        int[] nums = {1, 2, 3};
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(List.of()); // Empty subset
        expected.add(List.of(1));
        expected.add(List.of(2));
        expected.add(List.of(3));
        expected.add(Arrays.asList(1, 2));
        expected.add(Arrays.asList(1, 3));
        expected.add(Arrays.asList(2, 3));
        expected.add(Arrays.asList(1, 2, 3));

        List<List<Integer>> results = subsets.subsetsB(nums);

        // Sort the result for comparison
        results.forEach(Collections::sort);
        results.sort(Comparator.comparingInt(List::size));

        assertEquals(expected, results);
    }
}