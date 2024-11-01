package org.study.algorithm;

import java.util.*;

public class LCM {
    public int solution(int[] arr) {
        List<Map<Integer, Integer>> mapArrayList = new ArrayList<>();
        Map<Integer, Integer> answer = new HashMap<>();

        for (int i : arr) {
            Map<Integer, Integer> temp = new HashMap<>();
            int x = 2;
            while (i > 1) {
                if (i % x == 0) {
                    temp.put(x, temp.getOrDefault(x, 0) + 1);
                    i /= x;
                    x = 2;
                } else {
                    x++;
                }
            }
            mapArrayList.add(temp);
        }

        for (Map<Integer, Integer> entry : mapArrayList) {
            for (Integer i : entry.keySet()) {
                answer.put(i, Math.max(answer.getOrDefault(i, 0), entry.get(i)));
            }
        }

        int total = 1;
        for (Map.Entry<Integer, Integer> entry : answer.entrySet()) {
            for (int i = 0; i < entry.getValue(); i++) {
                total *= entry.getKey();
            }
        }

        return total;
    }

    public long solution2(int[] num) {
        long answer = num[0], g;
        for (int i = 1; i < num.length; i++) {
            g = gcd(answer, num[i]);
            answer = g * (answer / g) * (num[i] / g);
        }
        return answer;
    }

    public long gcd(long a, long b) {
        if (a > b)
            return (a % b == 0) ? b : gcd(b, a % b);
        else
            return (b % a == 0) ? a : gcd(a, b % a);
    }
}

