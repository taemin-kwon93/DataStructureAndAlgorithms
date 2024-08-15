package org.study.parksangkhil;

import java.util.*;

public class Permutations {

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> results = new ArrayList<>();
        List<Integer> elems = Arrays.stream(nums).boxed().toList();

        dfs(results, new ArrayList<>(), elems);

        return results;
    }

    public void dfs(List<List<Integer>> results, List<Integer> prevElements, List<Integer> elements) {
        if (elements.isEmpty()) results.add(new ArrayList<>(prevElements));

        for (Integer e : elements) {
            List<Integer> nextElements = new ArrayList<>(elements);
            nextElements.remove(e);
            prevElements.add(e);
            dfs(results, prevElements, nextElements);
            prevElements.remove(e);
        }
    }
}