package org.study.parksangkhil;

import java.util.*;

public class MergeIntervals {
    public int[][] merge(int[][] intervals) {
        List<int[]> result = new ArrayList<>();

        Arrays.sort(intervals, Comparator.comparing(a -> a[0]));

        for (int[] i : intervals) {
            if (!result.isEmpty() && i[0] <= result.get(result.size() - 1)[1]) {
                result.get(result.size() - 1)[1] = Math.max(i[1], result.get(result.size() - 1)[1]);
            } else {
                result.add(i);
            }
        }

        return result.toArray(new int[result.size()][]);
    }
}
