package org.study.parksangkhil;

import java.util.*;

public class ShortestPath {
    record Position(int y, int x, int distance) {
    }

    Queue<Position> pq = new PriorityQueue<>(Comparator.comparing(o -> o.distance));

    public void findPath(int y, int x, int distance, int[][] maps) {
        if (y >= 0 &&
                y < maps.length &&
                x >= 0 &&
                x < maps.length &&
                maps[y][x] != 0) {
            // 이미 지나온 경로는 더 이상 거치지 않도록 0으로 설정한다.
            maps[y][x] = 0;
            // 현재 위치와 거리 +1 을 우선순위 큐에 삽입
            pq.add(new Position(y, x, distance + 1));

        }
    }

    public int solution(int[][] maps) {
        pq.add(new Position(0, 0, 1));
        Map<Integer, Position> dist = new LinkedHashMap<>();

        while (!pq.isEmpty()) {
            // 거리가 가장 짧은 값 추출
            Position cur = pq.poll();

            // 아직 계산하지 않은 지점이라면 계산 결과 삽입
            // 키/값 형태이므로 키는 (y*1000+x)로 구성
            if (!dist.containsKey(cur.y * 1000 + cur.x)) {
                dist.put(cur.y * 1000 + cur.x, cur);

                findPath(cur.y, cur.x + 1, cur.distance, maps); // 동
                findPath(cur.y, cur.x - 1, cur.distance, maps); // 서
                findPath(cur.y + 1, cur.x, cur.distance, maps); // 남
                findPath(cur.y - 1, cur.x, cur.distance, maps); // 북
            }
        }

        if (dist.containsKey((maps.length - 1) * 1000 + (maps[0].length - 1))) {
            return dist.get(((maps.length - 1) * 1000) + (maps[0].length - 1)).distance;
        }

        return -1;
    }
}
