package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveCharactersTest {
    private RemoveCharacters removeCharacters;

    @BeforeEach
    void setUp() {
        removeCharacters = new RemoveCharacters();
    }
    @Test
    void solution() {
        String my_string = "apporoograpemmemprs";
        int[] indices = {1, 16, 6, 15, 0, 10, 11, 3};

        String result = removeCharacters.solution(my_string, indices);

        assertEquals("programmers", result);
    }
}