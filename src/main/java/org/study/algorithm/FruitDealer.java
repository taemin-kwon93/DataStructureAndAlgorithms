package org.study.algorithm;

import org.study.bohyohshibata.SelectionSort;
import java.util.*;

public class FruitDealer {
    public int solution(int k, int m, int[] score) {
        int totalPrice = 0;
        Arrays.sort(score);
        int left = 0, right = score.length - 1;
        while (left < right) {
            SelectionSort.swap(score, left, right);
            left++;
            right--;
        }

        int remain = score.length % m;
        int price;

        for (int i = m - 1; i < score.length - remain; i += m) {
            price = Math.min(score[i], k);
            totalPrice += (price * m);
        }

        return totalPrice;
    }
}
