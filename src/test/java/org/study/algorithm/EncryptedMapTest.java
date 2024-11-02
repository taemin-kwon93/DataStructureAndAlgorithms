package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EncryptedMapTest {
    private EncryptedMap encryptedMap;

    @BeforeEach
    void setUp() {
        encryptedMap = new EncryptedMap();
    }

    @Test
    void solution() {
        int[] arr1 = {9, 20, 28, 18, 11};
        int[] arr2 = {30, 1, 21, 17, 28};
        String[] expected = {"#####","# # #", "### #", "#  ##", "#####"};
        String[] result = encryptedMap.solution(5, arr1, arr2);
        assertArrayEquals(expected, result);
    }
}