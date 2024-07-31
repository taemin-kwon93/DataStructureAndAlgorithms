package org.study.parksangkhil;

import java.util.PriorityQueue;

public class ScovilleScale {
    public int solution(int[] scoville, int K) {
        // PriorityQueue를 사용하여 스코빌 지수를 오름차순으로 정렬
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i : scoville) {
            pq.add(i);
        }

        int counter = 0;  // 섞은 횟수

        // 가장 낮은 두 개의 음식을 섞어야 하므로 pq의 크기가 2 이상이어야 함
        while (pq.size() > 1) {
            if (pq.peek() >= K) {
                return counter;  // 모든 음식의 스코빌 지수가 K 이상인 경우
            }

            // 가장 맵지 않은 두 개의 음식을 꺼내어 섞음
            int first = pq.poll();
            int second = pq.poll();
            int newScoville = first + (second * 2);
            pq.add(newScoville);

            counter++;  // 섞은 횟수 증가
        }

        // 남은 하나의 음식이 K 이상인지 확인
        if (pq.peek() >= K) {
            return counter;
        }

        return -1;  // 모든 음식을 섞어도 K 이상이 될 수 없는 경우
    }
}
