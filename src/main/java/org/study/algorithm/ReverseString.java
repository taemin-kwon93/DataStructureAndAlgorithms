package org.study.algorithm;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseString {
    public static void main(String[] args) {
        ReverseString reverseString = new ReverseString();
        String result = reverseString.solution("test");
        System.out.println(result);
        String result2 = reverseString.solution2("test");
        System.out.println(result2);
        String result3 = reverseString.solution3("test");
        System.out.println(result3);
    }

    public String solution(String str) {
        byte[] a = str.getBytes();
        byte[] b = str.getBytes();
        for(int i = 0; i < str.length(); i++) {
            a[i] = b[(str.length() - 1) - i];
        }

        return new String(a);
    }

    public String solution2(String str) {
        String answer = "";

        for(int i = str.length() - 1; i >= 0; i--){
            answer += str.charAt(i);
        }

        return answer;
    }

    public String solution3(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.reverse();

        return sb.toString();
    }
}
