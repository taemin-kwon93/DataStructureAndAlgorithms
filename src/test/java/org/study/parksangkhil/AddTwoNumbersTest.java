package org.study.parksangkhil;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AddTwoNumbersTest {
    private AddTwoNumbers addTwoNumbers;

    @BeforeEach
    void setUp() {
        addTwoNumbers = new AddTwoNumbers();
    }

    @Test
    void solution() {
        List<Integer> l1 = new ArrayList<>(Arrays.asList(2, 4, 3));
        List<Integer> l2 = new ArrayList<>(Arrays.asList(5, 6, 2));
        List<Integer> expected = new ArrayList<>(Arrays.asList(7, 0, 6));

        List<Integer> result = addTwoNumbers.solution(l1, l2);

        assertArrayEquals(expected.toArray(), result.toArray());
    }
}