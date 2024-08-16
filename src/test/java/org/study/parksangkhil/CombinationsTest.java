package org.study.parksangkhil;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CombinationsTest {
    private Combinations combinations;

    @BeforeEach
    void setUp() {
        combinations = new Combinations();
    }

    @Test
    void combine() {
        int n = 5;
        int k = 3;
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(new ArrayList<>(Arrays.asList(1, 2, 3)));
        expected.add(new ArrayList<>(Arrays.asList(1, 2, 4)));
        expected.add(new ArrayList<>(Arrays.asList(1, 2, 5)));
        expected.add(new ArrayList<>(Arrays.asList(1, 3, 4)));
        expected.add(new ArrayList<>(Arrays.asList(1, 3, 5)));
        expected.add(new ArrayList<>(Arrays.asList(1, 4, 5)));
        expected.add(new ArrayList<>(Arrays.asList(2, 3, 4)));
        expected.add(new ArrayList<>(Arrays.asList(2, 3, 5)));
        expected.add(new ArrayList<>(Arrays.asList(2, 4, 5)));
        expected.add(new ArrayList<>(Arrays.asList(3, 4, 5)));

        List<List<Integer>> results = combinations.combine(n, k);

        assertEquals(expected, results);
    }
}