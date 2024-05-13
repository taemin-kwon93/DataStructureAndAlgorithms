package org.study.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ElementsSpacedNPart {
    public static void main(String[] args) {
        int[] a = {4, 2, 6, 1, 7, 6};
        int[] b = solution(a, 2);
        System.out.println(Arrays.toString(b));
    }

    private static int[] solution(int[] num_list, int n) {
        List<Integer> answer = new ArrayList<Integer>();
        for (int i = 0; i < num_list.length; i++) {
            if (i % n == 0) answer.add(num_list[i]);
        }

        return answer.stream().mapToInt(i -> i).toArray();
    }
}
