package org.study.parksangkhil;

import java.util.*;

public class Subsets {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> results = new ArrayList<>();
        dfs(results, new ArrayList<>(), 0, nums);
        return new ArrayList<>(results);
    }

    private void dfs(List<List<Integer>> results, List<Integer> path, int idx, int[] nums) {
        results.add(new ArrayList<>(path));

        for (int i = idx; i < nums.length; i++) {
            path.add(nums[i]);
            dfs(results, path, i + 1, nums);
            path.remove(path.size() - 1);
        }
    }

    public List<List<Integer>> subsetsB(int[] nums) {
        List<List<Integer>> results = new ArrayList<>();
        dfsB(results, nums, 0, new ArrayDeque<>());
        return results;
    }

    public void dfsB(List<List<Integer>> results, int[] nums, int index, Deque<Integer> path) {
        results.add(new ArrayList<>(path));

        for (int i = index; i < nums.length; i++) {
            path.add(nums[i]);
            System.out.println("path: " + path);
            dfsB(results, nums, i+1, path);
            path.removeLast();
        }
    }
}
