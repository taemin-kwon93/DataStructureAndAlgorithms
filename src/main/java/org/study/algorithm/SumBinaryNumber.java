package org.study.algorithm;

/**
 * 이진수를 의미하는 두 개의 문자열 bin1과 bin2가 매개변수로 주어질 때, 두 이진수의 합을 return하도록 solution 함수를 완성해주세요.
 */
public class SumBinaryNumber {
    public String solution(String bin1, String bin2) {
        int x = getIntFromBinString(bin1);
        int y = getIntFromBinString(bin2);

        return Integer.toBinaryString(x + y);
    }

    public int getIntFromBinString(String s) {
        char[] chars = s.toCharArray();
        chars = reverse(chars, chars.length);

        int num = 0;
        int base = 1;
        for (char c : chars) {
            num = (c == '1') ? num + base : num;
            base *= 2;
        }
        return num;
    }

    public char[] reverse(char[] chars, int n) {

        for (int i = 0; i < n / 2; i++) {
            char tmp = chars[i];
            char c1 = chars[n - i - 1];

            chars[i] = c1;
            chars[n - i - 1] = tmp;
        }
        return chars;
    }
}
