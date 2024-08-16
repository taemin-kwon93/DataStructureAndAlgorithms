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
        // 레벨이 증가할수록 자식 노드의 개수가 점점 적어진다.
        // 자식 노드의 개수가 줄어들어 isEmpty() 가 true 로 되면,
        // result 에 지금까지 누적한 값을 List 형태로 add()를 실행한다.
        System.out.println("current prevElements: " + prevElements);
        if (elements.isEmpty()) results.add(new ArrayList<>(prevElements));

        for (Integer e : elements) {
            List<Integer> nextElements = new ArrayList<>(elements);
            nextElements.remove(e);
            prevElements.add(e);
            System.out.println("add e: " + e);
            dfs(results, prevElements, nextElements);
            prevElements.remove(e);
            System.out.println("remove e: " + e);
        }
    }
}