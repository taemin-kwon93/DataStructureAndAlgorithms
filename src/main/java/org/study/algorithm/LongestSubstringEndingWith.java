package org.study.algorithm;

/**
 * 문자열 myString과 pat가 주어집니다. myString의 부분 문자열중 pat로 끝나는 가장 긴 부분 문자열을 찾아서 return 하는 solution 함수를 완성해 주세요.
 */

public class LongestSubstringEndingWith {
    public String solution(String myString, String pat) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        sb1.append(myString);
        sb1.reverse();

        sb2.append(pat);
        sb2.reverse();

        int x = sb1.toString().indexOf(sb2.toString());


        return myString.substring(0, myString.length() - x);
    }
}
