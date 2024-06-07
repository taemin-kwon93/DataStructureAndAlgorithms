package org.study.algorithm;

public class MakeOne {
    public int solution(int[] num_list) {
        int counter = 0;
        for (int i : num_list) {
            while (i != 1) {
                if (i % 2 == 0) {
                    i /= 2;
                } else {
                    i = (i - 1) / 2;
                }
                counter++;
            }
        }

        return counter;
    }
}
