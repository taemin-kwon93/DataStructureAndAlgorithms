package org.study.algorithm;

import java.util.*;

public class FeatureDevelopment {
    public int[] solution(int[] progress, int[] speeds) {
        int pLen = progress.length;
        int sLen = speeds.length;
        if (pLen != sLen || pLen == 0) return new int[] {};

        final int COMPLETE = 100;
        int[] arr = new int[pLen];
        Deque<Integer> dq = new ArrayDeque<>();

        for (int i = 0; i < pLen; i++) {
            int x = COMPLETE - progress[i];
            int y = x / speeds[i];
            arr[i] = (x % speeds[i] == 0) ? y : y + 1;
        }

        int max = 0;
        int idx = 0;
        int x = pLen;

        while (idx > -1) {
            int lastElem = x;
            for (int i = 0; i < lastElem; i++) {
                if (max < arr[i]) {
                    max = arr[i];
                    x = i;
                    idx = x - 1;
                }
            }
            max = 0;
            dq.push(lastElem - x);
        }

        return dq.stream().mapToInt(Integer::intValue).toArray();
    }
}
