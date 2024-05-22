package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SplitBySpaceTest {
    private SplitBySpace splitBySpace;

    @BeforeEach
    void setUp() {
        splitBySpace = new SplitBySpace();
    }
    @Test
    void solution() {
        String[] result = splitBySpace.solution("i    love  you");
        assertArrayEquals(new String[] {"i", "love", "you"}, result);
    }

    @Test
    void solution2() {
        String[] result = splitBySpace.solution2("i    love  you");
        assertArrayEquals(new String[] {"i", "love", "you"}, result);
    }
}