package org.study.parksangkhil;

import java.util.*;

public class CombinationSum {
    public void dfs(List<List<Integer>> results, LinkedList<Integer> elements, int sum, int target, int start, int[] candidates) {
        if (target < sum) return;
        if (target == sum) {
            results.add(new ArrayList<>(elements));
            return;
        }

        for (int i = start; i < candidates.length; i++) {
            elements.add(candidates[i]);
            sum += candidates[i];

            dfs(results, elements, sum, target, i, candidates);
            sum -= elements.getLast();
            elements.removeLast();
        }
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> results = new ArrayList<>();
        dfs(results, new LinkedList<>(), 0, target, 0, candidates);
        return results;
    }
}
