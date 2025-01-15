package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FeatureDevelopmentTest {
    private FeatureDevelopment featureDevelopment;

    @BeforeEach
    void setUp() {
        featureDevelopment = new FeatureDevelopment();
    }

    @Test
    void solution() {
        int[] progress1 = {93, 30, 55};
        int[] speeds1 = {1, 30, 5};
        int[] expected1 = {2, 1};

        int[] progress2 = {95, 90, 99, 99, 80, 99};
        int[] speeds2 = {1, 1, 1, 1, 1, 1};
        int[] expected2 = {1, 3, 2};

        int[] progress3 = {99, 96, 40, 10, 15, 70, 50};
        int[] speeds3 = {1, 2, 20, 50, 45, 8, 50};
        int[] expected3 = {1, 1, 3, 2};

        int[] progress4 = {90, 90, 90};
        int[] speeds4 = {1, 5, 4};
        int[] expected4 = {3};

        int[] result1 = featureDevelopment.solution(progress1, speeds1);
        int[] result2 = featureDevelopment.solution(progress2, speeds2);
        int[] result3 = featureDevelopment.solution(progress3, speeds3);
        int[] result4 = featureDevelopment.solution(progress4, speeds4);

        assertArrayEquals(expected1, result1);
        assertArrayEquals(expected2, result2);
        assertArrayEquals(expected3, result3);
        assertArrayEquals(expected4, result4);
    }
}