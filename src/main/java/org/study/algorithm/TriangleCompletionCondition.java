package org.study.algorithm;

public class TriangleCompletionCondition {
    public int solution(int[] slides) {
        // 긴변
        int x = Math.max(slides[0], slides[1]);
        // 작은변
        int y = Math.min(slides[0], slides[1]);
        // 미지수
        int z = 1;
        int count = 0;

        while (z < x+y) {
            if (x+y > z && y+z > x && x+z > y) {
                count++;
            }
            z++;
        }

        return count;
    }
}
