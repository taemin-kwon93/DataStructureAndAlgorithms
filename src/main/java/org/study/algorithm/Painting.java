package org.study.algorithm;

public class Painting {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        // Tracks the end of the last painted segment
        int lastPainted = 0;

        for (int x : section) {
            // If current section is not covered
            if (x > lastPainted) {
                // Paint from x to (x + m - 1)
                lastPainted = x + m - 1;
                // Increment paint count
                answer++;
            }
        }

        return answer;
    }
}
