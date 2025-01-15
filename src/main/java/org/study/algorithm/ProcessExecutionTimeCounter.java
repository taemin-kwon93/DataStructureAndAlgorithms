package org.study.algorithm;

import java.util.*;

public class ProcessExecutionTimeCounter {
    public int solution(int cacheSize, String[] cities) {
        if (cacheSize == 0) {
            // 캐시 크기가 0이면 모든 요청은 cache miss
            return cities.length * 5;
        }

        Deque<String> cache = new ArrayDeque<>();
        int executionTime = 0;

        for (String city : cities) {
            String cur = city.toLowerCase();

            if (cache.contains(cur)) {
                // Cache hit: 실행 시간 1, 큐에서 제거 후 다시 삽입
                cache.remove(cur);
                executionTime += 1;
            } else {
                // Cache miss: 실행 시간 5, 캐시가 가득 차면 가장 오래된 항목 제거
                if (cache.size() >= cacheSize) {
                    cache.poll();
                }
                executionTime += 5;
            }
            cache.add(cur);
        }

        return executionTime;
    }
}
