package org.study.algorithm;

import java.util.Map;
import java.util.HashMap;

public class GroupStringByLength {
    public int solution(String[] strArr) {
        int max = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 1; i < 31; i++) {
            map.put(i, 0);
        }

        for (String s : strArr) {
            map.put(s.length(), map.get(s.length()) + 1);
        }

        for (int j = 1; j < 31; j++) {
            if (map.get(j) > max) max = map.get(j);
        }

        return max;
    }

    public int solution2(String[] strArr) {
        int answer = 0;
        int[] counter = new int[strArr.length];
        for (String s: strArr) counter[s.length()]++;
        for (int j : counter) answer = Math.max(answer, j);
        return answer;
    }
}
