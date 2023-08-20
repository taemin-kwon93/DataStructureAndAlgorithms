package org.study.algorithm;

import java.util.Arrays;

public class SliceArray2 {
    public int[] solution(int[] numbers, int x, int y) {
        return Arrays.copyOfRange(numbers, x, y + 1);
    }
}
