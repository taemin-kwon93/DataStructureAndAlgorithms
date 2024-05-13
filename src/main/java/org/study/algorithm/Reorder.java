package org.study.algorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Reorder {
    public static void main(String[] args) {
//        int[] a = {2, 1, 6};
        int[] a = {5, 2, 1, 7, 5};
        int[] b = solution(a, 3);
        System.out.println(Arrays.toString(b));
    }

    private static int[] solution(int[] num_list, int n) {
        List<Integer> answer = new ArrayList<>();
        for (int i = n; i < num_list.length; i++) {
            answer.add(num_list[i]);
        }
        for (int i = 0; i < n; i++) {
            answer.add(num_list[i]);
        }
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}
