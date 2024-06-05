package org.study.algorithm;

public class Factorial {
    public int solution(int n) {
        int answer = 0;
        int sum = 1;
        for (int i = sum; i <= n; i++) {
            if (sum <= n) {
                sum *= i;
                answer++;
            } else {
                break;
            }
        }

        return sum <= n ? answer : answer - 1;
    }
}
