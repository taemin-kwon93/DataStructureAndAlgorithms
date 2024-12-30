package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LifeBoatTest {
    private LifeBoat lifeBoat;

    @BeforeEach
    void setUp() {
        lifeBoat = new LifeBoat();
    }

    @Test
    void solution() {
        int[] people1 = {70, 50, 80, 50};
        int[] people2 = {70, 80, 50};
        int[] people3 = {10, 10, 20, 30, 30, 30, 50, 50, 80, 100};
        int[] people4 = {40, 50, 100, 100};

        int limit1 = 100;
        int limit2 = 100;
        int limit3 = 100;
        int limit4 = 140;

        int result1 = lifeBoat.solution(people1, limit1);
        int result2 = lifeBoat.solution(people2, limit2);
        int result3 = lifeBoat.solution(people3, limit3);
        int result4 = lifeBoat.solution(people4, limit4);

        assertEquals(3, result1);
        assertEquals(3, result2);
        assertEquals(6, result3);
        assertEquals(3, result4);
    }
}