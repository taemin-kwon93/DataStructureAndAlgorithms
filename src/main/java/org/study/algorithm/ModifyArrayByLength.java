package org.study.algorithm;

/**
 * 정수 배열 arr과 정수 n이 매개변수로 주어집니다. arr의 길이가 홀수라면 arr의 모든 짝수 인덱스 위치에 n을 더한 배열을, arr의 길이가 짝수라면 arr의 모든 홀수 인덱스 위치에 n을 더한 배열을 return 하는 solution 함수를 작성해 주세요.
 */

public class ModifyArrayByLength {
    public int[] solution(int[] arr, int n) {
        if ((arr.length % 2 == 0)) {
            for (int i = 1; i < arr.length; i+=2) {
                arr[i] = arr[i] + n;
            }
        } else {
            for (int i = 0; i < arr.length; i+=2) {
                arr[i] = arr[i] + n;
            }
        }

        return arr;
    }
}