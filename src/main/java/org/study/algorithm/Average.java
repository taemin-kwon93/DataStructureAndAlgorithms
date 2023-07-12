package org.study.algorithm;

public class Average {
    public static void main(String[] args) {
        double result = solution(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
        System.out.println(result);
    }
    public static double solution(int[] numbers) {
        double answer = 0;
        for(int i=0; i<numbers.length; i++) {
            answer += numbers[i];
        }
        answer /= numbers.length;
        return answer;
    }
}

/** 다른 사람의 풀이 중 인상 깊었던 방법
 * public double solution(int[] numbers) {
 *     return Array.stream(numbers).average().orElse(0);
 * }
 */
