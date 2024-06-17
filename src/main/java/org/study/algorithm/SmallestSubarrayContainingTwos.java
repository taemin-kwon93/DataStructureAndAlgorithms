package org.study.algorithm;

/**
 * 정수 배열 arr가 주어집니다. 배열 안의 2가 모두 포함된 가장 작은
 * 연속된 부분 배열을 return 하는 solution 함수를 완성해 주세요.
 * 단, arr에 2가 없는 경우 [-1]을 return 합니다.
 */
public class SmallestSubarrayContainingTwos {
    public int[] solution(int[] arr) {
        int start = 0;
        int end = 0;
        int counter;

        for (int i : arr) {
            start++;
            if (i == 2) {
                start--;
                break;
            }
        }
        counter = start;

        for (int j = start; j < arr.length; j++) {
            if (arr[j] == 2) end = j;
        }


        if (start > end) return new int[] {-1};
        int[] answer = new int[(end - start) + 1];

        for (int k = 0; k <= end - counter; k++) {
            answer[k] = arr[start++];
        }
        return answer;
    }
}