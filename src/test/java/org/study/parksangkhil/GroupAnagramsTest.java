package org.study.parksangkhil;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class GroupAnagramsTest {
    private GroupAnagrams groupAnagrams;

    @BeforeEach
    void setUp() {
        groupAnagrams = new GroupAnagrams();
    }

    @Test
    void solution() {
        String[] strArr = {"eat", "tea", "tan", "ate", "ant", "cat"};
        List<List<String>> expected = Arrays.asList(
                Arrays.asList("eat", "tea", "ate"),
                List.of("cat"),
                Arrays.asList("tan", "ant")
        );

        List<List<String>> result = groupAnagrams.solution(strArr);

        assertEquals(expected, result);
    }
}