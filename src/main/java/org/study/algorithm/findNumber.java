package org.study.algorithm;

public class findNumber {
    public static int solution(int num, int k) {
        String a = num + "";
        char[] a1 = a.toCharArray();
        String k2 = "" + k;
        char b = k2.charAt(0);

        for(int i = 0; i < a.length(); i++) {
            if(a1[i] == b) {
                return i + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int a = solution(29183, 3);
        System.out.println(a);
    }
}
