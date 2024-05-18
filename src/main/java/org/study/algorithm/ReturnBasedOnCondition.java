package org.study.algorithm;

public class ReturnBasedOnCondition {
    public int solution(int n) {
        return n % 2 == 0 ? squareEvenNumbersAndSum(n) : sumOddNumbers(n);
    }

    public int sumOddNumbers(int n) {
        int result = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) result += i;
        }
        return result;
    }

    public int squareEvenNumbersAndSum(int n) {
        int result = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) result += (i * i);
        }
        return result;
    }
}
