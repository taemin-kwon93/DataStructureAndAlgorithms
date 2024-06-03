package org.study.algorithm;

import java.util.Map;
import java.util.HashMap;

public class SumMissingNumbers {
    public int solution(int[] numbers) {
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < 10; i++) {
            map.put(i, 0);
        }

        for (int number : numbers) {
            map.put(number, map.get(number) + 1);
        }

        for (int i = 0; i < 10; i ++) {
            if (map.get(i) < 1) answer += i;
        }

        return answer;
    }
}
