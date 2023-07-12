package org.study.algorithm;

public class DuplicateNumber {
    public static void main(String[] args) {
        int[] numbers = {1, 3, 5, 7, 3, 2, 1, 3, 4, 5, 6, 7, 8, 9, 0};
        int result = new DuplicateNumber().solution(numbers, 3);
        System.out.println(result);
    }

    public int solution(int[] numbers, int x) {
        int answer = 0;
        for (int number : numbers) {
            if (number == x) answer++;
        }
        return answer;
    }
}
