package org.study.algorithm;

/**
 * calculate the Greatest Common Divisor (GCD) and Least Common Multiple (LCM) of two numbers.
 */
public class GCDandLCM {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];

        // GCD
        answer[0] = gcd(n, m , 2, 1);
        System.out.println("gcd: " + answer[0]);

        // LCM
        answer[1] = (n * m) / gcd(n, m, 2, 1);

        return answer;
    }

    // x, y, 공약수, 공약수 누적 곱
    public int gcd(int x, int y, int z, int m) {
        int min = Math.min(x, y);
        if ((x % z != 0 || y % z != 0) && z <= min) {
            return gcd(x, y, z + 1, m);
        } else if (x % z == 0 && y % z == 0 && z <= min) {
            x /= z;
            y /= z;
            m *= z;
            return gcd(x, y, 2, m);
        }

        return m;
    }
}
