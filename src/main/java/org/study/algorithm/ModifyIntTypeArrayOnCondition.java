package org.study.algorithm;

import java.util.Arrays;

public class ModifyIntTypeArrayOnCondition {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 100, 99, 98};
        int[] answer = solution(a);
        System.out.println(Arrays.toString(answer));
    }

    private static int[] solution(int[] a) {
        for(int i = 0; i < a.length; i++) {
            if(a[i] >= 50 && a[i] % 2 == 0){
                a[i] = a[i] / 2;
            } else if(a[i] < 50 && a[i] % 2 != 0) {
                a[i] = a[i] * 2;
            }
        }
        return a;
    }
}
