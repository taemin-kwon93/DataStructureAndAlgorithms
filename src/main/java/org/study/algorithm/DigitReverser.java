package org.study.algorithm;

/**
 * 자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요. 예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.
 */

public class DigitReverser {
    public int[] solution(long n) {
        String a = String.valueOf(n);
        int[] answer = new int[a.length()];

        for (int i = 0; i < a.length(); i++) {
            answer[i] = Integer.parseInt(String.valueOf(a.charAt(a.length() - 1 - i)));
        }

        return answer;
    }
}
