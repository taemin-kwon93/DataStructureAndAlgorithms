package org.study.algorithm;

/**
 * 피보나치 수는 F(0) = 0, F(1) = 1일 때, 1 이상의 n에 대하여 F(n) = F(n-1) + F(n-2) 가 적용되는 수 입니다.
 * <p>예를들어
 * <pre>F(2) = F(0) + F(1) = 0 + 1 = 1</pre>
 * <pre>F(3) = F(1) + F(2) = 1 + 1 = 2</pre>
 * <pre>F(4) = F(2) + F(3) = 1 + 2 = 3</pre>
 * <pre>F(5) = F(3) + F(4) = 2 + 3 = 5</pre>
 * 와 같이 이어집니다.<p>
 * 2 이상의 n이 입력되었을 때, n번째 피보나치 수를 1234567으로 나눈 나머지를 리턴하는 함수, solution 을 완성해 주세요.
 * <p>제한 사항,  * n은 2 이상 100,000 이하인 자연수입니다.
 */

public class Fibonacci {
    public int solution(int n) {
        int x = fibonacci(n);
        return x % 1234567;
    }

    public int fibonacci(int x) {
        if (x <= 1) return x;
        return fibonacci(x - 2) + fibonacci(x - 1);
    }

    public int solution2(int n) {
        int[] fibo = new int[n + 1];

        fibo[0] = 0;
        fibo[1] = 1;

        for (int i = 2; i <= n; i++) {
            fibo[i] = (fibo[i - 1] + fibo[i - 2]) % 1234567;
        }

        return fibo[n];
    }
}
