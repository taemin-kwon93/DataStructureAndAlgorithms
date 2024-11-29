package org.study.parksangkhil;

import java.util.*;

public class TaskScheduler {
    public int leastInterval(char[] tasks, int n) {
        int[] freq = new int[26];
        for (char c : tasks)
            freq[c - 'A']++;

        Queue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        for (int f : freq) {
            if (f > 0)
                pq.add(f);
        }

        int answer = 0;
        while (true) {
            int intervals = 0;
            List<Integer> list = new ArrayList<>();
            while (!pq.isEmpty()) {
                int frequency = pq.poll();
                if (intervals < n + 1) {
                    intervals++;
                    answer++;
                    if (frequency > 1)
                        list.add(frequency - 1);
                } else {
                    list.add(frequency);
                }
            }
            if (list.isEmpty())
                break;
            pq.addAll(list);
            answer += n + 1 - intervals;
        }

        return answer;
    }
}
