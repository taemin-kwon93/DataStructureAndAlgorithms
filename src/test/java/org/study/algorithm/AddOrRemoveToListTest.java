package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddOrRemoveToListTest {
    private AddOrRemoveToList addOrRemoveToList;

    @BeforeEach
    void setUp() {
        addOrRemoveToList = new AddOrRemoveToList();
    }

    @Test
    void solution() {
        int[] arr = {3, 2, 4, 1, 3};
        boolean[] flag = {true, false, true, false, false};
        int[] expected = {3, 3, 3, 3, 4, 4, 4, 4};

        int[] result = addOrRemoveToList.solution(arr, flag);

        assertArrayEquals(expected, result);
    }
}