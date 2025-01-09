package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConysClothesTest {
    private ConysClothes conysClothes;

    @BeforeEach
    void setUp() {
        conysClothes = new ConysClothes();
    }

    @Test
    void solution() {
        String[][] clothes1 = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
        String[][] clothes2 = {{"crow_mask", "face"}, {"blue_sunglasses", "face"}, {"smoky_makeup", "face"}};
        String[][] clothes3 = {{"beanie", "headgear"}, {"jean" ,"pants"}, {"polo", "shirts"},
                               {"hat", "headgear"}, {"slacks" ,"pants"}, {"hoodie", "shirts"},
                               {"cap", "headgear"}, {"chino" ,"pants"}, {"v_neck", "shirts"}};

        int result1 = conysClothes.solution(clothes1);
        int result2 = conysClothes.solution(clothes2);
        int result3 = conysClothes.solution(clothes3);

        assertEquals(5, result1);
        assertEquals(3, result2);
        assertEquals(63, result3);
    }
}