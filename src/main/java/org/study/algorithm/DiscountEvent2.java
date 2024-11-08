package org.study.algorithm;

import java.util.*;

public class DiscountEvent2 {
    public int solution(String[] wants, int[] amount, String[] items) {
        Map<String, Integer> map = new HashMap<>();
        final int EVENT_PERIOD = 10;
        int answer = 0;

        for (int i = 0; i < wants.length; i++) {
            map.put(wants[i], amount[i]);
        }

        for (int i = 0; i < items.length; i++) {
            int flag = 0;
            if (map.containsKey(items[i])) {
                map.put(items[i], map.get(items[i]) - 1);
            }

            if (i >= 10 && map.containsKey(items[i - EVENT_PERIOD])) {
                map.put(items[i - EVENT_PERIOD],
                        (map.get(items[i - EVENT_PERIOD]) + 1)
                );
            }
            for (int x : map.values())
                flag = Math.max(flag, x);

            if (flag <= 0) {
                answer++;
            }
        }
        return answer;
    }
}
