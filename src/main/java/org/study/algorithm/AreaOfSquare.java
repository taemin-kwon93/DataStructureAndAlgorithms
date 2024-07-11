package org.study.algorithm;

/**
 * 2차원 좌표 평면에 변이 축과 평행한 직사각형이 있습니다.
 * 직사각형 네 꼭짓점의 좌표 [[x1, y1], [x2, y2], [x3, y3],
 * [x4, y4]]가 담겨있는 배열 dots가 매개변수로 주어질 때,
 * 직사각형의 넓이를 return 하도록 solution 함수를 완성해보세요.
 */
public class AreaOfSquare {
    public int solution(int[][] dots) {
        if (dots == null || dots.length != 4) return 0;

        // x좌표와 y좌표의 최소값과 최대값을 찾습니다.
        int minX = Integer.MAX_VALUE;
        int maxX = Integer.MIN_VALUE;
        int minY = Integer.MAX_VALUE;
        int maxY = Integer.MIN_VALUE;

        for (int[] dot : dots) {
            minX = Math.min(minX, dot[0]);
            maxX = Math.max(maxX, dot[0]);
            minY = Math.min(minY, dot[1]);
            maxY = Math.max(maxY, dot[1]);
        }

        // 사각형의 넓이 계산
        int width = maxX - minX;
        int height = maxY - minY;

        return width * height;
    }
}
