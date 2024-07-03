package org.study.parksangkhil;

import java.util.List;
import java.util.ArrayList;

public class LongestPalindromeSubstring {
    // 이 접근 방식은 시간 복잡도가 O(n^3)입니다.
    // 여기서 n은 문자열의 길이입니다.
    // 이는 부분 문자열을 생성하는 데 O(n^2)와 회문 확인에 O(n)이 필요하기 때문입니다.
    public String solution(String s) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < s.length() - 1; i++) {
            for (int j = i + 1; j < s.length(); j++) {
                String str = s.substring(i, j);
                if (isPalindrome(str)) {
                    list.add(str);
                }
            }
        }
        int check = 0;
        String result = "";
        for (String string : list) {
            check = Math.max(check, string.length());
            result = (string.length() >= check) ? string : result;
        }

        return result;
    }

    private static boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        sb.append(s);

        return sb.reverse().toString().equals(s);
    }

    int left, maxLen;
    // 이 접근 방식의 시간 복잡도는 O(n^2)입니다.
    public String solutionB(String s) {
        int len = s.length();

        if (len < 2) return s;

        for (int i = 0; i < len - 1; i++) {
            extendPalindrome(s, i, i + 1);
            extendPalindrome(s, i, i + 2);
        }

        return s.substring(left, left + maxLen);
    }

    public void extendPalindrome(String s, int j, int k) {
        while (j >= 0 && k < s.length() && s.charAt(j) == s.charAt(k)) {
            j--;
            k++;
        }

        if (maxLen < k - j ) {
            left = j + 1;
            maxLen = k - j - 1;
        }
    }
}
