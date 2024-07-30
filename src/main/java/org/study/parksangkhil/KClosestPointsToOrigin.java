package org.study.parksangkhil;

import java.util.PriorityQueue;
import java.util.Comparator;

public class KClosestPointsToOrigin {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<Coordinate> pq = new PriorityQueue<>(Comparator.comparingInt(c -> -c.distance));

        for (int[] point : points) {
            int x = point[0];
            int y = point[1];
            int distance = euclideanDistance(x, y);

            Coordinate c = new Coordinate(x, y, distance);
            if (pq.size() < k) {
                pq.add(c);
            } else {
                assert pq.peek() != null;
                if (distance < pq.peek().distance) {
                    pq.poll();
                    pq.add(c);
                }
            }
        }

        int[][] result = new int[k][2];

        for (int i = 0; i < k; i++) {
            Coordinate c = pq.poll();
            assert c != null;
            result[i][0] = c.x;
            result[i][1] = c.y;
        }

        return result;
    }

    public int euclideanDistance(int x, int y) {
        return (x * x) + (y* y);
    }

    static class Coordinate {
        int x;
        int y;
        int distance;

        public Coordinate(int x, int y, int distance) {
            this.x = x;
            this.y = y;
            this.distance = distance;
        }
    }
}