package org.study.algorithm;

import java.util.Arrays;

public class EvenOddArraySeparator {
    public static void main(String[] args) {
        EvenOddArraySeparator separator = new EvenOddArraySeparator();
        int[] result = separator.solution(new int[] {1, 2, 3, 4, 5});
        System.out.println(Arrays.toString(result));
    }

    public int[] solution(int[] numbers) {
        int[] result = new int[2];

        for(int i = 0; i < numbers.length; i++) {
            result[numbers[i] % 2 == 0 ? 0 : 1]++;
        }

        return result;
    }
}
