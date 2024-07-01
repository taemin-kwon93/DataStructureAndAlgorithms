package org.study.algorithm;

import java.util.*;

public class ArrayPartiton1 {
    public int solution(int[] arr) {
        int answer = 0;
        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i += 2) {
            answer += arr[i];
        }

        return answer;
    }
}
