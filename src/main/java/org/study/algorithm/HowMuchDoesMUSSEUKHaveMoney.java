package org.study.algorithm;

import java.util.Arrays;

public class HowMuchDoesMUSSEUKHaveMoney {
    public static void main(String[] args) {
        HowMuchDoesMUSSEUKHaveMoney haveMoney = new HowMuchDoesMUSSEUKHaveMoney();
        int[] result = haveMoney.solution(5500);
        System.out.println(Arrays.toString(result));
    }

    public int[] solution(int money) {
        return new int[] {money / 5500, money % 5500};
    }
}
