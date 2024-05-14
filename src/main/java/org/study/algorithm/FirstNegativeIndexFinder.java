package org.study.algorithm;

public class FirstNegativeIndexFinder {
    public static void main(String[] args) {
        int[] a = {12, 4, 15, 46, 38, -2, 15};
        int b = solution(a);
        System.out.println(b);
    }

    private static int solution(int[] num_list) {
        for (int i = 0; i < num_list.length; i++) if (num_list[i] < 0) return i;
        return -1;
    }
}
