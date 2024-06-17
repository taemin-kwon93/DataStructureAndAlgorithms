package org.study.parksangkhil;

public class PalindromeChecker {
    public boolean solution(String s1) {
        StringBuilder s2 = new StringBuilder();
        s2.append(s1.replace(" ", "").toLowerCase());

        return s2.reverse().toString().equals(s1.toLowerCase().replace(" ", ""));
    }
}
