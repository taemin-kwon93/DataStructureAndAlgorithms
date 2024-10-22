package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NameCardTest {
    private NameCard nameCard;

    @BeforeEach
    void setUp() {
        nameCard = new NameCard();
    }

    @Test
    void solution() {
        int[][] sizes1 = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
        int[][] sizes2 = {{10, 7}, {12, 3}, {8, 15}, {14, 7}, {5, 15}};
        int[][] sizes3 = {{14, 4}, {19, 6}, {6, 16}, {18, 7}, {7, 11}};

        int result1 =  nameCard.solution(sizes1);
        int result2 =  nameCard.solution(sizes2);
        int result3 =  nameCard.solution(sizes3);

        assertEquals(4000, result1);
        assertEquals(120, result2);
        assertEquals(133, result3);
    }
}