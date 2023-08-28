package org.study.algorithm;
import java.util.Arrays;

public class Median {
    public static void main(String[] args) {
        Median median = new Median();
        int result = median.solution(new int[] {1, 1, 22, 7, 2});
        System.out.println(result);
    }

    public int solution(int[] array) {
        Arrays.sort(array);
        int x = array.length;
        int y = x / 2;

        return array[y];
    }
}
