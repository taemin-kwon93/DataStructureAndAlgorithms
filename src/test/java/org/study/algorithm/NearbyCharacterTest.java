package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NearbyCharacterTest {
    private NearbyCharacter nearbyCharacter;

    @BeforeEach
    void setUp() {
        nearbyCharacter = new NearbyCharacter();
    }

    @Test
    void solution() {
        int[] result1 = nearbyCharacter.solution("banana");
        int[] expected = {-1, -1, -1, 2, 2, 2};
        assertArrayEquals(expected, result1);
    }
}