package org.study.algorithm;

import java.util.Deque;
import java.util.ArrayDeque;

public class FoodFightCompetition {
    public String solution(int[] food) {
        StringBuilder s = new StringBuilder();
        Deque<Integer> bucket = new ArrayDeque<>();
        int meal = 1;

        for (int i = 1; i < food.length; i++) {
            for (int j = 0; j < food[i] / 2; j++) {
                bucket.push(meal);
            }
            meal++;
        }

        while (!bucket.isEmpty()) {
            String tmp = String.valueOf(bucket.pop());
            s = new StringBuilder(tmp + s + tmp);
        }

        String a = s.substring(0, s.length() / 2);
        String b = s.substring(s.length() / 2);

        return a + "0" + b;
    }

    public String solution2(int[] food) {
        StringBuilder answer = new StringBuilder("0");

        for (int i = food.length - 1; i > 0; i--) {
            for (int j = 0; j < food[i] / 2; j++) {
                answer = new StringBuilder(i + answer.toString() + i);
            }
        }

        return answer.toString();
    }
}
