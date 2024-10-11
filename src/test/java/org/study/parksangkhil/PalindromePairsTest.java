package org.study.parksangkhil;

import java.util.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromePairsTest {

    @Test
    public void testPalindromePairs() {
        PalindromePairs palindromePairs = new PalindromePairs();

        // Test case 1
        String[] words1 = {"d", "cbbcd", "dcbb", "dcbc", "cbbc", "bbcd"};
        List<List<Integer>> expected1 = Arrays.asList(
                Arrays.asList(0, 1),
                Arrays.asList(1, 4),
                Arrays.asList(2, 5),
                Arrays.asList(2, 1),
                Arrays.asList(3, 0),
                Arrays.asList(5, 2)
        );
        assertEquals(expected1, palindromePairs.palindromePairs(words1));
    }
}