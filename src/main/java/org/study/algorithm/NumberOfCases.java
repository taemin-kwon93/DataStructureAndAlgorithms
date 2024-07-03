package org.study.algorithm;

import java.math.BigInteger;

public class NumberOfCases {
    public BigInteger solution(int n, int m) {
        return factorial(n).divide(factorial(n - m).multiply(factorial(m)));
    }

    public BigInteger factorial(int x) {
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= x; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
}
