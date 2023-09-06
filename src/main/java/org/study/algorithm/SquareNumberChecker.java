package org.study.algorithm;

/**
 * 제곱수 판별학기
 * 어떤 자연수를 제곱했을 때 나오는 정수를 제곱수라고 합니다.
 * 정수 n이 매개변수로 주어질 때,
 * n이 제곱수라면 1을 아니라면 2를 return하도록 solution 함수를 완성해주세요.
 */

public class SquareNumberChecker {
    public static void main(String[] args) {
        SquareNumberChecker solve = new SquareNumberChecker();
        int answer = solve.solution(976);
        System.out.println(answer); // 2
    }

    public int solution(int n) {
        int condition = 0;
        int i = 0;

        while (condition <= n) {
            if (i * i == n) {
                return 1;
            }
            condition = i * i;
            i++;
        }

        return 2;
    }
}
