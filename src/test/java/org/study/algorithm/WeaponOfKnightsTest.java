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

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
    }
}