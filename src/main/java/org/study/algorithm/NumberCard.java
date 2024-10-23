package org.study.algorithm;

public class NumberCard {
    public int solution(String s) {
        String[] strsForCharacter = {"zero", "one",  "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String[] strsForInteger = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        for (int i = 0; i < strsForCharacter.length; i++)
            s = s.replaceAll(strsForCharacter[i], strsForInteger[i]);
        return Integer.parseInt(s);
    }
}
