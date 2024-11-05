package org.study.algorithm;

public class Tournament {
    public int solution(int n, int a, int b) {
        int count = 1;
        int x = Math.min(a, b);
        int y = Math.max(a, b);

        for (int i = n; i >= 2; i /= 2) {
            if (y - x <= 1 && x % 2 == 1) break;
            if (x % 2 == 0) {
                x /= 2;
            } else {
                x = x / 2 + 1;
            }

            if (y % 2 == 0) {
                y /= 2;
            } else {
                y = y / 2 + 1;
            }
            count++;
        }

        return count;
    }

    public int solution2(int a, int b) {
        return Integer.toBinaryString((a-1)^(b-1)).length();
    }
}
