package org.study.algorithm;

public class CollatzConjecture2 {
    public int solution(int num) {
        int counter = 0;
        long long_num = num;
        while(long_num != 1 || counter == 500) {
            if (long_num % 2 == 0) {
                long_num /= 2;
            } else {
                long_num = (long_num * 3) + 1;
            }
            counter++;
        }

        return counter >= 500 ? -1 : counter;
    }
}
