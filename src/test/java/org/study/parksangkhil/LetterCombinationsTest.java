package org.study.parksangkhil;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LetterCombinationsTest {
    private LetterCombinations letterCombinations;

    @BeforeEach
    void setUp() {
        letterCombinations = new LetterCombinations();
    }

    @Test
    void letterCombinations() {
        String digits = "24";
        List<String> expected = new ArrayList<>(Arrays.asList("ag", "ah", "ai", "bg", "bh", "bi", "cg", "ch", "ci"));

        List<String> result = letterCombinations.letterCombinations(digits);

        assertArrayEquals(expected.toArray(new String[0]), result.toArray(new String[0]));
    }
}