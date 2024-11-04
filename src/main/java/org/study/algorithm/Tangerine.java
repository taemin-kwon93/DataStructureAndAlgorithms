package org.study.algorithm;

import java.util.*;

public class Tangerine {
    public int solution(int k, int[] tangerine) {
        int answer = 0;

        Map<Integer, Integer> map = new HashMap<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        for (int i : tangerine)
            map.put(i, map.getOrDefault(i, 0) + 1);

        pq.addAll(map.values());

        while (!pq.isEmpty() && k > 0) {
            k -= pq.poll();
            answer++;
        }

        return answer;
    }
}
