package org.study.parksangkhil;

import java.util.*;

public class CourseSchedule {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        Map<Integer, List<Integer>> finishToTakeMap = new HashMap<>();
        for (int[] pre : prerequisites) {
            finishToTakeMap.put(pre[0], new ArrayList<>());
            finishToTakeMap.get(pre[0]).add(pre[1]);
        }
        List<Integer> takes = new ArrayList<>();
        for (Integer finish : finishToTakeMap.keySet()) {
            if (!dfs(finishToTakeMap, finish, takes)) return false;
        }

        return true;
    }

    public boolean dfs(Map<Integer, List<Integer>> finishToTakeMap,
                       Integer finish,
                       List<Integer> takes) {
        if (takes.contains(finish)) return false;
        if (finishToTakeMap.containsKey(finish)) {
            takes.add(finish);
            for (Integer take : finishToTakeMap.get(finish)) {
                if (!dfs(finishToTakeMap, take, takes))
                    return false;
                takes.remove(finish);
            }
        }
        return true;
    }
}
