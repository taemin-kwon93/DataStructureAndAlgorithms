package org.study.algorithm;

import java.util.*;

public class Process {
    public int solution(int[] priorities, int location) {
        Queue<int[]> queue = new LinkedList<>();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < priorities.length; i++) {
            queue.offer(new int[]{priorities[i], i});
            maxHeap.offer(priorities[i]);
        }

        int executionOrder = 0;
        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            if (current[0] < maxHeap.peek()) {
                queue.offer(current);
            } else {
                executionOrder++;
                maxHeap.poll();
                if (current[1] == location) {
                    return executionOrder;
                }
            }
        }
        return -1;
    }
}
