package org.study.parksangkhil;

import java.util.*;

public class Combinations {
    public void dfs(List<List<Integer>> results, LinkedList<Integer> elements, int n, int start, int k) {
        if (k == 0) {
            results.add(new ArrayList<>(elements));
            return;
        }

        for (int i = start; i <= n; i++) {
            elements.add(i);
            dfs(results, elements, n, i + 1, k - 1);
            // 마지막 요소를 지우기 위해 elements를 LinkedList로 선언함
            elements.removeLast();
        }
    }


    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> results = new ArrayList<>();

        dfs(results, new LinkedList<>(), n, 1, k);

        return results;
    }
}
