package org.study.algorithm;

import java.util.Arrays;

public class SubmissionHistory {
    public String solution(String my_string) {
        int[] a = new int[my_string.length()];
        for (int i = 0; i < my_string.length(); i++) {
            a[i] = my_string.toLowerCase().charAt(i);
        }

        a = Arrays.stream(a).sorted().toArray();
        String result = "";
        for (int i = 0; i < a.length; i++) {
            result += (char) a[i];
        }

        return result;
    }

    public String solution2(String my_string) {
        char[] c = my_string.toLowerCase().toCharArray();
        Arrays.sort(c);
        return new String(c);
    }
}
