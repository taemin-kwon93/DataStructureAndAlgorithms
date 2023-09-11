package org.study.algorithm;

import java.util.Arrays;

public class LargestNumberFinder {
    public static void main(String[] args) {
        LargestNumberFinder solve = new LargestNumberFinder();
        int[] answer = solve.solution(new int[]{1,8,3});
        System.out.println(Arrays.toString(answer));
    }

    public int[] solution(int[] numbers) {
        int[] duplicateNumbers = numbers.clone();
        Arrays.sort(duplicateNumbers);
        for(int i = 0; i < numbers.length; i++) {
            if(numbers[i] == duplicateNumbers[numbers.length - 1]) {
                return new int[] {numbers[i], i};
            }
        }
        return new int[] {0, 0};
    }
}
