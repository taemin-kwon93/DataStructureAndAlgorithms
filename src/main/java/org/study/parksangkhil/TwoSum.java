package org.study.parksangkhil;

import java.util.Map;
import java.util.HashMap;

public class TwoSum {
    // brute force, O(n^2)
    public int[] solution(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) return new int[] {i, j};
            }
        }

        return new int[] {-1};
    }

    // O(n) 풀이법
    public int[] solutionB(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i]))
                return new int[] {map.get(target - nums[i]), i};

            map.put(nums[i], i);
        }

        return null;
    }
}
