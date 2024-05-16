package org.study.algorithm;

import java.util.Arrays;
// 합성수 찾기, 약수의 개수가 세 개 이상인 수를 합성수라고 합니다.
public class FindCompositeNumbers {
    // 소수가 아닌 수를 판별
    public int solution(int n) {
        int count = 0;
        for (int i = 2; i <= n; i++) if (isComposite(i)) count++;
        return count;
    }

    public boolean isComposite(int n) {
        int divisorCount = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) divisorCount++;
            if (divisorCount >= 3) return true;
        }

        return false;
    }

    // 소수를 구하고 전체 개수 n에서 소수 갯수를 뺌
    public int solution2(int n) {
        int countPrimeNumbers = countPrimeNumbers(n);
        int answer = n - countPrimeNumbers;

        return answer;
    }

    public int countPrimeNumbers(int n) {
        int counter = 1;
        boolean[] primes = sieveOfEratosthenes(n);

        for (int i = 2; i <= n; i++) {
            if (primes[i]) {
                counter++;
            }
        }

        System.out.println("counter: " + counter);
        return counter;
    }

    public static boolean[] sieveOfEratosthenes(int n) {
        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = false; // 0은 소수가 아니다.
        isPrime[1] = false; // 1은 소수가 아니다.

        for (int i = 2; i * i <= n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        return isPrime;
    }
}
