package org.study.algorithm;

import java.util.*;

public class PrimeNumber {
    public int solution(int n) {
        List<Integer> list = new ArrayList<>();
        if (n < 3) {
            return 1;
        } else if (n == 3) {
            return 2;
        }
        list.add(2);
        list.add(3);

        for (int i = 4; i <= n; i++) {
            for (int j = 0; j < list.size(); j++) {
                if (i % list.get(j) == 0) {
                    break;
                } else if (i % list.get(j) != 0 && j == list.size() - 1) {
                    list.add(i);
                }
            }
        }

        return list.size();
    }

    // Use Sieve of Eratosthenes
    public int solution2(int n) {
        if (n < 2) return 0;

        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false; // 0 and 1 aren't prime numbers

        for (int i = 2; i * i <= n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= n; j += i)
                    isPrime[j] = false;
            }
        }

        int count = 0;
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) count++;
        }

        return count;
    }
}
