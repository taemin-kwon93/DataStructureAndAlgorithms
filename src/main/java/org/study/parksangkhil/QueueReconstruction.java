package org.study.parksangkhil;

import java.util.*;

public class QueueReconstruction {
    public int[][] reconstructQueue(int[][] people) {
        PriorityQueue<int[]> pq = new PriorityQueue<>(
                (a, b) -> {
                    if (a[0] != b[0]) {
                        return b[0] - a[0]; // [0] 인덱스는 내림차순
                    } else {
                        return a[1] - b[1]; // [1] 인덱스는 오름차순
                    }
                }
        );

        List<int[]> list = new ArrayList<>();

        Collections.addAll(pq, people);

        while(!pq.isEmpty()) {
            int[] tmp = pq.poll();
            list.add(tmp[1], tmp);
        }
        return list.toArray(new int[people.length][2]);
    }
}
