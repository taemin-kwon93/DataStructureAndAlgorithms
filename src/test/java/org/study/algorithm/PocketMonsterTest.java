package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PocketMonsterTest {
    private PocketMonster pocketMonster;

    @BeforeEach
    void setUp() {
        pocketMonster = new PocketMonster();
    }

    @Test
    void solution() {
        int[] nums1 = {1, 2, 3, 3};
        int[] nums2 = {3, 3, 3, 2, 2, 4};
        int[] nums3 = {3, 3, 3, 2, 2, 2};

        int result1 = pocketMonster.solution(nums1);
        int result2 = pocketMonster.solution(nums2);
        int result3 = pocketMonster.solution(nums3);

        assertEquals(2, result1);
        assertEquals(3, result2);
        assertEquals(2, result3);
    }
}