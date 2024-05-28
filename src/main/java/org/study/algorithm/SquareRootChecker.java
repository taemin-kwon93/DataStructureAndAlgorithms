package org.study.algorithm;

/**
 * 임의의 양의 정수 n에 대해, n이 어떤 양의 정수 x의 제곱인지 아닌지 판단하려 합니다.
 * n이 양의 정수 x의 제곱이라면 x+1의 제곱을 리턴하고, n이 양의 정수 x의 제곱이 아니라면 -1을 리턴하는 함수를 완성하세요.
 */

public class SquareRootChecker {
    public long solution(long n) {
        for (int i = 1; i <= (n+1)  / 2; i++) {
            if ((long) i * i == n) return (long) (i + 1) * (i + 1);
        }
        return -1;
    }
}
