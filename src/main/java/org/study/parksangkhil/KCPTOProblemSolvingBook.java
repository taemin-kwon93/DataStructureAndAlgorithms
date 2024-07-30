package org.study.parksangkhil;

import java.util.PriorityQueue;
import java.util.Comparator;

public class KCPTOProblemSolvingBook {
    static class Point {
        long distance;
        int[] point;

        public Point(long distance, int[] point) {
            this.distance = distance;
            this.point = point;
        }
    }

    public int[][] kClosest(int[][] points, int k) {
        // Point 클래스를 저장하는 우선순위 큐로, 정렬 기준은 distance로 한다.
        PriorityQueue<Point> pq = new PriorityQueue<>(Comparator.comparingLong(c -> c.distance));

        for (int[] point : points) {
            // 유클리드 거리 계산
            long distance = (long) point[0] * point[0] + (long) point[1] * point[1];
            // 우선순의 큐에 거리와 좌표를 Point 클래스로 담아 삽입
            pq.add(new Point(distance, point));
        }

        int[][] result = new int [k][];
        // k번 만큼 반복하여 결과 추출
        for (int i = 0; i < k; i++) {
            assert !pq.isEmpty();
            result[i] = pq.poll().point;
        }

        return result;
    }
}
