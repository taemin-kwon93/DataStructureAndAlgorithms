package org.study.algorithm;

public class CaesarPassword {
    public String solution(String s, int n) {
        StringBuilder sb = new StringBuilder();
        // A:65 ~ z: 90
        // a:97 ~ z: 122
        for (char c : s.toCharArray()) {
            int addNFromC = (int) c + n;

            // modular calculator
            // UpperCase
            if ((int) c >= 65 && (int) c <= 90) {
                if (addNFromC > 90) {
                    sb.append((char) ((addNFromC % 90) + 64));
                } else {
                    sb.append((char) addNFromC);
                }
                // LowerCase
            } else if ((int) c >= 97 && (int) c <= 122) {
                if (addNFromC > 122) {
                    sb.append((char) ((addNFromC % 122) + 96));
                } else {
                    sb.append((char) addNFromC);
                }
            } else {
                sb.append(c);
            }
        }

        return sb.toString();
    }
}
