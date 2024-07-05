package org.study.parksangkhil;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ReverseLinkedListTest {
    private ReverseLinkedList reverseLinkedList;

    @BeforeEach
    void setUp() {
        reverseLinkedList = new ReverseLinkedList();
    }

    @Test
    void solution() {
        List<Integer> l = new ArrayList<>(Arrays.asList(1, 2, 3,4, 5, 6));
        List<Integer> expected = new ArrayList<>(Arrays.asList(6, 5, 4, 3, 2, 1));

        List<Integer> result = reverseLinkedList.solution(l);

        assertArrayEquals(expected.toArray(), result.toArray());
    }
}