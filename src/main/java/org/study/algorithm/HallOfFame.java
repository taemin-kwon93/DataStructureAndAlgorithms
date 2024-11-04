package org.study.algorithm;

import java.util.*;

public class HallOfFame {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < score.length; i++) {
            list.add(score[i]);
            list.sort(Comparator.reverseOrder());
            if (list.size() < k) {
                answer[i] = list.get(list.size() - 1);
            } else {
                answer[i] = list.get(k - 1);
            }
        }
        return answer;
    }

    public int[] solution2(int k, int[] score) {
        int[] answer = new int[score.length];

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        for(int i = 0; i < score.length; i++) {
            priorityQueue.add(score[i]);
            if (priorityQueue.size() > k) {
                priorityQueue.poll();
            }

            if (!priorityQueue.isEmpty()) {
                answer[i] = priorityQueue.peek();
            }
        }

        return answer;
    }
}
