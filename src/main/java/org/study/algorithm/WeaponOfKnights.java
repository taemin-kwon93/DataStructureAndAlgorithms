package org.study.algorithm;

public class WeaponOfKnights {
    public int solution(int number, int limit, int power) {
        if (number < 2 && limit < 1) {
            return 0;
        } else if (number < 2) {
            return 1;
        }

        int[] x = new int[number];
        x[0] = 1;

        for (int i = 2; i <= number; i++)
            x[i - 1] = measureCounter(i, limit, power);

        return sumOfElements(x);
    }

    public int measureCounter(int n, int limit, int power) {
        int count = 0;
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) count += (i * i == n) ? 1 : 2;
            if (count > limit) return power;
        }
        return count;
    }

    public int sumOfElements(int[] x) {
        int sum = 0;
        for (int i : x) sum += i;
        return sum;
    }
}
