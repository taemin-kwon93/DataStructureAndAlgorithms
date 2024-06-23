package org.study.parksangkhil;

import java.util.List;
import java.util.ArrayList;

public class LongestPalindromeSubstring {
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
}
