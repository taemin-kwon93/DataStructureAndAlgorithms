package org.study.algorithm;

public class ProductAndSum {
    public int solution(int[] num_list) {
        // 모든 원소들의 곱
        int multiple = num_list[0];
        // 모든 원소들의 합 이후 제곱의 값
        int sumSquare = num_list[0];

        for (int i = 1; i < num_list.length; i++) {
            multiple *= num_list[i];
            sumSquare += num_list[i];
        }

        return (multiple < (sumSquare * sumSquare)) ? 1 : 0;
    }
}
