package org.study.algorithm;

import java.util.Arrays;

public class MaxTwoNumbersMultiplier {
    public static void main(String[] args) {
        MaxTwoNumbersMultiplier multiplier = new MaxTwoNumbersMultiplier();
        int result = multiplier.solution(new int[] {1, 2, 3, 4, 5});
        System.out.println(result);
    }
    public int solution(int[] numbers) {
        int maxNumberIndex = numbers.length - 1;
        Arrays.sort(numbers);
        int answer = numbers[maxNumberIndex] * numbers[maxNumberIndex - 1];
        return answer;
    }
}
