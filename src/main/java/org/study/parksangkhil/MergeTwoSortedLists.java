package org.study.parksangkhil;

import java.util.List;
import java.util.ArrayList;

public class MergeTwoSortedLists {
    public List<Integer> solution(List<Integer> list1, List<Integer> list2) {
        List<Integer> answer = new ArrayList<>(list1);
        answer.addAll(list2);

        return answer.stream().sorted().toList();
    }
}
