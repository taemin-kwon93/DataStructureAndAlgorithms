package org.study.parksangkhil;

import java.util.*;

public class RecursiveDFS {
    private Map<Integer, List<Integer>> graph = new HashMap<>();
    private Set<Integer> visited = new HashSet<>();

    public void dfs(int node) {
        visited.add(node);
        System.out.print(node + " ");

        for (int neighbor : graph.getOrDefault(node, new ArrayList<>())) {
            if (!visited.contains(neighbor)) {
                dfs(neighbor);
            }
        }
    }

    public static void main(String[] args) {
        RecursiveDFS dfs = new RecursiveDFS();
        dfs.graph.put(0, Arrays.asList(1, 2));
        dfs.graph.put(1, Arrays.asList(3, 4));
        dfs.graph.put(2, Arrays.asList(5));
        dfs.graph.put(3, Arrays.asList());
        dfs.graph.put(4, Arrays.asList());
        dfs.graph.put(5, Arrays.asList());

        System.out.println("DFS Start");
        dfs.dfs(0);
    }
}
