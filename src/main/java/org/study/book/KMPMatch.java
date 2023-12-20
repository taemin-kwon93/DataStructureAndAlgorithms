package org.study.book;

public class KMPMatch {

    // KMP 법으로 문자열 검색
    static int kmpMatch(String txt, String pat) {
        int pt = 1; // txt 커서
        int pp = 0; // pat 커서
        int[] skip = new int[pat.length() + 1]; // 건너뛰기 표

        // 건너뛰기 표 만들기
        skip[pt] = 0;
        while (pt != pat.length()) {
            if (pat.charAt(pt) == pat.charAt(pp))
                skip[++pt] = ++pp;
            else if (pp == 0)
                skip[++pt] = pp;
            else
                pp = skip[pp];
        }

        // 검색
        pt = pp = 0;
        while (pt != txt.length() && pp != pat.length()) {
            if (txt.charAt(pt) == pat.charAt(pp)) {
                pt++;
                pp++;
            } else if (pp == 0)
                pt++;
            else
                pp = skip[pp];
        }

        if (pp == pat.length()) // 패턴의 모든 문자 대조
            return pt - pp;
        return -1; // 검색 실패
    }

    public static void main(String[] args) {
        String a = "ABCABDABEE";
        String b = "ABE";

        System.out.println(kmpMatch(a, b));
    }
}
