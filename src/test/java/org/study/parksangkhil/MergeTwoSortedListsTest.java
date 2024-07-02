package org.study.parksangkhil;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MergeTwoSortedListsTest {
    private MergeTwoSortedLists mergeTwoSortedLists;

    @BeforeEach
    void setUp() {
        mergeTwoSortedLists = new MergeTwoSortedLists();
    }

    @Test
    void solution() {
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 5));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(1, 3, 4));
        List<Integer> expected = new ArrayList<>(Arrays.asList(1, 1, 2, 3, 4, 5));

        List<Integer> result = mergeTwoSortedLists.solution(list1, list2);

        assertArrayEquals(expected.toArray(), result.toArray());
    }
}