package org.study.algorithm;

public class OddOrEven {
    public static void main(String[] args) {
        int[] a = {4, 2, 6, 1, 7, 6};
        int b = solution(a);
        System.out.println(b);
    }

    private static int solution(int[] num_list) {
        int SumOfOdd = 0;
        int SumOfEven = 0;

        for (int i = 0; i < num_list.length; i++) {
            if (i % 2 == 0) {
                SumOfOdd += num_list[i];
            } else {
                SumOfEven += num_list[i];
            }
        }

        return Math.max(SumOfOdd, SumOfEven);
    }
}
