package org.study.algorithm;

import java.util.Arrays;
import java.util.Collections;

/**
 * 함수 solution은 정수 n을 매개변수로 입력받습니다. n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요. 예를들어 n이 118372면 873211을 리턴하면 됩니다.
 */

public class SortDigit {
    public long solution(long n) {
        String s = String.valueOf(n);
        Long[] intArray = new Long[s.length()];

        for (int i = 0; i < s.length(); i++) {
            intArray[i] = (long) s.charAt(i) - 48;
        }

        Arrays.sort(intArray, Collections.reverseOrder());
        StringBuilder sb = new StringBuilder();
        for (Long aLong : intArray) {
            sb.append(aLong);
        }
        return Long.parseLong(sb.toString());
    }
}
