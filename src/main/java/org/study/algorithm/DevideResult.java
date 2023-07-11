package org.study.algorithm;

public class DevideResult {
    public static void main(String[] args) {
        int answer = solution(7, 3);
        System.out.println(answer);
    }
    private static int solution(int num1, int num2) {
        float answer = 0;
        answer = ((float)num1 / (float)num2) * 1000;
        return (int)answer;
    }
}

/**
 * 프로그래머스에 제출한 코드는 아래와 같습니다.
 * class Solution {
 *     public static int solution(int num1, int num2) {
 *         float answer = 0;
 *         answer = ((float)num1 / (float)num2) * 1000;
 *         return (int)answer;
 *     }
 * }
 */

/**
 * 다른 사람의 풀이중 마음에 들었던 풀이.
 * class Solution {
 *     public static int solution(int num1, int num2) {
 *         return (int)(((double)num1 / num2) * 1000);
 *   }
 * }
 */