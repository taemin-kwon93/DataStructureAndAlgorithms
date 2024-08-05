package org.study.parksangkhil;

import java.util.*;

public class FrequentElem {
    public int[] solution(int[] nums, int k) {
        Map<Integer, Integer> counter = new HashMap<>();
        int[] answer = new int[k];
        int max = 0;

        for (int i : nums) {
            counter.put(i, counter.getOrDefault(i, 0) + 1);
        }

        for (int j = 0; j < k; j++) {
            for (Map.Entry<Integer, Integer> entry : counter.entrySet()) {
                if (max <= entry.getValue()) {
                    max = entry.getValue();
                    answer[j] = entry.getKey();
                }
            }
            max = 0;
            counter.remove(answer[j]);
        }

        return answer;
    }

    public int[] solutionB(int[] nums, int k) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int n : nums) {
            frequencyMap.put(n, frequencyMap.getOrDefault(n, 0) + 1);
        }

        Map<Integer, List<Integer>> buckets = new HashMap<>();
        for (int elem : frequencyMap.keySet()) {
            int frequency = frequencyMap.get(elem);
            List<Integer> elems = buckets.getOrDefault(frequency, new ArrayList<>());
            elems.add(elem);
            buckets.put(frequency, elems);
        }

        int[] result = new int[k];
        int idx = 0;
        for (int frequency = nums.length; frequency >= 0 && idx < k; frequency--) {
            if (buckets.get(frequency) != null) {
                for (int elem : buckets.get(frequency)) {
                    result[idx++] = elem;
                }
            }
        }

        return result;
    }
}
