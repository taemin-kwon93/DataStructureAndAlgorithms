package org.study.parksangkhil;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MinimumHeightTreesTest {
    private MinimumHeightTrees minimumHeightTrees;
    @BeforeEach
    void setUp() {
        minimumHeightTrees = new MinimumHeightTrees();
    }

    @Test
    void findMinHeightTrees() {
        int[][] edges = {{3, 0}, {3, 1}, {3, 2}, {3, 4}, {5, 4}};
        List<Integer> expected = new ArrayList<>(Arrays.asList(3, 4));
        List<Integer> result = minimumHeightTrees.findMinHeightTrees(6, edges);

        assertArrayEquals(expected.toArray(), result.toArray());
    }
}