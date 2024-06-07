package org.study.algorithm;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class OrderingCare {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        System.arraycopy(emergency, 0, answer, 0, emergency.length);
        Arrays.sort(answer);
        Map<Integer, Integer> map = new LinkedHashMap<>();

        int priority = answer.length;
        for (int i : answer) map.put(i, priority--);

        for (int j = 0; j < emergency.length; j++) {
            answer[j] = map.get(emergency[j]);
        }

        return answer;
    }
}
