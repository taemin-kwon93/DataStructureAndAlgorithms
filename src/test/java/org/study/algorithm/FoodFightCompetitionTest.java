package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FoodFightCompetitionTest {
    private FoodFightCompetition foodFightCompetition;

    @BeforeEach
    void setUp() {
        foodFightCompetition = new FoodFightCompetition();
    }

    @Test
    void solution() {
        int[] food = {1, 3, 4, 6};
        String result = foodFightCompetition.solution(food);
        System.out.println("result: " + result);
        assertEquals("1223330333221", result);
    }

    @Test
    void solution2() {
        int[] food = {1, 3, 4, 6};
        String result = foodFightCompetition.solution2(food);
        System.out.println("result: " + result);
        assertEquals("1223330333221", result);
    }
}