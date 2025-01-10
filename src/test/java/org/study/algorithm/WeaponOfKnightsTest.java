package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WeaponOfKnightsTest {
    private WeaponOfKnights weaponOfKnights;

    @BeforeEach
    void setUp() {
        weaponOfKnights = new WeaponOfKnights();
    }

    @Test
    void solution() {
        int result1 = weaponOfKnights.solution(5, 3, 2);
        int result2 = weaponOfKnights.solution(10, 3, 2);
        int result3 = weaponOfKnights.solution(1, 0, 2);
        int result4 = weaponOfKnights.solution(1, 3, 2);

        assertEquals(10, result1);
        assertEquals(21, result2);
        assertEquals(0, result3);
        assertEquals(1, result4);
    }
}