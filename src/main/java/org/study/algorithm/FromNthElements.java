package org.study.algorithm;

import java.util.List;
import java.util.ArrayList;

import java.util.Arrays;

public class FromNthElements {
    public static void main(String[] args) {
        int[] a = {5, 2, 1, 7, 5};
        int[] b = solution(a, 2);
        System.out.println(Arrays.toString(b)); // [2, 1, 7, 5]
    }

    private static int[] solution(int[] num_list, int n) {
        List<Integer> answer = new ArrayList<>();
        for (int i = n - 1; i < num_list.length; i++) {
            answer.add(num_list[i]);
        }
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}
