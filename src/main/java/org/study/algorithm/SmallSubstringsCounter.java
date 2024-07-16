package org.study.algorithm;

import java.math.BigInteger;

public class SmallSubstringsCounter {
    public int solution(String t, String p) {
        if (t.isEmpty() || p.isEmpty()) return 0;
        int len = p.length();
        BigInteger intBP = BigInteger.valueOf(Long.parseLong(p));
        int counter = 0;

        for (int i = 0; i < t.length() - len + 1; i++) {
            BigInteger parts = BigInteger.valueOf(Long.parseLong(t.substring(i, len + i)));
            int flag = intBP.compareTo(parts);
            if (flag >= 0) counter++;
        }

        return counter;
    }
}
